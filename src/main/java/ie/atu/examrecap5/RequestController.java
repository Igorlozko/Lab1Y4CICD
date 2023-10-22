package ie.atu.examrecap5;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RequestController {


    @GetMapping("/hello")
    public String hello(){
        return "Hello, World";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable  String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name: " + name + ", Age: " + age;
    }
}
