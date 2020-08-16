package com.zjw.tradeplatformv1.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * sport
 * @author 
 */
public class Sport implements Serializable {
    private Integer sportId;

    private String sportName;

    private Integer sportAuthor;

    private String sportIntroduceBased;

    private String sportContext;

    private String sportAttendWay;

    private String sportConversationNumber;

    private String sportOther;

    private String sportVersion;

    private Date sportCreateTime;

    private Date sportUpdateTime;

    private static final long serialVersionUID = 1L;

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

    public Integer getSportAuthor() {
        return sportAuthor;
    }

    public void setSportAuthor(Integer sportAuthor) {
        this.sportAuthor = sportAuthor;
    }

    public String getSportIntroduceBased() {
        return sportIntroduceBased;
    }

    public void setSportIntroduceBased(String sportIntroduceBased) {
        this.sportIntroduceBased = sportIntroduceBased;
    }

    public String getSportContext() {
        return sportContext;
    }

    public void setSportContext(String sportContext) {
        this.sportContext = sportContext;
    }

    public String getSportAttendWay() {
        return sportAttendWay;
    }

    public void setSportAttendWay(String sportAttendWay) {
        this.sportAttendWay = sportAttendWay;
    }

    public String getSportConversationNumber() {
        return sportConversationNumber;
    }

    public void setSportConversationNumber(String sportConversationNumber) {
        this.sportConversationNumber = sportConversationNumber;
    }

    public String getSportOther() {
        return sportOther;
    }

    public void setSportOther(String sportOther) {
        this.sportOther = sportOther;
    }

    public String getSportVersion() {
        return sportVersion;
    }

    public void setSportVersion(String sportVersion) {
        this.sportVersion = sportVersion;
    }

    public Date getSportCreateTime() {
        return sportCreateTime;
    }

    public void setSportCreateTime(Date sportCreateTime) {
        this.sportCreateTime = sportCreateTime;
    }

    public Date getSportUpdateTime() {
        return sportUpdateTime;
    }

    public void setSportUpdateTime(Date sportUpdateTime) {
        this.sportUpdateTime = sportUpdateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Sport other = (Sport) that;
        return (this.getSportId() == null ? other.getSportId() == null : this.getSportId().equals(other.getSportId()))
            && (this.getSportName() == null ? other.getSportName() == null : this.getSportName().equals(other.getSportName()))
            && (this.getSportAuthor() == null ? other.getSportAuthor() == null : this.getSportAuthor().equals(other.getSportAuthor()))
            && (this.getSportIntroduceBased() == null ? other.getSportIntroduceBased() == null : this.getSportIntroduceBased().equals(other.getSportIntroduceBased()))
            && (this.getSportContext() == null ? other.getSportContext() == null : this.getSportContext().equals(other.getSportContext()))
            && (this.getSportAttendWay() == null ? other.getSportAttendWay() == null : this.getSportAttendWay().equals(other.getSportAttendWay()))
            && (this.getSportConversationNumber() == null ? other.getSportConversationNumber() == null : this.getSportConversationNumber().equals(other.getSportConversationNumber()))
            && (this.getSportOther() == null ? other.getSportOther() == null : this.getSportOther().equals(other.getSportOther()))
            && (this.getSportVersion() == null ? other.getSportVersion() == null : this.getSportVersion().equals(other.getSportVersion()))
            && (this.getSportCreateTime() == null ? other.getSportCreateTime() == null : this.getSportCreateTime().equals(other.getSportCreateTime()))
            && (this.getSportUpdateTime() == null ? other.getSportUpdateTime() == null : this.getSportUpdateTime().equals(other.getSportUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSportId() == null) ? 0 : getSportId().hashCode());
        result = prime * result + ((getSportName() == null) ? 0 : getSportName().hashCode());
        result = prime * result + ((getSportAuthor() == null) ? 0 : getSportAuthor().hashCode());
        result = prime * result + ((getSportIntroduceBased() == null) ? 0 : getSportIntroduceBased().hashCode());
        result = prime * result + ((getSportContext() == null) ? 0 : getSportContext().hashCode());
        result = prime * result + ((getSportAttendWay() == null) ? 0 : getSportAttendWay().hashCode());
        result = prime * result + ((getSportConversationNumber() == null) ? 0 : getSportConversationNumber().hashCode());
        result = prime * result + ((getSportOther() == null) ? 0 : getSportOther().hashCode());
        result = prime * result + ((getSportVersion() == null) ? 0 : getSportVersion().hashCode());
        result = prime * result + ((getSportCreateTime() == null) ? 0 : getSportCreateTime().hashCode());
        result = prime * result + ((getSportUpdateTime() == null) ? 0 : getSportUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sportId=").append(sportId);
        sb.append(", sportName=").append(sportName);
        sb.append(", sportAuthor=").append(sportAuthor);
        sb.append(", sportIntroduceBased=").append(sportIntroduceBased);
        sb.append(", sportContext=").append(sportContext);
        sb.append(", sportAttendWay=").append(sportAttendWay);
        sb.append(", sportConversationNumber=").append(sportConversationNumber);
        sb.append(", sportOther=").append(sportOther);
        sb.append(", sportVersion=").append(sportVersion);
        sb.append(", sportCreateTime=").append(sportCreateTime);
        sb.append(", sportUpdateTime=").append(sportUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}