package com.mathiric.house.server.bis;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AddressBis.class)
public class MyServerService {

     @Bean
     public ServerConfigBis getConfig(AddressBis address) {
            return new ServerConfigBis(address);
        }
    }

