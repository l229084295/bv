package bilibili.main.`dynamic`.feed.v1

import bilibili.`dynamic`.AtListReq
import bilibili.`dynamic`.AtListRsp
import bilibili.`dynamic`.AtSearchReq
import bilibili.`dynamic`.CreateCheckResp
import bilibili.`dynamic`.CreateResp
import bilibili.`dynamic`.GetUidByNameReq
import bilibili.`dynamic`.GetUidByNameRsp
import bilibili.main.`dynamic`.feed.v1.FeedGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.main.dynamic.feed.v1.Feed.
 */
public object FeedGrpcKt {
  public const val SERVICE_NAME: String = FeedGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createInitCheckMethod: MethodDescriptor<CreateInitCheckReq, CreateCheckResp>
    @JvmStatic
    get() = FeedGrpc.getCreateInitCheckMethod()

  public val submitCheckMethod: MethodDescriptor<SubmitCheckReq, SubmitCheckRsp>
    @JvmStatic
    get() = FeedGrpc.getSubmitCheckMethod()

  public val createDynMethod: MethodDescriptor<CreateDynReq, CreateResp>
    @JvmStatic
    get() = FeedGrpc.getCreateDynMethod()

  public val getUidByNameMethod: MethodDescriptor<GetUidByNameReq, GetUidByNameRsp>
    @JvmStatic
    get() = FeedGrpc.getGetUidByNameMethod()

  public val atListMethod: MethodDescriptor<AtListReq, AtListRsp>
    @JvmStatic
    get() = FeedGrpc.getAtListMethod()

  public val atSearchMethod: MethodDescriptor<AtSearchReq, AtListRsp>
    @JvmStatic
    get() = FeedGrpc.getAtSearchMethod()

  public val reserveButtonClickMethod:
      MethodDescriptor<ReserveButtonClickReq, ReserveButtonClickResp>
    @JvmStatic
    get() = FeedGrpc.getReserveButtonClickMethod()

  public val createPlusButtonClickMethod:
      MethodDescriptor<CreatePlusButtonClickReq, CreatePlusButtonClickRsp>
    @JvmStatic
    get() = FeedGrpc.getCreatePlusButtonClickMethod()

  public val hotSearchMethod: MethodDescriptor<HotSearchReq, HotSearchRsp>
    @JvmStatic
    get() = FeedGrpc.getHotSearchMethod()

  public val suggestMethod: MethodDescriptor<SuggestReq, SuggestRsp>
    @JvmStatic
    get() = FeedGrpc.getSuggestMethod()

  public val dynamicButtonClickMethod:
      MethodDescriptor<DynamicButtonClickReq, DynamicButtonClickRsp>
    @JvmStatic
    get() = FeedGrpc.getDynamicButtonClickMethod()

  public val createPermissionButtonClickMethod:
      MethodDescriptor<CreatePermissionButtonClickReq, CreatePermissionButtonClickRsp>
    @JvmStatic
    get() = FeedGrpc.getCreatePermissionButtonClickMethod()

