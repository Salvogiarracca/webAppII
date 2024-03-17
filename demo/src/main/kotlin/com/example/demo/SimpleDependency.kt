package com.example.demo

import org.springframework.stereotype.Component

//=> implementation of "Inversion of Control" + "Dependency Injection"
//@Component
interface SimpleDependency {
//    init {
//        println("Created an instance of SimpleDependency")
//    }
    fun run()
}