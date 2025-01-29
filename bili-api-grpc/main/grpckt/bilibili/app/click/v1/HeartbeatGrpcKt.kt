package bilibili.app.click.v1

import bilibili.app.click.v1.ClickGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.click.v1.Click.
 */
public object ClickGrpcKt {
  public const val SERVICE_NAME: String = ClickGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.click.v1.Click service as suspending coroutines.
   */
  @StubFor(ClickGrpc::class)
  public class ClickCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ClickCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ClickCoroutineStub =
        ClickCoroutineStub(channel, callOptions)
  }

  /**
   * Skeletal implementation of the bilibili.app.click.v1.Click service based on Kotlin coroutines.
   */
  public abstract class ClickCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor()).build()
  }
}
