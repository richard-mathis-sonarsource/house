package com.mathiric.house.server;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "server")
public class ServerConfig {

    @Valid
    private Address address;

    //private Map<String, String> resourcesPath;

    public Address getAddress() { return address; }
    public void setAddress(@Valid Address address) {this.address = address;}

    //public Map<@NotBlank String, @NotBlank String> getResourcesPath() {return resourcesPath;}
    //public void setResourcesPath(Map<String, String> resourcesPath) {this.resourcesPath = resourcesPath;}

}
