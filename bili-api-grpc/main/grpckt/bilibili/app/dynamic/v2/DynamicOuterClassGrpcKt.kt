package bilibili.app.`dynamic`.v2

import bilibili.app.`dynamic`.v2.DynamicGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for bilibili.app.dynamic.v2.Dynamic.
 */
public object DynamicGrpcKt {
  public const val SERVICE_NAME: String = DynamicGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val alumniDynamicsMethod: MethodDescriptor<AlumniDynamicsReq, AlumniDynamicsReply>
    @JvmStatic
    get() = DynamicGrpc.getAlumniDynamicsMethod()

  public val campusBillBoardMethod: MethodDescriptor<CampusBillBoardReq, CampusBillBoardReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusBillBoardMethod()

  public val campusEntryTabMethod: MethodDescriptor<CampusEntryTabReq, CampusEntryTabResp>
    @JvmStatic
    get() = DynamicGrpc.getCampusEntryTabMethod()

  public val campusFeedbackMethod: MethodDescriptor<CampusFeedbackReq, CampusFeedbackReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusFeedbackMethod()

  public val campusHomePagesMethod: MethodDescriptor<CampusHomePagesReq, CampusHomePagesReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusHomePagesMethod()

  public val campusMateLikeListMethod:
      MethodDescriptor<CampusMateLikeListReq, CampusMateLikeListReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusMateLikeListMethod()

  public val campusMngDetailMethod: MethodDescriptor<CampusMngDetailReq, CampusMngDetailReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusMngDetailMethod()

  public val campusMngQuizOperateMethod:
      MethodDescriptor<CampusMngQuizOperateReq, CampusMngQuizOperateReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusMngQuizOperateMethod()

  public val campusMngSubmitMethod: MethodDescriptor<CampusMngSubmitReq, CampusMngSubmitReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusMngSubmitMethod()

  public val campusRcmdMethod: MethodDescriptor<CampusRcmdReq, CampusRcmdReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusRcmdMethod()

  public val campusRcmdFeedMethod: MethodDescriptor<CampusRcmdFeedReq, CampusRcmdFeedReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusRcmdFeedMethod()

  public val campusRecommendMethod: MethodDescriptor<CampusRecommendReq, CampusRecommendReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusRecommendMethod()

  public val campusRedDotMethod: MethodDescriptor<CampusRedDotReq, CampusRedDotReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusRedDotMethod()

  public val campusSquareMethod: MethodDescriptor<CampusSquareReq, CampusSquareReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusSquareMethod()

  public val campusTopicRcmdFeedMethod:
      MethodDescriptor<CampusTopicRcmdFeedReq, CampusTopicRcmdFeedReply>
    @JvmStatic
    get() = DynamicGrpc.getCampusTopicRcmdFeedMethod()

  public val dynAdditionCommonFollowMethod:
      MethodDescriptor<DynAdditionCommonFollowReq, DynAdditionCommonFollowReply>
    @JvmStatic
    get() = DynamicGrpc.getDynAdditionCommonFollowMethod()

  public val dynAllMethod: MethodDescriptor<DynAllReq, DynAllReply>
    @JvmStatic
    get() = DynamicGrpc.getDynAllMethod()

  public val dynAllPersonalMethod: MethodDescriptor<DynAllPersonalReq, DynAllPersonalReply>
    @JvmStatic
    get() = DynamicGrpc.getDynAllPersonalMethod()

  public val dynAllUpdOffsetMethod: MethodDescriptor<DynAllUpdOffsetReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getDynAllUpdOffsetMethod()

  public val dynDetailMethod: MethodDescriptor<DynDetailReq, DynDetailReply>
    @JvmStatic
    get() = DynamicGrpc.getDynDetailMethod()

  public val dynDetailsMethod: MethodDescriptor<DynDetailsReq, DynDetailsReply>
    @JvmStatic
    get() = DynamicGrpc.getDynDetailsMethod()

  public val dynFakeCardMethod: MethodDescriptor<DynFakeCardReq, DynFakeCardReply>
    @JvmStatic
    get() = DynamicGrpc.getDynFakeCardMethod()

  public val dynFriendMethod: MethodDescriptor<DynFriendReq, DynFriendReply>
    @JvmStatic
    get() = DynamicGrpc.getDynFriendMethod()

