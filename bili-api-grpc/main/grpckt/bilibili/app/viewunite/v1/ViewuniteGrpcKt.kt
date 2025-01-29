package bilibili.app.viewunite.v1

import bilibili.app.viewunite.v1.ViewGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.viewunite.v1.View.
 */
public object ViewGrpcKt {
  public const val SERVICE_NAME: String = ViewGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val arcRefreshMethod: MethodDescriptor<ArcRefreshReq, ArcRefreshReply>
    @JvmStatic
    get() = ViewGrpc.getArcRefreshMethod()

  public val relatesFeedMethod: MethodDescriptor<RelatesFeedReq, RelatesFeedReply>
    @JvmStatic
    get() = ViewGrpc.getRelatesFeedMethod()

  public val viewMethod: MethodDescriptor<ViewReq, ViewReply>
    @JvmStatic
    get() = ViewGrpc.getViewMethod()

  public val viewProgressMethod: MethodDescriptor<ViewProgressReq, ViewProgressReply>
    @JvmStatic
    get() = ViewGrpc.getViewProgressMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.viewunite.v1.View service as suspending
   * coroutines.
   */
  @StubFor(ViewGrpc::class)
  public class ViewCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ViewCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ViewCoroutineStub =
        ViewCoroutineStub(channel, callOptions)

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
    public suspend fun arcRefresh(request: ArcRefreshReq, headers: Metadata = Metadata()):
        ArcRefreshReply = unaryRpc(
      channel,
      ViewGrpc.getArcRefreshMethod(),
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
    public suspend fun relatesFeed(request: RelatesFeedReq, headers: Metadata = Metadata()):
        RelatesFeedReply = unaryRpc(
      channel,
      ViewGrpc.getRelatesFeedMethod(),
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
    public suspend fun view(request: ViewReq, headers: Metadata = Metadata()): ViewReply = unaryRpc(
      channel,
      ViewGrpc.getViewMethod(),
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
    public suspend fun viewProgress(request: ViewProgressReq, headers: Metadata = Metadata()):
        ViewProgressReply = unaryRpc(
      channel,
      ViewGrpc.getViewProgressMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.viewunite.v1.View service based on Kotlin
   * coroutines.
   */
  public abstract class ViewCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.viewunite.v1.View.ArcRefresh.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun arcRefresh(request: ArcRefreshReq): ArcRefreshReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.viewunite.v1.View.ArcRefresh is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.viewunite.v1.View.RelatesFeed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun relatesFeed(request: RelatesFeedReq): RelatesFeedReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.viewunite.v1.View.RelatesFeed is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.viewunite.v1.View.View.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun view(request: ViewReq): ViewReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.viewunite.v1.View.View is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.viewunite.v1.View.ViewProgress.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewProgress(request: ViewProgressReq): ViewProgressReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.viewunite.v1.View.ViewProgress is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getArcRefreshMethod(),
      implementation = ::arcRefresh
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getRelatesFeedMethod(),
      implementation = ::relatesFeed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getViewMethod(),
      implementation = ::view
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getViewProgressMethod(),
      implementation = ::viewProgress
    )).build()
  }
}
