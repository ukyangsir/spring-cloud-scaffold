package com.ukyang.webserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * WebServer8001 主启动类
 *
 * @author ukyang
 * @version v1.0.0
 * @since 2022-09-26 23:58
 */
@SpringBootApplication
public class WebServer {
    public static void main(String[] args) {
        SpringApplication.run(WebServer.class, args);
    }
}
