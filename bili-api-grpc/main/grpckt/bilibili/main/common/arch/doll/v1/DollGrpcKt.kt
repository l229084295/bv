package bilibili.main.common.arch.doll.v1

import bilibili.main.common.arch.doll.v1.EchoGrpc.getServiceDescriptor
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
 * bilibili.main.common.arch.doll.v1.Echo.
 */
public object EchoGrpcKt {
  public const val SERVICE_NAME: String = EchoGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val pingMethod: MethodDescriptor<PingRequest, PingResponse>
    @JvmStatic
    get() = EchoGrpc.getPingMethod()

  public val sayMethod: MethodDescriptor<SayRequest, SayResponse>
    @JvmStatic
    get() = EchoGrpc.getSayMethod()

  public val errorMethod: MethodDescriptor<ErrorRequest, ErrorResponse>
    @JvmStatic
    get() = EchoGrpc.getErrorMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.main.common.arch.doll.v1.Echo service as suspending
   * coroutines.
   */
  @StubFor(EchoGrpc::class)
  public class EchoCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<EchoCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): EchoCoroutineStub =
        EchoCoroutineStub(channel, callOptions)

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
    public suspend fun ping(request: PingRequest, headers: Metadata = Metadata()): PingResponse =
        unaryRpc(
      channel,
      EchoGrpc.getPingMethod(),
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
    public suspend fun say(request: SayRequest, headers: Metadata = Metadata()): SayResponse =
        unaryRpc(
      channel,
      EchoGrpc.getSayMethod(),
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
    public suspend fun error(request: ErrorRequest, headers: Metadata = Metadata()): ErrorResponse =
        unaryRpc(
      channel,
      EchoGrpc.getErrorMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.main.common.arch.doll.v1.Echo service based on Kotlin
   * coroutines.
   */
  public abstract class EchoCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.main.common.arch.doll.v1.Echo.Ping.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun ping(request: PingRequest): PingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.common.arch.doll.v1.Echo.Ping is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.common.arch.doll.v1.Echo.Say.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun say(request: SayRequest): SayResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.common.arch.doll.v1.Echo.Say is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.main.common.arch.doll.v1.Echo.Error.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun error(request: ErrorRequest): ErrorResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.main.common.arch.doll.v1.Echo.Error is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EchoGrpc.getPingMethod(),
      implementation = ::ping
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EchoGrpc.getSayMethod(),
      implementation = ::say
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EchoGrpc.getErrorMethod(),
      implementation = ::error
    )).build()
  }
}
