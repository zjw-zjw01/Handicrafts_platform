package com.zjw.tradeplatformv1.pojo.VO;

public class SportArrVO {
    private Integer sportId;

    private String sportName;

    private String sportOther;

    public SportArrVO(Integer sportId, String sportName, String sportOther) {
        this.sportId = sportId;
        this.sportName = sportName;
        this.sportOther = sportOther;
    }

    public Integer getSportId() {
        return sportId;
    }

    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getSportOther() {
        return sportOther;
    }

    public void setSportOther(String sportOther) {
        this.sportOther = sportOther;
    }
}
