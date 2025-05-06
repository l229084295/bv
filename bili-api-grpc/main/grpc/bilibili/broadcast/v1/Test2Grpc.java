package bilibili.broadcast.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: bilibili/broadcast/v1/test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class Test2Grpc {

  private Test2Grpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.v1.Test2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.broadcast.v1.AddParams,
      com.google.protobuf.Empty> getTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Test",
      requestType = bilibili.broadcast.v1.AddParams.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.broadcast.v1.AddParams,
      com.google.protobuf.Empty> getTestMethod() {
    io.grpc.MethodDescriptor<bilibili.broadcast.v1.AddParams, com.google.protobuf.Empty> getTestMethod;
    if ((getTestMethod = Test2Grpc.getTestMethod) == null) {
      synchronized (Test2Grpc.class) {
        if ((getTestMethod = Test2Grpc.getTestMethod) == null) {
          Test2Grpc.getTestMethod = getTestMethod =
              io.grpc.MethodDescriptor.<bilibili.broadcast.v1.AddParams, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Test"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.AddParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Test2MethodDescriptorSupplier("Test"))
              .build();
        }
      }
    }
    return getTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Test2Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Test2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Test2Stub>() {
        @java.lang.Override
        public Test2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Test2Stub(channel, callOptions);
        }
      };
    return Test2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Test2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Test2BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Test2BlockingStub>() {
        @java.lang.Override
        public Test2BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Test2BlockingStub(channel, callOptions);
        }
      };
    return Test2BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Test2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Test2FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Test2FutureStub>() {
        @java.lang.Override
        public Test2FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Test2FutureStub(channel, callOptions);
        }
      };
    return Test2FutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void test(bilibili.broadcast.v1.AddParams request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Test2.
   */
  public static abstract class Test2ImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return Test2Grpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Test2.
   */
  public static final class Test2Stub
      extends io.grpc.stub.AbstractAsyncStub<Test2Stub> {
    private Test2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Test2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Test2Stub(channel, callOptions);
    }

    /**
     */
    public void test(bilibili.broadcast.v1.AddParams request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Test2.
   */
  public static final class Test2BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<Test2BlockingStub> {
    private Test2BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Test2BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Test2BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty test(bilibili.broadcast.v1.AddParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Test2.
   */
  public static final class Test2FutureStub
      extends io.grpc.stub.AbstractFutureStub<Test2FutureStub> {
    private Test2FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Test2FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Test2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> test(
        bilibili.broadcast.v1.AddParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST = 0;

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
        case METHODID_TEST:
          serviceImpl.test((bilibili.broadcast.v1.AddParams) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getTestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.broadcast.v1.AddParams,
              com.google.protobuf.Empty>(
                service, METHODID_TEST)))
        .build();
  }

  private static abstract class Test2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Test2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.v1.TestOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Test2");
    }
  }

  private static final class Test2FileDescriptorSupplier
      extends Test2BaseDescriptorSupplier {
    Test2FileDescriptorSupplier() {}
  }

  private static final class Test2MethodDescriptorSupplier
      extends Test2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    Test2MethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (Test2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Test2FileDescriptorSupplier())
              .addMethod(getTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
