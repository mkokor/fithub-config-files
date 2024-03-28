package com.fithub.services.config.dev.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FitHubDevConfigServerLauncher {

    public static void main(String[] args) {
        SpringApplication.run(FitHubDevConfigServerLauncher.class, args);
    }

}