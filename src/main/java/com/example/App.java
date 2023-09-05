package com.example;


import hello_titulos.servicios_de_hello_titulosGrpc;
import hello_titulos.HelloTitulos.hello;
import hello_titulos.servicios_de_hello_titulosGrpc.servicios_de_hello_titulosBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
         // Dirección y puerto del servidor gRPC
        System.out.println(Constants.HOST);

        // Configurar el canal de comunicación
        ManagedChannel channel = ManagedChannelBuilder.forTarget(Constants.HOST)
                .useTransportSecurity() // Utilizar SSL/TLS
                .build();

        BearerToken token =new BearerToken(Constants.JWT_SIGNING_KEY);

        // Crear el cliente gRPC utilizando el canal
       servicios_de_hello_titulosBlockingStub client =  servicios_de_hello_titulosGrpc
                                                                        .newBlockingStub(channel)
                                                                        .withCallCredentials(token);


        hello request = hello.newBuilder().setId(String.valueOf("1")).build();
        System.out.println(client.sendId(request).getMensaje());


        // servicios_de_hello_titulos.newBlockingStub(channel);
        System.out.println( "Hello World!" );

    }
}
