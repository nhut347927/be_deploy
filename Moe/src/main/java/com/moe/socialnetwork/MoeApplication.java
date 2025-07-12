package com.moe.socialnetwork;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: nhutnm379
 */
@SpringBootApplication
public class MoeApplication {

    public static void main(String[] args) {
        //Này chỉ dùng cho local.

        // // Load .env vào System properties
        // Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        // dotenv.entries().forEach(entry -> {
        //     System.setProperty(entry.getKey(), entry.getValue());
        // });

        SpringApplication.run(MoeApplication.class, args);
    }
}
