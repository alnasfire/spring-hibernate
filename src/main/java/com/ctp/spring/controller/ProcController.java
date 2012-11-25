package com.ctp.spring.controller;

import com.ctp.spring.domain.User;
import com.ctp.spring.service.UserService;
import com.ctp.spring.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value="/proc")
public class ProcController {

//    @Autowired
    private UserService userService = new UserServiceImpl();

    public ModelAndView test(HttpServletResponse response) throws IOException {
        return new ModelAndView("proc");
    }

    @RequestMapping(method = RequestMethod.GET)
    public void register(HttpServletRequest request){
        User user = new User();
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("mail"));

        userService.saveUser(user);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}