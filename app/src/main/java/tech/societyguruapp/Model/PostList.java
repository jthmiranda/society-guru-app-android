
package tech.societyguruapp.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostList {

    @SerializedName("posts")
    @Expose
    private List<Post> posts = null;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
