package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/21.
 */

public class TopicBody {

    public List<TopicStory> stories;

    @SerializedName("description")
    @Expose
    public String desc;

    @SerializedName("background")
    @Expose
    public String bgUrl;

    @SerializedName("color")
    @Expose
    public int color;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("image")
    @Expose
    public String imageUrl;

    public List<TopicEditor> editors;

    @SerializedName("image_source")
    @Expose
    public String imageSouce;

    public class TopicStory{

        @SerializedName("images")
        @Expose
        public List<String> images;

        @SerializedName("type")
        @Expose
        public int type;

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("title")
        @Expose
        public String title;

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public class TopicEditor{

        @SerializedName("url")
        @Expose
        public String url;

        @SerializedName("bio")
        @Expose
        public String bio;

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("avatar")
        @Expose
        public String avatarUrl;

        @SerializedName("name")
        @Expose
        public String name;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
