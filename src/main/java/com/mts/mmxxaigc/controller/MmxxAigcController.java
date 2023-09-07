package com.mts.mmxxaigc.controller;

import com.mts.mmxxaigc.service.entity.MmxxAigcRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "mmxx_aigc")
public class MmxxAigcController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/common", method = {RequestMethod.GET, RequestMethod.POST})
    public String run(MmxxAigcRequest request) {
        return "/home/data/mmxx-aigc/publish/20230907/1.png" ;
    }

}
