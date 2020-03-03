package com.programlanguageranking.demo.entity;

public class Video {
    private int videoId;    //视频id
    private String up_name; //视频上传者
    private String time;    //视频上传时间
    private String so_icon;     //视频播放量
    private String des;     //视频描述
    private String col3;    //课程类型
    private String tag;     //视频播放时间标签
    private String title_link;  //视频标题url；
    private String title;   //视频标题
    private String score;   //视频评分
    private String videoImage;  //视频图片

    public int getVideoId() {
        return videoId;
    }
    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
    public String getUp_name() {
        return up_name;
    }
    public void setUp_name(String up_name) {
        this.up_name = up_name;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getSo_icon() {
        return so_icon;
    }
    public void setSo_icon(String so_icon) {
        this.so_icon = so_icon;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public String getCol3() {
        return col3;
    }
    public void setCol3(String col3) {
        this.col3 = col3;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getTitle_link() {
        return title_link;
    }
    public void setTitle_link(String title_link) {
        this.title_link = title_link;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public String getVideoImage() {
        return videoImage;
    }
    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage;
    }
    public Video() {
    }
    public Video(int videoId, String up_name, String time, String so_icon, String des, String col3, String tag, String title_link, String title, String score,String videoImage) {
        this.videoId = videoId;
        this.up_name = up_name;
        this.time = time;
        this.so_icon = so_icon;
        this.des = des;
        this.col3 = col3;
        this.tag = tag;
        this.title_link = title_link;
        this.title = title;
        this.score = score;
        this.videoImage=videoImage;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", up_name='" + up_name + '\'' +
                ", time='" + time + '\'' +
                ", so_icon='" + so_icon + '\'' +
                ", des='" + des + '\'' +
                ", col3='" + col3 + '\'' +
                ", tag='" + tag + '\'' +
                ", title_link='" + title_link + '\'' +
                ", title='" + title + '\'' +
                ", videoImage='" + videoImage + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
