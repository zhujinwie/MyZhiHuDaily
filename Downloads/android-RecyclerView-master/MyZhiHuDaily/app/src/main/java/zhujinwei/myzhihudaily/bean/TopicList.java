package zhujinwei.myzhihudaily.bean;

import android.support.annotation.StringDef;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/21.
 */

public class TopicList {

    @SerializedName("limit")
    @Expose
    public int limit;

    @SerializedName("subscribed")
    @Expose
    public List<ThemeInfo> subscribed;

    @SerializedName("others")
    @Expose
    public List<ThemeInfo> others;

    public class ThemeInfo{

        @SerializedName("color")
        @Expose
        public int color;

        @SerializedName("thumbnail")
        @Expose
        public String thumb;

        @SerializedName("description")
        @Expose
        public String description;

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("name")
        @Expose
        public String name;

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
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
    }


}
