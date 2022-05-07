package com.cloud.demo.auth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

  @Value("${contents.value}")
  private String str;

  @GetMapping("")
  public String authGet() {
    return "hello auth";
  }

  @GetMapping("/config/info")
  public String configInfo() {
    return str;
  }
}
