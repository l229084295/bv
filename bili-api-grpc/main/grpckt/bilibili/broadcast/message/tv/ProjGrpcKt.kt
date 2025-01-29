package bilibili.broadcast.message.tv

import bilibili.broadcast.message.tv.TvGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.broadcast.message.tv.Tv.
 */
public object TvGrpcKt {
  public const val SERVICE_NAME: String = TvGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val projMethod: MethodDescriptor<Empty, ProjReply>
    @JvmStatic
    get() = TvGrpc.getProjMethod()

  public val liveStatusMethod: MethodDescriptor<Empty, LiveStatusNotify>
    @JvmStatic
    get() = TvGrpc.getLiveStatusMethod()

  public val esportsMethod: MethodDescriptor<Empty, EsportsNotify>
    @JvmStatic
    get() = TvGrpc.getEsportsMethod()

  public val publicityMethod: MethodDescriptor<Empty, PublicityNotify>
    @JvmStatic
    get() = TvGrpc.getPublicityMethod()

  public val liveSkipMethod: MethodDescriptor<Empty, LiveSkipNotify>
    @JvmStatic
    get() = TvGrpc.getLiveSkipMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.broadcast.message.tv.Tv service as suspending
   * coroutines.
   */
  @StubFor(TvGrpc::class)
  public class TvCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TvCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TvCoroutineStub =
        TvCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun proj(request: Empty, headers: Metadata = Metadata()): Flow<ProjReply> =
        serverStreamingRpc(
      channel,
      TvGrpc.getProjMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun liveStatus(request: Empty, headers: Metadata = Metadata()): Flow<LiveStatusNotify> =
        serverStreamingRpc(
      channel,
      TvGrpc.getLiveStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun esports(request: Empty, headers: Metadata = Metadata()): Flow<EsportsNotify> =
        serverStreamingRpc(
      channel,
      TvGrpc.getEsportsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun publicity(request: Empty, headers: Metadata = Metadata()): Flow<PublicityNotify> =
        serverStreamingRpc(
      channel,
      TvGrpc.getPublicityMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun liveSkip(request: Empty, headers: Metadata = Metadata()): Flow<LiveSkipNotify> =
        serverStreamingRpc(
      channel,
      TvGrpc.getLiveSkipMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.broadcast.message.tv.Tv service based on Kotlin
   * coroutines.
   */
  public abstract class TvCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for bilibili.broadcast.message.tv.Tv.Proj.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun proj(request: Empty): Flow<ProjReply> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.message.tv.Tv.Proj is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for bilibili.broadcast.message.tv.Tv.LiveStatus.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun liveStatus(request: Empty): Flow<LiveStatusNotify> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.message.tv.Tv.LiveStatus is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for bilibili.broadcast.message.tv.Tv.Esports.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun esports(request: Empty): Flow<EsportsNotify> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.message.tv.Tv.Esports is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for bilibili.broadcast.message.tv.Tv.Publicity.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun publicity(request: Empty): Flow<PublicityNotify> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.message.tv.Tv.Publicity is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for bilibili.broadcast.message.tv.Tv.LiveSkip.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun liveSkip(request: Empty): Flow<LiveSkipNotify> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.message.tv.Tv.LiveSkip is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TvGrpc.getProjMethod(),
      implementation = ::proj
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TvGrpc.getLiveStatusMethod(),
      implementation = ::liveStatus
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TvGrpc.getEsportsMethod(),
      implementation = ::esports
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TvGrpc.getPublicityMethod(),
      implementation = ::publicity
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TvGrpc.getLiveSkipMethod(),
      implementation = ::liveSkip
    )).build()
  }
}
