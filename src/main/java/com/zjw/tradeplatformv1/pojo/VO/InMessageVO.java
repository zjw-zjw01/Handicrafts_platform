package com.zjw.tradeplatformv1.pojo.VO;

import java.time.LocalDateTime;

public class InMessageVO {
    private String from;
    private String to;
    private LocalDateTime time = LocalDateTime.now();
    private String content;

    public InMessageVO(String from, String to, LocalDateTime time, String content) {
        this.from = from;
        this.to = to;
        this.time = time;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
