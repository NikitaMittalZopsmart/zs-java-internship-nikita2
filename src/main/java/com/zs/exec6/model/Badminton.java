package com.zs.exec6.model;



import java.sql.Time;
import java.util.Date;


public class Badminton extends Hobby {
    private int numberOfMove;
    @Result
    private String result;

   public Badminton(){}

    public Badminton(java.sql.Time startTime, Time endTime, String userId, java.sql.Date tickDate, int numberOfMove, String result) {
        super(startTime, endTime, userId, tickDate);
        this.numberOfMove = numberOfMove;
        this.result = result;
    }

    @Override
    public void setUserId(String userId) {
        super.setUserId(userId);
    }

    @Override
    public String getUserId() {
        return super.getUserId();
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public void setStartTime(Time startTime) {
        super.setStartTime(startTime);
    }


    @Override
    public void setEndTime(Time endTime) {
        super.setEndTime(endTime);
    }

    @Override
    public void setTickDate(java.sql.Date tickDate) {
        super.setTickDate(tickDate);
    }

    @Override
    public java.sql.Date getTickDate() {
        return super.getTickDate();
    }

    public void setNumberOfMove(int numberOfMove) {
        this.numberOfMove = numberOfMove;
    }

    /**
     * @return Returning the result value.
     */
    public String getResult() {
        return result;
    }

    /**
     * @return Returning number of moves.
     */
    public int getNumberOfMove() {
        return numberOfMove;
    }

    /**
     * @return Returning Start time.
     */
    public Date getStartTime() {
        return (super.getStartTime());
    }

    /**
     * @return Returning End time.
     */
    public Date getEndTime() {
        return (super.getEndTime());
    }

}
