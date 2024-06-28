package com.diabets.DiabetsTracker.controller;

import com.diabets.DiabetsTracker.model.GlucoseReading;
//import com.diabets.DiabetsTracker.model.User;
import com.diabets.DiabetsTracker.services.GlucoseReadingService;
//import com.diabets.DiabetsTracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/glucose")
@CrossOrigin(origins = "http://localhost:4200/")
public class GlucoseReadingController {

//    @Autowired
//    private UserService userService;

    @Autowired
    private GlucoseReadingService glucoseReadingService;

    @GetMapping
    public List<GlucoseReading> getAllGlucoseReadings() {
        return glucoseReadingService.getAllGlucoseReadings();
    }

    @PostMapping
    public GlucoseReading saveGlucoseReading(@RequestBody GlucoseReading glucoseReading) {
        return glucoseReadingService.saveGlucoseReading(glucoseReading);
    }

    @DeleteMapping
    public void deleteGlucoseReading(@PathVariable Integer id) {
        glucoseReadingService.deleteGlucoseReading(id);
    }
}
