package com.awcode.rvanimation;

public class NewsItem {

    String title, content, date;
    int userPhoto;

    public NewsItem() {
    }

    public NewsItem(String title, String content, String date, int userPhoto) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.userPhoto = userPhoto;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setUserPhoto(int userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public int getUserPhoto() {
        return userPhoto;
    }
}
