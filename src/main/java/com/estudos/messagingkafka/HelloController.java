package com.estudos.messagingkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class HelloController{

    @Autowired
    private HelloProducer helloProducer;

    @GetMapping("/hello/{name}")
    public ResponseEntity hello(@PathVariable("name") String name){
    helloProducer.sendMessage("Hello " + name);
        return new ResponseEntity(HttpStatus.OK);
    }


}
