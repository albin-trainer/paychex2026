package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MyController {
    @GetMapping ("/user")
public String hello(){
    return "Hello User have a nice day !!!";
}

 @GetMapping ("/adminpage")
public String admin(){
    return "Hello Admin have a nice day !!!";
}
@GetMapping 
public String home(){
    return "Hello Home have a nice day !!!";
}
}