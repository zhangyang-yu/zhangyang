package com.zhangyang.springbootrabbitmqproduce;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRabbitmqProduceApplicationTests {
@Autowired
private RabbitTemplate rabbitTemplate;
    @Test
    void contextLoads() {
        //指定消费端的数据发送给指定的交换机和路由器
        rabbitTemplate.convertAndSend("exchangezhang","user.add","新政策没有出现");
    }

}
