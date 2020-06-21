package com.vkiprono.kafkaproducer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProperties {
    @Value("${kafka.bootstrap.servers}")
    private String bootstrapServers;

    public KafkaProperties() {
    }

    public String getBootstrapServers() {
        return bootstrapServers;
    }
}
