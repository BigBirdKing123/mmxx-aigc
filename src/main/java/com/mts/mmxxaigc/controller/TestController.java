package com.mts.mmxxaigc.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;;

/**
 * test
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String test() {
        return "hello world!" ;
    }


}
