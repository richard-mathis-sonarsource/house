package com.mathiric.house.server.bis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotBlank;

@Validated
@ConfigurationProperties(prefix = "address")
public class AddressBis {

    @NotBlank
    private String ip;

}
