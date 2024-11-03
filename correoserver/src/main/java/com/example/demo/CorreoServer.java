package com.example.demo;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CorreoServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Construye el servidor gRPC
        Server server = ServerBuilder.forPort(9090)
                .addService(new CorreoServiceImpl())
                .build();

        // Arranca el servidor
        server.start();
        System.out.println("Servidor gRPC iniciado en el puerto 9090");

        // Espera a que el servidor se cierre
        server.awaitTermination();
    }
}