  public val dynLightMethod: MethodDescriptor<DynLightReq, DynLightReply>
    @JvmStatic
    get() = DynamicGrpc.getDynLightMethod()

  public val dynMixUpListViewMoreMethod:
      MethodDescriptor<DynMixUpListViewMoreReq, DynMixUpListViewMoreReply>
    @JvmStatic
    get() = DynamicGrpc.getDynMixUpListViewMoreMethod()

  public val dynRcmdUpExchangeMethod: MethodDescriptor<DynRcmdUpExchangeReq, DynRcmdUpExchangeReply>
    @JvmStatic
    get() = DynamicGrpc.getDynRcmdUpExchangeMethod()

  public val dynSearchMethod: MethodDescriptor<DynSearchReq, DynSearchReply>
    @JvmStatic
    get() = DynamicGrpc.getDynSearchMethod()

  public val dynServerDetailsMethod: MethodDescriptor<DynServerDetailsReq, DynServerDetailsReply>
    @JvmStatic
    get() = DynamicGrpc.getDynServerDetailsMethod()

  public val dynSpaceMethod: MethodDescriptor<DynSpaceReq, DynSpaceRsp>
    @JvmStatic
    get() = DynamicGrpc.getDynSpaceMethod()

  public val dynSpaceSearchDetailsMethod:
      MethodDescriptor<DynSpaceSearchDetailsReq, DynSpaceSearchDetailsReply>
    @JvmStatic
    get() = DynamicGrpc.getDynSpaceSearchDetailsMethod()

  public val dynTabMethod: MethodDescriptor<DynTabReq, DynTabReply>
    @JvmStatic
    get() = DynamicGrpc.getDynTabMethod()

  public val dynThumbMethod: MethodDescriptor<DynThumbReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getDynThumbMethod()

  public val dynUnLoginRcmdMethod: MethodDescriptor<DynRcmdReq, DynRcmdReply>
    @JvmStatic
    get() = DynamicGrpc.getDynUnLoginRcmdMethod()

  public val dynVideoMethod: MethodDescriptor<DynVideoReq, DynVideoReply>
    @JvmStatic
    get() = DynamicGrpc.getDynVideoMethod()

  public val dynVideoPersonalMethod: MethodDescriptor<DynVideoPersonalReq, DynVideoPersonalReply>
    @JvmStatic
    get() = DynamicGrpc.getDynVideoPersonalMethod()

  public val dynVideoUpdOffsetMethod: MethodDescriptor<DynVideoUpdOffsetReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getDynVideoUpdOffsetMethod()

  public val dynVoteMethod: MethodDescriptor<DynVoteReq, DynVoteReply>
    @JvmStatic
    get() = DynamicGrpc.getDynVoteMethod()

  public val feedFilterMethod: MethodDescriptor<FeedFilterReq, FeedFilterReply>
    @JvmStatic
    get() = DynamicGrpc.getFeedFilterMethod()

  public val fetchTabSettingMethod: MethodDescriptor<NoReq, FetchTabSettingReply>
    @JvmStatic
    get() = DynamicGrpc.getFetchTabSettingMethod()

  public val homeSubscribeMethod: MethodDescriptor<HomeSubscribeReq, HomeSubscribeReply>
    @JvmStatic
    get() = DynamicGrpc.getHomeSubscribeMethod()

  public val lbsPoiMethod: MethodDescriptor<LbsPoiReq, LbsPoiReply>
    @JvmStatic
    get() = DynamicGrpc.getLbsPoiMethod()

  public val legacyTopicFeedMethod: MethodDescriptor<LegacyTopicFeedReq, LegacyTopicFeedReply>
    @JvmStatic
    get() = DynamicGrpc.getLegacyTopicFeedMethod()

  public val likeListMethod: MethodDescriptor<LikeListReq, LikeListReply>
    @JvmStatic
    get() = DynamicGrpc.getLikeListMethod()

  public val officialAccountsMethod: MethodDescriptor<OfficialAccountsReq, OfficialAccountsReply>
    @JvmStatic
    get() = DynamicGrpc.getOfficialAccountsMethod()

