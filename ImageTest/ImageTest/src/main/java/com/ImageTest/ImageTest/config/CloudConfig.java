package com.ImageTest.ImageTest.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudConfig {


    public Cloudinary cloudConfig(){
        Map config = new HashMap();
        config.put("cloud_name","djqntqkz3");
        config.put("api_key","617221998763537");
        config.put("api_secret","cCpDO4VseHGNc7ay-1OJE3SUFpY");
        config.put("secure",true);

        return new Cloudinary(config);
    }


}
