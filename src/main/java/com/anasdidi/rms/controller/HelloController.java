package com.anasdidi.rms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public ResponseEntity<String> getGreeting() {
    return ResponseEntity.ok().body("Hello World");
  }
}
