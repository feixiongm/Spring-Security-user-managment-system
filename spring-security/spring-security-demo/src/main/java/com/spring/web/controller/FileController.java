package com.spring.web.controller;


import com.spring.dto.FileInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.nio.ch.IOUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;

@RestController
@RequestMapping("/file")
public class FileController {
     private String folder = "/Users/mengfeixiong/IdeaProjects/springsecurity/spring-security/spring-security-demo/src/main/java/com/spring/web/controller";

    @PostMapping
    public FileInfo upload(MultipartFile file) throws IOException {
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());


        File localFIle = new File(folder, new Date().getTime() + ".txt");
        file.transferTo(localFIle);
        return new FileInfo(localFIle.getAbsolutePath());
    }

    @GetMapping("/{id}")
    public void download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) {

        try (InputStream inputStream = new FileInputStream(new File(folder, id + ".txt"));
                OutputStream outputStream = response.getOutputStream();){
            response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment;filename=text.txt");

            IOUtils.copy(inputStream,outputStream);
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
