package com.moe.socialnetwork;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoeApplication {

    public static void main(String[] args) {
        // Chỉ load .env khi không chạy test
        if (!isTestEnvironment()) {
            Dotenv dotenv = Dotenv.configure()
                                  .ignoreIfMissing()
                                  .load();

            dotenv.entries().forEach(entry -> {
                System.setProperty(entry.getKey(), entry.getValue());
            });
        }

        SpringApplication.run(MoeApplication.class, args);
    }

    private static boolean isTestEnvironment() {
        String env = System.getProperty("ENV");
        return env != null && env.equalsIgnoreCase("test");
    }
}
