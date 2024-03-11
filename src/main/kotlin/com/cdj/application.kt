package com.cdj

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
open class application
fun main(args: Array<String>){
    SpringApplication.run(application::class.java, *args)
}