package bilibili.app.`dynamic`.v1

import bilibili.app.`dynamic`.v1.DynamicGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.dynamic.v1.Dynamic.
 */
public object DynamicGrpcKt {
  public const val SERVICE_NAME: String = DynamicGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val dynVideoMethod: MethodDescriptor<DynVideoReq, DynVideoReqReply>
    @JvmStatic
    get() = DynamicGrpc.getDynVideoMethod()

  public val dynDetailsMethod: MethodDescriptor<DynDetailsReq, DynDetailsReply>
    @JvmStatic
    get() = DynamicGrpc.getDynDetailsMethod()

  public val sVideoMethod: MethodDescriptor<SVideoReq, SVideoReply>
    @JvmStatic
    get() = DynamicGrpc.getSVideoMethod()

  public val dynTabMethod: MethodDescriptor<DynTabReq, DynTabReply>
    @JvmStatic
    get() = DynamicGrpc.getDynTabMethod()

  public val dynOurCitySwitchMethod: MethodDescriptor<DynOurCitySwitchReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getDynOurCitySwitchMethod()

  public val dynOurCityMethod: MethodDescriptor<DynOurCityReq, DynOurCityReply>
    @JvmStatic
    get() = DynamicGrpc.getDynOurCityMethod()

  public val dynVideoPersonalMethod: MethodDescriptor<DynVideoPersonalReq, DynVideoPersonalReply>
    @JvmStatic
    get() = DynamicGrpc.getDynVideoPersonalMethod()

  public val dynUpdOffsetMethod: MethodDescriptor<DynUpdOffsetReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getDynUpdOffsetMethod()

  public val dynRedMethod: MethodDescriptor<DynRedReq, DynRedReply>
    @JvmStatic
    get() = DynamicGrpc.getDynRedMethod()

  public val dynMixUpListViewMoreMethod: MethodDescriptor<NoReq, DynMixUpListViewMoreReply>
    @JvmStatic
    get() = DynamicGrpc.getDynMixUpListViewMoreMethod()

  public val dynMixUpListSearchMethod:
      MethodDescriptor<DynMixUpListSearchReq, DynMixUpListSearchReply>
    @JvmStatic
    get() = DynamicGrpc.getDynMixUpListSearchMethod()

  public val ourCityClickReportMethod:
      MethodDescriptor<OurCityClickReportReq, OurCityClickReportReply>
    @JvmStatic
    get() = DynamicGrpc.getOurCityClickReportMethod()

