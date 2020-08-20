package com.zjw.tradeplatformv1.pojo.VO;

import java.util.Date;

public class PostVO {
    /**
     * 标识码
     */
    private Integer postid;

    /**
     * 标题
     */
    private String postHead;

    /**
     * 内容
     */
    private String postContext;

    /**
     * 类别
     */
    private String postClass;

    /**
     * 图片
     */
    private String postImage;

    /**
     * 审核结果
     */
    private String postVerify;

    /**
     * 点赞
     */
    private Integer postLikes;

    /**
     * 作者
     */
    private String postAuthorid;


    public PostVO(Integer postid, String postHead, String postContext, String postClass, String postImage, String postVerify, Integer postLikes, String postAuthorid) {
        this.postid = postid;
        this.postHead = postHead;
        this.postContext = postContext;
        this.postClass = postClass;
        this.postImage = postImage;
        this.postVerify = postVerify;
        this.postLikes = postLikes;
        this.postAuthorid = postAuthorid;
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

    public String getPostContext() {
        return postContext;
    }

    public void setPostContext(String postContext) {
        this.postContext = postContext;
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

    public String getPostVerify() {
        return postVerify;
    }

    public void setPostVerify(String postVerify) {
        this.postVerify = postVerify;
    }

    public Integer getPostLikes() {
        return postLikes;
    }

    public void setPostLikes(Integer postLikes) {
        this.postLikes = postLikes;
    }

    public String getPostAuthorid() {
        return postAuthorid;
    }

    public void setPostAuthorid(String postAuthorid) {
        this.postAuthorid = postAuthorid;
    }

}
