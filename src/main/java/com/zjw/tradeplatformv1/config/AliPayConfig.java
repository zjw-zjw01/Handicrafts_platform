package com.zjw.tradeplatformv1.config;


import org.springframework.context.annotation.Configuration;

@Configuration
public class AliPayConfig {
    private static String neturl = "http://g5kike.natappfree.cc";

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号 按照我文章图上的信息填写
    public static String app_id = "2016102500760217";

    // 商户私钥，您的PKCS8格式RSA2私钥  刚刚生成的私钥直接复制填写
    public static String merchant_private_key ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC68xSta5sxqbFOzxElTsDATtrHS5UZhfJL2iXAjch14WHVvSiWPPd07F/d8JAov62T648U9rlUecIwoD3D9TpE6XGHac3VV2BNCIPvpIChxkx7cBLQXUvEOM/xoE3A8jvAqOSXPQP58txE2VQn4dJ77GJ4l1awWeOzQPVEZeLlV0i5JVjBFNbCHR5NeBMtvATkK4M68shKv4mzQpakJxEOqCWXvhWiKD9l2c1TzlNje0IwIjot6bbpFnSDdp8ZSHMFq7IWMpK8pj77gWQWs39lKG5jTqSyXj6t0ytjYJwBoK5OJtu0qIMX2/ORwExeFJ+FUa63pzoD0jfxMnqSmFN5AgMBAAECggEAFYLk7TOFjwhcm5nd+jH+oeIw8F+1D1PHVo0KbQaje1TswgBbDDaFrtGIEmyc2eN8YJnpQ9tD5gGAo8G8ebDc/JLz+kXlZlgAf7ysGcYO+w5rPITf1VP25OQ4oS/14m69C2UjsHdX3sngKJftRA2K/7Fqfz/CvNYLClQ+JJmoqwTWmJiZnyDCdbs7E1oxxqd8gdHJxRyv9TBhSTy2gsGKxWcp2s3mq+j47B27Pa4YWMtT26IYS8Usc77RLiIKJgiUxFIigEGiaP/eozR3hJkFUheygyvR48r8H2vXfPiDMcfpEnHlDuNGUhFaBMGdBL/ERVh69ON0mErP+QODMomUtQKBgQDtc9ZKJMP5ZWmSOBTCk8bTA6r+WUyx3pQICrKQjLvD6bN2NSx5JmcjN7zjeAb7XgRyZdje+w6C6BVs+oUzbhJa71UlfUifpcTSijd+ChJoLbUwMctBOLA7Vv7bIvzTEiAiKUsrGzu7OhammEC7G67iVrtJVOaCzlOvJB041oh5ewKBgQDJjV+MXMCz3H2/HwUbAMbRFN+WMrwD9YuHToh+9qhjsAINQGz3Kg3fI5nUQPcs4KRQP/N4iLpm7aUIlslI52A64xSPkkoZ1hCW3+u8qjJJuh1M9xPvn/FvpxVCNBnF8C1yxd+cVwMGwoWT6/c0+iFEBMW1fWv3NYOveTcyhjpymwKBgQCXul4ikG2dbhzQbv9s+eqhKYXY8wzb12L15IgHb7YHUMz46q9ZVp2u1k3fd/HWK1RiGQxEJ141bcFLGqWEoIAgFTBuPSjrwowLEIC3DA6I/TP68MZ1DZkmwccmFaxB3yIjUgmTKNq5HzwcBcvPA7hzLoKMMDD/QoIcttHpYMRiAwKBgDPasHNvRZDAsIVkWK7q0zvlj+SXpvGp0bz9AncPxKDpHo4EPkSUyD7ZbPFDyZP9M6kF2wDuxG5Iw8Xi7WRZStO7qoWJkJD3FwuKDp9adlerj3BGvRVQZBBiv0BqIRtgwICf0fjqFfg+QZmeAtrZY4eZZrhbzVQrq3aQzBeumwjzAoGAZFmxsCgEtdiextxmvu5D8X+amrIzAP5JTE100wESzd9YxeYTdB8dcBrfsXweiEvvb6Qw7NS+xTe2pgR9m24g8dy5fnoI0LWh+bV9A7iw8bUBo+Tnj3MQqCWOw4FjZWwqcDFCWQ2L2F5RdedDcMj5lLAE4HJ1cIkPw2XIG5oMBBc=";

    // 支付宝公钥,对应APPID下的支付宝公钥。 按照我文章图上的信息填写支付宝公钥，别填成商户公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuvMUrWubMamxTs8RJU7AwE7ax0uVGYXyS9olwI3IdeFh1b0oljz3dOxf3fCQKL+tk+uPFPa5VHnCMKA9w/U6ROlxh2nN1VdgTQiD76SAocZMe3AS0F1LxDjP8aBNwPI7wKjklz0D+fLcRNlUJ+HSe+xieJdWsFnjs0D1RGXi5VdIuSVYwRTWwh0eTXgTLbwE5CuDOvLISr+Js0KWpCcRDqgll74Voig/ZdnNU85TY3tCMCI6Lem26RZ0g3afGUhzBauyFjKSvKY++4FkFrN/ZShuY06ksl4+rdMrY2CcAaCuTibbtKiDF9vzkcBMXhSfhVGut6c6A9I38TJ6kphTeQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，其实就是你的一个支付完成后返回的页面URL
    public static String notify_url = neturl+"/alipay/notify_url";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，其实就是你的一个支付完成后返回的页面URL
    public static String return_url = neturl+"/alipay/return_url";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";
}
