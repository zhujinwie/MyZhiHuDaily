package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/20.
 */

public class HistoryData {

    @SerializedName("date")
    @Expose
    public String date;

    public List<Story> stories;


}
