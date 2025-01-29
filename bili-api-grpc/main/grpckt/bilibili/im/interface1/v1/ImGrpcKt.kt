package bilibili.im.interface1.v1

import bilibili.im.interface1.v1.ImInterfaceGrpc.getServiceDescriptor
import bilibili.im.type.SessionInfo
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
 * bilibili.im.interface.v1.ImInterface.
 */
public object ImInterfaceGrpcKt {
  public const val SERVICE_NAME: String = ImInterfaceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val sendMsgMethod: MethodDescriptor<ReqSendMsg, RspSendMsg>
    @JvmStatic
    get() = ImInterfaceGrpc.getSendMsgMethod()

  public val syncRelationMethod: MethodDescriptor<ReqRelationSync, RspRelationSync>
    @JvmStatic
    get() = ImInterfaceGrpc.getSyncRelationMethod()

  public val syncAckMethod: MethodDescriptor<ReqSyncAck, RspSyncAck>
    @JvmStatic
    get() = ImInterfaceGrpc.getSyncAckMethod()

  public val syncFetchSessionMsgsMethod: MethodDescriptor<ReqSessionMsg, RspSessionMsg>
    @JvmStatic
    get() = ImInterfaceGrpc.getSyncFetchSessionMsgsMethod()

  public val getSessionsMethod: MethodDescriptor<ReqGetSessions, RspSessions>
    @JvmStatic
    get() = ImInterfaceGrpc.getGetSessionsMethod()

  public val newSessionsMethod: MethodDescriptor<ReqNewSessions, RspSessions>
    @JvmStatic
    get() = ImInterfaceGrpc.getNewSessionsMethod()

  public val ackSessionsMethod: MethodDescriptor<ReqAckSessions, RspSessions>
    @JvmStatic
    get() = ImInterfaceGrpc.getAckSessionsMethod()

  public val updateAckMethod: MethodDescriptor<ReqUpdateAck, DummyRsp>
    @JvmStatic
    get() = ImInterfaceGrpc.getUpdateAckMethod()

  public val setTopMethod: MethodDescriptor<ReqSetTop, DummyRsp>
    @JvmStatic
    get() = ImInterfaceGrpc.getSetTopMethod()

  public val removeSessionMethod: MethodDescriptor<ReqRemoveSession, DummyRsp>
    @JvmStatic
    get() = ImInterfaceGrpc.getRemoveSessionMethod()

  public val singleUnreadMethod: MethodDescriptor<ReqSingleUnread, RspSingleUnread>
    @JvmStatic
    get() = ImInterfaceGrpc.getSingleUnreadMethod()

  public val myGroupUnreadMethod: MethodDescriptor<DummyReq, RspMyGroupUnread>
    @JvmStatic
    get() = ImInterfaceGrpc.getMyGroupUnreadMethod()

  public val updateUnflwReadMethod: MethodDescriptor<DummyReq, DummyRsp>
    @JvmStatic
    get() = ImInterfaceGrpc.getUpdateUnflwReadMethod()

  public val groupAssisMsgMethod: MethodDescriptor<ReqGroupAssisMsg, RspSessionMsg>
    @JvmStatic
    get() = ImInterfaceGrpc.getGroupAssisMsgMethod()

  public val ackAssisMsgMethod: MethodDescriptor<ReqAckAssisMsg, DummyRsp>
    @JvmStatic
    get() = ImInterfaceGrpc.getAckAssisMsgMethod()

  public val sessionDetailMethod: MethodDescriptor<ReqSessionDetail, SessionInfo>
    @JvmStatic
    get() = ImInterfaceGrpc.getSessionDetailMethod()

  public val batchSessDetailMethod: MethodDescriptor<ReqSessionDetails, RspSessionDetails>
    @JvmStatic
    get() = ImInterfaceGrpc.getBatchSessDetailMethod()

  public val batchRmSessionsMethod: MethodDescriptor<ReqBatRmSess, DummyRsp>
    @JvmStatic
    get() = ImInterfaceGrpc.getBatchRmSessionsMethod()

  public val shareListMethod: MethodDescriptor<ReqShareList, RspShareList>
    @JvmStatic
    get() = ImInterfaceGrpc.getShareListMethod()

  public val specificSingleUnreadMethod:
      MethodDescriptor<ReqSpecificSingleUnread, RspSpecificSingleUnread>
    @JvmStatic
    get() = ImInterfaceGrpc.getSpecificSingleUnreadMethod()

