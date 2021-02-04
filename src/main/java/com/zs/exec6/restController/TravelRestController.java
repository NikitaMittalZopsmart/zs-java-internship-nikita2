package com.zs.exec6.restController;

import com.zs.exec6.exceptions.MyCustomException;
import com.zs.exec6.model.Travel;
import com.zs.exec6.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
@RestController
public class TravelRestController {
    @Autowired
    private TravelService travelService;

    /**
     * Throwing Exception.
     * @throws MyCustomException
     */
    @RequestMapping("/")
    public void message() throws MyCustomException {
        throw new MyCustomException();
    }

    /**
     * Throwing the exception when the url for finding latest streak is wrong.
     * @throws MyCustomException
     */
    @RequestMapping("/travel/latestStreak")
    public void message2() throws MyCustomException {
        throw new MyCustomException();
    }
    /**
     * Inserting data into travel table.
     * @param travel Travel Object.
     * @return Response
     * @throws SQLException
     */
    @PostMapping("/travelcreate")
    public ResponseEntity<String> create(@RequestBody Travel travel) throws SQLException {

        travelService.create(travel);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    /**
     * This is fetching the latest streak for a paricular user.
     * @param userId User ID
     * @return Value of latest streak.
     * @throws SQLException
     */
    @GetMapping("/travel/latestStreak/{userId}")
    public int getLatestStreak(@PathVariable("userId") String userId) throws SQLException {
        return travelService.latsestStreak(userId);
    }
}
