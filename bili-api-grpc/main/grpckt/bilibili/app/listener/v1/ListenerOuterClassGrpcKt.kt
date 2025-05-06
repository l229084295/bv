package bilibili.app.listener.v1

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
import bilibili.app.listener.v1.ListenerGrpc.getServiceDescriptor as listenerGrpcGetServiceDescriptor
import bilibili.app.listener.v1.MusicGrpc.getServiceDescriptor as musicGrpcGetServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.listener.v1.Listener.
 */
public object ListenerGrpcKt {
  public const val SERVICE_NAME: String = ListenerGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = listenerGrpcGetServiceDescriptor()

  public val pingMethod: MethodDescriptor<Empty, Empty>
    @JvmStatic
    get() = ListenerGrpc.getPingMethod()

  public val playUrlMethod: MethodDescriptor<PlayURLReq, PlayURLResp>
    @JvmStatic
    get() = ListenerGrpc.getPlayUrlMethod()

  public val bkarcDetailsMethod: MethodDescriptor<BKArcDetailsReq, BKArcDetailsResp>
    @JvmStatic
    get() = ListenerGrpc.getBkarcDetailsMethod()

  public val playlistMethod: MethodDescriptor<PlaylistReq, PlaylistResp>
    @JvmStatic
    get() = ListenerGrpc.getPlaylistMethod()

  public val playlistAddMethod: MethodDescriptor<PlaylistAddReq, Empty>
    @JvmStatic
    get() = ListenerGrpc.getPlaylistAddMethod()

  public val playlistDelMethod: MethodDescriptor<PlaylistDelReq, Empty>
    @JvmStatic
    get() = ListenerGrpc.getPlaylistDelMethod()

  public val rcmdPlaylistMethod: MethodDescriptor<RcmdPlaylistReq, RcmdPlaylistResp>
    @JvmStatic
    get() = ListenerGrpc.getRcmdPlaylistMethod()

  public val playHistoryMethod: MethodDescriptor<PlayHistoryReq, PlayHistoryResp>
    @JvmStatic
    get() = ListenerGrpc.getPlayHistoryMethod()

  public val playHistoryAddMethod: MethodDescriptor<PlayHistoryAddReq, Empty>
    @JvmStatic
    get() = ListenerGrpc.getPlayHistoryAddMethod()

  public val playHistoryDelMethod: MethodDescriptor<PlayHistoryDelReq, Empty>
    @JvmStatic
    get() = ListenerGrpc.getPlayHistoryDelMethod()

  public val playActionReportMethod: MethodDescriptor<PlayActionReportReq, Empty>
    @JvmStatic
    get() = ListenerGrpc.getPlayActionReportMethod()

  public val tripleLikeMethod: MethodDescriptor<TripleLikeReq, TripleLikeResp>
    @JvmStatic
    get() = ListenerGrpc.getTripleLikeMethod()

  public val thumbUpMethod: MethodDescriptor<ThumbUpReq, ThumbUpResp>
    @JvmStatic
    get() = ListenerGrpc.getThumbUpMethod()

  public val coinAddMethod: MethodDescriptor<CoinAddReq, CoinAddResp>
    @JvmStatic
    get() = ListenerGrpc.getCoinAddMethod()

  public val favItemAddMethod: MethodDescriptor<FavItemAddReq, FavItemAddResp>
    @JvmStatic
    get() = ListenerGrpc.getFavItemAddMethod()

  public val favItemDelMethod: MethodDescriptor<FavItemDelReq, FavItemDelResp>
    @JvmStatic
    get() = ListenerGrpc.getFavItemDelMethod()

  public val favItemBatchMethod: MethodDescriptor<FavItemBatchReq, FavItemBatchResp>
    @JvmStatic
    get() = ListenerGrpc.getFavItemBatchMethod()

  public val favoredInAnyFoldersMethod:
      MethodDescriptor<FavoredInAnyFoldersReq, FavoredInAnyFoldersResp>
    @JvmStatic
    get() = ListenerGrpc.getFavoredInAnyFoldersMethod()

  public val favFolderListMethod: MethodDescriptor<FavFolderListReq, FavFolderListResp>
    @JvmStatic
    get() = ListenerGrpc.getFavFolderListMethod()

