package com.zs.exec6.model;

import java.util.Objects;

public class User {
    String userID;
    public User(){}
    public User(String userID, String hobbyName) {
        this.userID = userID;
        this.hobbyName = hobbyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID) && Objects.equals(hobbyName, user.hobbyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, hobbyName);
    }

    String hobbyName;

    public String getuID() {
        return userID;
    }
    public void setuID(String userID) {
        this.userID = userID;
    }
    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }
    public String getHobbyName() {
        return hobbyName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", name='" + hobbyName + '\'' +
                '}';
    }
}