  public val createPageInfosMethod: MethodDescriptor<CreatePageInfosReq, CreatePageInfosRsp>
    @JvmStatic
    get() = FeedGrpc.getCreatePageInfosMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.main.dynamic.feed.v1.Feed service as suspending
   * coroutines.
   */
  @StubFor(FeedGrpc::class)
  public class FeedCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<FeedCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): FeedCoroutineStub =
        FeedCoroutineStub(channel, callOptions)

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
    public suspend fun createInitCheck(request: CreateInitCheckReq, headers: Metadata = Metadata()):
        CreateCheckResp = unaryRpc(
      channel,
      FeedGrpc.getCreateInitCheckMethod(),
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
    public suspend fun submitCheck(request: SubmitCheckReq, headers: Metadata = Metadata()):
        SubmitCheckRsp = unaryRpc(
      channel,
      FeedGrpc.getSubmitCheckMethod(),
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
    public suspend fun createDyn(request: CreateDynReq, headers: Metadata = Metadata()): CreateResp
        = unaryRpc(
      channel,
      FeedGrpc.getCreateDynMethod(),
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
    public suspend fun getUidByName(request: GetUidByNameReq, headers: Metadata = Metadata()):
        GetUidByNameRsp = unaryRpc(
      channel,
      FeedGrpc.getGetUidByNameMethod(),
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
    public suspend fun atList(request: AtListReq, headers: Metadata = Metadata()): AtListRsp =
        unaryRpc(
      channel,
      FeedGrpc.getAtListMethod(),
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
    public suspend fun atSearch(request: AtSearchReq, headers: Metadata = Metadata()): AtListRsp =
        unaryRpc(
      channel,
      FeedGrpc.getAtSearchMethod(),
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
    public suspend fun reserveButtonClick(request: ReserveButtonClickReq, headers: Metadata =
        Metadata()): ReserveButtonClickResp = unaryRpc(
      channel,
      FeedGrpc.getReserveButtonClickMethod(),
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
    public suspend fun createPlusButtonClick(request: CreatePlusButtonClickReq, headers: Metadata =
        Metadata()): CreatePlusButtonClickRsp = unaryRpc(
      channel,
      FeedGrpc.getCreatePlusButtonClickMethod(),
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
    public suspend fun hotSearch(request: HotSearchReq, headers: Metadata = Metadata()):
        HotSearchRsp = unaryRpc(
      channel,
      FeedGrpc.getHotSearchMethod(),
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
    public suspend fun suggest(request: SuggestReq, headers: Metadata = Metadata()): SuggestRsp =
        unaryRpc(
      channel,
      FeedGrpc.getSuggestMethod(),
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
    public suspend fun dynamicButtonClick(request: DynamicButtonClickReq, headers: Metadata =
        Metadata()): DynamicButtonClickRsp = unaryRpc(
      channel,
      FeedGrpc.getDynamicButtonClickMethod(),
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
    public suspend fun createPermissionButtonClick(request: CreatePermissionButtonClickReq,
        headers: Metadata = Metadata()): CreatePermissionButtonClickRsp = unaryRpc(
      channel,
      FeedGrpc.getCreatePermissionButtonClickMethod(),
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
    public suspend fun createPageInfos(request: CreatePageInfosReq, headers: Metadata = Metadata()):
        CreatePageInfosRsp = unaryRpc(
      channel,
      FeedGrpc.getCreatePageInfosMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.main.dynamic.feed.v1.Feed service based on Kotlin
   * coroutines.
   */
  public abstract class FeedCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.CreateInitCheck.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createInitCheck(request: CreateInitCheckReq): CreateCheckResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.CreateInitCheck is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.SubmitCheck.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun submitCheck(request: SubmitCheckReq): SubmitCheckRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.SubmitCheck is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.CreateDyn.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createDyn(request: CreateDynReq): CreateResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.CreateDyn is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.GetUidByName.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUidByName(request: GetUidByNameReq): GetUidByNameRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.GetUidByName is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.AtList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun atList(request: AtListReq): AtListRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.AtList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.AtSearch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun atSearch(request: AtSearchReq): AtListRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.AtSearch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.ReserveButtonClick.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reserveButtonClick(request: ReserveButtonClickReq):
        ReserveButtonClickResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.ReserveButtonClick is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.CreatePlusButtonClick.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createPlusButtonClick(request: CreatePlusButtonClickReq):
        CreatePlusButtonClickRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.CreatePlusButtonClick is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.HotSearch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun hotSearch(request: HotSearchReq): HotSearchRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.HotSearch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.Suggest.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun suggest(request: SuggestReq): SuggestRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.Suggest is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.DynamicButtonClick.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynamicButtonClick(request: DynamicButtonClickReq):
        DynamicButtonClickRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.DynamicButtonClick is unimplemented"))

    /**
     * Returns the response to an RPC for
     * bilibili.main.dynamic.feed.v1.Feed.CreatePermissionButtonClick.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createPermissionButtonClick(request: CreatePermissionButtonClickReq):
        CreatePermissionButtonClickRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.CreatePermissionButtonClick is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.dynamic.feed.v1.Feed.CreatePageInfos.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createPageInfos(request: CreatePageInfosReq): CreatePageInfosRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.dynamic.feed.v1.Feed.CreatePageInfos is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getCreateInitCheckMethod(),
      implementation = ::createInitCheck
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getSubmitCheckMethod(),
      implementation = ::submitCheck
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getCreateDynMethod(),
      implementation = ::createDyn
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getGetUidByNameMethod(),
      implementation = ::getUidByName
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getAtListMethod(),
      implementation = ::atList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getAtSearchMethod(),
      implementation = ::atSearch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getReserveButtonClickMethod(),
      implementation = ::reserveButtonClick
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getCreatePlusButtonClickMethod(),
      implementation = ::createPlusButtonClick
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getHotSearchMethod(),
      implementation = ::hotSearch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getSuggestMethod(),
      implementation = ::suggest
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getDynamicButtonClickMethod(),
      implementation = ::dynamicButtonClick
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getCreatePermissionButtonClickMethod(),
      implementation = ::createPermissionButtonClick
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeedGrpc.getCreatePageInfosMethod(),
      implementation = ::createPageInfos
    )).build()
  }
}
