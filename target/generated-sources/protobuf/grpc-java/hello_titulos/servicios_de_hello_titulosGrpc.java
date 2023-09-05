package hello_titulos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: hello_titulos.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class servicios_de_hello_titulosGrpc {

  private servicios_de_hello_titulosGrpc() {}

  public static final String SERVICE_NAME = "hello_titulos.servicios_de_hello_titulos";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<hello_titulos.HelloTitulos.hello,
      hello_titulos.HelloTitulos.hello_respuesta> getSendIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send_id",
      requestType = hello_titulos.HelloTitulos.hello.class,
      responseType = hello_titulos.HelloTitulos.hello_respuesta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<hello_titulos.HelloTitulos.hello,
      hello_titulos.HelloTitulos.hello_respuesta> getSendIdMethod() {
    io.grpc.MethodDescriptor<hello_titulos.HelloTitulos.hello, hello_titulos.HelloTitulos.hello_respuesta> getSendIdMethod;
    if ((getSendIdMethod = servicios_de_hello_titulosGrpc.getSendIdMethod) == null) {
      synchronized (servicios_de_hello_titulosGrpc.class) {
        if ((getSendIdMethod = servicios_de_hello_titulosGrpc.getSendIdMethod) == null) {
          servicios_de_hello_titulosGrpc.getSendIdMethod = getSendIdMethod =
              io.grpc.MethodDescriptor.<hello_titulos.HelloTitulos.hello, hello_titulos.HelloTitulos.hello_respuesta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send_id"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello_titulos.HelloTitulos.hello.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello_titulos.HelloTitulos.hello_respuesta.getDefaultInstance()))
              .setSchemaDescriptor(new servicios_de_hello_titulosMethodDescriptorSupplier("send_id"))
              .build();
        }
      }
    }
    return getSendIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static servicios_de_hello_titulosStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<servicios_de_hello_titulosStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<servicios_de_hello_titulosStub>() {
        @java.lang.Override
        public servicios_de_hello_titulosStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new servicios_de_hello_titulosStub(channel, callOptions);
        }
      };
    return servicios_de_hello_titulosStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static servicios_de_hello_titulosBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<servicios_de_hello_titulosBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<servicios_de_hello_titulosBlockingStub>() {
        @java.lang.Override
        public servicios_de_hello_titulosBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new servicios_de_hello_titulosBlockingStub(channel, callOptions);
        }
      };
    return servicios_de_hello_titulosBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static servicios_de_hello_titulosFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<servicios_de_hello_titulosFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<servicios_de_hello_titulosFutureStub>() {
        @java.lang.Override
        public servicios_de_hello_titulosFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new servicios_de_hello_titulosFutureStub(channel, callOptions);
        }
      };
    return servicios_de_hello_titulosFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendId(hello_titulos.HelloTitulos.hello request,
        io.grpc.stub.StreamObserver<hello_titulos.HelloTitulos.hello_respuesta> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service servicios_de_hello_titulos.
   */
  public static abstract class servicios_de_hello_titulosImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return servicios_de_hello_titulosGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service servicios_de_hello_titulos.
   */
  public static final class servicios_de_hello_titulosStub
      extends io.grpc.stub.AbstractAsyncStub<servicios_de_hello_titulosStub> {
    private servicios_de_hello_titulosStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected servicios_de_hello_titulosStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new servicios_de_hello_titulosStub(channel, callOptions);
    }

    /**
     */
    public void sendId(hello_titulos.HelloTitulos.hello request,
        io.grpc.stub.StreamObserver<hello_titulos.HelloTitulos.hello_respuesta> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service servicios_de_hello_titulos.
   */
  public static final class servicios_de_hello_titulosBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<servicios_de_hello_titulosBlockingStub> {
    private servicios_de_hello_titulosBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected servicios_de_hello_titulosBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new servicios_de_hello_titulosBlockingStub(channel, callOptions);
    }

    /**
     */
    public hello_titulos.HelloTitulos.hello_respuesta sendId(hello_titulos.HelloTitulos.hello request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service servicios_de_hello_titulos.
   */
  public static final class servicios_de_hello_titulosFutureStub
      extends io.grpc.stub.AbstractFutureStub<servicios_de_hello_titulosFutureStub> {
    private servicios_de_hello_titulosFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected servicios_de_hello_titulosFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new servicios_de_hello_titulosFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<hello_titulos.HelloTitulos.hello_respuesta> sendId(
        hello_titulos.HelloTitulos.hello request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSendIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              hello_titulos.HelloTitulos.hello,
              hello_titulos.HelloTitulos.hello_respuesta>(
                service, METHODID_SEND_ID)))
        .build();
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
              .addMethod(getSendIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
