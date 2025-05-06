package bilibili.app.interfaces.v1

import bilibili.app.interfaces.v1.SpaceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.interface.v1.Space.
 */
public object SpaceGrpcKt {
  public const val SERVICE_NAME: String = SpaceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val searchTabMethod: MethodDescriptor<SearchTabReq, SearchTabReply>
    @JvmStatic
    get() = SpaceGrpc.getSearchTabMethod()

  public val searchArchiveMethod: MethodDescriptor<SearchArchiveReq, SearchArchiveReply>
    @JvmStatic
    get() = SpaceGrpc.getSearchArchiveMethod()

  public val searchDynamicMethod: MethodDescriptor<SearchDynamicReq, SearchDynamicReply>
    @JvmStatic
    get() = SpaceGrpc.getSearchDynamicMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.interface.v1.Space service as suspending
   * coroutines.
   */
  @StubFor(SpaceGrpc::class)
  public class SpaceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<SpaceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SpaceCoroutineStub =
        SpaceCoroutineStub(channel, callOptions)

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
    public suspend fun searchTab(request: SearchTabReq, headers: Metadata = Metadata()):
        SearchTabReply = unaryRpc(
      channel,
      SpaceGrpc.getSearchTabMethod(),
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
    public suspend fun searchArchive(request: SearchArchiveReq, headers: Metadata = Metadata()):
        SearchArchiveReply = unaryRpc(
      channel,
      SpaceGrpc.getSearchArchiveMethod(),
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
    public suspend fun searchDynamic(request: SearchDynamicReq, headers: Metadata = Metadata()):
        SearchDynamicReply = unaryRpc(
      channel,
      SpaceGrpc.getSearchDynamicMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.interface.v1.Space service based on Kotlin
   * coroutines.
   */
  public abstract class SpaceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Space.SearchTab.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchTab(request: SearchTabReq): SearchTabReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Space.SearchTab is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Space.SearchArchive.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchArchive(request: SearchArchiveReq): SearchArchiveReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Space.SearchArchive is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.interface.v1.Space.SearchDynamic.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchDynamic(request: SearchDynamicReq): SearchDynamicReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.interface.v1.Space.SearchDynamic is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SpaceGrpc.getSearchTabMethod(),
      implementation = ::searchTab
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SpaceGrpc.getSearchArchiveMethod(),
      implementation = ::searchArchive
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SpaceGrpc.getSearchDynamicMethod(),
      implementation = ::searchDynamic
    )).build()
  }
}
