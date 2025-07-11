package com.moe.socialnetwork;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MoeApplicationTests {

    @BeforeAll
    static void setup() {
        System.setProperty("ENV", "test");
    }

    @Test
    void contextLoads() {
    }
}
