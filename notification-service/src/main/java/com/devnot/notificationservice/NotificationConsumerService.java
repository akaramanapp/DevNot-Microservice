package com.devnot.notificationservice;

import com.devnot.model.CustomerNotification;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class NotificationConsumerService {

    @StreamListener(Sink.INPUT)
    public void onNotification(CustomerNotification customerNotification){
        System.out.println("———————————————————————————————————————————");
        System.out.println("Notification Alindi kullanıcıya gönderiliyor.");
        System.out.println("Notification -> " + customerNotification.toString());
    }
}
