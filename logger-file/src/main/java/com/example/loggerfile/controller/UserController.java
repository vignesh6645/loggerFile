package com.example.loggerfile.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    Logger logger= LoggerFactory.getLogger(UserController.class);

    @GetMapping("/user")
    public String getMessage(){
        logger.info("info message");
        logger.warn("warn msg");
        logger.error("error msg");
        logger.debug("debug msg");
        logger.trace("trace msg");

        return "This is log msg...";
    }
}
