package com.diabets.DiabetsTracker.controller;
//import com.diabets.DiabetsTracker.services.PhysicalAtivityService;
//import com.diabets.DiabetsTracker.services.UserService;
//import com.diabets.DiabetsTracker.services.PhysicalAtivityService;
//import com.diabets.DiabetsTracker.model.PhysicalActivity;
//import com.diabets.DiabetsTracker.model.User;
//import com.diabets.DiabetsTracker.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping(value = "api/phyisicalActivty")
//public class PhysicalActivityController {
//
//
//    @Autowired
//    PhysicalAtivityService physicalAtivityService;
//
//    @Autowired
//    UserService userService;
//
//    @RequestMapping("/homeActivity")
//    public String homeUser( Model model) {
//        model.addAttribute("physicalActivities", new PhysicalActivity());
//        model.addAttribute("userId", 1);
//        List<PhysicalActivity> listActivities = physicalAtivityService.getPhysicalActivities(1L);
//        model.addAttribute("listActivities", listActivities);
//        return "showPhysicalActivity";
//    }
//
//
//    @GetMapping("/new2")
//    public String addNewMeal(Model model) {
//        User user = userService.getUser(1L);
//        model.addAttribute("user", user);
//        model.addAttribute("physicalActivities", new PhysicalActivity());
//        return "showPhysicalActivity";
//    }
//
//
//
//    @PostMapping("/addActivity")
//    public String addNewActivity(@ModelAttribute PhysicalActivity physicalActivity) {
//        physicalAtivityService.addPhysicalActivity(physicalActivity);
//        return "redirect:/api/phyisicalActivty/homeActivity";
//    }
//
//}
