package com.hycgy.kaiblogbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hycgy.kaiblogbackend.mapper")
public class KaiBlogBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(KaiBlogBackendApplication.class, args);
    }
}
