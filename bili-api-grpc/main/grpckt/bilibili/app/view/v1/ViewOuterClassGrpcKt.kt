package bilibili.app.view.v1

import bilibili.app.view.v1.ViewGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.view.v1.View.
 */
public object ViewGrpcKt {
  public const val SERVICE_NAME: String = ViewGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val viewMethod: MethodDescriptor<ViewReq, ViewReply>
    @JvmStatic
    get() = ViewGrpc.getViewMethod()

  public val viewTagMethod: MethodDescriptor<ViewTagReq, ViewTagReply>
    @JvmStatic
    get() = ViewGrpc.getViewTagMethod()

  public val viewMaterialMethod: MethodDescriptor<ViewMaterialReq, ViewMaterialReply>
    @JvmStatic
    get() = ViewGrpc.getViewMaterialMethod()

  public val viewProgressMethod: MethodDescriptor<ViewProgressReq, ViewProgressReply>
    @JvmStatic
    get() = ViewGrpc.getViewProgressMethod()

  public val shortFormVideoDownloadMethod:
      MethodDescriptor<ShortFormVideoDownloadReq, ShortFormVideoDownloadReply>
    @JvmStatic
    get() = ViewGrpc.getShortFormVideoDownloadMethod()

  public val clickPlayerCardMethod: MethodDescriptor<ClickPlayerCardReq, NoReply>
    @JvmStatic
    get() = ViewGrpc.getClickPlayerCardMethod()

  public val clickActivitySeasonMethod: MethodDescriptor<ClickActivitySeasonReq, NoReply>
    @JvmStatic
    get() = ViewGrpc.getClickActivitySeasonMethod()

  public val seasonMethod: MethodDescriptor<SeasonReq, SeasonReply>
    @JvmStatic
    get() = ViewGrpc.getSeasonMethod()

  public val exposePlayerCardMethod: MethodDescriptor<ExposePlayerCardReq, NoReply>
    @JvmStatic
    get() = ViewGrpc.getExposePlayerCardMethod()

  public val addContractMethod: MethodDescriptor<AddContractReq, NoReply>
    @JvmStatic
    get() = ViewGrpc.getAddContractMethod()

  public val chronosPkgMethod: MethodDescriptor<ChronosPkgReq, Chronos>
    @JvmStatic
    get() = ViewGrpc.getChronosPkgMethod()

  public val cacheViewMethod: MethodDescriptor<CacheViewReq, CacheViewReply>
    @JvmStatic
    get() = ViewGrpc.getCacheViewMethod()

  public val continuousPlayMethod: MethodDescriptor<ContinuousPlayReq, ContinuousPlayReply>
    @JvmStatic
    get() = ViewGrpc.getContinuousPlayMethod()

  public val relatesFeedMethod: MethodDescriptor<RelatesFeedReq, RelatesFeedReply>
    @JvmStatic
    get() = ViewGrpc.getRelatesFeedMethod()

  public val premiereArchiveMethod: MethodDescriptor<PremiereArchiveReq, PremiereArchiveReply>
    @JvmStatic
    get() = ViewGrpc.getPremiereArchiveMethod()

  public val reserveMethod: MethodDescriptor<ReserveReq, ReserveReply>
    @JvmStatic
    get() = ViewGrpc.getReserveMethod()

  public val playerRelatesMethod: MethodDescriptor<PlayerRelatesReq, PlayerRelatesReply>
    @JvmStatic
    get() = ViewGrpc.getPlayerRelatesMethod()

  public val seasonActivityRecordMethod:
      MethodDescriptor<SeasonActivityRecordReq, SeasonActivityRecordReply>
    @JvmStatic
    get() = ViewGrpc.getSeasonActivityRecordMethod()

  public val seasonWidgetExposeMethod:
      MethodDescriptor<SeasonWidgetExposeReq, SeasonWidgetExposeReply>
    @JvmStatic
    get() = ViewGrpc.getSeasonWidgetExposeMethod()

