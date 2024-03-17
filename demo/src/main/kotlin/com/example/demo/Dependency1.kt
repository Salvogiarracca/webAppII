package com.example.demo

import org.springframework.stereotype.Component

@Component
class Dependency1: SimpleDependency {
    override fun run() {
        println("This is Dependency1")
    }
}