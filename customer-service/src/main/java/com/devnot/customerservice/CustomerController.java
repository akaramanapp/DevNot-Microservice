package com.devnot.customerservice;

import com.devnot.customerservice.impl.CustomerNotificationImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
    private final CustomerNotificationImpl _customerNotificationServiceImpl;

    public CustomerController(CustomerNotificationImpl customerNotificationServiceImpl) {
        _customerNotificationServiceImpl = customerNotificationServiceImpl;
    }


    @GetMapping
    public String get(){
        System.out.println("———————————————————————————————————————————");
        System.out.println("Müşteri veri tabanına kaydedildi.");
        _customerNotificationServiceImpl.sendToQueue("Kullanıcı sözleşmesi.");
        return "success";
    }
}
