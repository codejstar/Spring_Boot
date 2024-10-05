package org.codingwala.dummy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("m")
    public static String myMethod() {
        return "Jagdeep Jakhu Methods";
    }
}