  public val favFolderDetailMethod: MethodDescriptor<FavFolderDetailReq, FavFolderDetailResp>
    @JvmStatic
    get() = ListenerGrpc.getFavFolderDetailMethod()

  public val favFolderCreateMethod: MethodDescriptor<FavFolderCreateReq, FavFolderCreateResp>
    @JvmStatic
    get() = ListenerGrpc.getFavFolderCreateMethod()

  public val favFolderDeleteMethod: MethodDescriptor<FavFolderDeleteReq, FavFolderDeleteResp>
    @JvmStatic
    get() = ListenerGrpc.getFavFolderDeleteMethod()

  public val pickFeedMethod: MethodDescriptor<PickFeedReq, PickFeedResp>
    @JvmStatic
    get() = ListenerGrpc.getPickFeedMethod()

  public val pickCardDetailMethod: MethodDescriptor<PickCardDetailReq, PickCardDetailResp>
    @JvmStatic
    get() = ListenerGrpc.getPickCardDetailMethod()

  public val medialistMethod: MethodDescriptor<MedialistReq, MedialistResp>
    @JvmStatic
    get() = ListenerGrpc.getMedialistMethod()

  public val eventMethod: MethodDescriptor<EventReq, EventResp>
    @JvmStatic
    get() = ListenerGrpc.getEventMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.listener.v1.Listener service as suspending
   * coroutines.
   */
  @StubFor(ListenerGrpc::class)
  public class ListenerCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ListenerCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ListenerCoroutineStub =
        ListenerCoroutineStub(channel, callOptions)

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
    public suspend fun ping(request: Empty, headers: Metadata = Metadata()): Empty = unaryRpc(
      channel,
      ListenerGrpc.getPingMethod(),
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
    public suspend fun playUrl(request: PlayURLReq, headers: Metadata = Metadata()): PlayURLResp =
        unaryRpc(
      channel,
      ListenerGrpc.getPlayUrlMethod(),
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
    public suspend fun bkarcDetails(request: BKArcDetailsReq, headers: Metadata = Metadata()):
        BKArcDetailsResp = unaryRpc(
      channel,
      ListenerGrpc.getBkarcDetailsMethod(),
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
    public suspend fun playlist(request: PlaylistReq, headers: Metadata = Metadata()): PlaylistResp
        = unaryRpc(
      channel,
      ListenerGrpc.getPlaylistMethod(),
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
    public suspend fun playlistAdd(request: PlaylistAddReq, headers: Metadata = Metadata()): Empty =
        unaryRpc(
      channel,
      ListenerGrpc.getPlaylistAddMethod(),
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
    public suspend fun playlistDel(request: PlaylistDelReq, headers: Metadata = Metadata()): Empty =
        unaryRpc(
      channel,
      ListenerGrpc.getPlaylistDelMethod(),
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
    public suspend fun rcmdPlaylist(request: RcmdPlaylistReq, headers: Metadata = Metadata()):
        RcmdPlaylistResp = unaryRpc(
      channel,
      ListenerGrpc.getRcmdPlaylistMethod(),
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
    public suspend fun playHistory(request: PlayHistoryReq, headers: Metadata = Metadata()):
        PlayHistoryResp = unaryRpc(
      channel,
      ListenerGrpc.getPlayHistoryMethod(),
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
    public suspend fun playHistoryAdd(request: PlayHistoryAddReq, headers: Metadata = Metadata()):
        Empty = unaryRpc(
      channel,
      ListenerGrpc.getPlayHistoryAddMethod(),
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
    public suspend fun playHistoryDel(request: PlayHistoryDelReq, headers: Metadata = Metadata()):
        Empty = unaryRpc(
      channel,
      ListenerGrpc.getPlayHistoryDelMethod(),
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
    public suspend fun playActionReport(request: PlayActionReportReq, headers: Metadata =
        Metadata()): Empty = unaryRpc(
      channel,
      ListenerGrpc.getPlayActionReportMethod(),
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
    public suspend fun tripleLike(request: TripleLikeReq, headers: Metadata = Metadata()):
        TripleLikeResp = unaryRpc(
      channel,
      ListenerGrpc.getTripleLikeMethod(),
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
    public suspend fun thumbUp(request: ThumbUpReq, headers: Metadata = Metadata()): ThumbUpResp =
        unaryRpc(
      channel,
      ListenerGrpc.getThumbUpMethod(),
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
    public suspend fun coinAdd(request: CoinAddReq, headers: Metadata = Metadata()): CoinAddResp =
        unaryRpc(
      channel,
      ListenerGrpc.getCoinAddMethod(),
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
    public suspend fun favItemAdd(request: FavItemAddReq, headers: Metadata = Metadata()):
        FavItemAddResp = unaryRpc(
      channel,
      ListenerGrpc.getFavItemAddMethod(),
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
    public suspend fun favItemDel(request: FavItemDelReq, headers: Metadata = Metadata()):
        FavItemDelResp = unaryRpc(
      channel,
      ListenerGrpc.getFavItemDelMethod(),
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
    public suspend fun favItemBatch(request: FavItemBatchReq, headers: Metadata = Metadata()):
        FavItemBatchResp = unaryRpc(
      channel,
      ListenerGrpc.getFavItemBatchMethod(),
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
    public suspend fun favoredInAnyFolders(request: FavoredInAnyFoldersReq, headers: Metadata =
        Metadata()): FavoredInAnyFoldersResp = unaryRpc(
      channel,
      ListenerGrpc.getFavoredInAnyFoldersMethod(),
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
    public suspend fun favFolderList(request: FavFolderListReq, headers: Metadata = Metadata()):
        FavFolderListResp = unaryRpc(
      channel,
      ListenerGrpc.getFavFolderListMethod(),
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
    public suspend fun favFolderDetail(request: FavFolderDetailReq, headers: Metadata = Metadata()):
        FavFolderDetailResp = unaryRpc(
      channel,
      ListenerGrpc.getFavFolderDetailMethod(),
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
    public suspend fun favFolderCreate(request: FavFolderCreateReq, headers: Metadata = Metadata()):
        FavFolderCreateResp = unaryRpc(
      channel,
      ListenerGrpc.getFavFolderCreateMethod(),
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
    public suspend fun favFolderDelete(request: FavFolderDeleteReq, headers: Metadata = Metadata()):
        FavFolderDeleteResp = unaryRpc(
      channel,
      ListenerGrpc.getFavFolderDeleteMethod(),
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
    public suspend fun pickFeed(request: PickFeedReq, headers: Metadata = Metadata()): PickFeedResp
        = unaryRpc(
      channel,
      ListenerGrpc.getPickFeedMethod(),
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
    public suspend fun pickCardDetail(request: PickCardDetailReq, headers: Metadata = Metadata()):
        PickCardDetailResp = unaryRpc(
      channel,
      ListenerGrpc.getPickCardDetailMethod(),
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
    public suspend fun medialist(request: MedialistReq, headers: Metadata = Metadata()):
        MedialistResp = unaryRpc(
      channel,
      ListenerGrpc.getMedialistMethod(),
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
    public suspend fun event(request: EventReq, headers: Metadata = Metadata()): EventResp =
        unaryRpc(
      channel,
      ListenerGrpc.getEventMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.listener.v1.Listener service based on Kotlin
   * coroutines.
   */
  public abstract class ListenerCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.Ping.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun ping(request: Empty): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.Ping is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PlayUrl.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playUrl(request: PlayURLReq): PlayURLResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PlayUrl is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.BkarcDetails.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun bkarcDetails(request: BKArcDetailsReq): BKArcDetailsResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.BkarcDetails is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.Playlist.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playlist(request: PlaylistReq): PlaylistResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.Playlist is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PlaylistAdd.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playlistAdd(request: PlaylistAddReq): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PlaylistAdd is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PlaylistDel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playlistDel(request: PlaylistDelReq): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PlaylistDel is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.RcmdPlaylist.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rcmdPlaylist(request: RcmdPlaylistReq): RcmdPlaylistResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.RcmdPlaylist is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PlayHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playHistory(request: PlayHistoryReq): PlayHistoryResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PlayHistory is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PlayHistoryAdd.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playHistoryAdd(request: PlayHistoryAddReq): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PlayHistoryAdd is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PlayHistoryDel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playHistoryDel(request: PlayHistoryDelReq): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PlayHistoryDel is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PlayActionReport.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playActionReport(request: PlayActionReportReq): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PlayActionReport is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.TripleLike.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun tripleLike(request: TripleLikeReq): TripleLikeResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.TripleLike is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.ThumbUp.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun thumbUp(request: ThumbUpReq): ThumbUpResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.ThumbUp is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.CoinAdd.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun coinAdd(request: CoinAddReq): CoinAddResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.CoinAdd is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.FavItemAdd.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favItemAdd(request: FavItemAddReq): FavItemAddResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.FavItemAdd is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.FavItemDel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favItemDel(request: FavItemDelReq): FavItemDelResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.FavItemDel is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.FavItemBatch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favItemBatch(request: FavItemBatchReq): FavItemBatchResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.FavItemBatch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.FavoredInAnyFolders.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favoredInAnyFolders(request: FavoredInAnyFoldersReq):
        FavoredInAnyFoldersResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.FavoredInAnyFolders is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.FavFolderList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favFolderList(request: FavFolderListReq): FavFolderListResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.FavFolderList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.FavFolderDetail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favFolderDetail(request: FavFolderDetailReq): FavFolderDetailResp =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.FavFolderDetail is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.FavFolderCreate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favFolderCreate(request: FavFolderCreateReq): FavFolderCreateResp =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.FavFolderCreate is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.FavFolderDelete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favFolderDelete(request: FavFolderDeleteReq): FavFolderDeleteResp =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.FavFolderDelete is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PickFeed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun pickFeed(request: PickFeedReq): PickFeedResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PickFeed is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.PickCardDetail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun pickCardDetail(request: PickCardDetailReq): PickCardDetailResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.PickCardDetail is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.Medialist.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun medialist(request: MedialistReq): MedialistResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.Medialist is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Listener.Event.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun event(request: EventReq): EventResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Listener.Event is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(listenerGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPingMethod(),
      implementation = ::ping
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPlayUrlMethod(),
      implementation = ::playUrl
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getBkarcDetailsMethod(),
      implementation = ::bkarcDetails
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPlaylistMethod(),
      implementation = ::playlist
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPlaylistAddMethod(),
      implementation = ::playlistAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPlaylistDelMethod(),
      implementation = ::playlistDel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getRcmdPlaylistMethod(),
      implementation = ::rcmdPlaylist
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPlayHistoryMethod(),
      implementation = ::playHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPlayHistoryAddMethod(),
      implementation = ::playHistoryAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPlayHistoryDelMethod(),
      implementation = ::playHistoryDel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPlayActionReportMethod(),
      implementation = ::playActionReport
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getTripleLikeMethod(),
      implementation = ::tripleLike
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getThumbUpMethod(),
      implementation = ::thumbUp
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getCoinAddMethod(),
      implementation = ::coinAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getFavItemAddMethod(),
      implementation = ::favItemAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getFavItemDelMethod(),
      implementation = ::favItemDel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getFavItemBatchMethod(),
      implementation = ::favItemBatch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getFavoredInAnyFoldersMethod(),
      implementation = ::favoredInAnyFolders
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getFavFolderListMethod(),
      implementation = ::favFolderList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getFavFolderDetailMethod(),
      implementation = ::favFolderDetail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getFavFolderCreateMethod(),
      implementation = ::favFolderCreate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getFavFolderDeleteMethod(),
      implementation = ::favFolderDelete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPickFeedMethod(),
      implementation = ::pickFeed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getPickCardDetailMethod(),
      implementation = ::pickCardDetail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getMedialistMethod(),
      implementation = ::medialist
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerGrpc.getEventMethod(),
      implementation = ::event
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.listener.v1.Music.
 */
public object MusicGrpcKt {
  public const val SERVICE_NAME: String = MusicGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = musicGrpcGetServiceDescriptor()

  public val favTabShowMethod: MethodDescriptor<FavTabShowReq, FavTabShowResp>
    @JvmStatic
    get() = MusicGrpc.getFavTabShowMethod()

  public val mainFavMusicSubTabListMethod:
      MethodDescriptor<MainFavMusicSubTabListReq, MainFavMusicSubTabListResp>
    @JvmStatic
    get() = MusicGrpc.getMainFavMusicSubTabListMethod()

  public val mainFavMusicMenuListMethod:
      MethodDescriptor<MainFavMusicMenuListReq, MainFavMusicMenuListResp>
    @JvmStatic
    get() = MusicGrpc.getMainFavMusicMenuListMethod()

  public val menuEditMethod: MethodDescriptor<MenuEditReq, MenuEditResp>
    @JvmStatic
    get() = MusicGrpc.getMenuEditMethod()

  public val menuDeleteMethod: MethodDescriptor<MenuDeleteReq, MenuDeleteResp>
    @JvmStatic
    get() = MusicGrpc.getMenuDeleteMethod()

  public val menuSubscribeMethod: MethodDescriptor<MenuSubscribeReq, MenuSubscribeResp>
    @JvmStatic
    get() = MusicGrpc.getMenuSubscribeMethod()

  public val clickMethod: MethodDescriptor<ClickReq, ClickResp>
    @JvmStatic
    get() = MusicGrpc.getClickMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.listener.v1.Music service as suspending
   * coroutines.
   */
  @StubFor(MusicGrpc::class)
  public class MusicCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MusicCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): MusicCoroutineStub =
        MusicCoroutineStub(channel, callOptions)

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
    public suspend fun favTabShow(request: FavTabShowReq, headers: Metadata = Metadata()):
        FavTabShowResp = unaryRpc(
      channel,
      MusicGrpc.getFavTabShowMethod(),
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
    public suspend fun mainFavMusicSubTabList(request: MainFavMusicSubTabListReq, headers: Metadata
        = Metadata()): MainFavMusicSubTabListResp = unaryRpc(
      channel,
      MusicGrpc.getMainFavMusicSubTabListMethod(),
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
    public suspend fun mainFavMusicMenuList(request: MainFavMusicMenuListReq, headers: Metadata =
        Metadata()): MainFavMusicMenuListResp = unaryRpc(
      channel,
      MusicGrpc.getMainFavMusicMenuListMethod(),
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
    public suspend fun menuEdit(request: MenuEditReq, headers: Metadata = Metadata()): MenuEditResp
        = unaryRpc(
      channel,
      MusicGrpc.getMenuEditMethod(),
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
    public suspend fun menuDelete(request: MenuDeleteReq, headers: Metadata = Metadata()):
        MenuDeleteResp = unaryRpc(
      channel,
      MusicGrpc.getMenuDeleteMethod(),
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
    public suspend fun menuSubscribe(request: MenuSubscribeReq, headers: Metadata = Metadata()):
        MenuSubscribeResp = unaryRpc(
      channel,
      MusicGrpc.getMenuSubscribeMethod(),
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
    public suspend fun click(request: ClickReq, headers: Metadata = Metadata()): ClickResp =
        unaryRpc(
      channel,
      MusicGrpc.getClickMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.listener.v1.Music service based on Kotlin
   * coroutines.
   */
  public abstract class MusicCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Music.FavTabShow.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favTabShow(request: FavTabShowReq): FavTabShowResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Music.FavTabShow is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Music.MainFavMusicSubTabList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mainFavMusicSubTabList(request: MainFavMusicSubTabListReq):
        MainFavMusicSubTabListResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Music.MainFavMusicSubTabList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Music.MainFavMusicMenuList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mainFavMusicMenuList(request: MainFavMusicMenuListReq):
        MainFavMusicMenuListResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Music.MainFavMusicMenuList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Music.MenuEdit.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun menuEdit(request: MenuEditReq): MenuEditResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Music.MenuEdit is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Music.MenuDelete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun menuDelete(request: MenuDeleteReq): MenuDeleteResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Music.MenuDelete is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Music.MenuSubscribe.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun menuSubscribe(request: MenuSubscribeReq): MenuSubscribeResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Music.MenuSubscribe is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.listener.v1.Music.Click.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun click(request: ClickReq): ClickResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.listener.v1.Music.Click is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(musicGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MusicGrpc.getFavTabShowMethod(),
      implementation = ::favTabShow
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MusicGrpc.getMainFavMusicSubTabListMethod(),
      implementation = ::mainFavMusicSubTabList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MusicGrpc.getMainFavMusicMenuListMethod(),
      implementation = ::mainFavMusicMenuList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MusicGrpc.getMenuEditMethod(),
      implementation = ::menuEdit
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MusicGrpc.getMenuDeleteMethod(),
      implementation = ::menuDelete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MusicGrpc.getMenuSubscribeMethod(),
      implementation = ::menuSubscribe
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MusicGrpc.getClickMethod(),
      implementation = ::click
    )).build()
  }
}