  public val geoCoderMethod: MethodDescriptor<GeoCoderReq, GeoCoderReply>
    @JvmStatic
    get() = DynamicGrpc.getGeoCoderMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.dynamic.v1.Dynamic service as suspending
   * coroutines.
   */
  @StubFor(DynamicGrpc::class)
  public class DynamicCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<DynamicCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): DynamicCoroutineStub =
        DynamicCoroutineStub(channel, callOptions)

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
    public suspend fun dynVideo(request: DynVideoReq, headers: Metadata = Metadata()):
        DynVideoReqReply = unaryRpc(
      channel,
      DynamicGrpc.getDynVideoMethod(),
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
    public suspend fun dynDetails(request: DynDetailsReq, headers: Metadata = Metadata()):
        DynDetailsReply = unaryRpc(
      channel,
      DynamicGrpc.getDynDetailsMethod(),
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
    public suspend fun sVideo(request: SVideoReq, headers: Metadata = Metadata()): SVideoReply =
        unaryRpc(
      channel,
      DynamicGrpc.getSVideoMethod(),
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
    public suspend fun dynTab(request: DynTabReq, headers: Metadata = Metadata()): DynTabReply =
        unaryRpc(
      channel,
      DynamicGrpc.getDynTabMethod(),
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
    public suspend fun dynOurCitySwitch(request: DynOurCitySwitchReq, headers: Metadata =
        Metadata()): NoReply = unaryRpc(
      channel,
      DynamicGrpc.getDynOurCitySwitchMethod(),
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
    public suspend fun dynOurCity(request: DynOurCityReq, headers: Metadata = Metadata()):
        DynOurCityReply = unaryRpc(
      channel,
      DynamicGrpc.getDynOurCityMethod(),
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
    public suspend fun dynVideoPersonal(request: DynVideoPersonalReq, headers: Metadata =
        Metadata()): DynVideoPersonalReply = unaryRpc(
      channel,
      DynamicGrpc.getDynVideoPersonalMethod(),
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
    public suspend fun dynUpdOffset(request: DynUpdOffsetReq, headers: Metadata = Metadata()):
        NoReply = unaryRpc(
      channel,
      DynamicGrpc.getDynUpdOffsetMethod(),
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
    public suspend fun dynRed(request: DynRedReq, headers: Metadata = Metadata()): DynRedReply =
        unaryRpc(
      channel,
      DynamicGrpc.getDynRedMethod(),
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
    public suspend fun dynMixUpListViewMore(request: NoReq, headers: Metadata = Metadata()):
        DynMixUpListViewMoreReply = unaryRpc(
      channel,
      DynamicGrpc.getDynMixUpListViewMoreMethod(),
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
    public suspend fun dynMixUpListSearch(request: DynMixUpListSearchReq, headers: Metadata =
        Metadata()): DynMixUpListSearchReply = unaryRpc(
      channel,
      DynamicGrpc.getDynMixUpListSearchMethod(),
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
    public suspend fun ourCityClickReport(request: OurCityClickReportReq, headers: Metadata =
        Metadata()): OurCityClickReportReply = unaryRpc(
      channel,
      DynamicGrpc.getOurCityClickReportMethod(),
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
    public suspend fun geoCoder(request: GeoCoderReq, headers: Metadata = Metadata()): GeoCoderReply
        = unaryRpc(
      channel,
      DynamicGrpc.getGeoCoderMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.dynamic.v1.Dynamic service based on Kotlin
   * coroutines.
   */
  public abstract class DynamicCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynVideo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynVideo(request: DynVideoReq): DynVideoReqReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynVideo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynDetails.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynDetails(request: DynDetailsReq): DynDetailsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynDetails is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.SVideo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sVideo(request: SVideoReq): SVideoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.SVideo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynTab.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynTab(request: DynTabReq): DynTabReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynTab is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynOurCitySwitch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynOurCitySwitch(request: DynOurCitySwitchReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynOurCitySwitch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynOurCity.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynOurCity(request: DynOurCityReq): DynOurCityReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynOurCity is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynVideoPersonal.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynVideoPersonal(request: DynVideoPersonalReq): DynVideoPersonalReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynVideoPersonal is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynUpdOffset.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynUpdOffset(request: DynUpdOffsetReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynUpdOffset is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynRed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynRed(request: DynRedReq): DynRedReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynRed is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynMixUpListViewMore.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynMixUpListViewMore(request: NoReq): DynMixUpListViewMoreReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynMixUpListViewMore is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.DynMixUpListSearch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynMixUpListSearch(request: DynMixUpListSearchReq):
        DynMixUpListSearchReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.DynMixUpListSearch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.OurCityClickReport.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun ourCityClickReport(request: OurCityClickReportReq):
        OurCityClickReportReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.OurCityClickReport is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v1.Dynamic.GeoCoder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun geoCoder(request: GeoCoderReq): GeoCoderReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v1.Dynamic.GeoCoder is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynVideoMethod(),
      implementation = ::dynVideo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynDetailsMethod(),
      implementation = ::dynDetails
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getSVideoMethod(),
      implementation = ::sVideo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynTabMethod(),
      implementation = ::dynTab
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynOurCitySwitchMethod(),
      implementation = ::dynOurCitySwitch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynOurCityMethod(),
      implementation = ::dynOurCity
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynVideoPersonalMethod(),
      implementation = ::dynVideoPersonal
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynUpdOffsetMethod(),
      implementation = ::dynUpdOffset
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynRedMethod(),
      implementation = ::dynRed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynMixUpListViewMoreMethod(),
      implementation = ::dynMixUpListViewMore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynMixUpListSearchMethod(),
      implementation = ::dynMixUpListSearch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getOurCityClickReportMethod(),
      implementation = ::ourCityClickReport
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getGeoCoderMethod(),
      implementation = ::geoCoder
    )).build()
  }
}
