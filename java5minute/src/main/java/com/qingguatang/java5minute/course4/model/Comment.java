package com.qingguatang.java5minute.course4.model;


import java.util.Date;

public class Comment {
    //评论人头像
    private String icon;
    //评论人昵称
    private String nickName;
    //评论内容
    private String content;
    //评论时间
    private Date commentTime;
    //点赞数
    private int likeNum;

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getIcon() {
        return icon;
    }

    public String getNickName() {
        return nickName;
    }

    public String getContent() {
        return content;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }
}
