package bilibili.account.fission.v1

import bilibili.account.fission.v1.FissionGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.account.fission.v1.Fission.
 */
public object FissionGrpcKt {
  public const val SERVICE_NAME: String = FissionGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val entranceMethod: MethodDescriptor<EntranceReq, EntranceReply>
    @JvmStatic
    get() = FissionGrpc.getEntranceMethod()

  public val windowMethod: MethodDescriptor<WindowReq, WindowReply>
    @JvmStatic
    get() = FissionGrpc.getWindowMethod()

  public val privacyMethod: MethodDescriptor<PrivacyReq, PrivacyReply>
    @JvmStatic
    get() = FissionGrpc.getPrivacyMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.account.fission.v1.Fission service as suspending
   * coroutines.
   */
  @StubFor(FissionGrpc::class)
  public class FissionCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<FissionCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): FissionCoroutineStub =
        FissionCoroutineStub(channel, callOptions)

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
    public suspend fun entrance(request: EntranceReq, headers: Metadata = Metadata()): EntranceReply
        = unaryRpc(
      channel,
      FissionGrpc.getEntranceMethod(),
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
    public suspend fun window(request: WindowReq, headers: Metadata = Metadata()): WindowReply =
        unaryRpc(
      channel,
      FissionGrpc.getWindowMethod(),
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
    public suspend fun privacy(request: PrivacyReq, headers: Metadata = Metadata()): PrivacyReply =
        unaryRpc(
      channel,
      FissionGrpc.getPrivacyMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.account.fission.v1.Fission service based on Kotlin
   * coroutines.
   */
  public abstract class FissionCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.account.fission.v1.Fission.Entrance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun entrance(request: EntranceReq): EntranceReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.account.fission.v1.Fission.Entrance is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.account.fission.v1.Fission.Window.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun window(request: WindowReq): WindowReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.account.fission.v1.Fission.Window is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.account.fission.v1.Fission.Privacy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun privacy(request: PrivacyReq): PrivacyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.account.fission.v1.Fission.Privacy is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FissionGrpc.getEntranceMethod(),
      implementation = ::entrance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FissionGrpc.getWindowMethod(),
      implementation = ::window
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FissionGrpc.getPrivacyMethod(),
      implementation = ::privacy
    )).build()
  }
}
