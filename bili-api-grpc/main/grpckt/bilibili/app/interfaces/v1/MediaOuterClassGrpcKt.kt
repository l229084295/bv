package bilibili.app.interfaces.v1

import bilibili.app.interfaces.v1.MediaGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.interface.v1.Media.
 */
public object MediaGrpcKt {
  public const val SERVICE_NAME: String = MediaGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val mediaTabMethod: MethodDescriptor<MediaTabReq, MediaTabReply>
    @JvmStatic
    get() = MediaGrpc.getMediaTabMethod()

  public val mediaDetailMethod: MethodDescriptor<MediaDetailReq, MediaDetailReply>
    @JvmStatic
    get() = MediaGrpc.getMediaDetailMethod()

  public val mediaVideoMethod: MethodDescriptor<MediaVideoReq, MediaVideoReply>
    @JvmStatic
    get() = MediaGrpc.getMediaVideoMethod()

  public val mediaRelationMethod: MethodDescriptor<MediaRelationReq, MediaRelationReply>
    @JvmStatic
    get() = MediaGrpc.getMediaRelationMethod()

  public val mediaFollowMethod: MethodDescriptor<MediaFollowReq, MediaFollowReply>
    @JvmStatic
    get() = MediaGrpc.getMediaFollowMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.interface.v1.Media service as suspending
   * coroutines.
   */
  @StubFor(MediaGrpc::class)
  public class MediaCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MediaCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): MediaCoroutineStub =
        MediaCoroutineStub(channel, callOptions)

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
    public suspend fun mediaTab(request: MediaTabReq, headers: Metadata = Metadata()): MediaTabReply
        = unaryRpc(
      channel,
      MediaGrpc.getMediaTabMethod(),
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
    public suspend fun mediaDetail(request: MediaDetailReq, headers: Metadata = Metadata()):
        MediaDetailReply = unaryRpc(
      channel,
      MediaGrpc.getMediaDetailMethod(),
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
    public suspend fun mediaVideo(request: MediaVideoReq, headers: Metadata = Metadata()):
        MediaVideoReply = unaryRpc(
      channel,
      MediaGrpc.getMediaVideoMethod(),
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
    public suspend fun mediaRelation(request: MediaRelationReq, headers: Metadata = Metadata()):
        MediaRelationReply = unaryRpc(
      channel,
      MediaGrpc.getMediaRelationMethod(),
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
    public suspend fun mediaFollow(request: MediaFollowReq, headers: Metadata = Metadata()):
        MediaFollowReply = unaryRpc(
      channel,
      MediaGrpc.getMediaFollowMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.interface.v1.Media service based on Kotlin
   * coroutines.
   */
  public abstract class MediaCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Media.MediaTab.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mediaTab(request: MediaTabReq): MediaTabReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Media.MediaTab is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Media.MediaDetail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mediaDetail(request: MediaDetailReq): MediaDetailReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Media.MediaDetail is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Media.MediaVideo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mediaVideo(request: MediaVideoReq): MediaVideoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Media.MediaVideo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Media.MediaRelation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mediaRelation(request: MediaRelationReq): MediaRelationReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Media.MediaRelation is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Media.MediaFollow.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mediaFollow(request: MediaFollowReq): MediaFollowReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Media.MediaFollow is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MediaGrpc.getMediaTabMethod(),
      implementation = ::mediaTab
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MediaGrpc.getMediaDetailMethod(),
      implementation = ::mediaDetail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MediaGrpc.getMediaVideoMethod(),
      implementation = ::mediaVideo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MediaGrpc.getMediaRelationMethod(),
      implementation = ::mediaRelation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MediaGrpc.getMediaFollowMethod(),
      implementation = ::mediaFollow
    )).build()
  }
}
