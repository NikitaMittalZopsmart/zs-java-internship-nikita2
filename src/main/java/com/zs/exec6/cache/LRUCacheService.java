package com.zs.exec6.cache;


import com.zs.exec6.model.User;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;


/**
 * This method is implementing LRU cache.
 */
public class LRUCacheService {

    private LRUCache cache = null;
    private static LRUCacheService single_instance = null;
    public LRUCacheService() {
        cache = new LRUCache<User,Integer>(3);
    }
    public static LRUCacheService getInstance()
    {
        if (single_instance == null)
            single_instance = new LRUCacheService();

        return single_instance;
    }
    /**
     * This method is calling put funtion of cache to put the data.
     * @param uid User ID

     * @param tableName Name of Hobby
     * @param laStreak Value of LastStreak.
     */
    public void putInCache(String uid,String tableName, int laStreak) {

        User userObj = new User();
        userObj.setuID(uid);
        userObj.setHobbyName(tableName);
        cache.putCache(userObj, new Integer(laStreak));

        cache.displayCache();
    }

    /**
     * This function is giving value of cache.
     * @param uId UserId

     * @param tableName Name of Hobby
     * @return Return true if value is present in cache.
     */
    public int getValue(String uId,String tableName) {



        Set<Map.Entry<User, Integer>> entrySet = cache.getVal();
        if (entrySet != null) {
            for (Map.Entry<User, Integer> entry : entrySet) {
                User u = entry.getKey();

                String uid = u.getuID();
                String tName = u.getHobbyName();
                if (uid.equals(uId) && tName.equals(tableName)) {

                    return entry.getValue();
                }
            }

        }
        return -1;
    }




}

