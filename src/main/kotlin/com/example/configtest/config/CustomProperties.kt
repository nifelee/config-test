package com.example.configtest.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "custom")
data class CustomProperties (
    val prop1: String,
    val prop2: String,
    val prop3: String,
    val prop4: String? = "def=4",
    val prop5: String? = "def=5",
)
