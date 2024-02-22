package com.mts.mmxxaigc.controller;

import com.mts.mmxxaigc.service.entity.MmxxAigcRequest;
import com.mts.mmxxaigc.service.utils.ImageUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "mmxx_aigc")
public class MmxxAigcController {

    private static Logger logger = LoggerFactory.getLogger(MmxxAigcController.class);

    @RequestMapping(value = "/gen", produces = MediaType.IMAGE_PNG_VALUE, method = {RequestMethod.GET, RequestMethod.POST})
    public byte[] generate(MmxxAigcRequest request) throws IOException {
        List<String> pathList = Arrays.asList("C:\\Users\\Administrator\\Downloads\\mmxx-aigc\\1.png", "C:\\Users\\Administrator\\Downloads\\mmxx-aigc\\2.png");
        List<BufferedImage> imageList = new ArrayList<>();
        pathList.forEach(path -> imageList.add(ImageUtil.getBufferedImage(path)));
        BufferedImage image = ImageUtil.mergeImage(imageList);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos);
        return baos.toByteArray();
    }

}
