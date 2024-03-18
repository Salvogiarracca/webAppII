package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

//@Component
class TestComponent(/*val d: SimpleDependency*/) { // has an autowired property injected in the constructor
    init {
        println("Created an instance of TestComponent")
//        d.run()  // this will break the code throwing an exception
    }

    @Autowired
    var d: SimpleDependency? = null
        set(v: SimpleDependency?){
            field = d
            d?.run()
        }
}