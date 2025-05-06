package bilibili.api.probe.v1

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
import bilibili.api.probe.v1.ProbeGrpc.getServiceDescriptor as probeGrpcGetServiceDescriptor
import bilibili.api.probe.v1.ProbeServiceGrpc.getServiceDescriptor as probeServiceGrpcGetServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.api.probe.v1.Probe.
 */
public object ProbeGrpcKt {
  public const val SERVICE_NAME: String = ProbeGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = probeGrpcGetServiceDescriptor()

  public val testCodeMethod: MethodDescriptor<CodeReq, CodeReply>
    @JvmStatic
    get() = ProbeGrpc.getTestCodeMethod()

  public val testReqMethod: MethodDescriptor<ProbeReq, ProbeReply>
    @JvmStatic
    get() = ProbeGrpc.getTestReqMethod()

  public val testStreamMethod: MethodDescriptor<ProbeStreamReq, ProbeStreamReply>
    @JvmStatic
    get() = ProbeGrpc.getTestStreamMethod()

  public val testSubMethod: MethodDescriptor<ProbeSubReq, ProbeSubReply>
    @JvmStatic
    get() = ProbeGrpc.getTestSubMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.api.probe.v1.Probe service as suspending coroutines.
   */
  @StubFor(ProbeGrpc::class)
  public class ProbeCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ProbeCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProbeCoroutineStub =
        ProbeCoroutineStub(channel, callOptions)

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
    public suspend fun testCode(request: CodeReq, headers: Metadata = Metadata()): CodeReply =
        unaryRpc(
      channel,
      ProbeGrpc.getTestCodeMethod(),
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
    public suspend fun testReq(request: ProbeReq, headers: Metadata = Metadata()): ProbeReply =
        unaryRpc(
      channel,
      ProbeGrpc.getTestReqMethod(),
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
    public suspend fun testStream(request: ProbeStreamReq, headers: Metadata = Metadata()):
        ProbeStreamReply = unaryRpc(
      channel,
      ProbeGrpc.getTestStreamMethod(),
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
    public suspend fun testSub(request: ProbeSubReq, headers: Metadata = Metadata()): ProbeSubReply
        = unaryRpc(
      channel,
      ProbeGrpc.getTestSubMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.api.probe.v1.Probe service based on Kotlin coroutines.
   */
  public abstract class ProbeCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.Probe.TestCode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun testCode(request: CodeReq): CodeReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.Probe.TestCode is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.Probe.TestReq.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun testReq(request: ProbeReq): ProbeReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.Probe.TestReq is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.Probe.TestStream.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun testStream(request: ProbeStreamReq): ProbeStreamReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.Probe.TestStream is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.Probe.TestSub.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun testSub(request: ProbeSubReq): ProbeSubReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.Probe.TestSub is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(probeGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeGrpc.getTestCodeMethod(),
      implementation = ::testCode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeGrpc.getTestReqMethod(),
      implementation = ::testReq
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeGrpc.getTestStreamMethod(),
      implementation = ::testStream
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeGrpc.getTestSubMethod(),
      implementation = ::testSub
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.api.probe.v1.ProbeService.
 */
public object ProbeServiceGrpcKt {
  public const val SERVICE_NAME: String = ProbeServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = probeServiceGrpcGetServiceDescriptor()

  public val echoMethod: MethodDescriptor<SimpleMessage, SimpleMessage>
    @JvmStatic
    get() = ProbeServiceGrpc.getEchoMethod()

  public val echoBodyMethod: MethodDescriptor<SimpleMessage, SimpleMessage>
    @JvmStatic
    get() = ProbeServiceGrpc.getEchoBodyMethod()

  public val echoDeleteMethod: MethodDescriptor<SimpleMessage, SimpleMessage>
    @JvmStatic
    get() = ProbeServiceGrpc.getEchoDeleteMethod()

  public val echoErrorMethod: MethodDescriptor<ErrorMessage, ErrorMessage>
    @JvmStatic
    get() = ProbeServiceGrpc.getEchoErrorMethod()

  public val echoPatchMethod: MethodDescriptor<DynamicMessageUpdate, DynamicMessageUpdate>
    @JvmStatic
    get() = ProbeServiceGrpc.getEchoPatchMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.api.probe.v1.ProbeService service as suspending
   * coroutines.
   */
  @StubFor(ProbeServiceGrpc::class)
  public class ProbeServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ProbeServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProbeServiceCoroutineStub =
        ProbeServiceCoroutineStub(channel, callOptions)

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
    public suspend fun echo(request: SimpleMessage, headers: Metadata = Metadata()): SimpleMessage =
        unaryRpc(
      channel,
      ProbeServiceGrpc.getEchoMethod(),
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
    public suspend fun echoBody(request: SimpleMessage, headers: Metadata = Metadata()):
        SimpleMessage = unaryRpc(
      channel,
      ProbeServiceGrpc.getEchoBodyMethod(),
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
    public suspend fun echoDelete(request: SimpleMessage, headers: Metadata = Metadata()):
        SimpleMessage = unaryRpc(
      channel,
      ProbeServiceGrpc.getEchoDeleteMethod(),
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
    public suspend fun echoError(request: ErrorMessage, headers: Metadata = Metadata()):
        ErrorMessage = unaryRpc(
      channel,
      ProbeServiceGrpc.getEchoErrorMethod(),
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
    public suspend fun echoPatch(request: DynamicMessageUpdate, headers: Metadata = Metadata()):
        DynamicMessageUpdate = unaryRpc(
      channel,
      ProbeServiceGrpc.getEchoPatchMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.api.probe.v1.ProbeService service based on Kotlin
   * coroutines.
   */
  public abstract class ProbeServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.ProbeService.Echo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun echo(request: SimpleMessage): SimpleMessage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.ProbeService.Echo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.ProbeService.EchoBody.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun echoBody(request: SimpleMessage): SimpleMessage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.ProbeService.EchoBody is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.ProbeService.EchoDelete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun echoDelete(request: SimpleMessage): SimpleMessage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.ProbeService.EchoDelete is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.ProbeService.EchoError.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun echoError(request: ErrorMessage): ErrorMessage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.ProbeService.EchoError is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.api.probe.v1.ProbeService.EchoPatch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun echoPatch(request: DynamicMessageUpdate): DynamicMessageUpdate = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.api.probe.v1.ProbeService.EchoPatch is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(probeServiceGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeServiceGrpc.getEchoMethod(),
      implementation = ::echo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeServiceGrpc.getEchoBodyMethod(),
      implementation = ::echoBody
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeServiceGrpc.getEchoDeleteMethod(),
      implementation = ::echoDelete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeServiceGrpc.getEchoErrorMethod(),
      implementation = ::echoError
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProbeServiceGrpc.getEchoPatchMethod(),
      implementation = ::echoPatch
    )).build()
  }
}
