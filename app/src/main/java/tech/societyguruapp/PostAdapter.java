package tech.societyguruapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import tech.societyguruapp.Model.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ItemViewHolder>  {

    public static final String SOCIETYGURU_TECH = "http://societyguru.tech";
    private Context mContext;
    private List<Post> mPost;

    public PostAdapter(Context context, List<Post> mPost) {
        this.mContext = context;
        this.mPost = mPost;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        Context context = parent.getContext();
        View itemView = LayoutInflater.from(context).inflate(R.layout.post_item, parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, final int position) {
        Post item = mPost.get(position);
        holder.postTitle.setText(item.getTitle());

        Document document = Jsoup.parse(item.getHtml());
        holder.postDescription.setText(document.text());

        String urlImage = SOCIETYGURU_TECH + item.getFeatureImage();
        final String urlPostDetail = SOCIETYGURU_TECH + item.getUrl();

        Glide.with(mContext).load(urlImage ).into(holder.postImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("url", urlPostDetail);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPost.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView postImage;
        TextView postTitle;
        TextView postDescription;

        public ItemViewHolder(final View itemView) {
            super(itemView);
            postImage = itemView.findViewById(R.id.postImage);
            postTitle = itemView.findViewById(R.id.postTitle);
            postDescription = itemView.findViewById(R.id.postDescription);
        }


    }
}
