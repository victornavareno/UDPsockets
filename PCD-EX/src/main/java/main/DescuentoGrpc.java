package main;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: EjemploExamen4.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DescuentoGrpc {

  private DescuentoGrpc() {}

  public static final String SERVICE_NAME = "Descuento";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<main.EjemploExamen4.ExamenRequest,
      main.EjemploExamen4.ExamenReply> getAplicarDescuentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "aplicarDescuento",
      requestType = main.EjemploExamen4.ExamenRequest.class,
      responseType = main.EjemploExamen4.ExamenReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<main.EjemploExamen4.ExamenRequest,
      main.EjemploExamen4.ExamenReply> getAplicarDescuentoMethod() {
    io.grpc.MethodDescriptor<main.EjemploExamen4.ExamenRequest, main.EjemploExamen4.ExamenReply> getAplicarDescuentoMethod;
    if ((getAplicarDescuentoMethod = DescuentoGrpc.getAplicarDescuentoMethod) == null) {
      synchronized (DescuentoGrpc.class) {
        if ((getAplicarDescuentoMethod = DescuentoGrpc.getAplicarDescuentoMethod) == null) {
          DescuentoGrpc.getAplicarDescuentoMethod = getAplicarDescuentoMethod =
              io.grpc.MethodDescriptor.<main.EjemploExamen4.ExamenRequest, main.EjemploExamen4.ExamenReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "aplicarDescuento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  main.EjemploExamen4.ExamenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  main.EjemploExamen4.ExamenReply.getDefaultInstance()))
              .setSchemaDescriptor(new DescuentoMethodDescriptorSupplier("aplicarDescuento"))
              .build();
        }
      }
    }
    return getAplicarDescuentoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DescuentoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DescuentoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DescuentoStub>() {
        @java.lang.Override
        public DescuentoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DescuentoStub(channel, callOptions);
        }
      };
    return DescuentoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DescuentoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DescuentoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DescuentoBlockingStub>() {
        @java.lang.Override
        public DescuentoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DescuentoBlockingStub(channel, callOptions);
        }
      };
    return DescuentoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DescuentoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DescuentoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DescuentoFutureStub>() {
        @java.lang.Override
        public DescuentoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DescuentoFutureStub(channel, callOptions);
        }
      };
    return DescuentoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void aplicarDescuento(main.EjemploExamen4.ExamenRequest request,
        io.grpc.stub.StreamObserver<main.EjemploExamen4.ExamenReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAplicarDescuentoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Descuento.
   */
  public static abstract class DescuentoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DescuentoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Descuento.
   */
  public static final class DescuentoStub
      extends io.grpc.stub.AbstractAsyncStub<DescuentoStub> {
    private DescuentoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DescuentoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DescuentoStub(channel, callOptions);
    }

    /**
     */
    public void aplicarDescuento(main.EjemploExamen4.ExamenRequest request,
        io.grpc.stub.StreamObserver<main.EjemploExamen4.ExamenReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAplicarDescuentoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Descuento.
   */
  public static final class DescuentoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DescuentoBlockingStub> {
    private DescuentoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DescuentoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DescuentoBlockingStub(channel, callOptions);
    }

    /**
     */
    public main.EjemploExamen4.ExamenReply aplicarDescuento(main.EjemploExamen4.ExamenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAplicarDescuentoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Descuento.
   */
  public static final class DescuentoFutureStub
      extends io.grpc.stub.AbstractFutureStub<DescuentoFutureStub> {
    private DescuentoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DescuentoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DescuentoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<main.EjemploExamen4.ExamenReply> aplicarDescuento(
        main.EjemploExamen4.ExamenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAplicarDescuentoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APLICAR_DESCUENTO = 0;

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
        case METHODID_APLICAR_DESCUENTO:
          serviceImpl.aplicarDescuento((main.EjemploExamen4.ExamenRequest) request,
              (io.grpc.stub.StreamObserver<main.EjemploExamen4.ExamenReply>) responseObserver);
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
          getAplicarDescuentoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              main.EjemploExamen4.ExamenRequest,
              main.EjemploExamen4.ExamenReply>(
                service, METHODID_APLICAR_DESCUENTO)))
        .build();
  }

  private static abstract class DescuentoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DescuentoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return main.EjemploExamen4.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Descuento");
    }
  }

  private static final class DescuentoFileDescriptorSupplier
      extends DescuentoBaseDescriptorSupplier {
    DescuentoFileDescriptorSupplier() {}
  }

  private static final class DescuentoMethodDescriptorSupplier
      extends DescuentoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DescuentoMethodDescriptorSupplier(String methodName) {
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
      synchronized (DescuentoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DescuentoFileDescriptorSupplier())
              .addMethod(getAplicarDescuentoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
