package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/21.
 */

public class ShortComData {

    public List<ShComment> comments;

    public class ShComment{

        @SerializedName("author")
        @Expose
        public String author;

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("content")
        @Expose
        public String content;

        @SerializedName("likes")
        @Expose
        public int likes;

        @SerializedName("time")
        @Expose
        public int time;

        @SerializedName("avatar")
        @Expose
        public String avatarUrl;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }
    }





}