  public val officialDynamicsMethod: MethodDescriptor<OfficialDynamicsReq, OfficialDynamicsReply>
    @JvmStatic
    get() = DynamicGrpc.getOfficialDynamicsMethod()

  public val reactionListMethod: MethodDescriptor<ReactionListReq, ReactionListReply>
    @JvmStatic
    get() = DynamicGrpc.getReactionListMethod()

  public val repostListMethod: MethodDescriptor<RepostListReq, RepostListRsp>
    @JvmStatic
    get() = DynamicGrpc.getRepostListMethod()

  public val schoolRecommendMethod: MethodDescriptor<SchoolRecommendReq, SchoolRecommendReply>
    @JvmStatic
    get() = DynamicGrpc.getSchoolRecommendMethod()

  public val schoolSearchMethod: MethodDescriptor<SchoolSearchReq, SchoolSearchReply>
    @JvmStatic
    get() = DynamicGrpc.getSchoolSearchMethod()

  public val setDecisionMethod: MethodDescriptor<SetDecisionReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getSetDecisionMethod()

  public val setRecentCampusMethod: MethodDescriptor<SetRecentCampusReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getSetRecentCampusMethod()

  public val subscribeCampusMethod: MethodDescriptor<SubscribeCampusReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getSubscribeCampusMethod()

  public val topicListMethod: MethodDescriptor<TopicListReq, TopicListReply>
    @JvmStatic
    get() = DynamicGrpc.getTopicListMethod()

  public val topicSquareMethod: MethodDescriptor<TopicSquareReq, TopicSquareReply>
    @JvmStatic
    get() = DynamicGrpc.getTopicSquareMethod()

  public val unfollowMatchMethod: MethodDescriptor<UnfollowMatchReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getUnfollowMatchMethod()

  public val updateTabSettingMethod: MethodDescriptor<UpdateTabSettingReq, NoReply>
    @JvmStatic
    get() = DynamicGrpc.getUpdateTabSettingMethod()

