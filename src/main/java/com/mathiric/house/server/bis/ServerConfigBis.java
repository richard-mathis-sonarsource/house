package com.mathiric.house.server.bis;

import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;

@Configuration
public class ServerConfigBis {

    @Valid
    private AddressBis address;

    public ServerConfigBis(AddressBis address) {
        this.address = address;
    }

    public AddressBis getAddress() { return address; }

}
