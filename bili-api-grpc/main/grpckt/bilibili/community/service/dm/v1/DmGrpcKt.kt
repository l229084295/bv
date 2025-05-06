package bilibili.community.service.dm.v1

import bilibili.community.service.dm.v1.DMGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.community.service.dm.v1.DM.
 */
public object DMGrpcKt {
  public const val SERVICE_NAME: String = DMGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val dmSegMobileMethod: MethodDescriptor<DmSegMobileReq, DmSegMobileReply>
    @JvmStatic
    get() = DMGrpc.getDmSegMobileMethod()

  public val dmViewMethod: MethodDescriptor<DmViewReq, DmViewReply>
    @JvmStatic
    get() = DMGrpc.getDmViewMethod()

  public val dmPlayerConfigMethod: MethodDescriptor<DmPlayerConfigReq, Response>
    @JvmStatic
    get() = DMGrpc.getDmPlayerConfigMethod()

  public val dmSegOttMethod: MethodDescriptor<DmSegOttReq, DmSegOttReply>
    @JvmStatic
    get() = DMGrpc.getDmSegOttMethod()

  public val dmSegSDKMethod: MethodDescriptor<DmSegSDKReq, DmSegSDKReply>
    @JvmStatic
    get() = DMGrpc.getDmSegSDKMethod()

  public val dmExpoReportMethod: MethodDescriptor<DmExpoReportReq, DmExpoReportRes>
    @JvmStatic
    get() = DMGrpc.getDmExpoReportMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.community.service.dm.v1.DM service as suspending
   * coroutines.
   */
  @StubFor(DMGrpc::class)
  public class DMCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<DMCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): DMCoroutineStub =
        DMCoroutineStub(channel, callOptions)

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
    public suspend fun dmSegMobile(request: DmSegMobileReq, headers: Metadata = Metadata()):
        DmSegMobileReply = unaryRpc(
      channel,
      DMGrpc.getDmSegMobileMethod(),
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
    public suspend fun dmView(request: DmViewReq, headers: Metadata = Metadata()): DmViewReply =
        unaryRpc(
      channel,
      DMGrpc.getDmViewMethod(),
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
    public suspend fun dmPlayerConfig(request: DmPlayerConfigReq, headers: Metadata = Metadata()):
        Response = unaryRpc(
      channel,
      DMGrpc.getDmPlayerConfigMethod(),
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
    public suspend fun dmSegOtt(request: DmSegOttReq, headers: Metadata = Metadata()): DmSegOttReply
        = unaryRpc(
      channel,
      DMGrpc.getDmSegOttMethod(),
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
    public suspend fun dmSegSDK(request: DmSegSDKReq, headers: Metadata = Metadata()): DmSegSDKReply
        = unaryRpc(
      channel,
      DMGrpc.getDmSegSDKMethod(),
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
    public suspend fun dmExpoReport(request: DmExpoReportReq, headers: Metadata = Metadata()):
        DmExpoReportRes = unaryRpc(
      channel,
      DMGrpc.getDmExpoReportMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.community.service.dm.v1.DM service based on Kotlin
   * coroutines.
   */
  public abstract class DMCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.community.service.dm.v1.DM.DmSegMobile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dmSegMobile(request: DmSegMobileReq): DmSegMobileReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.community.service.dm.v1.DM.DmSegMobile is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.community.service.dm.v1.DM.DmView.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dmView(request: DmViewReq): DmViewReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.community.service.dm.v1.DM.DmView is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.community.service.dm.v1.DM.DmPlayerConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dmPlayerConfig(request: DmPlayerConfigReq): Response = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.community.service.dm.v1.DM.DmPlayerConfig is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.community.service.dm.v1.DM.DmSegOtt.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dmSegOtt(request: DmSegOttReq): DmSegOttReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.community.service.dm.v1.DM.DmSegOtt is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.community.service.dm.v1.DM.DmSegSDK.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dmSegSDK(request: DmSegSDKReq): DmSegSDKReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.community.service.dm.v1.DM.DmSegSDK is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.community.service.dm.v1.DM.DmExpoReport.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dmExpoReport(request: DmExpoReportReq): DmExpoReportRes = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.community.service.dm.v1.DM.DmExpoReport is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DMGrpc.getDmSegMobileMethod(),
      implementation = ::dmSegMobile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DMGrpc.getDmViewMethod(),
      implementation = ::dmView
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DMGrpc.getDmPlayerConfigMethod(),
      implementation = ::dmPlayerConfig
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DMGrpc.getDmSegOttMethod(),
      implementation = ::dmSegOtt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DMGrpc.getDmSegSDKMethod(),
      implementation = ::dmSegSDK
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DMGrpc.getDmExpoReportMethod(),
      implementation = ::dmExpoReport
    )).build()
  }
}
