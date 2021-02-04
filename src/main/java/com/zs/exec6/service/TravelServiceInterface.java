package com.zs.exec6.service;

import com.zs.exec6.model.Travel;

import java.sql.SQLException;

public interface TravelServiceInterface {
    public void create(Travel travelObject) throws SQLException;
    public int latsestStreak(String uidInput) throws SQLException;
}
