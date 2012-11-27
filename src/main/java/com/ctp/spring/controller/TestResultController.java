package com.ctp.spring.controller;

import com.ctp.spring.service.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class TestResultController {

//    @Autowired
//    TestResultService resultService;

    @RequestMapping(value="/testresult")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        return new ModelAndView("testresult");
    }

//    @RequestMapping(value="/testresult")
//    public void viewTestResult(){
//
//    }
}
