package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/21.
 */

public class LontComData {

    public List<LoComment> comments;

    public class LoComment{

        @SerializedName("author")
        @Expose
        public String author;

        @SerializedName("content")
        @Expose
        public String content;

        @SerializedName("avatar")
        @Expose
        public String avatarUrl;

        @SerializedName("time")
        @Expose
        public int time;

        public ReplyTo reply_to;

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("likes")
        @Expose
        public int likes;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public ReplyTo getReply_to() {
            return reply_to;
        }

        public void setReply_to(ReplyTo reply_to) {
            this.reply_to = reply_to;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public class ReplyTo{

            @SerializedName("content")
            @Expose
            public String content;

            @SerializedName("status")
            @Expose
            public int status;

            @SerializedName("id")
            @Expose
            public int id;

            @SerializedName("author")
            @Expose
            public String author;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }
        }


    }



}
