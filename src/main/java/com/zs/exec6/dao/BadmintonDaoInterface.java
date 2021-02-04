package com.zs.exec6.dao;

import com.zs.exec6.model.Badminton;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public interface BadmintonDaoInterface   {
    public void create(Badminton badmintonObject) throws SQLException;
    public int latestStreak(ArrayList<Date> arr) throws SQLException;
}
