package com.zs.exec6.restController;

import com.zs.exec6.model.Travel;
import com.zs.exec6.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
@RestController
public class TravelRestController {
    @Autowired
    private TravelService travelService;
    @PostMapping("/travelcreate")
    public ResponseEntity<String> create(@RequestBody Travel travel) throws SQLException {

        travelService.create(travel);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }
    @GetMapping("/travel/latestStreak/{userId}")
    public int getLatestStreak(@PathVariable("userId") String userId) throws SQLException {
        return travelService.latsestStreak(userId);
    }
}
