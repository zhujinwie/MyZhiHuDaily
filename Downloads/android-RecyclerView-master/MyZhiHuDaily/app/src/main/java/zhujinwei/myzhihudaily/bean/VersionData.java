package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ZhuJinWei on 2017/6/20.
 */

public class VersionData {

    @SerializedName("msg")
    @Expose
    public String msg;

    @SerializedName("status")
    @Expose
    public int status;

    @SerializedName("latest")
    @Expose
    public String version;

    @Override
    public String toString() {
        return "VersionData{" +
                "msg='" + msg + '\'' +
                ", status=" + status +
                ", version='" + version + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
