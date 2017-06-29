package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/21.
 */

public class StoryRecommender {

    @SerializedName("items")
    @Expose
    public List items;

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @SerializedName("item_count")
    @Expose
    public int count;

    public class Editor{
        @SerializedName("bio")
        @Expose
        public String bio;

        @SerializedName("title")
        @Expose
        public String title;

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("avatar")
        @Expose
        public String avatarUrl;

        @SerializedName("name")
        @Expose
        public String name;

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
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
