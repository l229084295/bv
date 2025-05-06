package bilibili.app.resource.privacy.v1

import bilibili.app.resource.privacy.v1.PrivacyGrpc.getServiceDescriptor
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
 * bilibili.app.resource.privacy.v1.Privacy.
 */
public object PrivacyGrpcKt {
  public const val SERVICE_NAME: String = PrivacyGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val privacyConfigMethod: MethodDescriptor<NoArgRequest, PrivacyConfigReply>
    @JvmStatic
    get() = PrivacyGrpc.getPrivacyConfigMethod()

  public val setPrivacyConfigMethod: MethodDescriptor<SetPrivacyConfigRequest, NoReply>
    @JvmStatic
    get() = PrivacyGrpc.getSetPrivacyConfigMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.resource.privacy.v1.Privacy service as suspending
   * coroutines.
   */
  @StubFor(PrivacyGrpc::class)
  public class PrivacyCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<PrivacyCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): PrivacyCoroutineStub =
        PrivacyCoroutineStub(channel, callOptions)

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
    public suspend fun privacyConfig(request: NoArgRequest, headers: Metadata = Metadata()):
        PrivacyConfigReply = unaryRpc(
      channel,
      PrivacyGrpc.getPrivacyConfigMethod(),
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
    public suspend fun setPrivacyConfig(request: SetPrivacyConfigRequest, headers: Metadata =
        Metadata()): NoReply = unaryRpc(
      channel,
      PrivacyGrpc.getSetPrivacyConfigMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.resource.privacy.v1.Privacy service based on Kotlin
   * coroutines.
   */
  public abstract class PrivacyCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.resource.privacy.v1.Privacy.PrivacyConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun privacyConfig(request: NoArgRequest): PrivacyConfigReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.resource.privacy.v1.Privacy.PrivacyConfig is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.resource.privacy.v1.Privacy.SetPrivacyConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setPrivacyConfig(request: SetPrivacyConfigRequest): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.resource.privacy.v1.Privacy.SetPrivacyConfig is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PrivacyGrpc.getPrivacyConfigMethod(),
      implementation = ::privacyConfig
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PrivacyGrpc.getSetPrivacyConfigMethod(),
      implementation = ::setPrivacyConfig
    )).build()
  }
}
