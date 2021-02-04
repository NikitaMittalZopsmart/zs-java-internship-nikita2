package com.zs.exec6.dao;

import com.zs.exec6.model.Travel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public interface TravelDaoInterface {
    public void create(Travel travelObject) throws SQLException;
    public int latestStreak(ArrayList<Date> arr) throws SQLException;

}
