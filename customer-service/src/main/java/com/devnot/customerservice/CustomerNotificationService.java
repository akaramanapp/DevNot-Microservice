package com.devnot.customerservice;

import org.springframework.cloud.stream.annotation.Output;

public interface CustomerNotificationService {

    @Output("msqueue")
    void sendToQueue(String data);
}
