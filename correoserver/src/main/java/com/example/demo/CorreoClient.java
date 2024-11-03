package com.example.demo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class CorreoClient {
    public static void main(String[] args) {
        // Configura el canal de comunicación
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        // Crea un stub (cliente) para el servicio
        CorreoServiceGrpc.CorreoServiceStub stub = CorreoServiceGrpc.newStub(channel);

        // Construye la solicitud
        CorreoRequest request = CorreoRequest.newBuilder()
                .setDestinatario("destinatario@example.com")
                .setRemitente("remitente@example.com")
                .setAsunto("Prueba")
                .setContenido("Este es un correo de prueba.")
                .build();

        // Llama al servicio enviarCorreo
        stub.enviarCorreo(request, new StreamObserver<CorreoResponse>() {
            @Override
            public void onNext(CorreoResponse response) {
                // Procesa la respuesta
                System.out.printf("Respuesta recibida: %s%n", response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                // Maneja errores
                System.err.printf("Error recibido: %s%n", t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Completa la llamada
                System.out.println("Llamada completada.");
                channel.shutdown();
            }
        });
    }
}
