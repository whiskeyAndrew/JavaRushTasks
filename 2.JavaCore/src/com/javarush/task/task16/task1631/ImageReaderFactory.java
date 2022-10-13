package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    static ImageReader imageReader;
    public static ImageReader getImageReader(ImageTypes imgType){
        if(imgType==null){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        switch (imgType.name()) {
            case "JPG":
                imageReader = new JpgReader();
                break;
            case "PNG":
                imageReader = new PngReader();
                break;
            case "BMP":
                imageReader = new BmpReader();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return imageReader;
    }
}
