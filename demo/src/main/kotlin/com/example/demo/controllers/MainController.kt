package com.example.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class MainController {

    @GetMapping("/")
    fun home(): Map<String, Any>{
        return mapOf("date" to LocalDateTime.now(), "name" to "home", "number" to 42)
    }
}