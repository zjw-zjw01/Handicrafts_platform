package com.zjw.tradeplatformv1.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * goods
 * @author 
 */
public class Goods implements Serializable {
    private Integer goodsId;

    private String goodsName;

    /**
     * 11==花艺，22==纸艺，33==佩饰，44==刺绣，55==雕塑，66==旧物改造，77==小清新
     */
    private Integer goodsType;

    private Integer goodsPrice;

    private String goodsAmount;

    private Integer goodsAuthorId;

    private String goodsImage;

    private String goodsContent;

    private Integer goodsVersion;

    private Date goodsCreateTime;

    private Date goodsUpdateTime;

    private static final long serialVersionUID = 1L;

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

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
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

    public Integer getGoodsVersion() {
        return goodsVersion;
    }

    public void setGoodsVersion(Integer goodsVersion) {
        this.goodsVersion = goodsVersion;
    }

    public Date getGoodsCreateTime() {
        return goodsCreateTime;
    }

    public void setGoodsCreateTime(Date goodsCreateTime) {
        this.goodsCreateTime = goodsCreateTime;
    }

    public Date getGoodsUpdateTime() {
        return goodsUpdateTime;
    }

    public void setGoodsUpdateTime(Date goodsUpdateTime) {
        this.goodsUpdateTime = goodsUpdateTime;
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
        Goods other = (Goods) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsType() == null ? other.getGoodsType() == null : this.getGoodsType().equals(other.getGoodsType()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsAmount() == null ? other.getGoodsAmount() == null : this.getGoodsAmount().equals(other.getGoodsAmount()))
            && (this.getGoodsAuthorId() == null ? other.getGoodsAuthorId() == null : this.getGoodsAuthorId().equals(other.getGoodsAuthorId()))
            && (this.getGoodsImage() == null ? other.getGoodsImage() == null : this.getGoodsImage().equals(other.getGoodsImage()))
            && (this.getGoodsContent() == null ? other.getGoodsContent() == null : this.getGoodsContent().equals(other.getGoodsContent()))
            && (this.getGoodsVersion() == null ? other.getGoodsVersion() == null : this.getGoodsVersion().equals(other.getGoodsVersion()))
            && (this.getGoodsCreateTime() == null ? other.getGoodsCreateTime() == null : this.getGoodsCreateTime().equals(other.getGoodsCreateTime()))
            && (this.getGoodsUpdateTime() == null ? other.getGoodsUpdateTime() == null : this.getGoodsUpdateTime().equals(other.getGoodsUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsType() == null) ? 0 : getGoodsType().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsAmount() == null) ? 0 : getGoodsAmount().hashCode());
        result = prime * result + ((getGoodsAuthorId() == null) ? 0 : getGoodsAuthorId().hashCode());
        result = prime * result + ((getGoodsImage() == null) ? 0 : getGoodsImage().hashCode());
        result = prime * result + ((getGoodsContent() == null) ? 0 : getGoodsContent().hashCode());
        result = prime * result + ((getGoodsVersion() == null) ? 0 : getGoodsVersion().hashCode());
        result = prime * result + ((getGoodsCreateTime() == null) ? 0 : getGoodsCreateTime().hashCode());
        result = prime * result + ((getGoodsUpdateTime() == null) ? 0 : getGoodsUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsAmount=").append(goodsAmount);
        sb.append(", goodsAuthorId=").append(goodsAuthorId);
        sb.append(", goodsImage=").append(goodsImage);
        sb.append(", goodsContent=").append(goodsContent);
        sb.append(", goodsVersion=").append(goodsVersion);
        sb.append(", goodsCreateTime=").append(goodsCreateTime);
        sb.append(", goodsUpdateTime=").append(goodsUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}