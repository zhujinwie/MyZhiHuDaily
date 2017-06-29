package zhujinwei.myzhihudaily.utils;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import zhujinwei.myzhihudaily.bean.HistoryData;
import zhujinwei.myzhihudaily.bean.HotNews;
import zhujinwei.myzhihudaily.bean.LatestBodyData;
import zhujinwei.myzhihudaily.bean.LatestImageData;
import zhujinwei.myzhihudaily.bean.LontComData;
import zhujinwei.myzhihudaily.bean.SectionBody;
import zhujinwei.myzhihudaily.bean.SectionsData;
import zhujinwei.myzhihudaily.bean.ShortComData;
import zhujinwei.myzhihudaily.bean.StoryExtraData;
import zhujinwei.myzhihudaily.bean.StoryRecommender;
import zhujinwei.myzhihudaily.bean.TopicBody;
import zhujinwei.myzhihudaily.bean.TopicList;
import zhujinwei.myzhihudaily.bean.VersionData;

/**
 * Created by ZhuJinWei on 2017/6/20.
 */

public interface DailyApi {

    /**获取软件更新信息*/
    @GET("4/version/android/{versionNumber}")
    Flowable<VersionData> getVersion(@Path("versionNumber") String version);

    /**获取最新日报图片与id*/
    @GET("4/news/latest")
    Flowable<LatestImageData> getLatestImageData();

    /**获取最新日报内容与离线下载*/
    @GET("4/news/"+"{id}")
    Flowable<LatestBodyData> getLatestBodyData(@Path("id") int id);

    /**获取历史日报内容*/
    @GET("4/news/before/"+"{date}")
    Flowable<HistoryData> getHistoryData(@Path("date") String date);

    /**获取新闻额外信息*/
    @GET("4/story-extra/"+"{id}")
    Flowable<StoryExtraData> getStoryExtraData(@Path("id") int id);

    /**获取新闻长评论*/
    @GET("4/story/"+"{id}"+"/long-comments")
    Flowable<LontComData> getLongComments(@Path("id") int id);

    /**获取新闻短评论*/
    @GET("4/story/"+"{id}"+"/short-comments")
    Flowable<ShortComData> getShortComments(@Path("id") int id);

    /**获取主题日报列表*/
    @GET("4/themes")
    Flowable<TopicList> getTopicList();

    /**获取主题日报内容*/
    @GET("4/theme/"+"{id}")
    Flowable<TopicBody> getTopicBody(@Path("id") int id);

    /**获取热门消息*/
    @GET("3/news/hot")
    Flowable<HotNews> getHotNews();

    /**获取软件推广,已无效*/
    //@GET("3/promotion/android")

    /**获取栏目总览*/
    @GET("3/sections")
    Flowable<SectionsData> getSections();

    /**获取栏目具体消息*/
    @GET("3/sections/"+"{id}")
    Flowable<SectionBody> getSectionBody(@Path("id") int id);

    /**获取新闻推荐者*/
    @GET("4/story/"+"{id}"+"/recommenders")
    Flowable<StoryRecommender> getRecommenders(@Path("id") int id);

    /**获取某个专栏之前的新闻*/
    @GET("4/section/"+"{id}"+"/before/"+"{timestamp}")
    Flowable<HistoryData> getHistoryStoryBeforeTimeStamp(@Path("id") int id,@Path("timestamp") int timestamp);

    /**获取editor主页*/
    @GET("4/editor/"+"{id}"+"/profile-page/android")
    void getProfilePage(@Path("id") int id);

}
