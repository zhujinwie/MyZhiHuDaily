package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/20.
 *最新资讯
 * */

public class LatestImageData {

    @SerializedName("date")
    @Expose
    public String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    public List<TopStory> getTopStories() {
        return topStories;
    }

    public void setTopStories(List<TopStory> topStories) {
        this.topStories = topStories;
    }

    public List<Story> stories;

    public List<TopStory> topStories;



    public class TopStory{

        @SerializedName("title")
        @Expose
        public String topTitle;

        @SerializedName("image")
        @Expose
        public String imageUrl;

        @SerializedName("ga_prefix")
        @Expose
        public String ga;

        @SerializedName("type")
        @Expose
        public int type;

        @SerializedName("id")
        @Expose
        public int id;

        public String getTopTitle() {
            return topTitle;
        }

        public void setTopTitle(String topTitle) {
            this.topTitle = topTitle;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getGa() {
            return ga;
        }

        public void setGa(String ga) {
            this.ga = ga;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }





}
