package bilibili.app.interfaces.v1

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
import bilibili.app.interfaces.v1.SearchGrpc.getServiceDescriptor as searchGrpcGetServiceDescriptor
import bilibili.app.interfaces.v1.SearchTestGrpc.getServiceDescriptor as searchTestGrpcGetServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.interface.v1.Search.
 */
public object SearchGrpcKt {
  public const val SERVICE_NAME: String = SearchGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = searchGrpcGetServiceDescriptor()

  public val suggest3Method: MethodDescriptor<SuggestionResult3Req, SuggestionResult3Reply>
    @JvmStatic
    get() = SearchGrpc.getSuggest3Method()

  public val defaultWordsMethod: MethodDescriptor<DefaultWordsReq, DefaultWordsReply>
    @JvmStatic
    get() = SearchGrpc.getDefaultWordsMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.interface.v1.Search service as suspending
   * coroutines.
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
    public suspend fun suggest3(request: SuggestionResult3Req, headers: Metadata = Metadata()):
        SuggestionResult3Reply = unaryRpc(
      channel,
      SearchGrpc.getSuggest3Method(),
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
    public suspend fun defaultWords(request: DefaultWordsReq, headers: Metadata = Metadata()):
        DefaultWordsReply = unaryRpc(
      channel,
      SearchGrpc.getDefaultWordsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.interface.v1.Search service based on Kotlin
   * coroutines.
   */
  public abstract class SearchCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Search.Suggest3.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun suggest3(request: SuggestionResult3Req): SuggestionResult3Reply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Search.Suggest3 is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Search.DefaultWords.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun defaultWords(request: DefaultWordsReq): DefaultWordsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Search.DefaultWords is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(searchGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getSuggest3Method(),
      implementation = ::suggest3
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getDefaultWordsMethod(),
      implementation = ::defaultWords
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * bilibili.app.interface.v1.SearchTest.
 */
public object SearchTestGrpcKt {
  public const val SERVICE_NAME: String = SearchTestGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = searchTestGrpcGetServiceDescriptor()

  public val notExistMethod: MethodDescriptor<SuggestionResult3Req, SuggestionResult3Reply>
    @JvmStatic
    get() = SearchTestGrpc.getNotExistMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.interface.v1.SearchTest service as suspending
   * coroutines.
   */
  @StubFor(SearchTestGrpc::class)
  public class SearchTestCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<SearchTestCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SearchTestCoroutineStub =
        SearchTestCoroutineStub(channel, callOptions)

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
    public suspend fun notExist(request: SuggestionResult3Req, headers: Metadata = Metadata()):
        SuggestionResult3Reply = unaryRpc(
      channel,
      SearchTestGrpc.getNotExistMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.interface.v1.SearchTest service based on Kotlin
   * coroutines.
   */
  public abstract class SearchTestCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.SearchTest.NotExist.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun notExist(request: SuggestionResult3Req): SuggestionResult3Reply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.SearchTest.NotExist is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(searchTestGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchTestGrpc.getNotExistMethod(),
      implementation = ::notExist
    )).build()
  }
}