  public val getArcsPlayerMethod: MethodDescriptor<GetArcsPlayerReq, GetArcsPlayerReply>
    @JvmStatic
    get() = ViewGrpc.getGetArcsPlayerMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.view.v1.View service as suspending coroutines.
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
    public suspend fun viewTag(request: ViewTagReq, headers: Metadata = Metadata()): ViewTagReply =
        unaryRpc(
      channel,
      ViewGrpc.getViewTagMethod(),
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
    public suspend fun viewMaterial(request: ViewMaterialReq, headers: Metadata = Metadata()):
        ViewMaterialReply = unaryRpc(
      channel,
      ViewGrpc.getViewMaterialMethod(),
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
    public suspend fun shortFormVideoDownload(request: ShortFormVideoDownloadReq, headers: Metadata
        = Metadata()): ShortFormVideoDownloadReply = unaryRpc(
      channel,
      ViewGrpc.getShortFormVideoDownloadMethod(),
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
    public suspend fun clickPlayerCard(request: ClickPlayerCardReq, headers: Metadata = Metadata()):
        NoReply = unaryRpc(
      channel,
      ViewGrpc.getClickPlayerCardMethod(),
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
    public suspend fun clickActivitySeason(request: ClickActivitySeasonReq, headers: Metadata =
        Metadata()): NoReply = unaryRpc(
      channel,
      ViewGrpc.getClickActivitySeasonMethod(),
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
    public suspend fun season(request: SeasonReq, headers: Metadata = Metadata()): SeasonReply =
        unaryRpc(
      channel,
      ViewGrpc.getSeasonMethod(),
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
    public suspend fun exposePlayerCard(request: ExposePlayerCardReq, headers: Metadata =
        Metadata()): NoReply = unaryRpc(
      channel,
      ViewGrpc.getExposePlayerCardMethod(),
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
    public suspend fun addContract(request: AddContractReq, headers: Metadata = Metadata()): NoReply
        = unaryRpc(
      channel,
      ViewGrpc.getAddContractMethod(),
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
    public suspend fun chronosPkg(request: ChronosPkgReq, headers: Metadata = Metadata()): Chronos =
        unaryRpc(
      channel,
      ViewGrpc.getChronosPkgMethod(),
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
    public suspend fun cacheView(request: CacheViewReq, headers: Metadata = Metadata()):
        CacheViewReply = unaryRpc(
      channel,
      ViewGrpc.getCacheViewMethod(),
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
    public suspend fun continuousPlay(request: ContinuousPlayReq, headers: Metadata = Metadata()):
        ContinuousPlayReply = unaryRpc(
      channel,
      ViewGrpc.getContinuousPlayMethod(),
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
    public suspend fun premiereArchive(request: PremiereArchiveReq, headers: Metadata = Metadata()):
        PremiereArchiveReply = unaryRpc(
      channel,
      ViewGrpc.getPremiereArchiveMethod(),
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
    public suspend fun reserve(request: ReserveReq, headers: Metadata = Metadata()): ReserveReply =
        unaryRpc(
      channel,
      ViewGrpc.getReserveMethod(),
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
    public suspend fun playerRelates(request: PlayerRelatesReq, headers: Metadata = Metadata()):
        PlayerRelatesReply = unaryRpc(
      channel,
      ViewGrpc.getPlayerRelatesMethod(),
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
    public suspend fun seasonActivityRecord(request: SeasonActivityRecordReq, headers: Metadata =
        Metadata()): SeasonActivityRecordReply = unaryRpc(
      channel,
      ViewGrpc.getSeasonActivityRecordMethod(),
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
    public suspend fun seasonWidgetExpose(request: SeasonWidgetExposeReq, headers: Metadata =
        Metadata()): SeasonWidgetExposeReply = unaryRpc(
      channel,
      ViewGrpc.getSeasonWidgetExposeMethod(),
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
    public suspend fun getArcsPlayer(request: GetArcsPlayerReq, headers: Metadata = Metadata()):
        GetArcsPlayerReply = unaryRpc(
      channel,
      ViewGrpc.getGetArcsPlayerMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.view.v1.View service based on Kotlin coroutines.
   */
  public abstract class ViewCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.View.
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
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.View is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ViewTag.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewTag(request: ViewTagReq): ViewTagReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ViewTag is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ViewMaterial.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewMaterial(request: ViewMaterialReq): ViewMaterialReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ViewMaterial is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ViewProgress.
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
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ViewProgress is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ShortFormVideoDownload.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun shortFormVideoDownload(request: ShortFormVideoDownloadReq):
        ShortFormVideoDownloadReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ShortFormVideoDownload is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ClickPlayerCard.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun clickPlayerCard(request: ClickPlayerCardReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ClickPlayerCard is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ClickActivitySeason.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun clickActivitySeason(request: ClickActivitySeasonReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ClickActivitySeason is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.Season.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun season(request: SeasonReq): SeasonReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.Season is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ExposePlayerCard.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun exposePlayerCard(request: ExposePlayerCardReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ExposePlayerCard is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.AddContract.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addContract(request: AddContractReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.AddContract is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ChronosPkg.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun chronosPkg(request: ChronosPkgReq): Chronos = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ChronosPkg is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.CacheView.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun cacheView(request: CacheViewReq): CacheViewReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.CacheView is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.ContinuousPlay.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun continuousPlay(request: ContinuousPlayReq): ContinuousPlayReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.ContinuousPlay is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.RelatesFeed.
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
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.RelatesFeed is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.PremiereArchive.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun premiereArchive(request: PremiereArchiveReq): PremiereArchiveReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.PremiereArchive is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.Reserve.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reserve(request: ReserveReq): ReserveReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.Reserve is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.PlayerRelates.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playerRelates(request: PlayerRelatesReq): PlayerRelatesReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.PlayerRelates is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.SeasonActivityRecord.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun seasonActivityRecord(request: SeasonActivityRecordReq):
        SeasonActivityRecordReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.SeasonActivityRecord is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.SeasonWidgetExpose.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun seasonWidgetExpose(request: SeasonWidgetExposeReq):
        SeasonWidgetExposeReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.SeasonWidgetExpose is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.view.v1.View.GetArcsPlayer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getArcsPlayer(request: GetArcsPlayerReq): GetArcsPlayerReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.view.v1.View.GetArcsPlayer is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getViewMethod(),
      implementation = ::view
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getViewTagMethod(),
      implementation = ::viewTag
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getViewMaterialMethod(),
      implementation = ::viewMaterial
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getViewProgressMethod(),
      implementation = ::viewProgress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getShortFormVideoDownloadMethod(),
      implementation = ::shortFormVideoDownload
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getClickPlayerCardMethod(),
      implementation = ::clickPlayerCard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getClickActivitySeasonMethod(),
      implementation = ::clickActivitySeason
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getSeasonMethod(),
      implementation = ::season
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getExposePlayerCardMethod(),
      implementation = ::exposePlayerCard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getAddContractMethod(),
      implementation = ::addContract
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getChronosPkgMethod(),
      implementation = ::chronosPkg
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getCacheViewMethod(),
      implementation = ::cacheView
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getContinuousPlayMethod(),
      implementation = ::continuousPlay
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getRelatesFeedMethod(),
      implementation = ::relatesFeed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getPremiereArchiveMethod(),
      implementation = ::premiereArchive
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getReserveMethod(),
      implementation = ::reserve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getPlayerRelatesMethod(),
      implementation = ::playerRelates
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getSeasonActivityRecordMethod(),
      implementation = ::seasonActivityRecord
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getSeasonWidgetExposeMethod(),
      implementation = ::seasonWidgetExpose
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ViewGrpc.getGetArcsPlayerMethod(),
      implementation = ::getArcsPlayer
    )).build()
  }
}
