package com.zjw.tradeplatformv1.service;

import com.alipay.api.AlipayApiException;

public interface AliPayService {
    String aliPay(Integer amount) throws AlipayApiException;
}
