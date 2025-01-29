package bilibili.polymer.list.v1

import bilibili.polymer.list.v1.ListGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.polymer.list.v1.List.
 */
public object ListGrpcKt {
  public const val SERVICE_NAME: String = ListGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val favoriteTabMethod: MethodDescriptor<FavoriteTabReq, FavoriteTabReply>
    @JvmStatic
    get() = ListGrpc.getFavoriteTabMethod()

  public val checkAccountMethod: MethodDescriptor<CheckAccountReq, CheckAccountReply>
    @JvmStatic
    get() = ListGrpc.getCheckAccountMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.polymer.list.v1.List service as suspending coroutines.
   */
  @StubFor(ListGrpc::class)
  public class ListCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ListCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ListCoroutineStub =
        ListCoroutineStub(channel, callOptions)

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
    public suspend fun favoriteTab(request: FavoriteTabReq, headers: Metadata = Metadata()):
        FavoriteTabReply = unaryRpc(
      channel,
      ListGrpc.getFavoriteTabMethod(),
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
    public suspend fun checkAccount(request: CheckAccountReq, headers: Metadata = Metadata()):
        CheckAccountReply = unaryRpc(
      channel,
      ListGrpc.getCheckAccountMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.polymer.list.v1.List service based on Kotlin
   * coroutines.
   */
  public abstract class ListCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.polymer.list.v1.List.FavoriteTab.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun favoriteTab(request: FavoriteTabReq): FavoriteTabReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.list.v1.List.FavoriteTab is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.polymer.list.v1.List.CheckAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun checkAccount(request: CheckAccountReq): CheckAccountReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.list.v1.List.CheckAccount is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListGrpc.getFavoriteTabMethod(),
      implementation = ::favoriteTab
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListGrpc.getCheckAccountMethod(),
      implementation = ::checkAccount
    )).build()
  }
}
