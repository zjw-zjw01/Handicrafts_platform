package com.zjw.tradeplatformv1.pojo.VO;

public class Order1VO {

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

    private String goodsName;

    public Order1VO() {
    }

    public Order1VO(Integer order1Id, Integer order1HomeUserId, Integer order1HomeAmount, Integer order1PriceOne, Integer order1PriceSum, Integer order1BuyUserId, Integer order1GoodsId, Integer order1State, String goodsName) {
        this.order1Id = order1Id;
        this.order1HomeUserId = order1HomeUserId;
        this.order1HomeAmount = order1HomeAmount;
        this.order1PriceOne = order1PriceOne;
        this.order1PriceSum = order1PriceSum;
        this.order1BuyUserId = order1BuyUserId;
        this.order1GoodsId = order1GoodsId;
        this.order1State = order1State;
        this.goodsName = goodsName;
    }

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
