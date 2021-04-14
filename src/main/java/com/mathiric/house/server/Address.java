package com.mathiric.house.server;

import javax.validation.constraints.NotBlank;

public class Address {

    @NotBlank
    private String ip;

    public String getIp() { return ip; }

    public void setIp(String ip) { this.ip = ip; }


}
