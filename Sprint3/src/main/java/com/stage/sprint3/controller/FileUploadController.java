package com.stage.sprint3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    @GetMapping("/uploader")
    public String CV(){
        return "uploader";
    }

    @PostMapping("/upload")
    public ResponseEntity<?> handleFileUpload (@RequestParam("file")MultipartFile file){
        String fileName = file.getOriginalFilename();
        try {
            file.transferTo(new File("C:\\Users\\phili\\Desktop\\Web2\\systeme_information_de_stage_emplois\\Sprint3\\src\\main\\resources\\upload\\" + fileName));
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok("File uploaded successfully");
    }
}
