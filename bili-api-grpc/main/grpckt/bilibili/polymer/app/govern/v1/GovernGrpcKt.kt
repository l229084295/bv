package bilibili.polymer.app.govern.v1

import bilibili.polymer.app.govern.v1.AntiHarassmentServiceGrpc.getServiceDescriptor
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
 * bilibili.polymer.app.govern.v1.AntiHarassmentService.
 */
public object AntiHarassmentServiceGrpcKt {
  public const val SERVICE_NAME: String = AntiHarassmentServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val storeAntiHarassmentSettingsMethod:
      MethodDescriptor<StoreAntiHarassmentSettingsReq, StoreAntiHarassmentSettingsRsp>
    @JvmStatic
    get() = AntiHarassmentServiceGrpc.getStoreAntiHarassmentSettingsMethod()

  public val loadAntiHarassmentSettingsMethod:
      MethodDescriptor<LoadAntiHarassmentSettingsReq, LoadAntiHarassmentSettingsRsp>
    @JvmStatic
    get() = AntiHarassmentServiceGrpc.getLoadAntiHarassmentSettingsMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.polymer.app.govern.v1.AntiHarassmentService service as
   * suspending coroutines.
   */
  @StubFor(AntiHarassmentServiceGrpc::class)
  public class AntiHarassmentServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AntiHarassmentServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        AntiHarassmentServiceCoroutineStub = AntiHarassmentServiceCoroutineStub(channel,
        callOptions)

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
    public suspend fun storeAntiHarassmentSettings(request: StoreAntiHarassmentSettingsReq,
        headers: Metadata = Metadata()): StoreAntiHarassmentSettingsRsp = unaryRpc(
      channel,
      AntiHarassmentServiceGrpc.getStoreAntiHarassmentSettingsMethod(),
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
    public suspend fun loadAntiHarassmentSettings(request: LoadAntiHarassmentSettingsReq,
        headers: Metadata = Metadata()): LoadAntiHarassmentSettingsRsp = unaryRpc(
      channel,
      AntiHarassmentServiceGrpc.getLoadAntiHarassmentSettingsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.polymer.app.govern.v1.AntiHarassmentService service
   * based on Kotlin coroutines.
   */
  public abstract class AntiHarassmentServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * bilibili.polymer.app.govern.v1.AntiHarassmentService.StoreAntiHarassmentSettings.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun storeAntiHarassmentSettings(request: StoreAntiHarassmentSettingsReq):
        StoreAntiHarassmentSettingsRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.app.govern.v1.AntiHarassmentService.StoreAntiHarassmentSettings is unimplemented"))

    /**
     * Returns the response to an RPC for
     * bilibili.polymer.app.govern.v1.AntiHarassmentService.LoadAntiHarassmentSettings.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun loadAntiHarassmentSettings(request: LoadAntiHarassmentSettingsReq):
        LoadAntiHarassmentSettingsRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.app.govern.v1.AntiHarassmentService.LoadAntiHarassmentSettings is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AntiHarassmentServiceGrpc.getStoreAntiHarassmentSettingsMethod(),
      implementation = ::storeAntiHarassmentSettings
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AntiHarassmentServiceGrpc.getLoadAntiHarassmentSettingsMethod(),
      implementation = ::loadAntiHarassmentSettings
    )).build()
  }
}
