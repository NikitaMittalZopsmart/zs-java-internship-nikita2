package com.zs.exec6.model;

import java.sql.Time;
import java.util.Date;

/**
 * This is the parent class of all other hobbies class.
 */
public class Hobby {

    private Time startTime = null;
    private Time endTime = null;
    private String userId;
    private java.sql.Date tickDate;

    public Hobby(Time startTime,Time endTime, String userId, java.sql.Date tickDate)
    {
        this.startTime=startTime;
        this.endTime=endTime;
        this.userId=userId;
        this.tickDate=tickDate;
    }
    public void setTickDate(java.sql.Date tickDate) {
        this.tickDate = tickDate;
    }

    public java.sql.Date getTickDate() {
        return tickDate;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }


    public Hobby() {

    }






    /**
     * @return return start time.
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @return Returning end time.
     */
    public Date getEndTime() {
        return endTime;
    }

}
