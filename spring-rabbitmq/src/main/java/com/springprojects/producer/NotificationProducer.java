package com.springprojects.producer;

/* 
Eren created on 20.07.2020 
*/

import com.springprojects.model.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.UUID;

@Service
public class NotificationProducer {


    @Value("${sr.rabbit.routing.name}")
    private String routingName;

    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void init(){
        Notification notification = new Notification();
        notification.setNotificationId(UUID.randomUUID().toString());
        notification.setCreatedDate(new Date());
        notification.setMessage("Message content");
        notification.setSeen(true);

        sendToQueue(notification);
    }

    public void sendToQueue(Notification notification){
        System.out.println("Notification sent id :" +notification.getNotificationId());
        rabbitTemplate.convertAndSend(exchangeName, routingName,notification);
    }
}
