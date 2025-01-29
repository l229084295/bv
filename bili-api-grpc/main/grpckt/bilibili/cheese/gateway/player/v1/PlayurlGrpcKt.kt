package bilibili.cheese.gateway.player.v1

import bilibili.cheese.gateway.player.v1.PlayURLGrpc.getServiceDescriptor
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
 * bilibili.cheese.gateway.player.v1.PlayURL.
 */
public object PlayURLGrpcKt {
  public const val SERVICE_NAME: String = PlayURLGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val playViewMethod: MethodDescriptor<PlayViewReq, PlayViewReply>
    @JvmStatic
    get() = PlayURLGrpc.getPlayViewMethod()

  public val projectMethod: MethodDescriptor<ProjectReq, ProjectReply>
    @JvmStatic
    get() = PlayURLGrpc.getProjectMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.cheese.gateway.player.v1.PlayURL service as suspending
   * coroutines.
   */
  @StubFor(PlayURLGrpc::class)
  public class PlayURLCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<PlayURLCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): PlayURLCoroutineStub =
        PlayURLCoroutineStub(channel, callOptions)

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
    public suspend fun playView(request: PlayViewReq, headers: Metadata = Metadata()): PlayViewReply
        = unaryRpc(
      channel,
      PlayURLGrpc.getPlayViewMethod(),
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
    public suspend fun project(request: ProjectReq, headers: Metadata = Metadata()): ProjectReply =
        unaryRpc(
      channel,
      PlayURLGrpc.getProjectMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.cheese.gateway.player.v1.PlayURL service based on
   * Kotlin coroutines.
   */
  public abstract class PlayURLCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.cheese.gateway.player.v1.PlayURL.PlayView.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playView(request: PlayViewReq): PlayViewReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.cheese.gateway.player.v1.PlayURL.PlayView is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.cheese.gateway.player.v1.PlayURL.Project.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun project(request: ProjectReq): ProjectReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.cheese.gateway.player.v1.PlayURL.Project is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PlayURLGrpc.getPlayViewMethod(),
      implementation = ::playView
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PlayURLGrpc.getProjectMethod(),
      implementation = ::project
    )).build()
  }
}
