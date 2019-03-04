package com.ippon.k8S.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping
  public String helloWorld(){
    return "Hello World !";
  }
}
