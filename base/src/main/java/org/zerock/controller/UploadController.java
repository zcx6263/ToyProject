package org.zerock.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class UploadController {
    
    @GetMapping("/uploadForm")
    public void uploadForm() {
        log.info("upload form");
    }
    
    @PostMapping("/uploadFormAction")
    public void uploadFormPost(MultipartFile[] uploadFile, Model model) {
        
        String uploadFolder = "/Users/jang-won-yong/dev/workspace/ToyProject/upload";
        
        for(MultipartFile multipartFile : uploadFile) {
            
            log.info("----------------------------------------------------");
            log.info("Upload File Name: "+ multipartFile.getOriginalFilename());
            log.info("Upload File Size: "+ multipartFile.getSize());
            
            File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
            
            try {
                multipartFile.transferTo(saveFile);
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
    }
    
    @GetMapping("/uploadAjax")
    public void uploadAjax() {
        
        log.info("upload ajax");
    }
    
    @PostMapping("/uploadAjaxAction")
    public void uploadAjaxPost(MultipartFile[] uploadFile, Model model) {
        
        log.info("update ajax post................");
        
        String uploadFolder = "/Users/jang-won-yong/dev/workspace/ToyProject/upload";
        
        for(MultipartFile multipartFile : uploadFile) {
            
            log.info("----------------------------------------------------");
            log.info("Upload File Name: "+ multipartFile.getOriginalFilename());
            log.info("Upload File Size: "+ multipartFile.getSize());
            
            // IE 의 경우 getOriginFilename 은 경로 까지 출력되므로 substring 해줄 것 
            
            File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
            
            try {
                multipartFile.transferTo(saveFile);
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
    }
}









