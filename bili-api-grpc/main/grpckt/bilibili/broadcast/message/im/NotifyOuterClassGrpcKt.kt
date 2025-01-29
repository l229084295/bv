package bilibili.broadcast.message.im

import bilibili.broadcast.message.im.NotifyGrpc.getServiceDescriptor
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
 * bilibili.broadcast.message.im.Notify.
 */
public object NotifyGrpcKt {
  public const val SERVICE_NAME: String = NotifyGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val watchNotifyMethod: MethodDescriptor<Empty, NotifyRsp>
    @JvmStatic
    get() = NotifyGrpc.getWatchNotifyMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.broadcast.message.im.Notify service as suspending
   * coroutines.
   */
  @StubFor(NotifyGrpc::class)
  public class NotifyCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<NotifyCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): NotifyCoroutineStub =
        NotifyCoroutineStub(channel, callOptions)

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
    public fun watchNotify(request: Empty, headers: Metadata = Metadata()): Flow<NotifyRsp> =
        serverStreamingRpc(
      channel,
      NotifyGrpc.getWatchNotifyMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.broadcast.message.im.Notify service based on Kotlin
   * coroutines.
   */
  public abstract class NotifyCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for bilibili.broadcast.message.im.Notify.WatchNotify.
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
    public open fun watchNotify(request: Empty): Flow<NotifyRsp> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.message.im.Notify.WatchNotify is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = NotifyGrpc.getWatchNotifyMethod(),
      implementation = ::watchNotify
    )).build()
  }
}
