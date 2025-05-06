package bilibili.pangu.gallery.v1

import bilibili.pangu.gallery.v1.GalleryInterfaceGrpc.getServiceDescriptor
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

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * bilibili.pangu.gallery.v1.GalleryInterface.
 */
public object GalleryInterfaceGrpcKt {
  public const val SERVICE_NAME: String = GalleryInterfaceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val pingMethod: MethodDescriptor<Empty, Empty>
    @JvmStatic
    get() = GalleryInterfaceGrpc.getPingMethod()

  public val userInfoMethod: MethodDescriptor<GetUserInfoReq, GetUserInfoReply>
    @JvmStatic
    get() = GalleryInterfaceGrpc.getUserInfoMethod()

  public val listNFTByMidMethod: MethodDescriptor<ListNFTByMidReq, ListNFTByMidReply>
    @JvmStatic
    get() = GalleryInterfaceGrpc.getListNFTByMidMethod()

  public val listOrderByMidMethod: MethodDescriptor<ListOrderByMidReq, ListOrderByMidReply>
    @JvmStatic
    get() = GalleryInterfaceGrpc.getListOrderByMidMethod()

  public val basicInfoMethod: MethodDescriptor<BasicInfoReq, BasicInfoReply>
    @JvmStatic
    get() = GalleryInterfaceGrpc.getBasicInfoMethod()

  public val userCheckMethod: MethodDescriptor<UserCheckReq, UserCheckReply>
    @JvmStatic
    get() = GalleryInterfaceGrpc.getUserCheckMethod()

  public val agreePolicyMethod: MethodDescriptor<AgreePolicyReq, AgreePolicyReply>
    @JvmStatic
    get() = GalleryInterfaceGrpc.getAgreePolicyMethod()

  public val getLastPolicyMethod: MethodDescriptor<GetLastPolicyReq, GetLastPolicyReply>
    @JvmStatic
    get() = GalleryInterfaceGrpc.getGetLastPolicyMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.pangu.gallery.v1.GalleryInterface service as
   * suspending coroutines.
   */
  @StubFor(GalleryInterfaceGrpc::class)
  public class GalleryInterfaceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GalleryInterfaceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): GalleryInterfaceCoroutineStub =
        GalleryInterfaceCoroutineStub(channel, callOptions)

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
      GalleryInterfaceGrpc.getPingMethod(),
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
    public suspend fun userInfo(request: GetUserInfoReq, headers: Metadata = Metadata()):
        GetUserInfoReply = unaryRpc(
      channel,
      GalleryInterfaceGrpc.getUserInfoMethod(),
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
    public suspend fun listNFTByMid(request: ListNFTByMidReq, headers: Metadata = Metadata()):
        ListNFTByMidReply = unaryRpc(
      channel,
      GalleryInterfaceGrpc.getListNFTByMidMethod(),
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
    public suspend fun listOrderByMid(request: ListOrderByMidReq, headers: Metadata = Metadata()):
        ListOrderByMidReply = unaryRpc(
      channel,
      GalleryInterfaceGrpc.getListOrderByMidMethod(),
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
    public suspend fun basicInfo(request: BasicInfoReq, headers: Metadata = Metadata()):
        BasicInfoReply = unaryRpc(
      channel,
      GalleryInterfaceGrpc.getBasicInfoMethod(),
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
    public suspend fun userCheck(request: UserCheckReq, headers: Metadata = Metadata()):
        UserCheckReply = unaryRpc(
      channel,
      GalleryInterfaceGrpc.getUserCheckMethod(),
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
    public suspend fun agreePolicy(request: AgreePolicyReq, headers: Metadata = Metadata()):
        AgreePolicyReply = unaryRpc(
      channel,
      GalleryInterfaceGrpc.getAgreePolicyMethod(),
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
    public suspend fun getLastPolicy(request: GetLastPolicyReq, headers: Metadata = Metadata()):
        GetLastPolicyReply = unaryRpc(
      channel,
      GalleryInterfaceGrpc.getGetLastPolicyMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.pangu.gallery.v1.GalleryInterface service based on
   * Kotlin coroutines.
   */
  public abstract class GalleryInterfaceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.pangu.gallery.v1.GalleryInterface.Ping.
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
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pangu.gallery.v1.GalleryInterface.Ping is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.pangu.gallery.v1.GalleryInterface.UserInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun userInfo(request: GetUserInfoReq): GetUserInfoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pangu.gallery.v1.GalleryInterface.UserInfo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.pangu.gallery.v1.GalleryInterface.ListNFTByMid.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listNFTByMid(request: ListNFTByMidReq): ListNFTByMidReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pangu.gallery.v1.GalleryInterface.ListNFTByMid is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.pangu.gallery.v1.GalleryInterface.ListOrderByMid.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listOrderByMid(request: ListOrderByMidReq): ListOrderByMidReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pangu.gallery.v1.GalleryInterface.ListOrderByMid is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.pangu.gallery.v1.GalleryInterface.BasicInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun basicInfo(request: BasicInfoReq): BasicInfoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pangu.gallery.v1.GalleryInterface.BasicInfo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.pangu.gallery.v1.GalleryInterface.UserCheck.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun userCheck(request: UserCheckReq): UserCheckReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pangu.gallery.v1.GalleryInterface.UserCheck is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.pangu.gallery.v1.GalleryInterface.AgreePolicy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun agreePolicy(request: AgreePolicyReq): AgreePolicyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pangu.gallery.v1.GalleryInterface.AgreePolicy is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.pangu.gallery.v1.GalleryInterface.GetLastPolicy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getLastPolicy(request: GetLastPolicyReq): GetLastPolicyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pangu.gallery.v1.GalleryInterface.GetLastPolicy is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GalleryInterfaceGrpc.getPingMethod(),
      implementation = ::ping
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GalleryInterfaceGrpc.getUserInfoMethod(),
      implementation = ::userInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GalleryInterfaceGrpc.getListNFTByMidMethod(),
      implementation = ::listNFTByMid
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GalleryInterfaceGrpc.getListOrderByMidMethod(),
      implementation = ::listOrderByMid
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GalleryInterfaceGrpc.getBasicInfoMethod(),
      implementation = ::basicInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GalleryInterfaceGrpc.getUserCheckMethod(),
      implementation = ::userCheck
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GalleryInterfaceGrpc.getAgreePolicyMethod(),
      implementation = ::agreePolicy
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GalleryInterfaceGrpc.getGetLastPolicyMethod(),
      implementation = ::getLastPolicy
    )).build()
  }
}
