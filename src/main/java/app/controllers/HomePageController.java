package app.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HomePageController {
    final static Logger logger = Logger.getLogger(HomePageController.class);

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        logger.info("greeting page");
        return "greeting";
    }
}
