package com.student.kube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @GetMapping(path = "getStudent")
    public String getStudent(){
        return "Student name is kanagaraj";
    }

}
