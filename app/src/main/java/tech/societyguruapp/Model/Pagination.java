
package tech.societyguruapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("next")
    @Expose
    private Integer next;
    @SerializedName("prev")
    @Expose
    private Object prev;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public Object getPrev() {
        return prev;
    }

    public void setPrev(Object prev) {
        this.prev = prev;
    }

}
