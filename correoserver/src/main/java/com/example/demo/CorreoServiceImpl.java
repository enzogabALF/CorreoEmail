package com.example.demo;

import io.grpc.stub.StreamObserver;

public class CorreoServiceImpl extends CorreoServiceGrpc.CorreoServiceImplBase {

    @Override
    public void enviarCorreo(CorreoRequest request, StreamObserver<CorreoResponse> responseObserver) {
        // Implementa la lógica de envío de correo aquí
        String destinatario = request.getDestinatario();
        String remitente = request.getRemitente();
        String asunto = request.getAsunto();
        String contenido = request.getContenido();

        // Aquí puedes añadir la lógica de envío de correo
        System.out.printf("Enviando correo de %s a %s con asunto '%s' y contenido: %s%n",
                remitente, destinatario, asunto, contenido);

        // Construye la respuesta
        CorreoResponse response = CorreoResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Correo enviado con éxito")
                .build();

        // Envía la respuesta
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void recibirCorreo(CorreoRequest request, StreamObserver<CorreoResponse> responseObserver) {
        // Implementa la lógica de recepción de correo aquí
        String destinatario = request.getDestinatario();

        // Aquí puedes añadir la lógica de recepción de correo
        System.out.printf("Recibiendo correos para %s%n", destinatario);

        // Construye la respuesta
        CorreoResponse response = CorreoResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Correo recibido con éxito")
                .build();

        // Envía la respuesta
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}