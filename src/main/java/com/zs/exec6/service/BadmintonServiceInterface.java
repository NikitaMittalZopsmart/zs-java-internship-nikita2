package com.zs.exec6.service;

import com.zs.exec6.model.Badminton;

import java.sql.SQLException;

public interface BadmintonServiceInterface {
    public void create(Badminton badmintonObject) throws SQLException;

    public int latsestStreak(String uidInput) throws SQLException;
}
