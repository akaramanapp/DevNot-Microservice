package com.devnot.notificationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
public class NotificationController {

    //@Value("${base.url}")
    //private String baseUrl;

    @GetMapping()
    public String Get(){
        return "baseUrl";
    }
}
