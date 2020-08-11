package com.zjw.tradeplatformv1.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * post
 * @author 
 */
public class Post implements Serializable {
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
     * 视频
     */
    private String postVideo;

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

    /**
     * 版本
     */
    private Integer postVersion;

    /**
     * 创建时间
     */
    private Date postCreatetime;

    /**
     * 修改时间
     */
    private Date postUpdatetime;

    private static final long serialVersionUID = 1L;

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

    public String getPostVideo() {
        return postVideo;
    }

    public void setPostVideo(String postVideo) {
        this.postVideo = postVideo;
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

    public Integer getPostVersion() {
        return postVersion;
    }

    public void setPostVersion(Integer postVersion) {
        this.postVersion = postVersion;
    }

    public Date getPostCreatetime() {
        return postCreatetime;
    }

    public void setPostCreatetime(Date postCreatetime) {
        this.postCreatetime = postCreatetime;
    }

    public Date getPostUpdatetime() {
        return postUpdatetime;
    }

    public void setPostUpdatetime(Date postUpdatetime) {
        this.postUpdatetime = postUpdatetime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Post other = (Post) that;
        return (this.getPostid() == null ? other.getPostid() == null : this.getPostid().equals(other.getPostid()))
            && (this.getPostHead() == null ? other.getPostHead() == null : this.getPostHead().equals(other.getPostHead()))
            && (this.getPostContext() == null ? other.getPostContext() == null : this.getPostContext().equals(other.getPostContext()))
            && (this.getPostClass() == null ? other.getPostClass() == null : this.getPostClass().equals(other.getPostClass()))
            && (this.getPostImage() == null ? other.getPostImage() == null : this.getPostImage().equals(other.getPostImage()))
            && (this.getPostVideo() == null ? other.getPostVideo() == null : this.getPostVideo().equals(other.getPostVideo()))
            && (this.getPostVerify() == null ? other.getPostVerify() == null : this.getPostVerify().equals(other.getPostVerify()))
            && (this.getPostLikes() == null ? other.getPostLikes() == null : this.getPostLikes().equals(other.getPostLikes()))
            && (this.getPostAuthorid() == null ? other.getPostAuthorid() == null : this.getPostAuthorid().equals(other.getPostAuthorid()))
            && (this.getPostVersion() == null ? other.getPostVersion() == null : this.getPostVersion().equals(other.getPostVersion()))
            && (this.getPostCreatetime() == null ? other.getPostCreatetime() == null : this.getPostCreatetime().equals(other.getPostCreatetime()))
            && (this.getPostUpdatetime() == null ? other.getPostUpdatetime() == null : this.getPostUpdatetime().equals(other.getPostUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPostid() == null) ? 0 : getPostid().hashCode());
        result = prime * result + ((getPostHead() == null) ? 0 : getPostHead().hashCode());
        result = prime * result + ((getPostContext() == null) ? 0 : getPostContext().hashCode());
        result = prime * result + ((getPostClass() == null) ? 0 : getPostClass().hashCode());
        result = prime * result + ((getPostImage() == null) ? 0 : getPostImage().hashCode());
        result = prime * result + ((getPostVideo() == null) ? 0 : getPostVideo().hashCode());
        result = prime * result + ((getPostVerify() == null) ? 0 : getPostVerify().hashCode());
        result = prime * result + ((getPostLikes() == null) ? 0 : getPostLikes().hashCode());
        result = prime * result + ((getPostAuthorid() == null) ? 0 : getPostAuthorid().hashCode());
        result = prime * result + ((getPostVersion() == null) ? 0 : getPostVersion().hashCode());
        result = prime * result + ((getPostCreatetime() == null) ? 0 : getPostCreatetime().hashCode());
        result = prime * result + ((getPostUpdatetime() == null) ? 0 : getPostUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postid=").append(postid);
        sb.append(", postHead=").append(postHead);
        sb.append(", postContext=").append(postContext);
        sb.append(", postClass=").append(postClass);
        sb.append(", postImage=").append(postImage);
        sb.append(", postVideo=").append(postVideo);
        sb.append(", postVerify=").append(postVerify);
        sb.append(", postLikes=").append(postLikes);
        sb.append(", postAuthorid=").append(postAuthorid);
        sb.append(", postVersion=").append(postVersion);
        sb.append(", postCreatetime=").append(postCreatetime);
        sb.append(", postUpdatetime=").append(postUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}