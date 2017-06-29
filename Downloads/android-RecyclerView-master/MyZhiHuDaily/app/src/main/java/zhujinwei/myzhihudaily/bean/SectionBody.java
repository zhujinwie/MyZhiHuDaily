package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/21.
 */

public class SectionBody {

    @SerializedName("timestamp")
    @Expose
    public int timeStamp;

    @SerializedName("stories")
    @Expose
    public List<SectionStory> stories;

    @SerializedName("name")
    @Expose
    public String name;

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<SectionStory> getStories() {
        return stories;
    }

    public void setStories(List<SectionStory> stories) {
        this.stories = stories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class SectionStory{

        @SerializedName("images")
        @Expose
        public String images;

        @SerializedName("date")
        @Expose
        public String date;

        @SerializedName("display_date")
        @Expose
        public String displayDate;

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("title")
        @Expose
        public String title;

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDisplayDate() {
            return displayDate;
        }

        public void setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
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

}
