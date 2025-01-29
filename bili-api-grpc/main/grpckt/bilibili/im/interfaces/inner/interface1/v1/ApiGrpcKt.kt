package bilibili.im.interfaces.`inner`.interface1.v1

import bilibili.im.interfaces.`inner`.interface1.v1.InnerInterfaceGrpc.getServiceDescriptor
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
 * bilibili.im.interface.inner.interface.v1.InnerInterface.
 */
public object InnerInterfaceGrpcKt {
  public const val SERVICE_NAME: String = InnerInterfaceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val updateListInnMethod: MethodDescriptor<ReqOpBlacklist, RspOpBlacklist>
    @JvmStatic
    get() = InnerInterfaceGrpc.getUpdateListInnMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.im.interface.inner.interface.v1.InnerInterface service
   * as suspending coroutines.
   */
  @StubFor(InnerInterfaceGrpc::class)
  public class InnerInterfaceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<InnerInterfaceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): InnerInterfaceCoroutineStub =
        InnerInterfaceCoroutineStub(channel, callOptions)

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
    public suspend fun updateListInn(request: ReqOpBlacklist, headers: Metadata = Metadata()):
        RspOpBlacklist = unaryRpc(
      channel,
      InnerInterfaceGrpc.getUpdateListInnMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.im.interface.inner.interface.v1.InnerInterface service
   * based on Kotlin coroutines.
   */
  public abstract class InnerInterfaceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * bilibili.im.interface.inner.interface.v1.InnerInterface.UpdateListInn.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateListInn(request: ReqOpBlacklist): RspOpBlacklist = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.inner.interface.v1.InnerInterface.UpdateListInn is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InnerInterfaceGrpc.getUpdateListInnMethod(),
      implementation = ::updateListInn
    )).build()
  }
}
