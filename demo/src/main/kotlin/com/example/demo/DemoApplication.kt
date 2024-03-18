package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication{
    @Bean
    fun whatever(): TestComponent{
        return TestComponent()
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
