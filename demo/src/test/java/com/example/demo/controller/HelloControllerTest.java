package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    private int port;

    @Test
    public void helloEndpointReturnsHelloWorld() {
        String baseUrl = "http://localhost:" + port + "/api/hello";
        String response = new RestTemplate().getForObject(baseUrl, String.class);
        assertThat(response).isEqualTo("Hello, World");
    }
}
