package tech.societyguruapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tech.societyguruapp.Model.Post;
import tech.societyguruapp.Model.PostList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.postList);
        LinearLayoutManager itemLinearLayout =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(itemLinearLayout);
        getData();
    }

    private void getData() {
        Call<PostList> postList = GhostAPI.getService().getPostList();
        postList.enqueue(new Callback<PostList>() {
            @Override
            public void onResponse(final Call<PostList> call, final Response<PostList> response) {
                PostList list = response.body();
                mRecyclerView.setAdapter(new PostAdapter(MainActivity.this, list.getPosts()));
                //Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(final Call<PostList> call, final Throwable t) {
                mRecyclerView.setAdapter(new PostAdapter(MainActivity.this, new ArrayList<Post>()));
                //Toast.makeText(MainActivity.this, "Error occurred", Toast.LENGTH_SHORT).show();

            }
        });
    }


}
