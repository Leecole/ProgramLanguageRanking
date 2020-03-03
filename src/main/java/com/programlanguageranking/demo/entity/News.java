package com.programlanguageranking.demo.entity;

public class News {
    private int newId;
    private String newsName;
    private String newsAuthor;
    private String newsDesc;
    private String pushDate;
    private int watch;

    public int getWatch() {
        return watch;
    }

    public void setWatch(int watch) {
        this.watch = watch;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public String getPushDate() {
        return pushDate;
    }

    public void setPushDate(String pushDate) {
        this.pushDate = pushDate;
    }

    public News(int newId, String newsName, String newsAuthor, String newsDesc, String pushDate,int watch) {
        this.newId = newId;
        this.newsName = newsName;
        this.newsAuthor = newsAuthor;
        this.newsDesc = newsDesc;
        this.pushDate = pushDate;
        this.watch=watch;
    }

    public News() {
    }

    @Override
    public String toString() {
        return "News{" +
                "newId=" + newId +
                ", newsName='" + newsName + '\'' +
                ", newsAuthor='" + newsAuthor + '\'' +
                ", newsDesc='" + newsDesc + '\'' +
                ", watch='" + watch + '\'' +
                ", pushDate='" + pushDate + '\'' +
                '}';
    }
}
