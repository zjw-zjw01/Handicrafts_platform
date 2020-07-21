package com.zjw.tradeplatformv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.Date;

@Controller
public class WebSocketController {

    @Autowired
    SimpMessagingTemplate template;
    /**
     * @Description:这个方法是接收客户端发送功公告的WebSocket请求，使用的是@MessageMapping
     * @Author:hui.yunfei@qq.com
     * @Date: 2019/5/31
     */
    @MessageMapping("/transfer")//客户端访问服务端的时候config中配置的服务端接收前缀也要加上 例：/app/change-notice
    public void greeting(Message message){
        System.out.println("服务端接收到消息："+message.toString());

        send(message.getHeaders().toString());

        //我们使用这个方法进行消息的转发发送！
        /*template.convertAndSend("/topic/notice", value);(可以使用定时器定时发送消息到客户端)
                @Scheduled(fixedDelay = 1000L)
                public void time() {
                    template.convertAndSend("/system/time", new Date().toString());
               }*/
        return;
    }

    public void send(String name){
        template.convertAndSendToUser(name,"/topic/message","bangbang");
    }
}
