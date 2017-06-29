package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/20.
 */

public class LatestBodyData {

    @SerializedName("body")
    @Expose
    public String body;

    @SerializedName("image_source")
    @Expose
    public String source;

    @SerializedName("title")
    @Expose
    public String title;

    @SerializedName("image")
    @Expose
    public String imageUrl;

    @SerializedName("share_url")
    @Expose
    public String shareUrl;

    public List<Recommender> recomenderList;

    @SerializedName("ga_prefix")
    @Expose
    public String ga;

    public Section section;

    public class Section{
        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @SerializedName("thumbnail")
        @Expose
        public String thumb;

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("name")
        @Expose
        public String name;
    }

    @SerializedName("type")
    @Expose
    public int type;

    @SerializedName("id")
    @Expose
    public int id;

    @SerializedName("css")
    @Expose
   public List<String> cssList;

    @SerializedName("js")
    @Expose
    public List<String> js;

    public class Recommender{
        @SerializedName("avatar")
        @Expose
        public String avatar;

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }



    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public List<Recommender> getRecomenderList() {
        return recomenderList;
    }

    public void setRecomenderList(List<Recommender> recomenderList) {
        this.recomenderList = recomenderList;
    }

    public String getGa() {
        return ga;
    }

    public void setGa(String ga) {
        this.ga = ga;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
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

    public List<String> getCssList() {
        return cssList;
    }

    public void setCssList(List<String> cssList) {
        this.cssList = cssList;
    }

    public List<String> getJs() {
        return js;
    }

    public void setJs(List<String> js) {
        this.js = js;
    }
}