  public val getSpecificSessionsMethod: MethodDescriptor<ReqGetSpecificSessions, RspSessions>
    @JvmStatic
    get() = ImInterfaceGrpc.getGetSpecificSessionsMethod()

  public val getLiveInfoMethod: MethodDescriptor<ReqLiveInfo, RspLiveInfo>
    @JvmStatic
    get() = ImInterfaceGrpc.getGetLiveInfoMethod()

  public val getTotalUnreadMethod: MethodDescriptor<ReqTotalUnread, RspTotalUnread>
    @JvmStatic
    get() = ImInterfaceGrpc.getGetTotalUnreadMethod()

  public val showClearUnreadUIMethod: MethodDescriptor<ReqShowClearUnreadUI, RspShowClearUnreadUI>
    @JvmStatic
    get() = ImInterfaceGrpc.getShowClearUnreadUIMethod()

  public val closeClearUnreadUIMethod:
      MethodDescriptor<ReqCloseClearUnreadUI, RspCloseClearUnreadUI>
    @JvmStatic
    get() = ImInterfaceGrpc.getCloseClearUnreadUIMethod()

  public val updateTotalUnreadMethod: MethodDescriptor<ReqUpdateTotalUnread, RspUpdateTotalUnread>
    @JvmStatic
    get() = ImInterfaceGrpc.getUpdateTotalUnreadMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.im.interface.v1.ImInterface service as suspending
   * coroutines.
   */
  @StubFor(ImInterfaceGrpc::class)
  public class ImInterfaceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ImInterfaceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ImInterfaceCoroutineStub =
        ImInterfaceCoroutineStub(channel, callOptions)

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
    public suspend fun sendMsg(request: ReqSendMsg, headers: Metadata = Metadata()): RspSendMsg =
        unaryRpc(
      channel,
      ImInterfaceGrpc.getSendMsgMethod(),
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
    public suspend fun syncRelation(request: ReqRelationSync, headers: Metadata = Metadata()):
        RspRelationSync = unaryRpc(
      channel,
      ImInterfaceGrpc.getSyncRelationMethod(),
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
    public suspend fun syncAck(request: ReqSyncAck, headers: Metadata = Metadata()): RspSyncAck =
        unaryRpc(
      channel,
      ImInterfaceGrpc.getSyncAckMethod(),
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
    public suspend fun syncFetchSessionMsgs(request: ReqSessionMsg, headers: Metadata = Metadata()):
        RspSessionMsg = unaryRpc(
      channel,
      ImInterfaceGrpc.getSyncFetchSessionMsgsMethod(),
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
    public suspend fun getSessions(request: ReqGetSessions, headers: Metadata = Metadata()):
        RspSessions = unaryRpc(
      channel,
      ImInterfaceGrpc.getGetSessionsMethod(),
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
    public suspend fun newSessions(request: ReqNewSessions, headers: Metadata = Metadata()):
        RspSessions = unaryRpc(
      channel,
      ImInterfaceGrpc.getNewSessionsMethod(),
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
    public suspend fun ackSessions(request: ReqAckSessions, headers: Metadata = Metadata()):
        RspSessions = unaryRpc(
      channel,
      ImInterfaceGrpc.getAckSessionsMethod(),
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
    public suspend fun updateAck(request: ReqUpdateAck, headers: Metadata = Metadata()): DummyRsp =
        unaryRpc(
      channel,
      ImInterfaceGrpc.getUpdateAckMethod(),
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
    public suspend fun setTop(request: ReqSetTop, headers: Metadata = Metadata()): DummyRsp =
        unaryRpc(
      channel,
      ImInterfaceGrpc.getSetTopMethod(),
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
    public suspend fun removeSession(request: ReqRemoveSession, headers: Metadata = Metadata()):
        DummyRsp = unaryRpc(
      channel,
      ImInterfaceGrpc.getRemoveSessionMethod(),
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
    public suspend fun singleUnread(request: ReqSingleUnread, headers: Metadata = Metadata()):
        RspSingleUnread = unaryRpc(
      channel,
      ImInterfaceGrpc.getSingleUnreadMethod(),
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
    public suspend fun myGroupUnread(request: DummyReq, headers: Metadata = Metadata()):
        RspMyGroupUnread = unaryRpc(
      channel,
      ImInterfaceGrpc.getMyGroupUnreadMethod(),
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
    public suspend fun updateUnflwRead(request: DummyReq, headers: Metadata = Metadata()): DummyRsp
        = unaryRpc(
      channel,
      ImInterfaceGrpc.getUpdateUnflwReadMethod(),
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
    public suspend fun groupAssisMsg(request: ReqGroupAssisMsg, headers: Metadata = Metadata()):
        RspSessionMsg = unaryRpc(
      channel,
      ImInterfaceGrpc.getGroupAssisMsgMethod(),
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
    public suspend fun ackAssisMsg(request: ReqAckAssisMsg, headers: Metadata = Metadata()):
        DummyRsp = unaryRpc(
      channel,
      ImInterfaceGrpc.getAckAssisMsgMethod(),
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
    public suspend fun sessionDetail(request: ReqSessionDetail, headers: Metadata = Metadata()):
        SessionInfo = unaryRpc(
      channel,
      ImInterfaceGrpc.getSessionDetailMethod(),
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
    public suspend fun batchSessDetail(request: ReqSessionDetails, headers: Metadata = Metadata()):
        RspSessionDetails = unaryRpc(
      channel,
      ImInterfaceGrpc.getBatchSessDetailMethod(),
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
    public suspend fun batchRmSessions(request: ReqBatRmSess, headers: Metadata = Metadata()):
        DummyRsp = unaryRpc(
      channel,
      ImInterfaceGrpc.getBatchRmSessionsMethod(),
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
    public suspend fun shareList(request: ReqShareList, headers: Metadata = Metadata()):
        RspShareList = unaryRpc(
      channel,
      ImInterfaceGrpc.getShareListMethod(),
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
    public suspend fun specificSingleUnread(request: ReqSpecificSingleUnread, headers: Metadata =
        Metadata()): RspSpecificSingleUnread = unaryRpc(
      channel,
      ImInterfaceGrpc.getSpecificSingleUnreadMethod(),
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
    public suspend fun getSpecificSessions(request: ReqGetSpecificSessions, headers: Metadata =
        Metadata()): RspSessions = unaryRpc(
      channel,
      ImInterfaceGrpc.getGetSpecificSessionsMethod(),
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
    public suspend fun getLiveInfo(request: ReqLiveInfo, headers: Metadata = Metadata()):
        RspLiveInfo = unaryRpc(
      channel,
      ImInterfaceGrpc.getGetLiveInfoMethod(),
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
    public suspend fun getTotalUnread(request: ReqTotalUnread, headers: Metadata = Metadata()):
        RspTotalUnread = unaryRpc(
      channel,
      ImInterfaceGrpc.getGetTotalUnreadMethod(),
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
    public suspend fun showClearUnreadUI(request: ReqShowClearUnreadUI, headers: Metadata =
        Metadata()): RspShowClearUnreadUI = unaryRpc(
      channel,
      ImInterfaceGrpc.getShowClearUnreadUIMethod(),
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
    public suspend fun closeClearUnreadUI(request: ReqCloseClearUnreadUI, headers: Metadata =
        Metadata()): RspCloseClearUnreadUI = unaryRpc(
      channel,
      ImInterfaceGrpc.getCloseClearUnreadUIMethod(),
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
    public suspend fun updateTotalUnread(request: ReqUpdateTotalUnread, headers: Metadata =
        Metadata()): RspUpdateTotalUnread = unaryRpc(
      channel,
      ImInterfaceGrpc.getUpdateTotalUnreadMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.im.interface.v1.ImInterface service based on Kotlin
   * coroutines.
   */
  public abstract class ImInterfaceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.SendMsg.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendMsg(request: ReqSendMsg): RspSendMsg = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.SendMsg is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.SyncRelation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun syncRelation(request: ReqRelationSync): RspRelationSync = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.SyncRelation is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.SyncAck.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun syncAck(request: ReqSyncAck): RspSyncAck = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.SyncAck is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.SyncFetchSessionMsgs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun syncFetchSessionMsgs(request: ReqSessionMsg): RspSessionMsg = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.SyncFetchSessionMsgs is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.GetSessions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getSessions(request: ReqGetSessions): RspSessions = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.GetSessions is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.NewSessions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun newSessions(request: ReqNewSessions): RspSessions = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.NewSessions is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.AckSessions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun ackSessions(request: ReqAckSessions): RspSessions = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.AckSessions is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.UpdateAck.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateAck(request: ReqUpdateAck): DummyRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.UpdateAck is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.SetTop.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setTop(request: ReqSetTop): DummyRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.SetTop is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.RemoveSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeSession(request: ReqRemoveSession): DummyRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.RemoveSession is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.SingleUnread.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun singleUnread(request: ReqSingleUnread): RspSingleUnread = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.SingleUnread is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.MyGroupUnread.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun myGroupUnread(request: DummyReq): RspMyGroupUnread = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.MyGroupUnread is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.UpdateUnflwRead.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateUnflwRead(request: DummyReq): DummyRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.UpdateUnflwRead is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.GroupAssisMsg.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun groupAssisMsg(request: ReqGroupAssisMsg): RspSessionMsg = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.GroupAssisMsg is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.AckAssisMsg.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun ackAssisMsg(request: ReqAckAssisMsg): DummyRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.AckAssisMsg is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.SessionDetail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sessionDetail(request: ReqSessionDetail): SessionInfo = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.SessionDetail is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.BatchSessDetail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun batchSessDetail(request: ReqSessionDetails): RspSessionDetails = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.BatchSessDetail is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.BatchRmSessions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun batchRmSessions(request: ReqBatRmSess): DummyRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.BatchRmSessions is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.ShareList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun shareList(request: ReqShareList): RspShareList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.ShareList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.SpecificSingleUnread.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun specificSingleUnread(request: ReqSpecificSingleUnread):
        RspSpecificSingleUnread = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.SpecificSingleUnread is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.GetSpecificSessions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getSpecificSessions(request: ReqGetSpecificSessions): RspSessions =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.GetSpecificSessions is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.GetLiveInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getLiveInfo(request: ReqLiveInfo): RspLiveInfo = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.GetLiveInfo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.GetTotalUnread.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTotalUnread(request: ReqTotalUnread): RspTotalUnread = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.GetTotalUnread is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.ShowClearUnreadUI.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun showClearUnreadUI(request: ReqShowClearUnreadUI): RspShowClearUnreadUI =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.ShowClearUnreadUI is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.CloseClearUnreadUI.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun closeClearUnreadUI(request: ReqCloseClearUnreadUI):
        RspCloseClearUnreadUI = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.CloseClearUnreadUI is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.im.interface.v1.ImInterface.UpdateTotalUnread.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateTotalUnread(request: ReqUpdateTotalUnread): RspUpdateTotalUnread =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.im.interface.v1.ImInterface.UpdateTotalUnread is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getSendMsgMethod(),
      implementation = ::sendMsg
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getSyncRelationMethod(),
      implementation = ::syncRelation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getSyncAckMethod(),
      implementation = ::syncAck
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getSyncFetchSessionMsgsMethod(),
      implementation = ::syncFetchSessionMsgs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getGetSessionsMethod(),
      implementation = ::getSessions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getNewSessionsMethod(),
      implementation = ::newSessions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getAckSessionsMethod(),
      implementation = ::ackSessions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getUpdateAckMethod(),
      implementation = ::updateAck
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getSetTopMethod(),
      implementation = ::setTop
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getRemoveSessionMethod(),
      implementation = ::removeSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getSingleUnreadMethod(),
      implementation = ::singleUnread
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getMyGroupUnreadMethod(),
      implementation = ::myGroupUnread
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getUpdateUnflwReadMethod(),
      implementation = ::updateUnflwRead
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getGroupAssisMsgMethod(),
      implementation = ::groupAssisMsg
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getAckAssisMsgMethod(),
      implementation = ::ackAssisMsg
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getSessionDetailMethod(),
      implementation = ::sessionDetail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getBatchSessDetailMethod(),
      implementation = ::batchSessDetail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getBatchRmSessionsMethod(),
      implementation = ::batchRmSessions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getShareListMethod(),
      implementation = ::shareList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getSpecificSingleUnreadMethod(),
      implementation = ::specificSingleUnread
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getGetSpecificSessionsMethod(),
      implementation = ::getSpecificSessions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getGetLiveInfoMethod(),
      implementation = ::getLiveInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getGetTotalUnreadMethod(),
      implementation = ::getTotalUnread
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getShowClearUnreadUIMethod(),
      implementation = ::showClearUnreadUI
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getCloseClearUnreadUIMethod(),
      implementation = ::closeClearUnreadUI
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ImInterfaceGrpc.getUpdateTotalUnreadMethod(),
      implementation = ::updateTotalUnread
    )).build()
  }
}
