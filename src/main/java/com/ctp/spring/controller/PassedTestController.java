package com.ctp.spring.controller;

import com.ctp.spring.domain.TestResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class PassedTestController {
    @RequestMapping(value="/passedtest")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        return new ModelAndView("passedtest");
    }

    @RequestMapping(value="/passedtest")
    public List<TestResult> getPassedTestsResults(){
        return null;
    }
}
