package com.mts.mmxxaigc.controller;

import com.mts.mmxxaigc.service.entity.MmxxAigcRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
@RequestMapping(value = "mmxx_aigc")
public class MmxxAigcController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/img", produces = MediaType.IMAGE_JPEG_VALUE, method = {RequestMethod.GET, RequestMethod.POST})
    public byte[] generateImage(MmxxAigcRequest request) throws IOException {
        File file = new File("/home/data/mmxx-aigc/publish/20230907/1.png");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }

}
