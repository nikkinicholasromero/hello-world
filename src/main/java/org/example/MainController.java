package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MainController {
    @RequestMapping("/")
    public String main() {
        return "Hello, World";
    }
}
