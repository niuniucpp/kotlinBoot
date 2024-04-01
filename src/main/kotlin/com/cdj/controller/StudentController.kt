package com.cdj.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/stu")
class StudentControlle {

    @RequestMapping("/1")
    fun student1(): String {
        return "Studenth"
    }
}