package bilibili.app.interfaces.v1

import bilibili.app.interfaces.v1.HistoryGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.interface.v1.History.
 */
public object HistoryGrpcKt {
  public const val SERVICE_NAME: String = HistoryGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val historyTabMethod: MethodDescriptor<HistoryTabReq, HistoryTabReply>
    @JvmStatic
    get() = HistoryGrpc.getHistoryTabMethod()

  public val cursorMethod: MethodDescriptor<CursorReq, CursorReply>
    @JvmStatic
    get() = HistoryGrpc.getCursorMethod()

  public val cursorV2Method: MethodDescriptor<CursorV2Req, CursorV2Reply>
    @JvmStatic
    get() = HistoryGrpc.getCursorV2Method()

  public val deleteMethod: MethodDescriptor<DeleteReq, NoReply>
    @JvmStatic
    get() = HistoryGrpc.getDeleteMethod()

  public val searchMethod: MethodDescriptor<SearchReq, SearchReply>
    @JvmStatic
    get() = HistoryGrpc.getSearchMethod()

  public val clearMethod: MethodDescriptor<ClearReq, NoReply>
    @JvmStatic
    get() = HistoryGrpc.getClearMethod()

  public val latestHistoryMethod: MethodDescriptor<LatestHistoryReq, LatestHistoryReply>
    @JvmStatic
    get() = HistoryGrpc.getLatestHistoryMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.interface.v1.History service as suspending
   * coroutines.
   */
  @StubFor(HistoryGrpc::class)
  public class HistoryCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<HistoryCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): HistoryCoroutineStub =
        HistoryCoroutineStub(channel, callOptions)

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
    public suspend fun historyTab(request: HistoryTabReq, headers: Metadata = Metadata()):
        HistoryTabReply = unaryRpc(
      channel,
      HistoryGrpc.getHistoryTabMethod(),
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
    public suspend fun cursor(request: CursorReq, headers: Metadata = Metadata()): CursorReply =
        unaryRpc(
      channel,
      HistoryGrpc.getCursorMethod(),
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
    public suspend fun cursorV2(request: CursorV2Req, headers: Metadata = Metadata()): CursorV2Reply
        = unaryRpc(
      channel,
      HistoryGrpc.getCursorV2Method(),
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
    public suspend fun delete(request: DeleteReq, headers: Metadata = Metadata()): NoReply =
        unaryRpc(
      channel,
      HistoryGrpc.getDeleteMethod(),
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
    public suspend fun search(request: SearchReq, headers: Metadata = Metadata()): SearchReply =
        unaryRpc(
      channel,
      HistoryGrpc.getSearchMethod(),
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
    public suspend fun clear(request: ClearReq, headers: Metadata = Metadata()): NoReply = unaryRpc(
      channel,
      HistoryGrpc.getClearMethod(),
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
    public suspend fun latestHistory(request: LatestHistoryReq, headers: Metadata = Metadata()):
        LatestHistoryReply = unaryRpc(
      channel,
      HistoryGrpc.getLatestHistoryMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.interface.v1.History service based on Kotlin
   * coroutines.
   */
  public abstract class HistoryCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.History.HistoryTab.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun historyTab(request: HistoryTabReq): HistoryTabReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.History.HistoryTab is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.History.Cursor.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun cursor(request: CursorReq): CursorReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.History.Cursor is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.History.CursorV2.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun cursorV2(request: CursorV2Req): CursorV2Reply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.History.CursorV2 is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.History.Delete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun delete(request: DeleteReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.History.Delete is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.History.Search.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun search(request: SearchReq): SearchReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.History.Search is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.History.Clear.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun clear(request: ClearReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.History.Clear is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.History.LatestHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun latestHistory(request: LatestHistoryReq): LatestHistoryReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.History.LatestHistory is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryGrpc.getHistoryTabMethod(),
      implementation = ::historyTab
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryGrpc.getCursorMethod(),
      implementation = ::cursor
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryGrpc.getCursorV2Method(),
      implementation = ::cursorV2
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryGrpc.getDeleteMethod(),
      implementation = ::delete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryGrpc.getSearchMethod(),
      implementation = ::search
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryGrpc.getClearMethod(),
      implementation = ::clear
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryGrpc.getLatestHistoryMethod(),
      implementation = ::latestHistory
    )).build()
  }
}
