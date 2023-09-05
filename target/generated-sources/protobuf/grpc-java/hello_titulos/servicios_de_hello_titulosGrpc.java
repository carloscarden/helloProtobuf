package hello_titulos;

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
    comments = "Source: hello_titulos.proto")
public final class servicios_de_hello_titulosGrpc {

  private servicios_de_hello_titulosGrpc() {}

  public static final String SERVICE_NAME = "hello_titulos.servicios_de_hello_titulos";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<hello_titulos.HelloTitulos.hello,
      hello_titulos.HelloTitulos.hello_respuesta> METHOD_SEND_ID =
      io.grpc.MethodDescriptor.<hello_titulos.HelloTitulos.hello, hello_titulos.HelloTitulos.hello_respuesta>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "hello_titulos.servicios_de_hello_titulos", "send_id"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello_titulos.HelloTitulos.hello.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello_titulos.HelloTitulos.hello_respuesta.getDefaultInstance()))
          .setSchemaDescriptor(new servicios_de_hello_titulosMethodDescriptorSupplier("send_id"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static servicios_de_hello_titulosStub newStub(io.grpc.Channel channel) {
    return new servicios_de_hello_titulosStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static servicios_de_hello_titulosBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new servicios_de_hello_titulosBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static servicios_de_hello_titulosFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new servicios_de_hello_titulosFutureStub(channel);
  }

  /**
   */
  public static abstract class servicios_de_hello_titulosImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendId(hello_titulos.HelloTitulos.hello request,
        io.grpc.stub.StreamObserver<hello_titulos.HelloTitulos.hello_respuesta> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_ID,
            asyncUnaryCall(
              new MethodHandlers<
                hello_titulos.HelloTitulos.hello,
                hello_titulos.HelloTitulos.hello_respuesta>(
                  this, METHODID_SEND_ID)))
          .build();
    }
  }

  /**
   */
  public static final class servicios_de_hello_titulosStub extends io.grpc.stub.AbstractStub<servicios_de_hello_titulosStub> {
    private servicios_de_hello_titulosStub(io.grpc.Channel channel) {
      super(channel);
    }

    private servicios_de_hello_titulosStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected servicios_de_hello_titulosStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new servicios_de_hello_titulosStub(channel, callOptions);
    }

    /**
     */
    public void sendId(hello_titulos.HelloTitulos.hello request,
        io.grpc.stub.StreamObserver<hello_titulos.HelloTitulos.hello_respuesta> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class servicios_de_hello_titulosBlockingStub extends io.grpc.stub.AbstractStub<servicios_de_hello_titulosBlockingStub> {
    private servicios_de_hello_titulosBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private servicios_de_hello_titulosBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected servicios_de_hello_titulosBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new servicios_de_hello_titulosBlockingStub(channel, callOptions);
    }

    /**
     */
    public hello_titulos.HelloTitulos.hello_respuesta sendId(hello_titulos.HelloTitulos.hello request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class servicios_de_hello_titulosFutureStub extends io.grpc.stub.AbstractStub<servicios_de_hello_titulosFutureStub> {
    private servicios_de_hello_titulosFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private servicios_de_hello_titulosFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected servicios_de_hello_titulosFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new servicios_de_hello_titulosFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<hello_titulos.HelloTitulos.hello_respuesta> sendId(
        hello_titulos.HelloTitulos.hello request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final servicios_de_hello_titulosImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(servicios_de_hello_titulosImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_ID:
          serviceImpl.sendId((hello_titulos.HelloTitulos.hello) request,
              (io.grpc.stub.StreamObserver<hello_titulos.HelloTitulos.hello_respuesta>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class servicios_de_hello_titulosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    servicios_de_hello_titulosBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return hello_titulos.HelloTitulos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("servicios_de_hello_titulos");
    }
  }

  private static final class servicios_de_hello_titulosFileDescriptorSupplier
      extends servicios_de_hello_titulosBaseDescriptorSupplier {
    servicios_de_hello_titulosFileDescriptorSupplier() {}
  }

  private static final class servicios_de_hello_titulosMethodDescriptorSupplier
      extends servicios_de_hello_titulosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    servicios_de_hello_titulosMethodDescriptorSupplier(String methodName) {
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
      synchronized (servicios_de_hello_titulosGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new servicios_de_hello_titulosFileDescriptorSupplier())
              .addMethod(METHOD_SEND_ID)
              .build();
        }
      }
    }
    return result;
  }
}
