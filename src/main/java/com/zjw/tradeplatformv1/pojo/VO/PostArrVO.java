package com.zjw.tradeplatformv1.pojo.VO;

public class PostArrVO {
    /**
     * 标识码
     */
    private Integer postid;

    /**
     * 标题
     */
    private String postHead;

    /**
     * 类别
     */
    private String postClass;

    /**
     * 图片
     */
    private String postImage;

    /**
     * 点赞
     */
    private Integer postLikes;

    public PostArrVO(Integer postid, String postHead, String postClass, String postImage, Integer postLikes) {
        this.postid = postid;
        this.postHead = postHead;
        this.postClass = postClass;
        this.postImage = postImage;
        this.postLikes = postLikes;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostHead() {
        return postHead;
    }

    public void setPostHead(String postHead) {
        this.postHead = postHead;
    }

    public String getPostClass() {
        return postClass;
    }

    public void setPostClass(String postClass) {
        this.postClass = postClass;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public Integer getPostLikes() {
        return postLikes;
    }

    public void setPostLikes(Integer postLikes) {
        this.postLikes = postLikes;
    }
}
