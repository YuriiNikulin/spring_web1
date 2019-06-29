package app.controllers;

import app.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    final static Logger logger = Logger.getLogger(HomePageController.class);

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String greeting(Model model) {
        logger.info("greeting page");

       // userService.updateAdminPass();

        return "greeting";
    }
}
