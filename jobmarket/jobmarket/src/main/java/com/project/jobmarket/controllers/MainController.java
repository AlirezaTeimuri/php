package com.project.jobmarket.controllers;

import com.project.jobmarket.entity.UserEntity;
import com.project.jobmarket.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    UserRepository ur1;
    @GetMapping
    public ResponseEntity getUsers(){
        try {
            return ResponseEntity.ok("server works!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("connection error");
        }
    }

    @GetMapping("/favorite")
    public ResponseEntity<String> greeting(@RequestParam(name="name", required=false, defaultValue="World") String name){
        return ResponseEntity.ok("greeting "+name);
    }

    @GetMapping("/user")
    public ResponseEntity<String> user( ){
        //ur1.save(new UserEntity("test.test"));
        UserEntity ue1 = ur1.getReferenceById("seebachera@gmx.at");
        return ResponseEntity.ok("greeting " + ue1.getVorname());

    }
}