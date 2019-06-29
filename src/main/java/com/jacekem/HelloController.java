package com.jacekem;

import com.jacekem.controllers.Greeter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {

    String f =

            System.getProperty("java.version").toString();

    String a = "3".repeat(2);

        return a;
    }

}