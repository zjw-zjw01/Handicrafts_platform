package com.zjw.tradeplatformv1.controller;

import com.alipay.api.AlipayApiException;
import com.zjw.tradeplatformv1.service.AliPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.annotation.Resource;

@Controller
public class PayController {

    Logger logger = LoggerFactory.getLogger("PayController.class");

    @Resource
    AliPayService aliPayService;

    @RequestMapping(value = "alipay/toPay/{amount}", method = RequestMethod.GET)
    public String alipay(@PathVariable(value = "amount") Integer amount) throws AlipayApiException {
        return aliPayService.aliPay(amount);
    }

    @GetMapping("alipay/notify_url")
    public String notifyAlipay() {

        logger.info("----notify-----");
        return " a li pay notify ";
    }

    @GetMapping("alipay/return_url")
    public String returnAlipay() {
        logger.info("----return-----");
        return " a li pay return ";
    }

}
