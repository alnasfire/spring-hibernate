package com.ctp.spring.controller;

import com.ctp.spring.domain.Test;
import com.ctp.spring.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class CreateTestController {

    @Autowired
    TestService testService;
    @Autowired
    TestThemeService themeService;
    @Autowired
    SectionService sectionService;
    @Autowired
    QuastionService quastionService;
    @Autowired
    AnswerService answerService;

    @RequestMapping(value="/createtest")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        return new ModelAndView("createtest");
    }

    @RequestMapping(value="/createtest")
    public void createNewTest(){

    }

    @RequestMapping(value="/createtest")
    public void createNewTheme(){

    }

    @RequestMapping(value="/createtest")
    public void createNewSection(){

    }

    @RequestMapping(value="/createtest")
    public void createNewQuastion(){

    }

    @RequestMapping(value="/createtest")
    public void createNewAnswer(){

    }
}
