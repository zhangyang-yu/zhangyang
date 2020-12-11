package com.zhangyang.springbootrabbitmqcinsumer;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ListenRabbitmq {
    @RabbitListener(bindings = {@QueueBinding(
            exchange = @Exchange(value = "exchangezhang",type = "topic",ignoreDeclarationExceptions = "true"),
            value = @Queue(value = "seckill.queue",durable = "true"),key = "user.#"
           )})
    public  void  listenMq(String message)
    {
        System.out.println(message);
    }
}
