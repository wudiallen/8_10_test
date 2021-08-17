package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1ApplicationTests {

    @Test
    void contextLoads() {
        int king = Monkey.King(5, 3);
        System.out.println("第"+king+"只猴子是king");
    }

}
