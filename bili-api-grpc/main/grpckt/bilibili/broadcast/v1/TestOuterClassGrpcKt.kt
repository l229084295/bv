package bilibili.broadcast.v1

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
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow
import bilibili.broadcast.v1.Test2Grpc.getServiceDescriptor as test2GrpcGetServiceDescriptor
import bilibili.broadcast.v1.TestGrpc.getServiceDescriptor as testGrpcGetServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.broadcast.v1.Test.
 */
public object TestGrpcKt {
  public const val SERVICE_NAME: String = TestGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = testGrpcGetServiceDescriptor()

  public val watchTestEventMethod: MethodDescriptor<Empty, TestResp>
    @JvmStatic
    get() = TestGrpc.getWatchTestEventMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.broadcast.v1.Test service as suspending coroutines.
   */
  @StubFor(TestGrpc::class)
  public class TestCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TestCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TestCoroutineStub =
        TestCoroutineStub(channel, callOptions)

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
    public fun watchTestEvent(request: Empty, headers: Metadata = Metadata()): Flow<TestResp> =
        serverStreamingRpc(
      channel,
      TestGrpc.getWatchTestEventMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.broadcast.v1.Test service based on Kotlin coroutines.
   */
  public abstract class TestCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for bilibili.broadcast.v1.Test.WatchTestEvent.
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
    public open fun watchTestEvent(request: Empty): Flow<TestResp> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.v1.Test.WatchTestEvent is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(testGrpcGetServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TestGrpc.getWatchTestEventMethod(),
      implementation = ::watchTestEvent
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.broadcast.v1.Test2.
 */
public object Test2GrpcKt {
  public const val SERVICE_NAME: String = Test2Grpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = test2GrpcGetServiceDescriptor()

  public val testMethod: MethodDescriptor<AddParams, Empty>
    @JvmStatic
    get() = Test2Grpc.getTestMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.broadcast.v1.Test2 service as suspending coroutines.
   */
  @StubFor(Test2Grpc::class)
  public class Test2CoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<Test2CoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): Test2CoroutineStub =
        Test2CoroutineStub(channel, callOptions)

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
    public suspend fun test(request: AddParams, headers: Metadata = Metadata()): Empty = unaryRpc(
      channel,
      Test2Grpc.getTestMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.broadcast.v1.Test2 service based on Kotlin coroutines.
   */
  public abstract class Test2CoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.broadcast.v1.Test2.Test.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun test(request: AddParams): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.broadcast.v1.Test2.Test is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(test2GrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = Test2Grpc.getTestMethod(),
      implementation = ::test
    )).build()
  }
}
