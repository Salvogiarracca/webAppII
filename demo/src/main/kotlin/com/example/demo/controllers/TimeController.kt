package com.example.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class TimeController {
    init {
        println("TimeController was built`")
    }

    @GetMapping("/currentTime")
    fun currentTime(): String {
        return LocalDateTime.now().toString()
    }
}