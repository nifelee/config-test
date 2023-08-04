package com.example.configtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class ConfigTestApplication

fun main(args: Array<String>) {
    runApplication<ConfigTestApplication>(*args)
}
