package com.diabets.DiabetsTracker.controller;
//import com.diabets.DiabetsTracker.services.MealService;
//import com.diabets.DiabetsTracker.services.UserService;
//import com.diabets.DiabetsTracker.model.Meal;
//import com.diabets.DiabetsTracker.model.User;
//import com.diabets.DiabetsTracker.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//
//@Controller
//@RequestMapping(value = "api/meal")
//public class MealController {
//
//    @Autowired
//    private MealService mealService;
//    @Autowired
//    private UserService userService;
//
//
//    @RequestMapping("/homeMeal")
//    public String homeUser(  ModelMap model) {
//        model.addAttribute("meal", new Meal());
//
//        model.addAttribute("userId", 1);
//        List<Meal> listMeals = mealService.getMeals(1L);
//        model.addAttribute("listMeals", listMeals);
//        return "showMeal";
//    }
//
//    @GetMapping("/new")
//    public String addNewMeal( Model model){
//        model.addAttribute("meal", new Meal());
//        User user = userService.getUser(1L);
//        model.addAttribute("userId", 1);
//        model.addAttribute("user", user);
//        return "showMeal";
//    }
//
//
//    @PostMapping("/addMeal")
//    public String addNewMeal(@ModelAttribute Meal meal) {
//        mealService.addMeal(meal);
//        return "redirect:/api/meal/homeMeal";
//    }
//
//}
