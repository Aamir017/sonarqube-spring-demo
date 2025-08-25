package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void testHelloApi() {
        assertThat(controller.hello()).contains("Hello");
    }

    @Test
    void testTasksApi() {
        List<String> tasks = controller.tasks();
        assertThat(tasks).contains("Secure CI/CD", "Run SonarQube", "Deploy with Docker");
    }
}
