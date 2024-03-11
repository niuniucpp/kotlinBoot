package com.cdj.controller

import com.cdj.model.Admin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AdminController {

    @RequestMapping("/hello")
    fun hello(): String{
        val tip: String = "Hello Kotlin And SpringBoot"
        return tip
    }

    @GetMapping("/admininfo")
    fun admininfo(): List<Admin>{
        var admins = ArrayList<Admin>()
        var name1 = Admin(1,"NIUNIU","admin")
        var name2 = Admin(2,"admin","admin")
        admins.add(name1)
        admins.add(name2)
        return admins
    }
}