package com.mathiric.house.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@EnableConfigurationProperties(value = ServerConfig.class)
@ContextConfiguration(classes = ServerConfigFactory.class)
@TestPropertySource("classpath:house.properties")
class BindingPropertiesToBeanMethodsUnitTest {

    @Autowired
    @Qualifier("default_bean")
    private ServerConfig serverConfig;

    @Test
    void givenBeanAnnotatedMethod_whenBindingProperties_thenAllFieldsAreSet() {
        assertEquals("192.168.0.2", serverConfig.getAddress().getIp());

        // other assertions...
    }
}
