package edu.depaul.cdm.se352;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {
    @GetMapping("/")
    @ResponseBody
    public String greeter() {
        return "Hello SE352 Web";
    }
}
