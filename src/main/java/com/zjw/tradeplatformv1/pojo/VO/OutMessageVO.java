package com.zjw.tradeplatformv1.pojo.VO;

import java.time.LocalDateTime;

public class OutMessageVO {
    private String from;
    private LocalDateTime time = LocalDateTime.now();
    private String content;

    public OutMessageVO(String from, String content) {
        this.from = from;
        this.content = content;
    }

    public OutMessageVO(LocalDateTime time) {
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
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
