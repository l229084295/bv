package bilibili.app.viewunite.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 统一视频信息接口 (7.41.0+)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: bilibili/app/viewunite/v1/viewunite.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ViewGrpc {

  private ViewGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.app.viewunite.v1.View";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ArcRefreshReq,
      bilibili.app.viewunite.v1.ArcRefreshReply> getArcRefreshMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArcRefresh",
      requestType = bilibili.app.viewunite.v1.ArcRefreshReq.class,
      responseType = bilibili.app.viewunite.v1.ArcRefreshReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ArcRefreshReq,
      bilibili.app.viewunite.v1.ArcRefreshReply> getArcRefreshMethod() {
    io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ArcRefreshReq, bilibili.app.viewunite.v1.ArcRefreshReply> getArcRefreshMethod;
    if ((getArcRefreshMethod = ViewGrpc.getArcRefreshMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getArcRefreshMethod = ViewGrpc.getArcRefreshMethod) == null) {
          ViewGrpc.getArcRefreshMethod = getArcRefreshMethod =
              io.grpc.MethodDescriptor.<bilibili.app.viewunite.v1.ArcRefreshReq, bilibili.app.viewunite.v1.ArcRefreshReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArcRefresh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.viewunite.v1.ArcRefreshReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.viewunite.v1.ArcRefreshReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ArcRefresh"))
              .build();
        }
      }
    }
    return getArcRefreshMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.RelatesFeedReq,
      bilibili.app.viewunite.v1.RelatesFeedReply> getRelatesFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelatesFeed",
      requestType = bilibili.app.viewunite.v1.RelatesFeedReq.class,
      responseType = bilibili.app.viewunite.v1.RelatesFeedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.RelatesFeedReq,
      bilibili.app.viewunite.v1.RelatesFeedReply> getRelatesFeedMethod() {
    io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.RelatesFeedReq, bilibili.app.viewunite.v1.RelatesFeedReply> getRelatesFeedMethod;
    if ((getRelatesFeedMethod = ViewGrpc.getRelatesFeedMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getRelatesFeedMethod = ViewGrpc.getRelatesFeedMethod) == null) {
          ViewGrpc.getRelatesFeedMethod = getRelatesFeedMethod =
              io.grpc.MethodDescriptor.<bilibili.app.viewunite.v1.RelatesFeedReq, bilibili.app.viewunite.v1.RelatesFeedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelatesFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.viewunite.v1.RelatesFeedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.viewunite.v1.RelatesFeedReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("RelatesFeed"))
              .build();
        }
      }
    }
    return getRelatesFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ViewReq,
      bilibili.app.viewunite.v1.ViewReply> getViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "View",
      requestType = bilibili.app.viewunite.v1.ViewReq.class,
      responseType = bilibili.app.viewunite.v1.ViewReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ViewReq,
      bilibili.app.viewunite.v1.ViewReply> getViewMethod() {
    io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ViewReq, bilibili.app.viewunite.v1.ViewReply> getViewMethod;
    if ((getViewMethod = ViewGrpc.getViewMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getViewMethod = ViewGrpc.getViewMethod) == null) {
          ViewGrpc.getViewMethod = getViewMethod =
              io.grpc.MethodDescriptor.<bilibili.app.viewunite.v1.ViewReq, bilibili.app.viewunite.v1.ViewReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "View"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.viewunite.v1.ViewReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.viewunite.v1.ViewReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("View"))
              .build();
        }
      }
    }
    return getViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ViewProgressReq,
      bilibili.app.viewunite.v1.ViewProgressReply> getViewProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProgress",
      requestType = bilibili.app.viewunite.v1.ViewProgressReq.class,
      responseType = bilibili.app.viewunite.v1.ViewProgressReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ViewProgressReq,
      bilibili.app.viewunite.v1.ViewProgressReply> getViewProgressMethod() {
    io.grpc.MethodDescriptor<bilibili.app.viewunite.v1.ViewProgressReq, bilibili.app.viewunite.v1.ViewProgressReply> getViewProgressMethod;
    if ((getViewProgressMethod = ViewGrpc.getViewProgressMethod) == null) {
      synchronized (ViewGrpc.class) {
        if ((getViewProgressMethod = ViewGrpc.getViewProgressMethod) == null) {
          ViewGrpc.getViewProgressMethod = getViewProgressMethod =
              io.grpc.MethodDescriptor.<bilibili.app.viewunite.v1.ViewProgressReq, bilibili.app.viewunite.v1.ViewProgressReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.viewunite.v1.ViewProgressReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.app.viewunite.v1.ViewProgressReply.getDefaultInstance()))
              .setSchemaDescriptor(new ViewMethodDescriptorSupplier("ViewProgress"))
              .build();
        }
      }
    }
    return getViewProgressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ViewStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ViewStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ViewStub>() {
        @java.lang.Override
        public ViewStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ViewStub(channel, callOptions);
        }
      };
    return ViewStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ViewBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ViewBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ViewBlockingStub>() {
        @java.lang.Override
        public ViewBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ViewBlockingStub(channel, callOptions);
        }
      };
    return ViewBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ViewFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ViewFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ViewFutureStub>() {
        @java.lang.Override
        public ViewFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ViewFutureStub(channel, callOptions);
        }
      };
    return ViewFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 统一视频信息接口 (7.41.0+)
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void arcRefresh(bilibili.app.viewunite.v1.ArcRefreshReq request,
        io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ArcRefreshReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArcRefreshMethod(), responseObserver);
    }

    /**
     * <pre>
     * 视频详情页下方推荐
     * </pre>
     */
    default void relatesFeed(bilibili.app.viewunite.v1.RelatesFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.RelatesFeedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelatesFeedMethod(), responseObserver);
    }

    /**
     */
    default void view(bilibili.app.viewunite.v1.ViewReq request,
        io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ViewReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMethod(), responseObserver);
    }

    /**
     */
    default void viewProgress(bilibili.app.viewunite.v1.ViewProgressReq request,
        io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ViewProgressReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProgressMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service View.
   * <pre>
   * 统一视频信息接口 (7.41.0+)
   * </pre>
   */
  public static abstract class ViewImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ViewGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service View.
   * <pre>
   * 统一视频信息接口 (7.41.0+)
   * </pre>
   */
  public static final class ViewStub
      extends io.grpc.stub.AbstractAsyncStub<ViewStub> {
    private ViewStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViewStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ViewStub(channel, callOptions);
    }

    /**
     */
    public void arcRefresh(bilibili.app.viewunite.v1.ArcRefreshReq request,
        io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ArcRefreshReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArcRefreshMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 视频详情页下方推荐
     * </pre>
     */
    public void relatesFeed(bilibili.app.viewunite.v1.RelatesFeedReq request,
        io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.RelatesFeedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelatesFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void view(bilibili.app.viewunite.v1.ViewReq request,
        io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ViewReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewProgress(bilibili.app.viewunite.v1.ViewProgressReq request,
        io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ViewProgressReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProgressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service View.
   * <pre>
   * 统一视频信息接口 (7.41.0+)
   * </pre>
   */
  public static final class ViewBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ViewBlockingStub> {
    private ViewBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViewBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ViewBlockingStub(channel, callOptions);
    }

    /**
     */
    public bilibili.app.viewunite.v1.ArcRefreshReply arcRefresh(bilibili.app.viewunite.v1.ArcRefreshReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArcRefreshMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 视频详情页下方推荐
     * </pre>
     */
    public bilibili.app.viewunite.v1.RelatesFeedReply relatesFeed(bilibili.app.viewunite.v1.RelatesFeedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelatesFeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.viewunite.v1.ViewReply view(bilibili.app.viewunite.v1.ViewReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMethod(), getCallOptions(), request);
    }

    /**
     */
    public bilibili.app.viewunite.v1.ViewProgressReply viewProgress(bilibili.app.viewunite.v1.ViewProgressReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProgressMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service View.
   * <pre>
   * 统一视频信息接口 (7.41.0+)
   * </pre>
   */
  public static final class ViewFutureStub
      extends io.grpc.stub.AbstractFutureStub<ViewFutureStub> {
    private ViewFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViewFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ViewFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.viewunite.v1.ArcRefreshReply> arcRefresh(
        bilibili.app.viewunite.v1.ArcRefreshReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArcRefreshMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 视频详情页下方推荐
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.viewunite.v1.RelatesFeedReply> relatesFeed(
        bilibili.app.viewunite.v1.RelatesFeedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelatesFeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.viewunite.v1.ViewReply> view(
        bilibili.app.viewunite.v1.ViewReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.app.viewunite.v1.ViewProgressReply> viewProgress(
        bilibili.app.viewunite.v1.ViewProgressReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProgressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ARC_REFRESH = 0;
  private static final int METHODID_RELATES_FEED = 1;
  private static final int METHODID_VIEW = 2;
  private static final int METHODID_VIEW_PROGRESS = 3;

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
        case METHODID_ARC_REFRESH:
          serviceImpl.arcRefresh((bilibili.app.viewunite.v1.ArcRefreshReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ArcRefreshReply>) responseObserver);
          break;
        case METHODID_RELATES_FEED:
          serviceImpl.relatesFeed((bilibili.app.viewunite.v1.RelatesFeedReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.RelatesFeedReply>) responseObserver);
          break;
        case METHODID_VIEW:
          serviceImpl.view((bilibili.app.viewunite.v1.ViewReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ViewReply>) responseObserver);
          break;
        case METHODID_VIEW_PROGRESS:
          serviceImpl.viewProgress((bilibili.app.viewunite.v1.ViewProgressReq) request,
              (io.grpc.stub.StreamObserver<bilibili.app.viewunite.v1.ViewProgressReply>) responseObserver);
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
          getArcRefreshMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.viewunite.v1.ArcRefreshReq,
              bilibili.app.viewunite.v1.ArcRefreshReply>(
                service, METHODID_ARC_REFRESH)))
        .addMethod(
          getRelatesFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.viewunite.v1.RelatesFeedReq,
              bilibili.app.viewunite.v1.RelatesFeedReply>(
                service, METHODID_RELATES_FEED)))
        .addMethod(
          getViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.viewunite.v1.ViewReq,
              bilibili.app.viewunite.v1.ViewReply>(
                service, METHODID_VIEW)))
        .addMethod(
          getViewProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.app.viewunite.v1.ViewProgressReq,
              bilibili.app.viewunite.v1.ViewProgressReply>(
                service, METHODID_VIEW_PROGRESS)))
        .build();
  }

  private static abstract class ViewBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ViewBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.app.viewunite.v1.Viewunite.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("View");
    }
  }

  private static final class ViewFileDescriptorSupplier
      extends ViewBaseDescriptorSupplier {
    ViewFileDescriptorSupplier() {}
  }

  private static final class ViewMethodDescriptorSupplier
      extends ViewBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ViewMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ViewGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ViewFileDescriptorSupplier())
              .addMethod(getArcRefreshMethod())
              .addMethod(getRelatesFeedMethod())
              .addMethod(getViewMethod())
              .addMethod(getViewProgressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
