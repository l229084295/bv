package bilibili.app.distribution.v1

import bilibili.app.distribution.v1.DistributionGrpc.getServiceDescriptor
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
 * bilibili.app.distribution.v1.Distribution.
 */
public object DistributionGrpcKt {
  public const val SERVICE_NAME: String = DistributionGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getUserPreferenceMethod: MethodDescriptor<GetUserPreferenceReq, GetUserPreferenceReply>
    @JvmStatic
    get() = DistributionGrpc.getGetUserPreferenceMethod()

  public val setUserPreferenceMethod: MethodDescriptor<SetUserPreferenceReq, SetUserPreferenceReply>
    @JvmStatic
    get() = DistributionGrpc.getSetUserPreferenceMethod()

  public val userPreferenceMethod: MethodDescriptor<UserPreferenceReq, UserPreferenceReply>
    @JvmStatic
    get() = DistributionGrpc.getUserPreferenceMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.distribution.v1.Distribution service as suspending
   * coroutines.
   */
  @StubFor(DistributionGrpc::class)
  public class DistributionCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<DistributionCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): DistributionCoroutineStub =
        DistributionCoroutineStub(channel, callOptions)

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
    public suspend fun getUserPreference(request: GetUserPreferenceReq, headers: Metadata =
        Metadata()): GetUserPreferenceReply = unaryRpc(
      channel,
      DistributionGrpc.getGetUserPreferenceMethod(),
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
    public suspend fun setUserPreference(request: SetUserPreferenceReq, headers: Metadata =
        Metadata()): SetUserPreferenceReply = unaryRpc(
      channel,
      DistributionGrpc.getSetUserPreferenceMethod(),
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
    public suspend fun userPreference(request: UserPreferenceReq, headers: Metadata = Metadata()):
        UserPreferenceReply = unaryRpc(
      channel,
      DistributionGrpc.getUserPreferenceMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.distribution.v1.Distribution service based on
   * Kotlin coroutines.
   */
  public abstract class DistributionCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * bilibili.app.distribution.v1.Distribution.GetUserPreference.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUserPreference(request: GetUserPreferenceReq): GetUserPreferenceReply
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.distribution.v1.Distribution.GetUserPreference is unimplemented"))

    /**
     * Returns the response to an RPC for
     * bilibili.app.distribution.v1.Distribution.SetUserPreference.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setUserPreference(request: SetUserPreferenceReq): SetUserPreferenceReply
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.distribution.v1.Distribution.SetUserPreference is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.distribution.v1.Distribution.UserPreference.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun userPreference(request: UserPreferenceReq): UserPreferenceReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.distribution.v1.Distribution.UserPreference is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DistributionGrpc.getGetUserPreferenceMethod(),
      implementation = ::getUserPreference
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DistributionGrpc.getSetUserPreferenceMethod(),
      implementation = ::setUserPreference
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DistributionGrpc.getUserPreferenceMethod(),
      implementation = ::userPreference
    )).build()
  }
}
