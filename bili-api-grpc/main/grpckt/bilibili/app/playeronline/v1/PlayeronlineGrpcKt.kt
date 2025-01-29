package bilibili.app.playeronline.v1

import bilibili.app.playeronline.v1.PlayerOnlineGrpc.getServiceDescriptor
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

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * bilibili.app.playeronline.v1.PlayerOnline.
 */
public object PlayerOnlineGrpcKt {
  public const val SERVICE_NAME: String = PlayerOnlineGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val playerOnlineMethod: MethodDescriptor<PlayerOnlineReq, PlayerOnlineReply>
    @JvmStatic
    get() = PlayerOnlineGrpc.getPlayerOnlineMethod()

  public val premiereInfoMethod: MethodDescriptor<PremiereInfoReq, PremiereInfoReply>
    @JvmStatic
    get() = PlayerOnlineGrpc.getPremiereInfoMethod()

  public val reportWatchMethod: MethodDescriptor<ReportWatchReq, NoReply>
    @JvmStatic
    get() = PlayerOnlineGrpc.getReportWatchMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.playeronline.v1.PlayerOnline service as suspending
   * coroutines.
   */
  @StubFor(PlayerOnlineGrpc::class)
  public class PlayerOnlineCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<PlayerOnlineCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): PlayerOnlineCoroutineStub =
        PlayerOnlineCoroutineStub(channel, callOptions)

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
    public suspend fun playerOnline(request: PlayerOnlineReq, headers: Metadata = Metadata()):
        PlayerOnlineReply = unaryRpc(
      channel,
      PlayerOnlineGrpc.getPlayerOnlineMethod(),
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
    public suspend fun premiereInfo(request: PremiereInfoReq, headers: Metadata = Metadata()):
        PremiereInfoReply = unaryRpc(
      channel,
      PlayerOnlineGrpc.getPremiereInfoMethod(),
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
    public suspend fun reportWatch(request: ReportWatchReq, headers: Metadata = Metadata()): NoReply
        = unaryRpc(
      channel,
      PlayerOnlineGrpc.getReportWatchMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.playeronline.v1.PlayerOnline service based on
   * Kotlin coroutines.
   */
  public abstract class PlayerOnlineCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.playeronline.v1.PlayerOnline.PlayerOnline.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playerOnline(request: PlayerOnlineReq): PlayerOnlineReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.playeronline.v1.PlayerOnline.PlayerOnline is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.playeronline.v1.PlayerOnline.PremiereInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun premiereInfo(request: PremiereInfoReq): PremiereInfoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.playeronline.v1.PlayerOnline.PremiereInfo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.playeronline.v1.PlayerOnline.ReportWatch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reportWatch(request: ReportWatchReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.playeronline.v1.PlayerOnline.ReportWatch is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PlayerOnlineGrpc.getPlayerOnlineMethod(),
      implementation = ::playerOnline
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PlayerOnlineGrpc.getPremiereInfoMethod(),
      implementation = ::premiereInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PlayerOnlineGrpc.getReportWatchMethod(),
      implementation = ::reportWatch
    )).build()
  }
}
