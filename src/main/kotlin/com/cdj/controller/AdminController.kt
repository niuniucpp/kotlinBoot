package com.cdj.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AdminController {

    @RequestMapping("/hello")
    fun hello(): String{
        val tip: String = "Hello Kotlin And SpringBoot";
        return tip
    }

}