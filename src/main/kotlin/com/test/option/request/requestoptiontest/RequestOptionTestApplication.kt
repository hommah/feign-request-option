package com.test.option.request.requestoptiontest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class RequestOptionTestApplication

fun main(args: Array<String>) {
	runApplication<RequestOptionTestApplication>(*args)
}
