package tech.societyguruapp;

import android.content.Context;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import tech.societyguruapp.Model.Post;
import tech.societyguruapp.Model.PostList;

public class GhostAPI {

    private static final String key = "?client_id=ghost-frontend&client_secret=4518bb8b3bcd";
    private static final String url = "https://societyguru.tech/ghost/api/v0.1/posts/";

    public static PostService postService = null;


    public static PostService getService(Context context) {
        if (postService == null) {
            OkHttpClient client = new OkHttpClient();
            try {
                 client = new OkHttpClient.Builder()
                        .sslSocketFactory(new TLSSocketFactory())
                        .build();
            } catch (Exception e) {
                //Log.d("Excepcion CERT", e.getLocalizedMessage());
            }

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
            postService = retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService {

        @GET("" + key)
        Call<PostList> getPostList();

        @GET("{postId}" + key)
        Call<Post> getPostById(@Path("postId") String id);

    }
}
