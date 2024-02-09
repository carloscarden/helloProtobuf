package data_analytics;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: coursework-certificate.proto")
public final class serviciosGrpc {

  private serviciosGrpc() {}

  public static final String SERVICE_NAME = "data_analytics.servicios";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.consulta,
      data_analytics.CourseworkCertificate.consulta_respuesta> METHOD_CONSULTA_ANALITICO_STREAM =
      io.grpc.MethodDescriptor.<data_analytics.CourseworkCertificate.consulta, data_analytics.CourseworkCertificate.consulta_respuesta>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "data_analytics.servicios", "consulta_analitico_stream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data_analytics.CourseworkCertificate.consulta.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data_analytics.CourseworkCertificate.consulta_respuesta.getDefaultInstance()))
          .setSchemaDescriptor(new serviciosMethodDescriptorSupplier("consulta_analitico_stream"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.analitico_con_firma,
      data_analytics.CourseworkCertificate.analitico_respuesta> METHOD_ENVIAR_ANALITICO_CON_FIRMA_STREAM =
      io.grpc.MethodDescriptor.<data_analytics.CourseworkCertificate.analitico_con_firma, data_analytics.CourseworkCertificate.analitico_respuesta>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "data_analytics.servicios", "enviar_analitico_con_firma_stream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data_analytics.CourseworkCertificate.analitico_con_firma.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data_analytics.CourseworkCertificate.analitico_respuesta.getDefaultInstance()))
          .setSchemaDescriptor(new serviciosMethodDescriptorSupplier("enviar_analitico_con_firma_stream"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.contenido_analitico,
      data_analytics.CourseworkCertificate.analitico_respuesta> METHOD_ENVIAR_ANALITICO_SIN_FIRMA_STREAM =
      io.grpc.MethodDescriptor.<data_analytics.CourseworkCertificate.contenido_analitico, data_analytics.CourseworkCertificate.analitico_respuesta>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "data_analytics.servicios", "enviar_analitico_sin_firma_stream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data_analytics.CourseworkCertificate.contenido_analitico.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data_analytics.CourseworkCertificate.analitico_respuesta.getDefaultInstance()))
          .setSchemaDescriptor(new serviciosMethodDescriptorSupplier("enviar_analitico_sin_firma_stream"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.editar_contenido_analitico,
      data_analytics.CourseworkCertificate.analitico_respuesta> METHOD_EDITAR_ANALITICO_SIN_FIRMA_STREAM =
      io.grpc.MethodDescriptor.<data_analytics.CourseworkCertificate.editar_contenido_analitico, data_analytics.CourseworkCertificate.analitico_respuesta>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "data_analytics.servicios", "editar_analitico_sin_firma_stream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data_analytics.CourseworkCertificate.editar_contenido_analitico.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data_analytics.CourseworkCertificate.analitico_respuesta.getDefaultInstance()))
          .setSchemaDescriptor(new serviciosMethodDescriptorSupplier("editar_analitico_sin_firma_stream"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static serviciosStub newStub(io.grpc.Channel channel) {
    return new serviciosStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static serviciosBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new serviciosBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static serviciosFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new serviciosFutureStub(channel);
  }

  /**
   */
  public static abstract class serviciosImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta> consultaAnaliticoStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta_respuesta> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_CONSULTA_ANALITICO_STREAM, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_con_firma> enviarAnaliticoConFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ENVIAR_ANALITICO_CON_FIRMA_STREAM, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.contenido_analitico> enviarAnaliticoSinFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ENVIAR_ANALITICO_SIN_FIRMA_STREAM, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.editar_contenido_analitico> editarAnaliticoSinFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_EDITAR_ANALITICO_SIN_FIRMA_STREAM, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CONSULTA_ANALITICO_STREAM,
            asyncBidiStreamingCall(
              new MethodHandlers<
                data_analytics.CourseworkCertificate.consulta,
                data_analytics.CourseworkCertificate.consulta_respuesta>(
                  this, METHODID_CONSULTA_ANALITICO_STREAM)))
          .addMethod(
            METHOD_ENVIAR_ANALITICO_CON_FIRMA_STREAM,
            asyncBidiStreamingCall(
              new MethodHandlers<
                data_analytics.CourseworkCertificate.analitico_con_firma,
                data_analytics.CourseworkCertificate.analitico_respuesta>(
                  this, METHODID_ENVIAR_ANALITICO_CON_FIRMA_STREAM)))
          .addMethod(
            METHOD_ENVIAR_ANALITICO_SIN_FIRMA_STREAM,
            asyncBidiStreamingCall(
              new MethodHandlers<
                data_analytics.CourseworkCertificate.contenido_analitico,
                data_analytics.CourseworkCertificate.analitico_respuesta>(
                  this, METHODID_ENVIAR_ANALITICO_SIN_FIRMA_STREAM)))
          .addMethod(
            METHOD_EDITAR_ANALITICO_SIN_FIRMA_STREAM,
            asyncBidiStreamingCall(
              new MethodHandlers<
                data_analytics.CourseworkCertificate.editar_contenido_analitico,
                data_analytics.CourseworkCertificate.analitico_respuesta>(
                  this, METHODID_EDITAR_ANALITICO_SIN_FIRMA_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class serviciosStub extends io.grpc.stub.AbstractStub<serviciosStub> {
    private serviciosStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviciosStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviciosStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviciosStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta> consultaAnaliticoStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta_respuesta> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_CONSULTA_ANALITICO_STREAM, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_con_firma> enviarAnaliticoConFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_ENVIAR_ANALITICO_CON_FIRMA_STREAM, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.contenido_analitico> enviarAnaliticoSinFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_ENVIAR_ANALITICO_SIN_FIRMA_STREAM, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.editar_contenido_analitico> editarAnaliticoSinFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_EDITAR_ANALITICO_SIN_FIRMA_STREAM, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class serviciosBlockingStub extends io.grpc.stub.AbstractStub<serviciosBlockingStub> {
    private serviciosBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviciosBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviciosBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviciosBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class serviciosFutureStub extends io.grpc.stub.AbstractStub<serviciosFutureStub> {
    private serviciosFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviciosFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviciosFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviciosFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONSULTA_ANALITICO_STREAM = 0;
  private static final int METHODID_ENVIAR_ANALITICO_CON_FIRMA_STREAM = 1;
  private static final int METHODID_ENVIAR_ANALITICO_SIN_FIRMA_STREAM = 2;
  private static final int METHODID_EDITAR_ANALITICO_SIN_FIRMA_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final serviciosImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(serviciosImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSULTA_ANALITICO_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.consultaAnaliticoStream(
              (io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta_respuesta>) responseObserver);
        case METHODID_ENVIAR_ANALITICO_CON_FIRMA_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.enviarAnaliticoConFirmaStream(
              (io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta>) responseObserver);
        case METHODID_ENVIAR_ANALITICO_SIN_FIRMA_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.enviarAnaliticoSinFirmaStream(
              (io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta>) responseObserver);
        case METHODID_EDITAR_ANALITICO_SIN_FIRMA_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.editarAnaliticoSinFirmaStream(
              (io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class serviciosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    serviciosBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return data_analytics.CourseworkCertificate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("servicios");
    }
  }

  private static final class serviciosFileDescriptorSupplier
      extends serviciosBaseDescriptorSupplier {
    serviciosFileDescriptorSupplier() {}
  }

  private static final class serviciosMethodDescriptorSupplier
      extends serviciosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    serviciosMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (serviciosGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new serviciosFileDescriptorSupplier())
              .addMethod(METHOD_CONSULTA_ANALITICO_STREAM)
              .addMethod(METHOD_ENVIAR_ANALITICO_CON_FIRMA_STREAM)
              .addMethod(METHOD_ENVIAR_ANALITICO_SIN_FIRMA_STREAM)
              .addMethod(METHOD_EDITAR_ANALITICO_SIN_FIRMA_STREAM)
              .build();
        }
      }
    }
    return result;
  }
}
