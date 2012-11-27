package com.ctp.spring.controller;

import com.ctp.spring.domain.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class TestsListController {

    @RequestMapping(value="/testslist")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        return new ModelAndView("testslist");
    }

    @RequestMapping(value="/testslist")
    public List<Test> getAvailableTestList(){
        return null;
    }
}