  /**
   * A stub for issuing RPCs to a(n) bilibili.app.dynamic.v2.Dynamic service as suspending
   * coroutines.
   */
  @StubFor(DynamicGrpc::class)
  public class DynamicCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<DynamicCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): DynamicCoroutineStub =
        DynamicCoroutineStub(channel, callOptions)

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
    public suspend fun alumniDynamics(request: AlumniDynamicsReq, headers: Metadata = Metadata()):
        AlumniDynamicsReply = unaryRpc(
      channel,
      DynamicGrpc.getAlumniDynamicsMethod(),
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
    public suspend fun campusBillBoard(request: CampusBillBoardReq, headers: Metadata = Metadata()):
        CampusBillBoardReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusBillBoardMethod(),
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
    public suspend fun campusEntryTab(request: CampusEntryTabReq, headers: Metadata = Metadata()):
        CampusEntryTabResp = unaryRpc(
      channel,
      DynamicGrpc.getCampusEntryTabMethod(),
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
    public suspend fun campusFeedback(request: CampusFeedbackReq, headers: Metadata = Metadata()):
        CampusFeedbackReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusFeedbackMethod(),
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
    public suspend fun campusHomePages(request: CampusHomePagesReq, headers: Metadata = Metadata()):
        CampusHomePagesReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusHomePagesMethod(),
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
    public suspend fun campusMateLikeList(request: CampusMateLikeListReq, headers: Metadata =
        Metadata()): CampusMateLikeListReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusMateLikeListMethod(),
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
    public suspend fun campusMngDetail(request: CampusMngDetailReq, headers: Metadata = Metadata()):
        CampusMngDetailReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusMngDetailMethod(),
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
    public suspend fun campusMngQuizOperate(request: CampusMngQuizOperateReq, headers: Metadata =
        Metadata()): CampusMngQuizOperateReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusMngQuizOperateMethod(),
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
    public suspend fun campusMngSubmit(request: CampusMngSubmitReq, headers: Metadata = Metadata()):
        CampusMngSubmitReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusMngSubmitMethod(),
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
    public suspend fun campusRcmd(request: CampusRcmdReq, headers: Metadata = Metadata()):
        CampusRcmdReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusRcmdMethod(),
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
    public suspend fun campusRcmdFeed(request: CampusRcmdFeedReq, headers: Metadata = Metadata()):
        CampusRcmdFeedReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusRcmdFeedMethod(),
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
    public suspend fun campusRecommend(request: CampusRecommendReq, headers: Metadata = Metadata()):
        CampusRecommendReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusRecommendMethod(),
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
    public suspend fun campusRedDot(request: CampusRedDotReq, headers: Metadata = Metadata()):
        CampusRedDotReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusRedDotMethod(),
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
    public suspend fun campusSquare(request: CampusSquareReq, headers: Metadata = Metadata()):
        CampusSquareReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusSquareMethod(),
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
    public suspend fun campusTopicRcmdFeed(request: CampusTopicRcmdFeedReq, headers: Metadata =
        Metadata()): CampusTopicRcmdFeedReply = unaryRpc(
      channel,
      DynamicGrpc.getCampusTopicRcmdFeedMethod(),
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
    public suspend fun dynAdditionCommonFollow(request: DynAdditionCommonFollowReq,
        headers: Metadata = Metadata()): DynAdditionCommonFollowReply = unaryRpc(
      channel,
      DynamicGrpc.getDynAdditionCommonFollowMethod(),
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
    public suspend fun dynAll(request: DynAllReq, headers: Metadata = Metadata()): DynAllReply =
        unaryRpc(
      channel,
      DynamicGrpc.getDynAllMethod(),
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
    public suspend fun dynAllPersonal(request: DynAllPersonalReq, headers: Metadata = Metadata()):
        DynAllPersonalReply = unaryRpc(
      channel,
      DynamicGrpc.getDynAllPersonalMethod(),
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
    public suspend fun dynAllUpdOffset(request: DynAllUpdOffsetReq, headers: Metadata = Metadata()):
        NoReply = unaryRpc(
      channel,
      DynamicGrpc.getDynAllUpdOffsetMethod(),
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
    public suspend fun dynDetail(request: DynDetailReq, headers: Metadata = Metadata()):
        DynDetailReply = unaryRpc(
      channel,
      DynamicGrpc.getDynDetailMethod(),
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
    public suspend fun dynDetails(request: DynDetailsReq, headers: Metadata = Metadata()):
        DynDetailsReply = unaryRpc(
      channel,
      DynamicGrpc.getDynDetailsMethod(),
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
    public suspend fun dynFakeCard(request: DynFakeCardReq, headers: Metadata = Metadata()):
        DynFakeCardReply = unaryRpc(
      channel,
      DynamicGrpc.getDynFakeCardMethod(),
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
    public suspend fun dynFriend(request: DynFriendReq, headers: Metadata = Metadata()):
        DynFriendReply = unaryRpc(
      channel,
      DynamicGrpc.getDynFriendMethod(),
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
    public suspend fun dynLight(request: DynLightReq, headers: Metadata = Metadata()): DynLightReply
        = unaryRpc(
      channel,
      DynamicGrpc.getDynLightMethod(),
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
    public suspend fun dynMixUpListViewMore(request: DynMixUpListViewMoreReq, headers: Metadata =
        Metadata()): DynMixUpListViewMoreReply = unaryRpc(
      channel,
      DynamicGrpc.getDynMixUpListViewMoreMethod(),
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
    public suspend fun dynRcmdUpExchange(request: DynRcmdUpExchangeReq, headers: Metadata =
        Metadata()): DynRcmdUpExchangeReply = unaryRpc(
      channel,
      DynamicGrpc.getDynRcmdUpExchangeMethod(),
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
    public suspend fun dynSearch(request: DynSearchReq, headers: Metadata = Metadata()):
        DynSearchReply = unaryRpc(
      channel,
      DynamicGrpc.getDynSearchMethod(),
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
    public suspend fun dynServerDetails(request: DynServerDetailsReq, headers: Metadata =
        Metadata()): DynServerDetailsReply = unaryRpc(
      channel,
      DynamicGrpc.getDynServerDetailsMethod(),
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
    public suspend fun dynSpace(request: DynSpaceReq, headers: Metadata = Metadata()): DynSpaceRsp =
        unaryRpc(
      channel,
      DynamicGrpc.getDynSpaceMethod(),
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
    public suspend fun dynSpaceSearchDetails(request: DynSpaceSearchDetailsReq, headers: Metadata =
        Metadata()): DynSpaceSearchDetailsReply = unaryRpc(
      channel,
      DynamicGrpc.getDynSpaceSearchDetailsMethod(),
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
    public suspend fun dynTab(request: DynTabReq, headers: Metadata = Metadata()): DynTabReply =
        unaryRpc(
      channel,
      DynamicGrpc.getDynTabMethod(),
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
    public suspend fun dynThumb(request: DynThumbReq, headers: Metadata = Metadata()): NoReply =
        unaryRpc(
      channel,
      DynamicGrpc.getDynThumbMethod(),
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
    public suspend fun dynUnLoginRcmd(request: DynRcmdReq, headers: Metadata = Metadata()):
        DynRcmdReply = unaryRpc(
      channel,
      DynamicGrpc.getDynUnLoginRcmdMethod(),
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
    public suspend fun dynVideo(request: DynVideoReq, headers: Metadata = Metadata()): DynVideoReply
        = unaryRpc(
      channel,
      DynamicGrpc.getDynVideoMethod(),
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
    public suspend fun dynVideoPersonal(request: DynVideoPersonalReq, headers: Metadata =
        Metadata()): DynVideoPersonalReply = unaryRpc(
      channel,
      DynamicGrpc.getDynVideoPersonalMethod(),
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
    public suspend fun dynVideoUpdOffset(request: DynVideoUpdOffsetReq, headers: Metadata =
        Metadata()): NoReply = unaryRpc(
      channel,
      DynamicGrpc.getDynVideoUpdOffsetMethod(),
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
    public suspend fun dynVote(request: DynVoteReq, headers: Metadata = Metadata()): DynVoteReply =
        unaryRpc(
      channel,
      DynamicGrpc.getDynVoteMethod(),
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
    public suspend fun feedFilter(request: FeedFilterReq, headers: Metadata = Metadata()):
        FeedFilterReply = unaryRpc(
      channel,
      DynamicGrpc.getFeedFilterMethod(),
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
    public suspend fun fetchTabSetting(request: NoReq, headers: Metadata = Metadata()):
        FetchTabSettingReply = unaryRpc(
      channel,
      DynamicGrpc.getFetchTabSettingMethod(),
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
    public suspend fun homeSubscribe(request: HomeSubscribeReq, headers: Metadata = Metadata()):
        HomeSubscribeReply = unaryRpc(
      channel,
      DynamicGrpc.getHomeSubscribeMethod(),
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
    public suspend fun lbsPoi(request: LbsPoiReq, headers: Metadata = Metadata()): LbsPoiReply =
        unaryRpc(
      channel,
      DynamicGrpc.getLbsPoiMethod(),
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
    public suspend fun legacyTopicFeed(request: LegacyTopicFeedReq, headers: Metadata = Metadata()):
        LegacyTopicFeedReply = unaryRpc(
      channel,
      DynamicGrpc.getLegacyTopicFeedMethod(),
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
    public suspend fun likeList(request: LikeListReq, headers: Metadata = Metadata()): LikeListReply
        = unaryRpc(
      channel,
      DynamicGrpc.getLikeListMethod(),
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
    public suspend fun officialAccounts(request: OfficialAccountsReq, headers: Metadata =
        Metadata()): OfficialAccountsReply = unaryRpc(
      channel,
      DynamicGrpc.getOfficialAccountsMethod(),
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
    public suspend fun officialDynamics(request: OfficialDynamicsReq, headers: Metadata =
        Metadata()): OfficialDynamicsReply = unaryRpc(
      channel,
      DynamicGrpc.getOfficialDynamicsMethod(),
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
    public suspend fun reactionList(request: ReactionListReq, headers: Metadata = Metadata()):
        ReactionListReply = unaryRpc(
      channel,
      DynamicGrpc.getReactionListMethod(),
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
    public suspend fun repostList(request: RepostListReq, headers: Metadata = Metadata()):
        RepostListRsp = unaryRpc(
      channel,
      DynamicGrpc.getRepostListMethod(),
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
    public suspend fun schoolRecommend(request: SchoolRecommendReq, headers: Metadata = Metadata()):
        SchoolRecommendReply = unaryRpc(
      channel,
      DynamicGrpc.getSchoolRecommendMethod(),
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
    public suspend fun schoolSearch(request: SchoolSearchReq, headers: Metadata = Metadata()):
        SchoolSearchReply = unaryRpc(
      channel,
      DynamicGrpc.getSchoolSearchMethod(),
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
    public suspend fun setDecision(request: SetDecisionReq, headers: Metadata = Metadata()): NoReply
        = unaryRpc(
      channel,
      DynamicGrpc.getSetDecisionMethod(),
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
    public suspend fun setRecentCampus(request: SetRecentCampusReq, headers: Metadata = Metadata()):
        NoReply = unaryRpc(
      channel,
      DynamicGrpc.getSetRecentCampusMethod(),
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
    public suspend fun subscribeCampus(request: SubscribeCampusReq, headers: Metadata = Metadata()):
        NoReply = unaryRpc(
      channel,
      DynamicGrpc.getSubscribeCampusMethod(),
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
    public suspend fun topicList(request: TopicListReq, headers: Metadata = Metadata()):
        TopicListReply = unaryRpc(
      channel,
      DynamicGrpc.getTopicListMethod(),
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
    public suspend fun topicSquare(request: TopicSquareReq, headers: Metadata = Metadata()):
        TopicSquareReply = unaryRpc(
      channel,
      DynamicGrpc.getTopicSquareMethod(),
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
    public suspend fun unfollowMatch(request: UnfollowMatchReq, headers: Metadata = Metadata()):
        NoReply = unaryRpc(
      channel,
      DynamicGrpc.getUnfollowMatchMethod(),
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
    public suspend fun updateTabSetting(request: UpdateTabSettingReq, headers: Metadata =
        Metadata()): NoReply = unaryRpc(
      channel,
      DynamicGrpc.getUpdateTabSettingMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bilibili.app.dynamic.v2.Dynamic service based on Kotlin
   * coroutines.
   */
  public abstract class DynamicCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.AlumniDynamics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun alumniDynamics(request: AlumniDynamicsReq): AlumniDynamicsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.AlumniDynamics is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusBillBoard.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusBillBoard(request: CampusBillBoardReq): CampusBillBoardReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusBillBoard is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusEntryTab.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusEntryTab(request: CampusEntryTabReq): CampusEntryTabResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusEntryTab is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusFeedback.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusFeedback(request: CampusFeedbackReq): CampusFeedbackReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusFeedback is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusHomePages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusHomePages(request: CampusHomePagesReq): CampusHomePagesReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusHomePages is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusMateLikeList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusMateLikeList(request: CampusMateLikeListReq):
        CampusMateLikeListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusMateLikeList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusMngDetail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusMngDetail(request: CampusMngDetailReq): CampusMngDetailReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusMngDetail is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusMngQuizOperate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusMngQuizOperate(request: CampusMngQuizOperateReq):
        CampusMngQuizOperateReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusMngQuizOperate is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusMngSubmit.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusMngSubmit(request: CampusMngSubmitReq): CampusMngSubmitReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusMngSubmit is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusRcmd.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusRcmd(request: CampusRcmdReq): CampusRcmdReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusRcmd is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusRcmdFeed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusRcmdFeed(request: CampusRcmdFeedReq): CampusRcmdFeedReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusRcmdFeed is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusRecommend.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusRecommend(request: CampusRecommendReq): CampusRecommendReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusRecommend is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusRedDot.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusRedDot(request: CampusRedDotReq): CampusRedDotReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusRedDot is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusSquare.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusSquare(request: CampusSquareReq): CampusSquareReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusSquare is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.CampusTopicRcmdFeed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun campusTopicRcmdFeed(request: CampusTopicRcmdFeedReq):
        CampusTopicRcmdFeedReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.CampusTopicRcmdFeed is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynAdditionCommonFollow.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynAdditionCommonFollow(request: DynAdditionCommonFollowReq):
        DynAdditionCommonFollowReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynAdditionCommonFollow is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynAll(request: DynAllReq): DynAllReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynAll is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynAllPersonal.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynAllPersonal(request: DynAllPersonalReq): DynAllPersonalReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynAllPersonal is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynAllUpdOffset.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynAllUpdOffset(request: DynAllUpdOffsetReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynAllUpdOffset is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynDetail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynDetail(request: DynDetailReq): DynDetailReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynDetail is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynDetails.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynDetails(request: DynDetailsReq): DynDetailsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynDetails is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynFakeCard.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynFakeCard(request: DynFakeCardReq): DynFakeCardReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynFakeCard is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynFriend.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynFriend(request: DynFriendReq): DynFriendReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynFriend is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynLight.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynLight(request: DynLightReq): DynLightReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynLight is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynMixUpListViewMore.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynMixUpListViewMore(request: DynMixUpListViewMoreReq):
        DynMixUpListViewMoreReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynMixUpListViewMore is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynRcmdUpExchange.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynRcmdUpExchange(request: DynRcmdUpExchangeReq): DynRcmdUpExchangeReply
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynRcmdUpExchange is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynSearch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynSearch(request: DynSearchReq): DynSearchReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynSearch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynServerDetails.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynServerDetails(request: DynServerDetailsReq): DynServerDetailsReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynServerDetails is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynSpace.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynSpace(request: DynSpaceReq): DynSpaceRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynSpace is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynSpaceSearchDetails.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynSpaceSearchDetails(request: DynSpaceSearchDetailsReq):
        DynSpaceSearchDetailsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynSpaceSearchDetails is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynTab.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynTab(request: DynTabReq): DynTabReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynTab is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynThumb.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynThumb(request: DynThumbReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynThumb is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynUnLoginRcmd.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynUnLoginRcmd(request: DynRcmdReq): DynRcmdReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynUnLoginRcmd is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynVideo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynVideo(request: DynVideoReq): DynVideoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynVideo is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynVideoPersonal.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynVideoPersonal(request: DynVideoPersonalReq): DynVideoPersonalReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynVideoPersonal is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynVideoUpdOffset.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynVideoUpdOffset(request: DynVideoUpdOffsetReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynVideoUpdOffset is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.DynVote.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun dynVote(request: DynVoteReq): DynVoteReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.DynVote is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.FeedFilter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun feedFilter(request: FeedFilterReq): FeedFilterReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.FeedFilter is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.FetchTabSetting.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun fetchTabSetting(request: NoReq): FetchTabSettingReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.FetchTabSetting is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.HomeSubscribe.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun homeSubscribe(request: HomeSubscribeReq): HomeSubscribeReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.HomeSubscribe is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.LbsPoi.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun lbsPoi(request: LbsPoiReq): LbsPoiReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.LbsPoi is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.LegacyTopicFeed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun legacyTopicFeed(request: LegacyTopicFeedReq): LegacyTopicFeedReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.LegacyTopicFeed is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.LikeList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun likeList(request: LikeListReq): LikeListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.LikeList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.OfficialAccounts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun officialAccounts(request: OfficialAccountsReq): OfficialAccountsReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.OfficialAccounts is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.OfficialDynamics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun officialDynamics(request: OfficialDynamicsReq): OfficialDynamicsReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.OfficialDynamics is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.ReactionList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reactionList(request: ReactionListReq): ReactionListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.ReactionList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.RepostList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun repostList(request: RepostListReq): RepostListRsp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.RepostList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.SchoolRecommend.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun schoolRecommend(request: SchoolRecommendReq): SchoolRecommendReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.SchoolRecommend is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.SchoolSearch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun schoolSearch(request: SchoolSearchReq): SchoolSearchReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.SchoolSearch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.SetDecision.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setDecision(request: SetDecisionReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.SetDecision is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.SetRecentCampus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRecentCampus(request: SetRecentCampusReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.SetRecentCampus is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.SubscribeCampus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun subscribeCampus(request: SubscribeCampusReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.SubscribeCampus is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.TopicList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun topicList(request: TopicListReq): TopicListReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.TopicList is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.TopicSquare.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun topicSquare(request: TopicSquareReq): TopicSquareReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.TopicSquare is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.UnfollowMatch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unfollowMatch(request: UnfollowMatchReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.UnfollowMatch is unimplemented"))

    /**
     * Returns the response to an RPC for bilibili.app.dynamic.v2.Dynamic.UpdateTabSetting.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateTabSetting(request: UpdateTabSettingReq): NoReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bilibili.app.dynamic.v2.Dynamic.UpdateTabSetting is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getAlumniDynamicsMethod(),
      implementation = ::alumniDynamics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusBillBoardMethod(),
      implementation = ::campusBillBoard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusEntryTabMethod(),
      implementation = ::campusEntryTab
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusFeedbackMethod(),
      implementation = ::campusFeedback
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusHomePagesMethod(),
      implementation = ::campusHomePages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusMateLikeListMethod(),
      implementation = ::campusMateLikeList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusMngDetailMethod(),
      implementation = ::campusMngDetail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusMngQuizOperateMethod(),
      implementation = ::campusMngQuizOperate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusMngSubmitMethod(),
      implementation = ::campusMngSubmit
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusRcmdMethod(),
      implementation = ::campusRcmd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusRcmdFeedMethod(),
      implementation = ::campusRcmdFeed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusRecommendMethod(),
      implementation = ::campusRecommend
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusRedDotMethod(),
      implementation = ::campusRedDot
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusSquareMethod(),
      implementation = ::campusSquare
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getCampusTopicRcmdFeedMethod(),
      implementation = ::campusTopicRcmdFeed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynAdditionCommonFollowMethod(),
      implementation = ::dynAdditionCommonFollow
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynAllMethod(),
      implementation = ::dynAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynAllPersonalMethod(),
      implementation = ::dynAllPersonal
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynAllUpdOffsetMethod(),
      implementation = ::dynAllUpdOffset
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynDetailMethod(),
      implementation = ::dynDetail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynDetailsMethod(),
      implementation = ::dynDetails
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynFakeCardMethod(),
      implementation = ::dynFakeCard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynFriendMethod(),
      implementation = ::dynFriend
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynLightMethod(),
      implementation = ::dynLight
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynMixUpListViewMoreMethod(),
      implementation = ::dynMixUpListViewMore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynRcmdUpExchangeMethod(),
      implementation = ::dynRcmdUpExchange
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynSearchMethod(),
      implementation = ::dynSearch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynServerDetailsMethod(),
      implementation = ::dynServerDetails
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynSpaceMethod(),
      implementation = ::dynSpace
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynSpaceSearchDetailsMethod(),
      implementation = ::dynSpaceSearchDetails
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynTabMethod(),
      implementation = ::dynTab
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynThumbMethod(),
      implementation = ::dynThumb
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynUnLoginRcmdMethod(),
      implementation = ::dynUnLoginRcmd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynVideoMethod(),
      implementation = ::dynVideo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynVideoPersonalMethod(),
      implementation = ::dynVideoPersonal
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynVideoUpdOffsetMethod(),
      implementation = ::dynVideoUpdOffset
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getDynVoteMethod(),
      implementation = ::dynVote
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getFeedFilterMethod(),
      implementation = ::feedFilter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getFetchTabSettingMethod(),
      implementation = ::fetchTabSetting
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getHomeSubscribeMethod(),
      implementation = ::homeSubscribe
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getLbsPoiMethod(),
      implementation = ::lbsPoi
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getLegacyTopicFeedMethod(),
      implementation = ::legacyTopicFeed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getLikeListMethod(),
      implementation = ::likeList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getOfficialAccountsMethod(),
      implementation = ::officialAccounts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getOfficialDynamicsMethod(),
      implementation = ::officialDynamics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getReactionListMethod(),
      implementation = ::reactionList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getRepostListMethod(),
      implementation = ::repostList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getSchoolRecommendMethod(),
      implementation = ::schoolRecommend
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getSchoolSearchMethod(),
      implementation = ::schoolSearch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getSetDecisionMethod(),
      implementation = ::setDecision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getSetRecentCampusMethod(),
      implementation = ::setRecentCampus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getSubscribeCampusMethod(),
      implementation = ::subscribeCampus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getTopicListMethod(),
      implementation = ::topicList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getTopicSquareMethod(),
      implementation = ::topicSquare
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getUnfollowMatchMethod(),
      implementation = ::unfollowMatch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DynamicGrpc.getUpdateTabSettingMethod(),
      implementation = ::updateTabSetting
    )).build()
  }
}
