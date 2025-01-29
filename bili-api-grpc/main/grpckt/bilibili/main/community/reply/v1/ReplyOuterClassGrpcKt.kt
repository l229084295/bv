package bilibili.main.community.reply.v1

import bilibili.main.community.reply.v1.ReplyGrpc.getServiceDescriptor
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
 * bilibili.main.community.reply.v1.Reply.
 */
public object ReplyGrpcKt {
  public const val SERVICE_NAME: String = ReplyGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val mainListMethod: MethodDescriptor<MainListReq, MainListReply>
    @JvmStatic
    get() = ReplyGrpc.getMainListMethod()

  public val detailListMethod: MethodDescriptor<DetailListReq, DetailListReply>
    @JvmStatic
    get() = ReplyGrpc.getDetailListMethod()

  public val dialogListMethod: MethodDescriptor<DialogListReq, DialogListReply>
    @JvmStatic
    get() = ReplyGrpc.getDialogListMethod()

  public val previewListMethod: MethodDescriptor<PreviewListReq, PreviewListReply>
    @JvmStatic
    get() = ReplyGrpc.getPreviewListMethod()

  public val searchItemPreHookMethod: MethodDescriptor<SearchItemPreHookReq, SearchItemPreHookReply>
    @JvmStatic
    get() = ReplyGrpc.getSearchItemPreHookMethod()

  public val searchItemMethod: MethodDescriptor<SearchItemReq, SearchItemReply>
    @JvmStatic
    get() = ReplyGrpc.getSearchItemMethod()

  public val atSearchMethod: MethodDescriptor<AtSearchReq, AtSearchReply>
    @JvmStatic
    get() = ReplyGrpc.getAtSearchMethod()

  public val replyInfoMethod: MethodDescriptor<ReplyInfoReq, ReplyInfoReply>
    @JvmStatic
    get() = ReplyGrpc.getReplyInfoMethod()

  public val userCallbackMethod: MethodDescriptor<UserCallbackReq, UserCallbackReply>
    @JvmStatic
    get() = ReplyGrpc.getUserCallbackMethod()

  public val shareRepliesInfoMethod: MethodDescriptor<ShareRepliesInfoReq, ShareRepliesInfoResp>
    @JvmStatic
    get() = ReplyGrpc.getShareRepliesInfoMethod()

  public val suggestEmotesMethod: MethodDescriptor<SuggestEmotesReq, SuggestEmotesResp>
    @JvmStatic
    get() = ReplyGrpc.getSuggestEmotesMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.main.community.reply.v1.Reply service as suspending
   * coroutines.
   */
  @StubFor(ReplyGrpc::class)
  public class ReplyCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ReplyCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ReplyCoroutineStub =
        ReplyCoroutineStub(channel, callOptions)

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
    public suspend fun mainList(request: MainListReq, headers: Metadata = Metadata()): MainListReply
        = unaryRpc(
      channel,
      ReplyGrpc.getMainListMethod(),
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
    public suspend fun detailList(request: DetailListReq, headers: Metadata = Metadata()):
        DetailListReply = unaryRpc(
      channel,
      ReplyGrpc.getDetailListMethod(),
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
    public suspend fun dialogList(request: DialogListReq, headers: Metadata = Metadata()):
        DialogListReply = unaryRpc(
      channel,
      ReplyGrpc.getDialogListMethod(),
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
    public suspend fun previewList(request: PreviewListReq, headers: Metadata = Metadata()):
        PreviewListReply = unaryRpc(
      channel,
      ReplyGrpc.getPreviewListMethod(),
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
    public suspend fun searchItemPreHook(request: SearchItemPreHookReq, headers: Metadata =
        Metadata()): SearchItemPreHookReply = unaryRpc(
      channel,
      ReplyGrpc.getSearchItemPreHookMethod(),
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
    public suspend fun searchItem(request: SearchItemReq, headers: Metadata = Metadata()):
        SearchItemReply = unaryRpc(
      channel,
      ReplyGrpc.getSearchItemMethod(),
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
    public suspend fun atSearch(request: AtSearchReq, headers: Metadata = Metadata()): AtSearchReply
        = unaryRpc(
      channel,
      ReplyGrpc.getAtSearchMethod(),
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
    public suspend fun replyInfo(request: ReplyInfoReq, headers: Metadata = Metadata()):
        ReplyInfoReply = unaryRpc(
      channel,
      ReplyGrpc.getReplyInfoMethod(),
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
    public suspend fun userCallback(request: UserCallbackReq, headers: Metadata = Metadata()):
        UserCallbackReply = unaryRpc(
      channel,
      ReplyGrpc.getUserCallbackMethod(),
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
    public suspend fun shareRepliesInfo(request: ShareRepliesInfoReq, headers: Metadata =
        Metadata()): ShareRepliesInfoResp = unaryRpc(
      channel,
      ReplyGrpc.getShareRepliesInfoMethod(),
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
    public suspend fun suggestEmotes(request: SuggestEmotesReq, headers: Metadata = Metadata()):
        SuggestEmotesResp = unaryRpc(
      channel,
      ReplyGrpc.getSuggestEmotesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.main.community.reply.v1.Reply service based on Kotlin
   * coroutines.
   */
  public abstract class ReplyCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.MainList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mainList(request: MainListReq): MainListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.MainList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.DetailList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun detailList(request: DetailListReq): DetailListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.DetailList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.DialogList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dialogList(request: DialogListReq): DialogListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.DialogList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.PreviewList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun previewList(request: PreviewListReq): PreviewListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.PreviewList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.SearchItemPreHook.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchItemPreHook(request: SearchItemPreHookReq): SearchItemPreHookReply
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.SearchItemPreHook is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.SearchItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchItem(request: SearchItemReq): SearchItemReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.SearchItem is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.AtSearch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun atSearch(request: AtSearchReq): AtSearchReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.AtSearch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.ReplyInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun replyInfo(request: ReplyInfoReq): ReplyInfoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.ReplyInfo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.UserCallback.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun userCallback(request: UserCallbackReq): UserCallbackReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.UserCallback is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.ShareRepliesInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun shareRepliesInfo(request: ShareRepliesInfoReq): ShareRepliesInfoResp =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.ShareRepliesInfo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.community.reply.v1.Reply.SuggestEmotes.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun suggestEmotes(request: SuggestEmotesReq): SuggestEmotesResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.community.reply.v1.Reply.SuggestEmotes is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getMainListMethod(),
      implementation = ::mainList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getDetailListMethod(),
      implementation = ::detailList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getDialogListMethod(),
      implementation = ::dialogList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getPreviewListMethod(),
      implementation = ::previewList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getSearchItemPreHookMethod(),
      implementation = ::searchItemPreHook
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getSearchItemMethod(),
      implementation = ::searchItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getAtSearchMethod(),
      implementation = ::atSearch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getReplyInfoMethod(),
      implementation = ::replyInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getUserCallbackMethod(),
      implementation = ::userCallback
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getShareRepliesInfoMethod(),
      implementation = ::shareRepliesInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplyGrpc.getSuggestEmotesMethod(),
      implementation = ::suggestEmotes
    )).build()
  }
}
