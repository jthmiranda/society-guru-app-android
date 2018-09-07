package tech.societyguruapp;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    ProgressBar mProgressBar;
    Toolbar mToolbar;
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mProgressBar = findViewById(R.id.progressBar);
        mWebView = findViewById(R.id.detailView);

        mWebView.setVisibility(View.INVISIBLE);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(final WebView view, final String url, final Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                //Toast.makeText(DetailActivity.this, "Page Started Loading", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageFinished(final WebView view, final String url) {
                super.onPageFinished(view, url);
                mProgressBar.setVisibility(View.GONE);
                mWebView.setVisibility(View.VISIBLE);
//                Toast.makeText(DetailActivity.this, "Page Loaded", Toast.LENGTH_SHORT).show();
                String javascript = "javascript:(function() { document.getElementsByTagName('header')[0].hidden = true;document.getElementsByClassName('floating-header')[0].style.display = 'none';document.getElementsByTagName('aside')[0].hidden = true;document.getElementsByClassName('site-footer')[0].style.display = 'none';})()";
                mWebView.loadUrl(javascript);
            }
        });
        mWebView.loadUrl(getIntent().getStringExtra("url"));
    }
}
