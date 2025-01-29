package bilibili.gaia.gw

import bilibili.gaia.gw.GaiaGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.gaia.gw.Gaia.
 */
public object GaiaGrpcKt {
  public const val SERVICE_NAME: String = GaiaGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val exUploadAppListMethod: MethodDescriptor<GaiaEncryptMsgReq, UploadAppListReply>
    @JvmStatic
    get() = GaiaGrpc.getExUploadAppListMethod()

  public val exFetchPublicKeyMethod: MethodDescriptor<Empty, FetchPublicKeyReply>
    @JvmStatic
    get() = GaiaGrpc.getExFetchPublicKeyMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.gaia.gw.Gaia service as suspending coroutines.
   */
  @StubFor(GaiaGrpc::class)
  public class GaiaCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GaiaCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): GaiaCoroutineStub =
        GaiaCoroutineStub(channel, callOptions)

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
    public suspend fun exUploadAppList(request: GaiaEncryptMsgReq, headers: Metadata = Metadata()):
        UploadAppListReply = unaryRpc(
      channel,
      GaiaGrpc.getExUploadAppListMethod(),
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
    public suspend fun exFetchPublicKey(request: Empty, headers: Metadata = Metadata()):
        FetchPublicKeyReply = unaryRpc(
      channel,
      GaiaGrpc.getExFetchPublicKeyMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.gaia.gw.Gaia service based on Kotlin coroutines.
   */
  public abstract class GaiaCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.gaia.gw.Gaia.ExUploadAppList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun exUploadAppList(request: GaiaEncryptMsgReq): UploadAppListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.gaia.gw.Gaia.ExUploadAppList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.gaia.gw.Gaia.ExFetchPublicKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun exFetchPublicKey(request: Empty): FetchPublicKeyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.gaia.gw.Gaia.ExFetchPublicKey is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GaiaGrpc.getExUploadAppListMethod(),
      implementation = ::exUploadAppList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GaiaGrpc.getExFetchPublicKeyMethod(),
      implementation = ::exFetchPublicKey
    )).build()
  }
}
