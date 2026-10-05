package com.example.simple_springboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MyController {
   // @Autowired 
    private MyService myService;
    public MyController(MyService myService) {
        this.myService = myService;
    }
    @GetMapping("/hello")
    //this method is called by any languuage /platform 
    public String hello() {
        return myService.getMessage(); 
    }
    @GetMapping("/testEmployee")
    public Employee getEmployee() {
        Employee emp = new Employee(1, "Albin","Bangalore");
        return emp;
    }
    @PostMapping ("/employee")
    public Employee addEmployee(@RequestBody Employee emp) {
        return emp;
    }
}