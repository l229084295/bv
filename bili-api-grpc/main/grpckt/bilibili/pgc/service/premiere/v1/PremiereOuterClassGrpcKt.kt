package bilibili.pgc.service.premiere.v1

import bilibili.pgc.service.premiere.v1.PremiereGrpc.getServiceDescriptor
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
 * bilibili.pgc.service.premiere.v1.Premiere.
 */
public object PremiereGrpcKt {
  public const val SERVICE_NAME: String = PremiereGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val statusMethod: MethodDescriptor<PremiereStatusReq, PremiereStatusReply>
    @JvmStatic
    get() = PremiereGrpc.getStatusMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.pgc.service.premiere.v1.Premiere service as suspending
   * coroutines.
   */
  @StubFor(PremiereGrpc::class)
  public class PremiereCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<PremiereCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): PremiereCoroutineStub =
        PremiereCoroutineStub(channel, callOptions)

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
    public suspend fun status(request: PremiereStatusReq, headers: Metadata = Metadata()):
        PremiereStatusReply = unaryRpc(
      channel,
      PremiereGrpc.getStatusMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.pgc.service.premiere.v1.Premiere service based on
   * Kotlin coroutines.
   */
  public abstract class PremiereCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.pgc.service.premiere.v1.Premiere.Status.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun status(request: PremiereStatusReq): PremiereStatusReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.pgc.service.premiere.v1.Premiere.Status is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PremiereGrpc.getStatusMethod(),
      implementation = ::status
    )).build()
  }
}
