package com.ctp.spring.controller;

import com.ctp.spring.domain.User;
import com.ctp.spring.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

//    @RequestMapping("/user/index")
//    public String listUsers(Map<String, Object> map) {
//
//        map.put("user", new User());
//        map.put("findUser", new User());
//        map.put("userList", userService.userList());
//        return "user_list";
//    }

    @RequestMapping(value = "/proc", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, BindingResult result) {

        userServiceImpl.saveUser(user);

        return "redirect:/user/index";
    }

//    @RequestMapping("/user/delete/{userId}")
//    public String deleteUser(@PathVariable("userId") Long userId) {
//
//        userService.removeUser(userId);
//
//        return "redirect:/user/index";
//    }
//
//    @RequestMapping("/user/save")
//    public String saveUser(@ModelAttribute("user") User user, BindingResult result) {
//
//        userService.saveUser(user);
//
//        return "redirect:/user/edit/" + user.getId();
//    }
//
//    @RequestMapping("/user/edit/{userId}")
//    public String editUser(@PathVariable("userId") Long userId, Map<String, Object> map) {
//
//        User user = userService.retriveUser(userId);
//        map.put("user", user);
//
//        return "user_edit";
//    }
//
//    @RequestMapping("/user/find")
//    public String findUsers(@ModelAttribute("findUser") User user, BindingResult result, Map<String, Object> map) {
//
//    	map.put("userList", userService.findUsersByName( user.getLogin() ) );
//        map.put("user", new User());
//
//        return "user_list";
//    }
}