package bilibili.broadcast.v1

import com.google.protobuf.Empty
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.bidiStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.bidiStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow
import bilibili.broadcast.v1.BroadcastGrpc.getServiceDescriptor as broadcastGrpcGetServiceDescriptor
import bilibili.broadcast.v1.BroadcastTunnelGrpc.getServiceDescriptor as broadcastTunnelGrpcGetServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.broadcast.v1.Broadcast.
 */
public object BroadcastGrpcKt {
  public const val SERVICE_NAME: String = BroadcastGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = broadcastGrpcGetServiceDescriptor()

  public val authMethod: MethodDescriptor<AuthReq, AuthResp>
    @JvmStatic
    get() = BroadcastGrpc.getAuthMethod()

  public val heartbeatMethod: MethodDescriptor<HeartbeatReq, HeartbeatResp>
    @JvmStatic
    get() = BroadcastGrpc.getHeartbeatMethod()

  public val subscribeMethod: MethodDescriptor<TargetPath, Empty>
    @JvmStatic
    get() = BroadcastGrpc.getSubscribeMethod()

  public val unsubscribeMethod: MethodDescriptor<TargetPath, Empty>
    @JvmStatic
    get() = BroadcastGrpc.getUnsubscribeMethod()

  public val messageAckMethod: MethodDescriptor<MessageAckReq, Empty>
    @JvmStatic
    get() = BroadcastGrpc.getMessageAckMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.broadcast.v1.Broadcast service as suspending
   * coroutines.
   */
  @StubFor(BroadcastGrpc::class)
  public class BroadcastCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<BroadcastCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): BroadcastCoroutineStub =
        BroadcastCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun auth(request: AuthReq, headers: Metadata = Metadata()): AuthResp = unaryRpc(
      channel,
      BroadcastGrpc.getAuthMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun heartbeat(request: HeartbeatReq, headers: Metadata = Metadata()):
        HeartbeatResp = unaryRpc(
      channel,
      BroadcastGrpc.getHeartbeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun subscribe(request: TargetPath, headers: Metadata = Metadata()): Empty =
        unaryRpc(
      channel,
      BroadcastGrpc.getSubscribeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun unsubscribe(request: TargetPath, headers: Metadata = Metadata()): Empty =
        unaryRpc(
      channel,
      BroadcastGrpc.getUnsubscribeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun messageAck(request: MessageAckReq, headers: Metadata = Metadata()): Empty =
        unaryRpc(
      channel,
      BroadcastGrpc.getMessageAckMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.broadcast.v1.Broadcast service based on Kotlin
   * coroutines.
   */
  public abstract class BroadcastCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.broadcast.v1.Broadcast.Auth.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun auth(request: AuthReq): AuthResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.v1.Broadcast.Auth is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.broadcast.v1.Broadcast.Heartbeat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun heartbeat(request: HeartbeatReq): HeartbeatResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.v1.Broadcast.Heartbeat is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.broadcast.v1.Broadcast.Subscribe.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun subscribe(request: TargetPath): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.v1.Broadcast.Subscribe is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.broadcast.v1.Broadcast.Unsubscribe.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unsubscribe(request: TargetPath): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.v1.Broadcast.Unsubscribe is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.broadcast.v1.Broadcast.MessageAck.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun messageAck(request: MessageAckReq): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.v1.Broadcast.MessageAck is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(broadcastGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BroadcastGrpc.getAuthMethod(),
      implementation = ::auth
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BroadcastGrpc.getHeartbeatMethod(),
      implementation = ::heartbeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BroadcastGrpc.getSubscribeMethod(),
      implementation = ::subscribe
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BroadcastGrpc.getUnsubscribeMethod(),
      implementation = ::unsubscribe
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BroadcastGrpc.getMessageAckMethod(),
      implementation = ::messageAck
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * bilibili.broadcast.v1.BroadcastTunnel.
 */
public object BroadcastTunnelGrpcKt {
  public const val SERVICE_NAME: String = BroadcastTunnelGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = broadcastTunnelGrpcGetServiceDescriptor()

  public val createTunnelMethod: MethodDescriptor<BroadcastFrame, BroadcastFrame>
    @JvmStatic
    get() = BroadcastTunnelGrpc.getCreateTunnelMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.broadcast.v1.BroadcastTunnel service as suspending
   * coroutines.
   */
  @StubFor(BroadcastTunnelGrpc::class)
  public class BroadcastTunnelCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<BroadcastTunnelCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): BroadcastTunnelCoroutineStub =
        BroadcastTunnelCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * The [Flow] of requests is collected once each time the [Flow] of responses is
     * collected. If collection of the [Flow] of responses completes normally or
     * exceptionally before collection of `requests` completes, the collection of
     * `requests` is cancelled.  If the collection of `requests` completes
     * exceptionally for any other reason, then the collection of the [Flow] of responses
     * completes exceptionally for the same reason and the RPC is cancelled with that reason.
     *
     * @param requests A [Flow] of request messages.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun createTunnel(requests: Flow<BroadcastFrame>, headers: Metadata = Metadata()):
        Flow<BroadcastFrame> = bidiStreamingRpc(
      channel,
      BroadcastTunnelGrpc.getCreateTunnelMethod(),
      requests,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.broadcast.v1.BroadcastTunnel service based on Kotlin
   * coroutines.
   */
  public abstract class BroadcastTunnelCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * bilibili.broadcast.v1.BroadcastTunnel.CreateTunnel.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param requests A [Flow] of requests from the client.  This flow can be
     *        collected only once and throws [java.lang.IllegalStateException] on attempts to
     * collect
     *        it more than once.
     */
    public open fun createTunnel(requests: Flow<BroadcastFrame>): Flow<BroadcastFrame> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.v1.BroadcastTunnel.CreateTunnel is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(broadcastTunnelGrpcGetServiceDescriptor())
      .addMethod(bidiStreamingServerMethodDefinition(
      context = this.context,
      descriptor = BroadcastTunnelGrpc.getCreateTunnelMethod(),
      implementation = ::createTunnel
    )).build()
  }
}
