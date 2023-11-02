package com.cbcamba.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("api-notification")
public interface NotificationClient {

    @PostMapping(path = "api/v1/notification")
    void createNotification(NotificationRequest notificationRequest);

}
