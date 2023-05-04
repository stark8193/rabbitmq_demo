package com.example.rabbitmqwithspringboot.cosumer;

import com.example.rabbitmqwithspringboot.config.RabbitMQConfig;
import com.example.rabbitmqwithspringboot.entity.OrderDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consume(OrderDTO orderDTO){
        System.out.println("consumer is able to consume messgae form queues"+orderDTO);
    }
}
