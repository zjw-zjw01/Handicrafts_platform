package com.zjw.tradeplatformv1.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * order1
 * @author 
 */
public class Order1 implements Serializable {
    private Integer order1Id;

    private Integer order1HomeUserId;

    private Integer order1HomeAmount;

    private Integer order1PriceOne;

    private Integer order1PriceSum;

    private Integer order1BuyUserId;

    private Integer order1GoodsId;

    /**
     * 1买家已支付未发货,2 已发货未收货,3已收货
     */
    private Integer order1State;

    private Integer order1Version;

    private Date order1CreateTime;

    private Date order1UpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getOrder1Id() {
        return order1Id;
    }

    public void setOrder1Id(Integer order1Id) {
        this.order1Id = order1Id;
    }

    public Integer getOrder1HomeUserId() {
        return order1HomeUserId;
    }

    public void setOrder1HomeUserId(Integer order1HomeUserId) {
        this.order1HomeUserId = order1HomeUserId;
    }

    public Integer getOrder1HomeAmount() {
        return order1HomeAmount;
    }

    public void setOrder1HomeAmount(Integer order1HomeAmount) {
        this.order1HomeAmount = order1HomeAmount;
    }

    public Integer getOrder1PriceOne() {
        return order1PriceOne;
    }

    public void setOrder1PriceOne(Integer order1PriceOne) {
        this.order1PriceOne = order1PriceOne;
    }

    public Integer getOrder1PriceSum() {
        return order1PriceSum;
    }

    public void setOrder1PriceSum(Integer order1PriceSum) {
        this.order1PriceSum = order1PriceSum;
    }

    public Integer getOrder1BuyUserId() {
        return order1BuyUserId;
    }

    public void setOrder1BuyUserId(Integer order1BuyUserId) {
        this.order1BuyUserId = order1BuyUserId;
    }

    public Integer getOrder1GoodsId() {
        return order1GoodsId;
    }

    public void setOrder1GoodsId(Integer order1GoodsId) {
        this.order1GoodsId = order1GoodsId;
    }

    public Integer getOrder1State() {
        return order1State;
    }

    public void setOrder1State(Integer order1State) {
        this.order1State = order1State;
    }

    public Integer getOrder1Version() {
        return order1Version;
    }

    public void setOrder1Version(Integer order1Version) {
        this.order1Version = order1Version;
    }

    public Date getOrder1CreateTime() {
        return order1CreateTime;
    }

    public void setOrder1CreateTime(Date order1CreateTime) {
        this.order1CreateTime = order1CreateTime;
    }

    public Date getOrder1UpdateTime() {
        return order1UpdateTime;
    }

    public void setOrder1UpdateTime(Date order1UpdateTime) {
        this.order1UpdateTime = order1UpdateTime;
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
        Order1 other = (Order1) that;
        return (this.getOrder1Id() == null ? other.getOrder1Id() == null : this.getOrder1Id().equals(other.getOrder1Id()))
            && (this.getOrder1HomeUserId() == null ? other.getOrder1HomeUserId() == null : this.getOrder1HomeUserId().equals(other.getOrder1HomeUserId()))
            && (this.getOrder1HomeAmount() == null ? other.getOrder1HomeAmount() == null : this.getOrder1HomeAmount().equals(other.getOrder1HomeAmount()))
            && (this.getOrder1PriceOne() == null ? other.getOrder1PriceOne() == null : this.getOrder1PriceOne().equals(other.getOrder1PriceOne()))
            && (this.getOrder1PriceSum() == null ? other.getOrder1PriceSum() == null : this.getOrder1PriceSum().equals(other.getOrder1PriceSum()))
            && (this.getOrder1BuyUserId() == null ? other.getOrder1BuyUserId() == null : this.getOrder1BuyUserId().equals(other.getOrder1BuyUserId()))
            && (this.getOrder1GoodsId() == null ? other.getOrder1GoodsId() == null : this.getOrder1GoodsId().equals(other.getOrder1GoodsId()))
            && (this.getOrder1State() == null ? other.getOrder1State() == null : this.getOrder1State().equals(other.getOrder1State()))
            && (this.getOrder1Version() == null ? other.getOrder1Version() == null : this.getOrder1Version().equals(other.getOrder1Version()))
            && (this.getOrder1CreateTime() == null ? other.getOrder1CreateTime() == null : this.getOrder1CreateTime().equals(other.getOrder1CreateTime()))
            && (this.getOrder1UpdateTime() == null ? other.getOrder1UpdateTime() == null : this.getOrder1UpdateTime().equals(other.getOrder1UpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrder1Id() == null) ? 0 : getOrder1Id().hashCode());
        result = prime * result + ((getOrder1HomeUserId() == null) ? 0 : getOrder1HomeUserId().hashCode());
        result = prime * result + ((getOrder1HomeAmount() == null) ? 0 : getOrder1HomeAmount().hashCode());
        result = prime * result + ((getOrder1PriceOne() == null) ? 0 : getOrder1PriceOne().hashCode());
        result = prime * result + ((getOrder1PriceSum() == null) ? 0 : getOrder1PriceSum().hashCode());
        result = prime * result + ((getOrder1BuyUserId() == null) ? 0 : getOrder1BuyUserId().hashCode());
        result = prime * result + ((getOrder1GoodsId() == null) ? 0 : getOrder1GoodsId().hashCode());
        result = prime * result + ((getOrder1State() == null) ? 0 : getOrder1State().hashCode());
        result = prime * result + ((getOrder1Version() == null) ? 0 : getOrder1Version().hashCode());
        result = prime * result + ((getOrder1CreateTime() == null) ? 0 : getOrder1CreateTime().hashCode());
        result = prime * result + ((getOrder1UpdateTime() == null) ? 0 : getOrder1UpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", order1Id=").append(order1Id);
        sb.append(", order1HomeUserId=").append(order1HomeUserId);
        sb.append(", order1HomeAmount=").append(order1HomeAmount);
        sb.append(", order1PriceOne=").append(order1PriceOne);
        sb.append(", order1PriceSum=").append(order1PriceSum);
        sb.append(", order1BuyUserId=").append(order1BuyUserId);
        sb.append(", order1GoodsId=").append(order1GoodsId);
        sb.append(", order1State=").append(order1State);
        sb.append(", order1Version=").append(order1Version);
        sb.append(", order1CreateTime=").append(order1CreateTime);
        sb.append(", order1UpdateTime=").append(order1UpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}