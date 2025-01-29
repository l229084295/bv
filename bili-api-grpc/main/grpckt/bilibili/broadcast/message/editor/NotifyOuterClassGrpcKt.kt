package bilibili.broadcast.message.editor

import bilibili.broadcast.message.editor.OperationNotifyGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * bilibili.broadcast.message.editor.OperationNotify.
 */
public object OperationNotifyGrpcKt {
  public const val SERVICE_NAME: String = OperationNotifyGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val operationNotifyMethod: MethodDescriptor<Empty, Notify>
    @JvmStatic
    get() = OperationNotifyGrpc.getOperationNotifyMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.broadcast.message.editor.OperationNotify service as
   * suspending coroutines.
   */
  @StubFor(OperationNotifyGrpc::class)
  public class OperationNotifyCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<OperationNotifyCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): OperationNotifyCoroutineStub =
        OperationNotifyCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun operationNotify(request: Empty, headers: Metadata = Metadata()): Flow<Notify> =
        serverStreamingRpc(
      channel,
      OperationNotifyGrpc.getOperationNotifyMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.broadcast.message.editor.OperationNotify service based
   * on Kotlin coroutines.
   */
  public abstract class OperationNotifyCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * bilibili.broadcast.message.editor.OperationNotify.OperationNotify.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun operationNotify(request: Empty): Flow<Notify> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.message.editor.OperationNotify.OperationNotify is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = OperationNotifyGrpc.getOperationNotifyMethod(),
      implementation = ::operationNotify
    )).build()
  }
}
