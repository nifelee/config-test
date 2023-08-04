package com.example.configtest.controller

import com.example.configtest.config.CustomProperties
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/prop")
class PropertyController(
    private val customProperties: CustomProperties
) {

    @GetMapping
    fun prop(): ResponseEntity<CustomProperties> {
        return ResponseEntity.ok(customProperties)
    }

}
