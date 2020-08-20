package com.zjw.tradeplatformv1.pojo.VO;

public class CommentVO {
    private Integer commentUserid;
    private String commentContext;

    private Integer commentLikes;

    private String commentImage;

    private String commentUsername;

    public CommentVO(Integer commentUserid, String commentContext, Integer commentLikes, String commentImage, String commentUsername) {
        this.commentUserid = commentUserid;
        this.commentContext = commentContext;
        this.commentLikes = commentLikes;
        this.commentImage = commentImage;
        this.commentUsername = commentUsername;
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
}
