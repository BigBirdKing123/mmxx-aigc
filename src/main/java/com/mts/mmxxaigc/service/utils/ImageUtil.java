package com.mts.mmxxaigc.service.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ImageUtil {

    /**
     * 获取图片数据
     * @param fileUrl 文件路径
     * @return 图片
     */
    public static BufferedImage getBufferedImage(String fileUrl) {
        try {
            File f = new File(fileUrl);
            return ImageIO.read(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 输出图片
     * @param buffImg  图像拼接叠加之后的BufferedImage对象
     * @param savePath 图像拼接叠加之后的保存路径
     */
    public static void generateSaveFile(BufferedImage buffImg, String savePath) throws IOException {
        int temp = savePath.lastIndexOf(".") + 1;
        File outFile = new File(savePath);
        if(!outFile.exists()){
            outFile.createNewFile();
        }
        ImageIO.write(buffImg, savePath.substring(temp), outFile);
    }

    /**
     * 合并图片
     * @param imgs
     * @return
     */
    public static BufferedImage mergeImage(List<BufferedImage> imgs) {
        int h = 0;
        int w = 0;
        for (BufferedImage img : imgs) {
            h += img.getHeight();
            w = img.getWidth();
        }
        BufferedImage DestImage;
        DestImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        int hPoint=0;
        for (int i = 0; i < imgs.size(); i++) {
            int width = imgs.get(i).getWidth();
            int height = imgs.get(i).getHeight();

            int[] ImageArray = new int[width * height];
            ImageArray = imgs.get(i).getRGB(0, 0, width, height, ImageArray, 0, width); // 逐行扫描图像中各个像素的RGB到数组中
            if (i == 0) {
                DestImage.setRGB(0, 0, width, height, ImageArray, 0, width);
            }else {
                hPoint+=height;
                DestImage.setRGB(0, hPoint, width, height, ImageArray, 0, width);
            }
        }
        return DestImage;
    }

}
