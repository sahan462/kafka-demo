package com.damitha.kafka_demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "demoTopic", groupId = "myGroup")
    public void consumeMessage(String message){
        log.info(String.format("Consuming the message from demo topic :: %s", message));

    }
}
