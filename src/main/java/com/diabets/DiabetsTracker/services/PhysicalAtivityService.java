package com.diabets.DiabetsTracker.services;
//import com.diabets.DiabetsTracker.repository.PhysicalActivityRepository;
//
//import com.diabets.DiabetsTracker.model.PhysicalActivity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//
//@Service
//@Transactional
//public class PhysicalAtivityService {
//
//    @Autowired
//    private PhysicalActivityRepository physicalActivityRepo;
//
//
//    public List<PhysicalActivity> getPhysicalActivities() {
//        return physicalActivityRepo.findAll();
//    }
//
//    public List<PhysicalActivity> getPhysicalActivities(Long id) {
//       return physicalActivityRepo.findByUser_UserId(id);
//    }
//
//    public void addPhysicalActivity(PhysicalActivity physicalActivity) {
//        physicalActivityRepo.save(physicalActivity);
//    }
//
//}
