package com.example.demo

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component // => by looking @Component, Spring recognize it as "to be automatically wired"
@Primary // => resolve the ambiguity of using Dep1 or Dep2
class Dependency2: SimpleDependency {
    override fun run() {
        println("This is Dependency2")
    }
}