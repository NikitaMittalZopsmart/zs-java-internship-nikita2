package com.zs.exec6.restController;


import com.zs.exec6.exceptions.MyCustomException;
import com.zs.exec6.model.Badminton;
import com.zs.exec6.service.BadmintonService;
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

/**
 * This class is the controller of the badminton class.
 */
@RestController
public class BadmintonRestController {
    @Autowired
    private BadmintonService badmintonService;


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
    @RequestMapping("/badminton/latestStreak")
    public void message2() throws MyCustomException {
        throw new MyCustomException();
    }

    /**
     * This is fetching the latest streak for a paricular user.
     * @param userId User ID
     * @return Value of latest streak.
     * @throws SQLException
     */
    @GetMapping("/badminton/latestStreak/{userId}")
    public int getLatestStreak(@PathVariable("userId") String userId) throws SQLException {

        return badmintonService.latsestStreak(userId);

    }

    /**
     * Inserting data into badminton table.
     * @param badminton Badminton Object.
     * @return Response
     * @throws SQLException
     */
    @PostMapping("/badmintoncreate")
    public ResponseEntity<String> create(@RequestBody Badminton badminton) throws SQLException {
        badmintonService.create(badminton);

       return new ResponseEntity<String>("Added", HttpStatus.OK);
    }


}






