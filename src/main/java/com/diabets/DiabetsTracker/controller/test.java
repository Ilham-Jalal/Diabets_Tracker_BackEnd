package com.diabets.DiabetsTracker.controller;

//import com.diabets.DiabetsTracker.model.GlucoseReading;
//import com.diabets.DiabetsTracker.services.AdviceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Controller
//@RequestMapping("api/test/")
//public class test {
//
//
//    private final AdviceService adviceService;
//
//    public test(AdviceService adviceService) {
//        this.adviceService = adviceService;
//    }
//
//    @GetMapping("/")
//    public String show(Model model){
//        model.addAttribute("glucoseReading", new GlucoseReading());
//        return "showMeal";
//    }
//
//
//    @GetMapping("/chart")
//    public String getChartData(Model model) {
//        // Example data
//        List<String> labels = Arrays.asList("January", "February", "March", "April", "May");
//        List<Integer> data = Arrays.asList(10, 20, 30, 40, 50);
//
//        model.addAttribute("labels", labels);
//        model.addAttribute("data", data);
//        return "chart";
//    }
//}
