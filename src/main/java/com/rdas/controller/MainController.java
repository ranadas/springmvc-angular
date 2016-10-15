package com.rdas.controller;

import com.rdas.exception.CustomGenericException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

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


    @RequestMapping(value = "/{type:.+}", method = RequestMethod.GET)
    public ModelAndView getPages(@PathVariable("type") String type)
            throws Exception {

        if ("error".equals(type)) {
            // go handleCustomException
            throw new CustomGenericException("E888", "This is custom message");
        } else if ("io-error".equals(type)) {
            // go handleAllException
            throw new IOException();
        } else {
            return new ModelAndView("index").addObject("msg", type);
        }

    }
}
