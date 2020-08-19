package com.zjw.tradeplatformv1.pojo.VO;

public class OneGoodsVO {
    private String goodsName;

    private Integer goodsPrice;

    private String goodsAmount;

    private Integer goodsAuthorId;

    private String goodsImage;

    private String goodsContent;

    public OneGoodsVO(String goodsName, Integer goodsPrice, String goodsAmount, Integer goodsAuthorId, String goodsImage, String goodsContent) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsAmount = goodsAmount;
        this.goodsAuthorId = goodsAuthorId;
        this.goodsImage = goodsImage;
        this.goodsContent = goodsContent;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(String goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getGoodsAuthorId() {
        return goodsAuthorId;
    }

    public void setGoodsAuthorId(Integer goodsAuthorId) {
        this.goodsAuthorId = goodsAuthorId;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }
}
