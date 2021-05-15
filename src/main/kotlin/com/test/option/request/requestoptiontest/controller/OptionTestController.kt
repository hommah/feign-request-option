package com.test.option.request.requestoptiontest.controller

import com.test.option.request.requestoptiontest.httpclient.TestFeignClient
import feign.Request
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.TimeUnit

@RestController
class OptionTestController(
    private val testFeignClient: TestFeignClient
) {

    @GetMapping("/request-google-with-options")
    fun requestToGoogleComWithOptions(@RequestParam(defaultValue = "5000") readTimeOut: String?) {
        readTimeOut?.let {
            println(
                testFeignClient.getRequestToGoogleWithOptions(
                    Request.Options(
                        3000,
                        TimeUnit.MILLISECONDS,
                        readTimeOut.toLong(),
                        TimeUnit.MILLISECONDS,
                        false
                    )
                )
            )
        }
    }

    @GetMapping("/request-google")
    fun requestToGoogleCom() {
        println(testFeignClient.getRequestToGoogle())
    }
}
