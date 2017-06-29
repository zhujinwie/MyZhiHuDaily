package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.reactivex.disposables.Disposable;

/**
 * Created by ZhuJinWei on 2017/6/21.
 */

public class SectionsData implements Disposable {

    @SerializedName("data")
    @Expose
    private List<SectionData> sections;


    public List<SectionData> getSections() {
        return sections;
    }

    public void setSections(List<SectionData> sections) {
        this.sections = sections;
    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean isDisposed() {
        return false;
    }

    public class SectionData{

        @SerializedName("id")
        @Expose
        public int id;

        @SerializedName("thumbnail")
        @Expose
        public String thumb;

        @SerializedName("name")
        @Expose
        public String name;

        @SerializedName("description")
        @Expose
        public String desc;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

}
