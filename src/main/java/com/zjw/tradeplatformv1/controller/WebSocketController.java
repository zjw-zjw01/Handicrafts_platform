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
     * @Date: 2019/5/31
     */
    @MessageMapping("/transfer")//客户端访问服务端的时候config中配置的服务端接收前缀也要加上 例：/app/change-notice
    public void greeting(Message message){
        System.out.println("服务端接收到消息："+message.toString());

        send(message.getHeaders().toString(),message.getPayload().toString());
        return;
    }

    /**
     * 转发给指定用户
     * @param name
     * @param context
     */
    public void send(String name,String context){
        template.convertAndSendToUser(name,"/topic/message",context);
    }
}
