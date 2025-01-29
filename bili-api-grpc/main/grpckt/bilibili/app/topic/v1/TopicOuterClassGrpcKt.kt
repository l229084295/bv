package bilibili.app.topic.v1

import bilibili.app.topic.v1.TopicGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.topic.v1.Topic.
 */
public object TopicGrpcKt {
  public const val SERVICE_NAME: String = TopicGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val topicDetailsAllMethod: MethodDescriptor<TopicDetailsAllReq, TopicDetailsAllReply>
    @JvmStatic
    get() = TopicGrpc.getTopicDetailsAllMethod()

  public val topicDetailsFoldMethod: MethodDescriptor<TopicDetailsFoldReq, TopicDetailsFoldReply>
    @JvmStatic
    get() = TopicGrpc.getTopicDetailsFoldMethod()

  public val topicSetDetailsMethod: MethodDescriptor<TopicSetDetailsReq, TopicSetDetailsReply>
    @JvmStatic
    get() = TopicGrpc.getTopicSetDetailsMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.topic.v1.Topic service as suspending coroutines.
   */
  @StubFor(TopicGrpc::class)
  public class TopicCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TopicCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TopicCoroutineStub =
        TopicCoroutineStub(channel, callOptions)

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
    public suspend fun topicDetailsAll(request: TopicDetailsAllReq, headers: Metadata = Metadata()):
        TopicDetailsAllReply = unaryRpc(
      channel,
      TopicGrpc.getTopicDetailsAllMethod(),
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
    public suspend fun topicDetailsFold(request: TopicDetailsFoldReq, headers: Metadata =
        Metadata()): TopicDetailsFoldReply = unaryRpc(
      channel,
      TopicGrpc.getTopicDetailsFoldMethod(),
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
    public suspend fun topicSetDetails(request: TopicSetDetailsReq, headers: Metadata = Metadata()):
        TopicSetDetailsReply = unaryRpc(
      channel,
      TopicGrpc.getTopicSetDetailsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.topic.v1.Topic service based on Kotlin coroutines.
   */
  public abstract class TopicCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.topic.v1.Topic.TopicDetailsAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun topicDetailsAll(request: TopicDetailsAllReq): TopicDetailsAllReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.topic.v1.Topic.TopicDetailsAll is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.topic.v1.Topic.TopicDetailsFold.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun topicDetailsFold(request: TopicDetailsFoldReq): TopicDetailsFoldReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.topic.v1.Topic.TopicDetailsFold is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.topic.v1.Topic.TopicSetDetails.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun topicSetDetails(request: TopicSetDetailsReq): TopicSetDetailsReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.topic.v1.Topic.TopicSetDetails is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TopicGrpc.getTopicDetailsAllMethod(),
      implementation = ::topicDetailsAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TopicGrpc.getTopicDetailsFoldMethod(),
      implementation = ::topicDetailsFold
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TopicGrpc.getTopicSetDetailsMethod(),
      implementation = ::topicSetDetails
    )).build()
  }
}
