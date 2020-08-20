package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.VO.InMessageVO;
import com.zjw.tradeplatformv1.pojo.VO.OutMessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
@CrossOrigin
public class WebSocketController {

    @Autowired
    SimpMessagingTemplate template;
    /**
     * @Description:这个方法是接收客户端发送功公告的WebSocket请求，使用的是@MessageMapping
     */
    @MessageMapping("/v2/chat")//客户端访问服务端的时候config中配置的服务端接收前缀也要加上 例：/app/v2/chat
    public void greeting(Message message){
        System.out.println("服务端接收到消息："+message.toString());

        template.convertAndSend("/topic/chat/",message.getPayload().toString());
        return;
    }

    public void send(InMessageVO message){
        template.convertAndSend("/topic/chat/"+message.getTo(),new OutMessageVO(message.getFrom(),message.getContent()));
    }

    @Scheduled(fixedRate = 10000)
    public void sendServerInfo(){
        template.convertAndSend("/topic/server_info","定时发送/..........");
    }
}
