package com.zjw.tradeplatformv1.pojo.VO;

public class GoodsVO {
    private Integer goodsId;
    private String goodsName;
    private String goodsImage;

    public GoodsVO(Integer goodsId, String goodsName, String goodsImage) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsImage = goodsImage;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }
}
