package com.ctp.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class RegisterUserController {

    @RequestMapping(value="/registerUser")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        return new ModelAndView("registerUser");
    }
}
