package com.vkiprono.kafkaproducer.services;

import com.vkiprono.kafkaproducer.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";


    @Autowired
    public UserService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishString(String name){
        System.out.println("*******INSIDE SERVICE*********************");
        kafkaTemplate.send(TOPIC, new User(name,"Laviki", "Technology", 120000L));
    }
}
