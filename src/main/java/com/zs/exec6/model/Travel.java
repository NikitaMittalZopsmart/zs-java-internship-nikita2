package com.zs.exec6.model;

import java.sql.Time;
import java.util.Date;

/**
 * This class is created for the Travelling hobby.
 */
public class Travel extends Hobby {
    private float distance;
    private String startingPoint;
    private String endPoint;
     public Travel(){}
    public Travel(Time startTime, Time endTime, String userId, java.sql.Date tickDate, float distance, String startingPoint, String endPoint) {
        super(startTime, endTime, userId, tickDate);
        this.distance = distance;
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    @Override
    public void setUserId(String userId) {
        super.setUserId(userId);
    }

    @Override
    public String getUserId() {
        return super.getUserId();
    }

    @Override
    public void setTickDate(java.sql.Date tickDate) {
        super.setTickDate(tickDate);
    }

    @Override
    public java.sql.Date getTickDate() {
        return super.getTickDate();
    }

    @Override
    public void setEndTime(Time endTime) {
        super.setEndTime(endTime);
    }

    @Override
    public void setStartTime(Time startTime) {
        super.setStartTime(startTime);
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    /**
     * @return Returning travelled distance.
     */
    public float getDistance() {
        return distance;
    }

    /**
     * @return Starting point of journey.
     */
    public String getStartingPoint() {
        return startingPoint;
    }

    /**
     * @return Returning end point of journey.
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * @return Returning the start time of journey.
     */
    public Date getStartTime() {
        return (super.getStartTime());
    }

    /**
     * @return Returning end time of journey.
     */
    public Date getEndTime() {
        return (super.getEndTime());
    }
}
