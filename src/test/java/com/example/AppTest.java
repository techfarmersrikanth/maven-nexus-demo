package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testApplicationMessage() {

        App app = new App();

        assertEquals(
            "Application deployed successfully",
            app.message()
        );
    }
}
