package com.ImageTest.ImageTest.controller;

import com.ImageTest.ImageTest.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ImageController {

    private ImageService service;

    public ImageController(ImageService service){
        this.service = service;
    }


        @PostMapping("/upload")
        public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {

        Map data = this.service.uploadImg(file);

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
