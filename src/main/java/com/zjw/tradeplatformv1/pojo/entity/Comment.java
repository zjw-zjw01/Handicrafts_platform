package com.zjw.tradeplatformv1.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * comment
 * @author 
 */
public class Comment implements Serializable {
    private Integer commentId;

    private Integer commentPostid;

    private Integer commentUserid;

    private String commentContext;

    private Integer commentLikes;

    private String commentImage;

    private String commentUsername;

    private String commentVersion;

    private Date commentCreatetime;

    private Date commentUpdatetime;

    private static final long serialVersionUID = 1L;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentPostid() {
        return commentPostid;
    }

    public void setCommentPostid(Integer commentPostid) {
        this.commentPostid = commentPostid;
    }

    public Integer getCommentUserid() {
        return commentUserid;
    }

    public void setCommentUserid(Integer commentUserid) {
        this.commentUserid = commentUserid;
    }

    public String getCommentContext() {
        return commentContext;
    }

    public void setCommentContext(String commentContext) {
        this.commentContext = commentContext;
    }

    public Integer getCommentLikes() {
        return commentLikes;
    }

    public void setCommentLikes(Integer commentLikes) {
        this.commentLikes = commentLikes;
    }

    public String getCommentImage() {
        return commentImage;
    }

    public void setCommentImage(String commentImage) {
        this.commentImage = commentImage;
    }

    public String getCommentUsername() {
        return commentUsername;
    }

    public void setCommentUsername(String commentUsername) {
        this.commentUsername = commentUsername;
    }

    public String getCommentVersion() {
        return commentVersion;
    }

    public void setCommentVersion(String commentVersion) {
        this.commentVersion = commentVersion;
    }

    public Date getCommentCreatetime() {
        return commentCreatetime;
    }

    public void setCommentCreatetime(Date commentCreatetime) {
        this.commentCreatetime = commentCreatetime;
    }

    public Date getCommentUpdatetime() {
        return commentUpdatetime;
    }

    public void setCommentUpdatetime(Date commentUpdatetime) {
        this.commentUpdatetime = commentUpdatetime;
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
        Comment other = (Comment) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getCommentPostid() == null ? other.getCommentPostid() == null : this.getCommentPostid().equals(other.getCommentPostid()))
            && (this.getCommentUserid() == null ? other.getCommentUserid() == null : this.getCommentUserid().equals(other.getCommentUserid()))
            && (this.getCommentContext() == null ? other.getCommentContext() == null : this.getCommentContext().equals(other.getCommentContext()))
            && (this.getCommentLikes() == null ? other.getCommentLikes() == null : this.getCommentLikes().equals(other.getCommentLikes()))
            && (this.getCommentImage() == null ? other.getCommentImage() == null : this.getCommentImage().equals(other.getCommentImage()))
            && (this.getCommentUsername() == null ? other.getCommentUsername() == null : this.getCommentUsername().equals(other.getCommentUsername()))
            && (this.getCommentVersion() == null ? other.getCommentVersion() == null : this.getCommentVersion().equals(other.getCommentVersion()))
            && (this.getCommentCreatetime() == null ? other.getCommentCreatetime() == null : this.getCommentCreatetime().equals(other.getCommentCreatetime()))
            && (this.getCommentUpdatetime() == null ? other.getCommentUpdatetime() == null : this.getCommentUpdatetime().equals(other.getCommentUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getCommentPostid() == null) ? 0 : getCommentPostid().hashCode());
        result = prime * result + ((getCommentUserid() == null) ? 0 : getCommentUserid().hashCode());
        result = prime * result + ((getCommentContext() == null) ? 0 : getCommentContext().hashCode());
        result = prime * result + ((getCommentLikes() == null) ? 0 : getCommentLikes().hashCode());
        result = prime * result + ((getCommentImage() == null) ? 0 : getCommentImage().hashCode());
        result = prime * result + ((getCommentUsername() == null) ? 0 : getCommentUsername().hashCode());
        result = prime * result + ((getCommentVersion() == null) ? 0 : getCommentVersion().hashCode());
        result = prime * result + ((getCommentCreatetime() == null) ? 0 : getCommentCreatetime().hashCode());
        result = prime * result + ((getCommentUpdatetime() == null) ? 0 : getCommentUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", commentPostid=").append(commentPostid);
        sb.append(", commentUserid=").append(commentUserid);
        sb.append(", commentContext=").append(commentContext);
        sb.append(", commentLikes=").append(commentLikes);
        sb.append(", commentImage=").append(commentImage);
        sb.append(", commentUsername=").append(commentUsername);
        sb.append(", commentVersion=").append(commentVersion);
        sb.append(", commentCreatetime=").append(commentCreatetime);
        sb.append(", commentUpdatetime=").append(commentUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}