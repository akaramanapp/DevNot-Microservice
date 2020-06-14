package com.devnot.customerservice.impl;

import com.devnot.customerservice.CustomerNotificationService;
import com.devnot.model.CustomerNotification;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.cloud.stream.messaging.Source;

@Service
@EnableBinding(Source.class)
public class CustomerNotificationImpl implements CustomerNotificationService {

    private final Source source;

    public CustomerNotificationImpl(Source source) {
        this.source = source;
    }

    @Override
    public void sendToQueue(String data) {
        CustomerNotification customerNotification = new CustomerNotification();
        customerNotification.setDescription(data);
        customerNotification.setCustomerId("1000034");
        source.output().send(MessageBuilder.withPayload(customerNotification).build());
    }
}