package com.example.SBAssign.Assign;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test_topic3",groupId = "group_id")

    public void consumerMessage(String message){

        System.out.println(message);
    }
}

