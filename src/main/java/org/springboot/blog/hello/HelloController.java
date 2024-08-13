package org.springboot.blog.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // (1)
public class HelloController {

    @GetMapping("/hello") // (2)
    public String hello() {
        return "hello";
    }
}
