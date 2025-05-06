package bilibili.app.`dynamic`.v2

import bilibili.app.`dynamic`.v2.CampusGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.dynamic.v2.Campus.
 */
public object CampusGrpcKt {
  public const val SERVICE_NAME: String = CampusGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.dynamic.v2.Campus service as suspending
   * coroutines.
   */
  @StubFor(CampusGrpc::class)
  public class CampusCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<CampusCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CampusCoroutineStub =
        CampusCoroutineStub(channel, callOptions)
  }

  /**
   * Skeletal implementation of the bilibili.app.dynamic.v2.Campus service based on Kotlin
   * coroutines.
   */
  public abstract class CampusCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor()).build()
  }
}
