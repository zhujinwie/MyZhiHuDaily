package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/21.
 */

public class HotNews {


    @SerializedName("recent")
    @Expose
    public List<Recent> recents;

    public List<Recent> getRecents() {
        return recents;
    }

    public void setRecents(List<Recent> recents) {
        this.recents = recents;
    }

    public class Recent{

        @SerializedName("new_id")
        @Expose
        public int id;

        @SerializedName("url")
        @Expose
        public String url;

        @SerializedName("thumbnail")
        @Expose
        public String thumb;

        @SerializedName("title")
        @Expose
        public String title;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
