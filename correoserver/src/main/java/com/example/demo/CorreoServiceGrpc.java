package com.example.demo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.2)",
    comments = "Source: correo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CorreoServiceGrpc {

  private CorreoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "CorreoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.CorreoProto.CorreoRequest,
      com.example.demo.CorreoProto.CorreoResponse> getEnviarCorreoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnviarCorreo",
      requestType = com.example.demo.CorreoProto.CorreoRequest.class,
      responseType = com.example.demo.CorreoProto.CorreoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.CorreoProto.CorreoRequest,
      com.example.demo.CorreoProto.CorreoResponse> getEnviarCorreoMethod() {
    io.grpc.MethodDescriptor<com.example.demo.CorreoProto.CorreoRequest, com.example.demo.CorreoProto.CorreoResponse> getEnviarCorreoMethod;
    if ((getEnviarCorreoMethod = CorreoServiceGrpc.getEnviarCorreoMethod) == null) {
      synchronized (CorreoServiceGrpc.class) {
        if ((getEnviarCorreoMethod = CorreoServiceGrpc.getEnviarCorreoMethod) == null) {
          CorreoServiceGrpc.getEnviarCorreoMethod = getEnviarCorreoMethod =
              io.grpc.MethodDescriptor.<com.example.demo.CorreoProto.CorreoRequest, com.example.demo.CorreoProto.CorreoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnviarCorreo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.CorreoProto.CorreoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.CorreoProto.CorreoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CorreoServiceMethodDescriptorSupplier("EnviarCorreo"))
              .build();
        }
      }
    }
    return getEnviarCorreoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.CorreoProto.CorreoRequest,
      com.example.demo.CorreoProto.CorreoResponse> getRecibirCorreoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecibirCorreo",
      requestType = com.example.demo.CorreoProto.CorreoRequest.class,
      responseType = com.example.demo.CorreoProto.CorreoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.CorreoProto.CorreoRequest,
      com.example.demo.CorreoProto.CorreoResponse> getRecibirCorreoMethod() {
    io.grpc.MethodDescriptor<com.example.demo.CorreoProto.CorreoRequest, com.example.demo.CorreoProto.CorreoResponse> getRecibirCorreoMethod;
    if ((getRecibirCorreoMethod = CorreoServiceGrpc.getRecibirCorreoMethod) == null) {
      synchronized (CorreoServiceGrpc.class) {
        if ((getRecibirCorreoMethod = CorreoServiceGrpc.getRecibirCorreoMethod) == null) {
          CorreoServiceGrpc.getRecibirCorreoMethod = getRecibirCorreoMethod =
              io.grpc.MethodDescriptor.<com.example.demo.CorreoProto.CorreoRequest, com.example.demo.CorreoProto.CorreoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecibirCorreo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.CorreoProto.CorreoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.CorreoProto.CorreoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CorreoServiceMethodDescriptorSupplier("RecibirCorreo"))
              .build();
        }
      }
    }
    return getRecibirCorreoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CorreoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CorreoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CorreoServiceStub>() {
        @java.lang.Override
        public CorreoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CorreoServiceStub(channel, callOptions);
        }
      };
    return CorreoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CorreoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CorreoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CorreoServiceBlockingStub>() {
        @java.lang.Override
        public CorreoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CorreoServiceBlockingStub(channel, callOptions);
        }
      };
    return CorreoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CorreoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CorreoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CorreoServiceFutureStub>() {
        @java.lang.Override
        public CorreoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CorreoServiceFutureStub(channel, callOptions);
        }
      };
    return CorreoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void enviarCorreo(com.example.demo.CorreoProto.CorreoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.CorreoProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnviarCorreoMethod(), responseObserver);
    }

    /**
     */
    default void recibirCorreo(com.example.demo.CorreoProto.CorreoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.CorreoProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecibirCorreoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CorreoService.
   */
  public static abstract class CorreoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CorreoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CorreoService.
   */
  public static final class CorreoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CorreoServiceStub> {
    private CorreoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CorreoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CorreoServiceStub(channel, callOptions);
    }

    /**
     */
    public void enviarCorreo(com.example.demo.CorreoProto.CorreoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.CorreoProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnviarCorreoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recibirCorreo(com.example.demo.CorreoProto.CorreoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.CorreoProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecibirCorreoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CorreoService.
   */
  public static final class CorreoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CorreoServiceBlockingStub> {
    private CorreoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CorreoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CorreoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.CorreoProto.CorreoResponse enviarCorreo(com.example.demo.CorreoProto.CorreoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnviarCorreoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.CorreoProto.CorreoResponse recibirCorreo(com.example.demo.CorreoProto.CorreoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecibirCorreoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CorreoService.
   */
  public static final class CorreoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CorreoServiceFutureStub> {
    private CorreoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CorreoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CorreoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.CorreoProto.CorreoResponse> enviarCorreo(
        com.example.demo.CorreoProto.CorreoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnviarCorreoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.CorreoProto.CorreoResponse> recibirCorreo(
        com.example.demo.CorreoProto.CorreoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecibirCorreoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENVIAR_CORREO = 0;
  private static final int METHODID_RECIBIR_CORREO = 1;

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
        case METHODID_ENVIAR_CORREO:
          serviceImpl.enviarCorreo((com.example.demo.CorreoProto.CorreoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.CorreoProto.CorreoResponse>) responseObserver);
          break;
        case METHODID_RECIBIR_CORREO:
          serviceImpl.recibirCorreo((com.example.demo.CorreoProto.CorreoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.CorreoProto.CorreoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
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
          getEnviarCorreoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.CorreoProto.CorreoRequest,
              com.example.demo.CorreoProto.CorreoResponse>(
                service, METHODID_ENVIAR_CORREO)))
        .addMethod(
          getRecibirCorreoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.CorreoProto.CorreoRequest,
              com.example.demo.CorreoProto.CorreoResponse>(
                service, METHODID_RECIBIR_CORREO)))
        .build();
  }

  private static abstract class CorreoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CorreoServiceBaseDescriptorSupplier(){}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.CorreoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CorreoService");
    }
  }

  private static final class CorreoServiceFileDescriptorSupplier
      extends CorreoServiceBaseDescriptorSupplier {
    CorreoServiceFileDescriptorSupplier() {}
  }

  private static final class CorreoServiceMethodDescriptorSupplier
      extends CorreoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CorreoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CorreoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CorreoServiceFileDescriptorSupplier())
              .addMethod(getEnviarCorreoMethod())
              .addMethod(getRecibirCorreoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
