package com.zjw.tradeplatformv1.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * order
 * @author 
 */
public class Order implements Serializable {
    private Integer orderNumber;

    private String orderName;

    private Integer orderHomeUserid;

    private String orderHomeAmount;

    private Integer orderPriceOne;

    private Integer orderPriceSum;

    private String orderHomeType;

    private Integer orderBuyUserid;

    private Integer orderGoodsId;

    private String orderState;

    private Integer version;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderHomeUserid() {
        return orderHomeUserid;
    }

    public void setOrderHomeUserid(Integer orderHomeUserid) {
        this.orderHomeUserid = orderHomeUserid;
    }

    public String getOrderHomeAmount() {
        return orderHomeAmount;
    }

    public void setOrderHomeAmount(String orderHomeAmount) {
        this.orderHomeAmount = orderHomeAmount;
    }

    public Integer getOrderPriceOne() {
        return orderPriceOne;
    }

    public void setOrderPriceOne(Integer orderPriceOne) {
        this.orderPriceOne = orderPriceOne;
    }

    public Integer getOrderPriceSum() {
        return orderPriceSum;
    }

    public void setOrderPriceSum(Integer orderPriceSum) {
        this.orderPriceSum = orderPriceSum;
    }

    public String getOrderHomeType() {
        return orderHomeType;
    }

    public void setOrderHomeType(String orderHomeType) {
        this.orderHomeType = orderHomeType;
    }

    public Integer getOrderBuyUserid() {
        return orderBuyUserid;
    }

    public void setOrderBuyUserid(Integer orderBuyUserid) {
        this.orderBuyUserid = orderBuyUserid;
    }

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        Order other = (Order) that;
        return (this.getOrderNumber() == null ? other.getOrderNumber() == null : this.getOrderNumber().equals(other.getOrderNumber()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getOrderHomeUserid() == null ? other.getOrderHomeUserid() == null : this.getOrderHomeUserid().equals(other.getOrderHomeUserid()))
            && (this.getOrderHomeAmount() == null ? other.getOrderHomeAmount() == null : this.getOrderHomeAmount().equals(other.getOrderHomeAmount()))
            && (this.getOrderPriceOne() == null ? other.getOrderPriceOne() == null : this.getOrderPriceOne().equals(other.getOrderPriceOne()))
            && (this.getOrderPriceSum() == null ? other.getOrderPriceSum() == null : this.getOrderPriceSum().equals(other.getOrderPriceSum()))
            && (this.getOrderHomeType() == null ? other.getOrderHomeType() == null : this.getOrderHomeType().equals(other.getOrderHomeType()))
            && (this.getOrderBuyUserid() == null ? other.getOrderBuyUserid() == null : this.getOrderBuyUserid().equals(other.getOrderBuyUserid()))
            && (this.getOrderGoodsId() == null ? other.getOrderGoodsId() == null : this.getOrderGoodsId().equals(other.getOrderGoodsId()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderNumber() == null) ? 0 : getOrderNumber().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getOrderHomeUserid() == null) ? 0 : getOrderHomeUserid().hashCode());
        result = prime * result + ((getOrderHomeAmount() == null) ? 0 : getOrderHomeAmount().hashCode());
        result = prime * result + ((getOrderPriceOne() == null) ? 0 : getOrderPriceOne().hashCode());
        result = prime * result + ((getOrderPriceSum() == null) ? 0 : getOrderPriceSum().hashCode());
        result = prime * result + ((getOrderHomeType() == null) ? 0 : getOrderHomeType().hashCode());
        result = prime * result + ((getOrderBuyUserid() == null) ? 0 : getOrderBuyUserid().hashCode());
        result = prime * result + ((getOrderGoodsId() == null) ? 0 : getOrderGoodsId().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderHomeUserid=").append(orderHomeUserid);
        sb.append(", orderHomeAmount=").append(orderHomeAmount);
        sb.append(", orderPriceOne=").append(orderPriceOne);
        sb.append(", orderPriceSum=").append(orderPriceSum);
        sb.append(", orderHomeType=").append(orderHomeType);
        sb.append(", orderBuyUserid=").append(orderBuyUserid);
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", orderState=").append(orderState);
        sb.append(", version=").append(version);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}