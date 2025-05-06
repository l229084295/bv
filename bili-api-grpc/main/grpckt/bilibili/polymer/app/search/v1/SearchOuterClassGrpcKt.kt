package bilibili.polymer.app.search.v1

import bilibili.polymer.app.search.v1.SearchGrpc.getServiceDescriptor
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
 * bilibili.polymer.app.search.v1.Search.
 */
public object SearchGrpcKt {
  public const val SERVICE_NAME: String = SearchGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val searchAllMethod: MethodDescriptor<SearchAllRequest, SearchAllResponse>
    @JvmStatic
    get() = SearchGrpc.getSearchAllMethod()

  public val searchByTypeMethod: MethodDescriptor<SearchByTypeRequest, SearchByTypeResponse>
    @JvmStatic
    get() = SearchGrpc.getSearchByTypeMethod()

  public val searchComicMethod: MethodDescriptor<SearchComicRequest, SearchComicResponse>
    @JvmStatic
    get() = SearchGrpc.getSearchComicMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.polymer.app.search.v1.Search service as suspending
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
    public suspend fun searchAll(request: SearchAllRequest, headers: Metadata = Metadata()):
        SearchAllResponse = unaryRpc(
      channel,
      SearchGrpc.getSearchAllMethod(),
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
    public suspend fun searchByType(request: SearchByTypeRequest, headers: Metadata = Metadata()):
        SearchByTypeResponse = unaryRpc(
      channel,
      SearchGrpc.getSearchByTypeMethod(),
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
    public suspend fun searchComic(request: SearchComicRequest, headers: Metadata = Metadata()):
        SearchComicResponse = unaryRpc(
      channel,
      SearchGrpc.getSearchComicMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.polymer.app.search.v1.Search service based on Kotlin
   * coroutines.
   */
  public abstract class SearchCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.polymer.app.search.v1.Search.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: SearchAllRequest): SearchAllResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.app.search.v1.Search.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.polymer.app.search.v1.Search.SearchByType.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchByType(request: SearchByTypeRequest): SearchByTypeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.app.search.v1.Search.SearchByType is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.polymer.app.search.v1.Search.SearchComic.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchComic(request: SearchComicRequest): SearchComicResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.app.search.v1.Search.SearchComic is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getSearchByTypeMethod(),
      implementation = ::searchByType
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SearchGrpc.getSearchComicMethod(),
      implementation = ::searchComic
    )).build()
  }
}
