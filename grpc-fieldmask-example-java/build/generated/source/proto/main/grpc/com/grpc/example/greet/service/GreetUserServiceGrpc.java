package com.grpc.example.greet.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: greet_user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetUserServiceGrpc {

  private GreetUserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.example.GreetUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.example.greet.service.GreetUserRequest,
      com.grpc.example.greet.service.GreetUserResponse> getGreetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetUser",
      requestType = com.grpc.example.greet.service.GreetUserRequest.class,
      responseType = com.grpc.example.greet.service.GreetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.example.greet.service.GreetUserRequest,
      com.grpc.example.greet.service.GreetUserResponse> getGreetUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.example.greet.service.GreetUserRequest, com.grpc.example.greet.service.GreetUserResponse> getGreetUserMethod;
    if ((getGreetUserMethod = GreetUserServiceGrpc.getGreetUserMethod) == null) {
      synchronized (GreetUserServiceGrpc.class) {
        if ((getGreetUserMethod = GreetUserServiceGrpc.getGreetUserMethod) == null) {
          GreetUserServiceGrpc.getGreetUserMethod = getGreetUserMethod =
              io.grpc.MethodDescriptor.<com.grpc.example.greet.service.GreetUserRequest, com.grpc.example.greet.service.GreetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.example.greet.service.GreetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.example.greet.service.GreetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetUserServiceMethodDescriptorSupplier("GreetUser"))
              .build();
        }
      }
    }
    return getGreetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.example.greet.service.GetRandomUserRequest,
      com.grpc.example.greet.service.GetRandomUserResponse> getGetRandomUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRandomUser",
      requestType = com.grpc.example.greet.service.GetRandomUserRequest.class,
      responseType = com.grpc.example.greet.service.GetRandomUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.example.greet.service.GetRandomUserRequest,
      com.grpc.example.greet.service.GetRandomUserResponse> getGetRandomUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.example.greet.service.GetRandomUserRequest, com.grpc.example.greet.service.GetRandomUserResponse> getGetRandomUserMethod;
    if ((getGetRandomUserMethod = GreetUserServiceGrpc.getGetRandomUserMethod) == null) {
      synchronized (GreetUserServiceGrpc.class) {
        if ((getGetRandomUserMethod = GreetUserServiceGrpc.getGetRandomUserMethod) == null) {
          GreetUserServiceGrpc.getGetRandomUserMethod = getGetRandomUserMethod =
              io.grpc.MethodDescriptor.<com.grpc.example.greet.service.GetRandomUserRequest, com.grpc.example.greet.service.GetRandomUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRandomUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.example.greet.service.GetRandomUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.example.greet.service.GetRandomUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetUserServiceMethodDescriptorSupplier("GetRandomUser"))
              .build();
        }
      }
    }
    return getGetRandomUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetUserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceStub>() {
        @java.lang.Override
        public GreetUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetUserServiceStub(channel, callOptions);
        }
      };
    return GreetUserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceBlockingStub>() {
        @java.lang.Override
        public GreetUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetUserServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetUserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceFutureStub>() {
        @java.lang.Override
        public GreetUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetUserServiceFutureStub(channel, callOptions);
        }
      };
    return GreetUserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetUserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greetUser(com.grpc.example.greet.service.GreetUserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.example.greet.service.GreetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetUserMethod(), responseObserver);
    }

    /**
     */
    public void getRandomUser(com.grpc.example.greet.service.GetRandomUserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.example.greet.service.GetRandomUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRandomUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.grpc.example.greet.service.GreetUserRequest,
                com.grpc.example.greet.service.GreetUserResponse>(
                  this, METHODID_GREET_USER)))
          .addMethod(
            getGetRandomUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.grpc.example.greet.service.GetRandomUserRequest,
                com.grpc.example.greet.service.GetRandomUserResponse>(
                  this, METHODID_GET_RANDOM_USER)))
          .build();
    }
  }

  /**
   */
  public static final class GreetUserServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetUserServiceStub> {
    private GreetUserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetUserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetUserServiceStub(channel, callOptions);
    }

    /**
     */
    public void greetUser(com.grpc.example.greet.service.GreetUserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.example.greet.service.GreetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRandomUser(com.grpc.example.greet.service.GetRandomUserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.example.greet.service.GetRandomUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRandomUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetUserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetUserServiceBlockingStub> {
    private GreetUserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetUserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetUserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.example.greet.service.GreetUserResponse greetUser(com.grpc.example.greet.service.GreetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.example.greet.service.GetRandomUserResponse getRandomUser(com.grpc.example.greet.service.GetRandomUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRandomUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetUserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetUserServiceFutureStub> {
    private GreetUserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetUserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetUserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.example.greet.service.GreetUserResponse> greetUser(
        com.grpc.example.greet.service.GreetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.example.greet.service.GetRandomUserResponse> getRandomUser(
        com.grpc.example.greet.service.GetRandomUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRandomUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET_USER = 0;
  private static final int METHODID_GET_RANDOM_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetUserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetUserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET_USER:
          serviceImpl.greetUser((com.grpc.example.greet.service.GreetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.example.greet.service.GreetUserResponse>) responseObserver);
          break;
        case METHODID_GET_RANDOM_USER:
          serviceImpl.getRandomUser((com.grpc.example.greet.service.GetRandomUserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.example.greet.service.GetRandomUserResponse>) responseObserver);
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

  private static abstract class GreetUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetUserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.example.greet.service.GreetUserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetUserService");
    }
  }

  private static final class GreetUserServiceFileDescriptorSupplier
      extends GreetUserServiceBaseDescriptorSupplier {
    GreetUserServiceFileDescriptorSupplier() {}
  }

  private static final class GreetUserServiceMethodDescriptorSupplier
      extends GreetUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetUserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetUserServiceFileDescriptorSupplier())
              .addMethod(getGreetUserMethod())
              .addMethod(getGetRandomUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
