package com.example.demo.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime

@Controller
class HomeController {
    @GetMapping("/")
    fun home(model: Model): String{
        model.addAttribute("date", LocalDateTime.now())
        model.addAttribute("message", "Welcome to Spring")
        return "home.html"
    }
}