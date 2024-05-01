package com.example.eva

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EvaApplication

fun main(args: Array<String>) {
	runApplication<EvaApplication>(*args)
}
