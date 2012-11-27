package com.ctp.spring.controller;

import com.ctp.spring.domain.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class CreateTestController {
    @RequestMapping(value="/createtest")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        return new ModelAndView("createtest");
    }

    @RequestMapping(value="/createtest")
    public void createNewTest(){

    }

}
