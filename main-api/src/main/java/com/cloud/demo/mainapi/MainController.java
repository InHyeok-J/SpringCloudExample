package com.cloud.demo.mainapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class MainController {

  @GetMapping("")
  public String hello() {
    System.out.println("---");
    return "hello";
  }
}
