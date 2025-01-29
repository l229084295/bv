package bilibili.api.ticket.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: bilibili/api/ticket/v1/ticket.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TicketGrpc {

  private TicketGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bilibili.api.ticket.v1.Ticket";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bilibili.api.ticket.v1.GetTicketRequest,
      bilibili.api.ticket.v1.GetTicketResponse> getGetTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTicket",
      requestType = bilibili.api.ticket.v1.GetTicketRequest.class,
      responseType = bilibili.api.ticket.v1.GetTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bilibili.api.ticket.v1.GetTicketRequest,
      bilibili.api.ticket.v1.GetTicketResponse> getGetTicketMethod() {
    io.grpc.MethodDescriptor<bilibili.api.ticket.v1.GetTicketRequest, bilibili.api.ticket.v1.GetTicketResponse> getGetTicketMethod;
    if ((getGetTicketMethod = TicketGrpc.getGetTicketMethod) == null) {
      synchronized (TicketGrpc.class) {
        if ((getGetTicketMethod = TicketGrpc.getGetTicketMethod) == null) {
          TicketGrpc.getGetTicketMethod = getGetTicketMethod =
              io.grpc.MethodDescriptor.<bilibili.api.ticket.v1.GetTicketRequest, bilibili.api.ticket.v1.GetTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.ticket.v1.GetTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bilibili.api.ticket.v1.GetTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketMethodDescriptorSupplier("GetTicket"))
              .build();
        }
      }
    }
    return getGetTicketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketStub>() {
        @java.lang.Override
        public TicketStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketStub(channel, callOptions);
        }
      };
    return TicketStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketBlockingStub>() {
        @java.lang.Override
        public TicketBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketBlockingStub(channel, callOptions);
        }
      };
    return TicketBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketFutureStub>() {
        @java.lang.Override
        public TicketFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketFutureStub(channel, callOptions);
        }
      };
    return TicketFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取鉴权用 Ticket
     * </pre>
     */
    default void getTicket(bilibili.api.ticket.v1.GetTicketRequest request,
        io.grpc.stub.StreamObserver<bilibili.api.ticket.v1.GetTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTicketMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Ticket.
   */
  public static abstract class TicketImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TicketGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Ticket.
   */
  public static final class TicketStub
      extends io.grpc.stub.AbstractAsyncStub<TicketStub> {
    private TicketStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取鉴权用 Ticket
     * </pre>
     */
    public void getTicket(bilibili.api.ticket.v1.GetTicketRequest request,
        io.grpc.stub.StreamObserver<bilibili.api.ticket.v1.GetTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTicketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Ticket.
   */
  public static final class TicketBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TicketBlockingStub> {
    private TicketBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取鉴权用 Ticket
     * </pre>
     */
    public bilibili.api.ticket.v1.GetTicketResponse getTicket(bilibili.api.ticket.v1.GetTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTicketMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Ticket.
   */
  public static final class TicketFutureStub
      extends io.grpc.stub.AbstractFutureStub<TicketFutureStub> {
    private TicketFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取鉴权用 Ticket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bilibili.api.ticket.v1.GetTicketResponse> getTicket(
        bilibili.api.ticket.v1.GetTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TICKET = 0;

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
        case METHODID_GET_TICKET:
          serviceImpl.getTicket((bilibili.api.ticket.v1.GetTicketRequest) request,
              (io.grpc.stub.StreamObserver<bilibili.api.ticket.v1.GetTicketResponse>) responseObserver);
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
          getGetTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bilibili.api.ticket.v1.GetTicketRequest,
              bilibili.api.ticket.v1.GetTicketResponse>(
                service, METHODID_GET_TICKET)))
        .build();
  }

  private static abstract class TicketBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bilibili.api.ticket.v1.TicketOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Ticket");
    }
  }

  private static final class TicketFileDescriptorSupplier
      extends TicketBaseDescriptorSupplier {
    TicketFileDescriptorSupplier() {}
  }

  private static final class TicketMethodDescriptorSupplier
      extends TicketBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TicketMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TicketGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketFileDescriptorSupplier())
              .addMethod(getGetTicketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
