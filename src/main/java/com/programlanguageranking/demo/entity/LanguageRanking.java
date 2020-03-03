package com.programlanguageranking.demo.entity;


/**
 * 编程语言排行的实体类
 */
public class LanguageRanking {
    private int rankId;   //语言id
    private String  projectName; //项目名称
    private String owner; //所属者
    private int stars; //星标数量
    private int watchers; //浏览数量
    private String language;   //语言名
    private int forks; //分支
    private String icon;   //图标
    private String image;   //语言图片
    private String introduction;    //语言详细介绍
    private int adminId;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getRankId() {
        return rankId;
    }

    public void setRankId(int rankId) {
        this.rankId = rankId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public LanguageRanking(int rankId, String projectName, String owner, int stars, int watchers, String language, int forks, String icon, String image, String introduction,int adminId) {
        this.rankId = rankId;
        this.projectName = projectName;
        this.owner = owner;
        this.stars = stars;
        this.watchers = watchers;
        this.language = language;
        this.forks = forks;
        this.icon = icon;
        this.image = image;
        this.introduction = introduction;
        this.adminId=adminId;
    }

    public LanguageRanking() {
    }

    @Override
    public String toString() {
        return "LanguageRanking{" +
                "rankId=" + rankId +
                ", projectName='" + projectName + '\'' +
                ", owner='" + owner + '\'' +
                ", stars=" + stars +
                ", watchers=" + watchers +
                ", language='" + language + '\'' +
                ", forks=" + forks +
                ", icon='" + icon + '\'' +
                ", image='" + image + '\'' +
                ", adminId='" + adminId + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
