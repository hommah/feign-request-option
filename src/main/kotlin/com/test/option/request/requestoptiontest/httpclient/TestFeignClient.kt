package com.test.option.request.requestoptiontest.httpclient

import feign.Request
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "test-feign-client", url = "https://www.google.com")
interface TestFeignClient {

    @GetMapping("")
    fun getRequestToGoogle(): ResponseEntity<String>

    @GetMapping("")
    fun getRequestToGoogleWithOptions(options: Request.Options): ResponseEntity<String>
}
