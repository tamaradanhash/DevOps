package com.example.devops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class MessageEndpointTest {
  @Autowired
TestRestTemplate restTemplate;

  private  String url="/";
  @Test
  void get() {
    String actual = restTemplate.getForObject(url, String.class);
    String expected="Learning DevOps";
    Assertions.assertEquals(expected,actual);
  }
}