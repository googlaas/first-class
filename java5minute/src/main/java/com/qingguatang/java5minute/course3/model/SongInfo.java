package com.qingguatang.java5minute.course3.model;


public class SongInfo {

    private String id;
    //歌曲名称
    private String name;
    //歌手名称
    private String singer;
    //专辑名称
    private String albumName;
    //评论数
    private int commentCount;
    //歌词
    private String lvrics;
    //专辑图片
    private String albumImg;

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public String getLvrics() {
        return lvrics;
    }

    public String getAlbumImg() {
        return albumImg;
    }

    public String getId() { return id; }

    public void setId(String id) {this.id = id; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setLvrics(String lvrics) {
        this.lvrics = lvrics;
    }

    public void setAlbumImg(String albumImg) {
        this.albumImg = albumImg;
    }
}
