package com.estudos.messagingkafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducer {

    private KafkaTemplate<String, String> kafkaTemplate;
    //              <mensagem, tópico>

    public HelloProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        kafkaTemplate.send("hello-topic", message);
    }
}
