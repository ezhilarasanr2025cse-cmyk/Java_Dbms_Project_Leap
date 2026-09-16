package com.example.project01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Add {
      @GetMapping ("/display/{string}")
      public String display(@PathVariable String string) {
          return string+"1";
      }
}