package org.codingwala.dummy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyController {

    @RequestMapping("m")
    public static String myMethod() {
        return "Jagdeep Jakhu Methods";
    }

    @GetMapping("process-form")
    public String getData(@RequestParam int num1, @RequestParam int num2) {
        int res = num1 + num2;
        return String.valueOf(res);
    }

}
