package bilibili.polymer.contract.v1

import bilibili.polymer.contract.v1.ContractGrpc.getServiceDescriptor
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
 * bilibili.polymer.contract.v1.Contract.
 */
public object ContractGrpcKt {
  public const val SERVICE_NAME: String = ContractGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val addContractMethod: MethodDescriptor<AddContractReq, Empty>
    @JvmStatic
    get() = ContractGrpc.getAddContractMethod()

  public val addContractV2Method: MethodDescriptor<AddContractReq, AddContractReply>
    @JvmStatic
    get() = ContractGrpc.getAddContractV2Method()

  public val contractConfigMethod: MethodDescriptor<ContractConfigReq, ContractConfigReply>
    @JvmStatic
    get() = ContractGrpc.getContractConfigMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.polymer.contract.v1.Contract service as suspending
   * coroutines.
   */
  @StubFor(ContractGrpc::class)
  public class ContractCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ContractCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ContractCoroutineStub =
        ContractCoroutineStub(channel, callOptions)

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
    public suspend fun addContract(request: AddContractReq, headers: Metadata = Metadata()): Empty =
        unaryRpc(
      channel,
      ContractGrpc.getAddContractMethod(),
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
    public suspend fun addContractV2(request: AddContractReq, headers: Metadata = Metadata()):
        AddContractReply = unaryRpc(
      channel,
      ContractGrpc.getAddContractV2Method(),
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
    public suspend fun contractConfig(request: ContractConfigReq, headers: Metadata = Metadata()):
        ContractConfigReply = unaryRpc(
      channel,
      ContractGrpc.getContractConfigMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.polymer.contract.v1.Contract service based on Kotlin
   * coroutines.
   */
  public abstract class ContractCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.polymer.contract.v1.Contract.AddContract.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addContract(request: AddContractReq): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.contract.v1.Contract.AddContract is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.polymer.contract.v1.Contract.AddContractV2.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addContractV2(request: AddContractReq): AddContractReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.contract.v1.Contract.AddContractV2 is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.polymer.contract.v1.Contract.ContractConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun contractConfig(request: ContractConfigReq): ContractConfigReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.polymer.contract.v1.Contract.ContractConfig is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ContractGrpc.getAddContractMethod(),
      implementation = ::addContract
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ContractGrpc.getAddContractV2Method(),
      implementation = ::addContractV2
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ContractGrpc.getContractConfigMethod(),
      implementation = ::contractConfig
    )).build()
  }
}
