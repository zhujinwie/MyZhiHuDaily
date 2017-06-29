package zhujinwei.myzhihudaily.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhuJinWei on 2017/6/20.
 */


    public class Story{

        @SerializedName("title")
        @Expose
        public String title;

        @SerializedName("ga_prefix")
        @Expose
        public String ga;

        public List<ImageUrl> imageUrls;

        @SerializedName("type")
        @Expose
        public int type;

        @SerializedName("id")
        @Expose
        public int id;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa() {
            return ga;
        }

        public void setGa(String ga) {
            this.ga = ga;
        }

        public List<ImageUrl> getImageUrls() {
            return imageUrls;
        }

        public void setImageUrls(List<ImageUrl> imageUrls) {
            this.imageUrls = imageUrls;
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

        public class ImageUrl{

            @SerializedName("images")
            @Expose
            public String imageUrls;

            public String getImageUrls() {
                return imageUrls;
            }

            public void setImageUrls(String imageUrls) {
                this.imageUrls = imageUrls;
            }
        }

    }

