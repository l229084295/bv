package pgc.gateway.vega.v1

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
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import pgc.gateway.vega.v1.VegaFrameDocGrpc.getServiceDescriptor as vegaFrameDocGrpcGetServiceDescriptor
import pgc.gateway.vega.v1.VegaGrpc.getServiceDescriptor as vegaGrpcGetServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for pgc.gateway.vega.v1.Vega.
 */
public object VegaGrpcKt {
  public const val SERVICE_NAME: String = VegaGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = vegaGrpcGetServiceDescriptor()

  public val createTunnelMethod: MethodDescriptor<VegaFrame, VegaFrame>
    @JvmStatic
    get() = VegaGrpc.getCreateTunnelMethod()

  /**
   * A stub for issuing RPCs to a(n) pgc.gateway.vega.v1.Vega service as suspending coroutines.
   */
  @StubFor(VegaGrpc::class)
  public class VegaCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<VegaCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): VegaCoroutineStub =
        VegaCoroutineStub(channel, callOptions)

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
    public suspend fun createTunnel(request: VegaFrame, headers: Metadata = Metadata()): VegaFrame =
        unaryRpc(
      channel,
      VegaGrpc.getCreateTunnelMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the pgc.gateway.vega.v1.Vega service based on Kotlin coroutines.
   */
  public abstract class VegaCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for pgc.gateway.vega.v1.Vega.CreateTunnel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createTunnel(request: VegaFrame): VegaFrame = throw
        StatusException(UNIMPLEMENTED.withDescription("Method pgc.gateway.vega.v1.Vega.CreateTunnel is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(vegaGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VegaGrpc.getCreateTunnelMethod(),
      implementation = ::createTunnel
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for pgc.gateway.vega.v1.VegaFrameDoc.
 */
public object VegaFrameDocGrpcKt {
  public const val SERVICE_NAME: String = VegaFrameDocGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = vegaFrameDocGrpcGetServiceDescriptor()

  public val authMethod: MethodDescriptor<AuthReq, AuthResp>
    @JvmStatic
    get() = VegaFrameDocGrpc.getAuthMethod()

  public val heartbeatMethod: MethodDescriptor<HeartbeatReq, HeartbeatResp>
    @JvmStatic
    get() = VegaFrameDocGrpc.getHeartbeatMethod()

  public val messageAckMethod: MethodDescriptor<MessageAckReq, Empty>
    @JvmStatic
    get() = VegaFrameDocGrpc.getMessageAckMethod()

  public val subscribeMethod: MethodDescriptor<SubscribeReq, Empty>
    @JvmStatic
    get() = VegaFrameDocGrpc.getSubscribeMethod()

  /**
   * A stub for issuing RPCs to a(n) pgc.gateway.vega.v1.VegaFrameDoc service as suspending
   * coroutines.
   */
  @StubFor(VegaFrameDocGrpc::class)
  public class VegaFrameDocCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<VegaFrameDocCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): VegaFrameDocCoroutineStub =
        VegaFrameDocCoroutineStub(channel, callOptions)

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
      VegaFrameDocGrpc.getAuthMethod(),
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
      VegaFrameDocGrpc.getHeartbeatMethod(),
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
      VegaFrameDocGrpc.getMessageAckMethod(),
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
    public suspend fun subscribe(request: SubscribeReq, headers: Metadata = Metadata()): Empty =
        unaryRpc(
      channel,
      VegaFrameDocGrpc.getSubscribeMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the pgc.gateway.vega.v1.VegaFrameDoc service based on Kotlin
   * coroutines.
   */
  public abstract class VegaFrameDocCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for pgc.gateway.vega.v1.VegaFrameDoc.Auth.
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
        StatusException(UNIMPLEMENTED.withDescription("Method pgc.gateway.vega.v1.VegaFrameDoc.Auth is unimplemented"))

    /**
     * Returns the response to an RPC for pgc.gateway.vega.v1.VegaFrameDoc.Heartbeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method pgc.gateway.vega.v1.VegaFrameDoc.Heartbeat is unimplemented"))

    /**
     * Returns the response to an RPC for pgc.gateway.vega.v1.VegaFrameDoc.MessageAck.
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
        StatusException(UNIMPLEMENTED.withDescription("Method pgc.gateway.vega.v1.VegaFrameDoc.MessageAck is unimplemented"))

    /**
     * Returns the response to an RPC for pgc.gateway.vega.v1.VegaFrameDoc.Subscribe.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun subscribe(request: SubscribeReq): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method pgc.gateway.vega.v1.VegaFrameDoc.Subscribe is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(vegaFrameDocGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VegaFrameDocGrpc.getAuthMethod(),
      implementation = ::auth
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VegaFrameDocGrpc.getHeartbeatMethod(),
      implementation = ::heartbeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VegaFrameDocGrpc.getMessageAckMethod(),
      implementation = ::messageAck
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VegaFrameDocGrpc.getSubscribeMethod(),
      implementation = ::subscribe
    )).build()
  }
}
