package com.diabets.DiabetsTracker.services;

import com.diabets.DiabetsTracker.model.GlucoseReading;
import com.diabets.DiabetsTracker.repository.GlucoseReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlucoseReadingService {

    @Autowired
    private GlucoseReadingRepository glucoseReadingRepository;

    public List<GlucoseReading> getAllGlucoseReadings() {
        return glucoseReadingRepository.findAll();
    }

    public GlucoseReading saveGlucoseReading(GlucoseReading glucoseReading) {
        return glucoseReadingRepository.save(glucoseReading);
    }

    public void deleteGlucoseReading(Integer id) {
        glucoseReadingRepository.deleteById(id);
    }
}
