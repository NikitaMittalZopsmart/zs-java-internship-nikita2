package com.zs.exec6.service;

import com.zs.exec6.cache.LRUCacheService;
import com.zs.exec6.dao.BadmintonImp;
import com.zs.exec6.model.Badminton;
import com.zs.exec6.util.LogImplement;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.logging.Logger;

@Service
public class BadmintonService implements BadmintonServiceInterface {

    Logger logger = LogImplement.initialize();
    BadmintonImp badmintonImplement = new BadmintonImp();
    LRUCacheService lruServiceObject = LRUCacheService.getInstance();


    public void create(Badminton badminton) throws SQLException {

         badmintonImplement.create(badminton);
        int max = badmintonImplement.streak(badminton.getUserId());
        lruServiceObject.putInCache(badminton.getUserId(), "badminton", max);
    }
    public int latsestStreak(String uidInput) throws SQLException {
        int x= lruServiceObject.getValue(uidInput,"badminton");
        if(x!=-1)
        {
            logger.info("Streak in cache="+x);
               return x;
        }
        else {
            int max = badmintonImplement.streak(uidInput);
            logger.info("latestStreak" + max);
            lruServiceObject.putInCache(uidInput,  "badminton", max);
             return max;
        }

    }



}
