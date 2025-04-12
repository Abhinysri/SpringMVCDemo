package com.springmvc.controller;

import com.springmvc.entity.Custom;
import com.springmvc.services.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/test")
public class CustomController {
    @Autowired
    private CustomService service;

    @GetMapping("/home")
    public String showPage(){
        return "homepage";
    }

    @GetMapping("/register")
    public String showRegister(){
        return "register";
    }

    @GetMapping("/")
    public String getAllCustomes(@RequestParam(value = "message", required = false) String message, Model model){
        List<Custom> customList = service.getAllCustomes();
        model.addAttribute("list", customList);
        model.addAttribute("message", message);
        return "showallcustoms";
    }

    @PostMapping("/add")
    public String addNewCustom(@ModelAttribute Custom custom, Model model)
    {
        service.addNew(custom);
        Long id = service.addNew(custom).getId();
        String message = "Record with id: " + id + " is saved successfully";
        model.addAttribute("message", message);
        return "register" ;
    }



}
