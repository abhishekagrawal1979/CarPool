package com.abhinet.V1


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import springfox.documentation.swagger2.annotations.EnableSwagger2

@RestController
@EnableSwagger2

class CarPoolController {

    val name: String = "Abhi"


    @GetMapping("/")
    fun firstSampleFunction(): String {
        return  "Hello"
    }




}