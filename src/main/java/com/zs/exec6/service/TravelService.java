package com.zs.exec6.service;

import com.zs.exec6.cache.LRUCacheService;
import com.zs.exec6.dao.TravelImp;
import com.zs.exec6.model.Travel;
import com.zs.exec6.util.LogImplement;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.logging.Logger;
@Service
public class TravelService implements TravelServiceInterface{
    LRUCacheService lruServiceObject=LRUCacheService.getInstance();
    TravelImp travelImplment =new TravelImp();
    Logger logger= LogImplement.initialize();
    public void create(Travel travelObject) throws SQLException {
        travelImplment.create(travelObject);
        int max=travelImplment.streak(travelObject.getUserId());
        lruServiceObject.putInCache(travelObject.getUserId(),"travel",max);

    }
    public int latsestStreak(String uidInput) throws SQLException {
        int x= lruServiceObject.getValue(uidInput,"travel");
        if(x!=-1)
        {
            logger.info("Streak in cache="+x);
            return x;
        }
        else {
            int max = travelImplment.streak(uidInput);
            logger.info("latestStreak" + max);
            lruServiceObject.putInCache(uidInput,"travel", max);
            return max;
        }

    }
}
