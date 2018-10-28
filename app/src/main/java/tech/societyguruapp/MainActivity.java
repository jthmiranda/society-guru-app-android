package tech.societyguruapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.security.ProviderInstaller;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tech.societyguruapp.Model.Post;
import tech.societyguruapp.Model.PostList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.postList);
        LinearLayoutManager itemLinearLayout =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(itemLinearLayout);

        upgradeSecurityProvider();

//        try{
//            ProviderInstaller.installIfNeeded(this);
//        } catch (GooglePlayServicesRepairableException e) {
//            Log.d("PlayServicesRepairable", e.getLocalizedMessage());
//        } catch (GooglePlayServicesNotAvailableException e) {
//            e.printStackTrace();
//        }

        getData();

    }

    private void getData() {
        Call<PostList> postList = GhostAPI.getService(mContext).getPostList();
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

    private void upgradeSecurityProvider() {
        ProviderInstaller.installIfNeededAsync(this, new ProviderInstaller.ProviderInstallListener() {
            @Override
            public void onProviderInstalled() {

            }

            @Override
            public void onProviderInstallFailed(int errorCode, Intent recoveryIntent) {
                GoogleApiAvailability.getInstance().showErrorNotification(mContext, errorCode);
                //GooglePlayServicesUtil.showErrorNotification(errorCode, MainActivity.this);
            }
        });
    }



}
