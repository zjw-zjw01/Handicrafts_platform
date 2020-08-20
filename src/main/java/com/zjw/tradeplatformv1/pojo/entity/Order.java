package com.zjw.tradeplatformv1.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * order
 * @author 
 */
public class Order implements Serializable {
    private Integer orderId;

    private String orderName;

    private Integer orderHomeUserid;

    private String orderHomeAmount;

    private Integer orderPriceOne;

    private Integer orderPriceSum;

    private String orderO;

    private Integer orderBuyUserid;

    private Integer orderGoodsId;

    private String orderState;

    private Integer orderVersion;

    private Date orderCreateTime;

    private Date orderUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public String getOrderO() {
        return orderO;
    }

    public void setOrderO(String orderO) {
        this.orderO = orderO;
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

    public Integer getOrderVersion() {
        return orderVersion;
    }

    public void setOrderVersion(Integer orderVersion) {
        this.orderVersion = orderVersion;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderUpdateTime() {
        return orderUpdateTime;
    }

    public void setOrderUpdateTime(Date orderUpdateTime) {
        this.orderUpdateTime = orderUpdateTime;
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
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getOrderHomeUserid() == null ? other.getOrderHomeUserid() == null : this.getOrderHomeUserid().equals(other.getOrderHomeUserid()))
            && (this.getOrderHomeAmount() == null ? other.getOrderHomeAmount() == null : this.getOrderHomeAmount().equals(other.getOrderHomeAmount()))
            && (this.getOrderPriceOne() == null ? other.getOrderPriceOne() == null : this.getOrderPriceOne().equals(other.getOrderPriceOne()))
            && (this.getOrderPriceSum() == null ? other.getOrderPriceSum() == null : this.getOrderPriceSum().equals(other.getOrderPriceSum()))
            && (this.getOrderO() == null ? other.getOrderO() == null : this.getOrderO().equals(other.getOrderO()))
            && (this.getOrderBuyUserid() == null ? other.getOrderBuyUserid() == null : this.getOrderBuyUserid().equals(other.getOrderBuyUserid()))
            && (this.getOrderGoodsId() == null ? other.getOrderGoodsId() == null : this.getOrderGoodsId().equals(other.getOrderGoodsId()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getOrderVersion() == null ? other.getOrderVersion() == null : this.getOrderVersion().equals(other.getOrderVersion()))
            && (this.getOrderCreateTime() == null ? other.getOrderCreateTime() == null : this.getOrderCreateTime().equals(other.getOrderCreateTime()))
            && (this.getOrderUpdateTime() == null ? other.getOrderUpdateTime() == null : this.getOrderUpdateTime().equals(other.getOrderUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getOrderHomeUserid() == null) ? 0 : getOrderHomeUserid().hashCode());
        result = prime * result + ((getOrderHomeAmount() == null) ? 0 : getOrderHomeAmount().hashCode());
        result = prime * result + ((getOrderPriceOne() == null) ? 0 : getOrderPriceOne().hashCode());
        result = prime * result + ((getOrderPriceSum() == null) ? 0 : getOrderPriceSum().hashCode());
        result = prime * result + ((getOrderO() == null) ? 0 : getOrderO().hashCode());
        result = prime * result + ((getOrderBuyUserid() == null) ? 0 : getOrderBuyUserid().hashCode());
        result = prime * result + ((getOrderGoodsId() == null) ? 0 : getOrderGoodsId().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getOrderVersion() == null) ? 0 : getOrderVersion().hashCode());
        result = prime * result + ((getOrderCreateTime() == null) ? 0 : getOrderCreateTime().hashCode());
        result = prime * result + ((getOrderUpdateTime() == null) ? 0 : getOrderUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderHomeUserid=").append(orderHomeUserid);
        sb.append(", orderHomeAmount=").append(orderHomeAmount);
        sb.append(", orderPriceOne=").append(orderPriceOne);
        sb.append(", orderPriceSum=").append(orderPriceSum);
        sb.append(", orderO=").append(orderO);
        sb.append(", orderBuyUserid=").append(orderBuyUserid);
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderVersion=").append(orderVersion);
        sb.append(", orderCreateTime=").append(orderCreateTime);
        sb.append(", orderUpdateTime=").append(orderUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}