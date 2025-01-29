package bilibili.app.search.v2

import bilibili.app.search.v2.SearchGrpc.getServiceDescriptor
import bilibili.broadcast.message.main.ChatResult
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.search.v2.Search.
 */
public object SearchGrpcKt {
  public const val SERVICE_NAME: String = SearchGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val cancelChatTaskMethod: MethodDescriptor<CancelChatTaskReq, CancelChatTaskReply>
    @JvmStatic
    get() = SearchGrpc.getCancelChatTaskMethod()

  public val getChatResultMethod: MethodDescriptor<GetChatResultReq, ChatResult>
    @JvmStatic
    get() = SearchGrpc.getGetChatResultMethod()

  public val searchEggMethod: MethodDescriptor<SearchEggReq, SearchEggReply>
    @JvmStatic
    get() = SearchGrpc.getSearchEggMethod()

  public val submitChatTaskMethod: MethodDescriptor<SubmitChatTaskReq, SubmitChatTaskReply>
    @JvmStatic
    get() = SearchGrpc.getSubmitChatTaskMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.search.v2.Search service as suspending coroutines.
   */
  @StubFor(SearchGrpc::class)
  public class SearchCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<SearchCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SearchCoroutineStub =
        SearchCoroutineStub(channel, callOptions)

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
    public suspend fun cancelChatTask(request: CancelChatTaskReq, headers: Metadata = Metadata()):
        CancelChatTaskReply = unaryRpc(
      channel,
      SearchGrpc.getCancelChatTaskMethod(),
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
    public suspend fun getChatResult(request: GetChatResultReq, headers: Metadata = Metadata()):
        ChatResult = unaryRpc(
      channel,
      SearchGrpc.getGetChatResultMethod(),
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
    public suspend fun searchEgg(request: SearchEggReq, headers: Metadata = Metadata()):
        SearchEggReply = unaryRpc(
      channel,
      SearchGrpc.getSearchEggMethod(),
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
    public suspend fun submitChatTask(request: SubmitChatTaskReq, headers: Metadata = Metadata()):
        SubmitChatTaskReply = unaryRpc(
      channel,
      SearchGrpc.getSubmitChatTaskMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.search.v2.Search service based on Kotlin
   * coroutines.
   */
  public abstract class SearchCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.search.v2.Search.CancelChatTask.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun cancelChatTask(request: CancelChatTaskReq): CancelChatTaskReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.search.v2.Search.CancelChatTask is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.search.v2.Search.GetChatResult.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getChatResult(request: GetChatResultReq): ChatResult = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.search.v2.Search.GetChatResult is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.search.v2.Search.SearchEgg.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchEgg(request: SearchEggReq): SearchEggReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.search.v2.Search.SearchEgg is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.search.v2.Search.SubmitChatTask.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun submitChatTask(request: SubmitChatTaskReq): SubmitChatTaskReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.search.v2.Search.SubmitChatTask is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getCancelChatTaskMethod(),
      implementation = ::cancelChatTask
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getGetChatResultMethod(),
      implementation = ::getChatResult
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getSearchEggMethod(),
      implementation = ::searchEgg
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getSubmitChatTaskMethod(),
      implementation = ::submitChatTask
    )).build()
  }
}
