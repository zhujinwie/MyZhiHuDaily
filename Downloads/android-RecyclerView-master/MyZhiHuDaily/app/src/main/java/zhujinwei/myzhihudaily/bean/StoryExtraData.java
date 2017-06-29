package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ZhuJinWei on 2017/6/20.
 */

public class StoryExtraData {

    @SerializedName("long_comments")
    @Expose
    public int lComments;

    @SerializedName("popularity")
    @Expose
    public int popu;

    @SerializedName("short_comments")
    @Expose
    public int sComments;

    @SerializedName("comments")
    @Expose
    public int comments;

    public int getlComments() {
        return lComments;
    }

    public void setlComments(int lComments) {
        this.lComments = lComments;
    }

    public int getPopu() {
        return popu;
    }

    public void setPopu(int popu) {
        this.popu = popu;
    }

    public int getsComments() {
        return sComments;
    }

    public void setsComments(int sComments) {
        this.sComments = sComments;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
}
