
package tech.societyguruapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("html")
    @Expose
    private String html;
    @SerializedName("feature_image")
    @Expose
    private String featureImage;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("page")
    @Expose
    private Boolean page;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("locale")
    @Expose
    private Object locale;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("meta_title")
    @Expose
    private Object metaTitle;
    @SerializedName("meta_description")
    @Expose
    private Object metaDescription;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("updated_by")
    @Expose
    private String updatedBy;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("published_by")
    @Expose
    private String publishedBy;
    @SerializedName("custom_excerpt")
    @Expose
    private Object customExcerpt;
    @SerializedName("codeinjection_head")
    @Expose
    private String codeinjectionHead;
    @SerializedName("codeinjection_foot")
    @Expose
    private String codeinjectionFoot;
    @SerializedName("og_image")
    @Expose
    private Object ogImage;
    @SerializedName("og_title")
    @Expose
    private Object ogTitle;
    @SerializedName("og_description")
    @Expose
    private Object ogDescription;
    @SerializedName("twitter_image")
    @Expose
    private Object twitterImage;
    @SerializedName("twitter_title")
    @Expose
    private Object twitterTitle;
    @SerializedName("twitter_description")
    @Expose
    private Object twitterDescription;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("primary_tag")
    @Expose
    private Object primaryTag;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("comment_id")
    @Expose
    private String commentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getFeatureImage() {
        return featureImage;
    }

    public void setFeatureImage(String featureImage) {
        this.featureImage = featureImage;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Boolean getPage() {
        return page;
    }

    public void setPage(Boolean page) {
        this.page = page;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getLocale() {
        return locale;
    }

    public void setLocale(Object locale) {
        this.locale = locale;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Object getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(Object metaTitle) {
        this.metaTitle = metaTitle;
    }

    public Object getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(Object metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    public Object getCustomExcerpt() {
        return customExcerpt;
    }

    public void setCustomExcerpt(Object customExcerpt) {
        this.customExcerpt = customExcerpt;
    }

    public String getCodeinjectionHead() {
        return codeinjectionHead;
    }

    public void setCodeinjectionHead(String codeinjectionHead) {
        this.codeinjectionHead = codeinjectionHead;
    }

    public String getCodeinjectionFoot() {
        return codeinjectionFoot;
    }

    public void setCodeinjectionFoot(String codeinjectionFoot) {
        this.codeinjectionFoot = codeinjectionFoot;
    }

    public Object getOgImage() {
        return ogImage;
    }

    public void setOgImage(Object ogImage) {
        this.ogImage = ogImage;
    }

    public Object getOgTitle() {
        return ogTitle;
    }

    public void setOgTitle(Object ogTitle) {
        this.ogTitle = ogTitle;
    }

    public Object getOgDescription() {
        return ogDescription;
    }

    public void setOgDescription(Object ogDescription) {
        this.ogDescription = ogDescription;
    }

    public Object getTwitterImage() {
        return twitterImage;
    }

    public void setTwitterImage(Object twitterImage) {
        this.twitterImage = twitterImage;
    }

    public Object getTwitterTitle() {
        return twitterTitle;
    }

    public void setTwitterTitle(Object twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    public Object getTwitterDescription() {
        return twitterDescription;
    }

    public void setTwitterDescription(Object twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Object getPrimaryTag() {
        return primaryTag;
    }

    public void setPrimaryTag(Object primaryTag) {
        this.primaryTag = primaryTag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

}
