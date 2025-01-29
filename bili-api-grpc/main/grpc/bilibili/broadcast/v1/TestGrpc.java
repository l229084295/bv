package bilibili.broadcast.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Test
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: bilibili/broadcast/v1/test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestGrpc {

  private TestGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.broadcast.v1.Test";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.v1.TestResp> getWatchTestEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchTestEvent",
      requestType = com.google.protobuf.Empty.class,
      responseType = bilibili.broadcast.v1.TestResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bilibili.broadcast.v1.TestResp> getWatchTestEventMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bilibili.broadcast.v1.TestResp> getWatchTestEventMethod;
    if ((getWatchTestEventMethod = TestGrpc.getWatchTestEventMethod) == null) {
      synchronized (TestGrpc.class) {
        if ((getWatchTestEventMethod = TestGrpc.getWatchTestEventMethod) == null) {
          TestGrpc.getWatchTestEventMethod = getWatchTestEventMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bilibili.broadcast.v1.TestResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchTestEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.broadcast.v1.TestResp.getDefaultInstance()))
              .setSchemaDescriptor(new TestMethodDescriptorSupplier("WatchTestEvent"))
              .build();
        }
      }
    }
    return getWatchTestEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestStub>() {
        @java.lang.Override
        public TestStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestStub(channel, callOptions);
        }
      };
    return TestStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestBlockingStub>() {
        @java.lang.Override
        public TestBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestBlockingStub(channel, callOptions);
        }
      };
    return TestBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestFutureStub>() {
        @java.lang.Override
        public TestFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestFutureStub(channel, callOptions);
        }
      };
    return TestFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Test
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 监听上报事件
     * </pre>
     */
    default void watchTestEvent(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.TestResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchTestEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Test.
   * <pre>
   * Test
   * </pre>
   */
  public static abstract class TestImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TestGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Test.
   * <pre>
   * Test
   * </pre>
   */
  public static final class TestStub
      extends io.grpc.stub.AbstractAsyncStub<TestStub> {
    private TestStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestStub(channel, callOptions);
    }

    /**
     * <pre>
     * 监听上报事件
     * </pre>
     */
    public void watchTestEvent(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bilibili.broadcast.v1.TestResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchTestEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Test.
   * <pre>
   * Test
   * </pre>
   */
  public static final class TestBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TestBlockingStub> {
    private TestBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 监听上报事件
     * </pre>
     */
    public java.util.Iterator<bilibili.broadcast.v1.TestResp> watchTestEvent(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchTestEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Test.
   * <pre>
   * Test
   * </pre>
   */
  public static final class TestFutureStub
      extends io.grpc.stub.AbstractFutureStub<TestFutureStub> {
    private TestFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATCH_TEST_EVENT = 0;

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
        case METHODID_WATCH_TEST_EVENT:
          serviceImpl.watchTestEvent((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bilibili.broadcast.v1.TestResp>) responseObserver);
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
          getWatchTestEventMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              bilibili.broadcast.v1.TestResp>(
                service, METHODID_WATCH_TEST_EVENT)))
        .build();
  }

  private static abstract class TestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.broadcast.v1.TestOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Test");
    }
  }

  private static final class TestFileDescriptorSupplier
      extends TestBaseDescriptorSupplier {
    TestFileDescriptorSupplier() {}
  }

  private static final class TestMethodDescriptorSupplier
      extends TestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TestMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TestGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestFileDescriptorSupplier())
              .addMethod(getWatchTestEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
