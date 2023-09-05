package com.example;

import hello_titulos.servicios_de_hello_titulosGrpc;
import hello_titulos.HelloTitulos.hello;
import hello_titulos.servicios_de_hello_titulosGrpc.servicios_de_hello_titulosBlockingStub;
import io.grpc.ChannelCredentials;
import io.grpc.Grpc;
import io.grpc.ManagedChannel;
import io.grpc.TlsChannelCredentials;

public class GrpcChannel {

    public static void main(String[] args) {

        System.out.println(Constants.HOST);

        // If only defaults are necessary, you can use TlsChannelCredentials.create()
        // instead of
        // interacting with the Builder.
        ChannelCredentials tlsBuilder = TlsChannelCredentials.create();

        ManagedChannel channel = Grpc.newChannelBuilder(Constants.HOST, tlsBuilder)
                .build();

        BearerToken token = new BearerToken(Constants.JWT_SIGNING_KEY);

        // Crear el cliente gRPC utilizando el canal
        servicios_de_hello_titulosBlockingStub client = servicios_de_hello_titulosGrpc
                .newBlockingStub(channel)
                .withCallCredentials(token);

        hello request = hello.newBuilder().setId(String.valueOf("1")).build();
        System.out.println(client.sendId(request).getMensaje());
    }
}
