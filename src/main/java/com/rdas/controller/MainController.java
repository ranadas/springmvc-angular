package com.rdas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    public String homepage(){
        return "homepage";
    }


    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, path = "angpost")
    public ResponseEntity savePage(@RequestBody String formData) throws Exception {
        System.out.println("-->> formData " + formData);
        return new ResponseEntity("success", HttpStatus.OK);
    }
}
