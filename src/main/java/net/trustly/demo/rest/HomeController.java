package net.trustly.demo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String swagger() {
        log.info("Redirecting to swagger ui...");
        return "redirect:swagger-ui.html";
    }
}
