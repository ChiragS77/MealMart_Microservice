package com.ImageTest.ImageTest.service;

import com.ImageTest.ImageTest.config.CloudConfig;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class ImageService {

   private CloudConfig cloudConfig;

    public ImageService(CloudConfig cloudConfig){
        this.cloudConfig= cloudConfig;
    }

    public Map uploadImg(MultipartFile file) throws IOException {
        try{
            Map data = this.cloudConfig.cloudConfig().uploader().upload(file.getBytes(),Map.of());
            return data;
        }catch(Exception e){
            throw new RuntimeException("Image not uploaded...!!");
        }

    }


}
