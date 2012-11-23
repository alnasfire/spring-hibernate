package com.seostella.spring.controller;

import com.seostella.spring.domain.user.User;
import com.seostella.spring.service.CountryService;
import com.seostella.spring.service.UserService;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author seostella.com
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CountryService countryService;

    @RequestMapping("/user/index")
    public String listUsers(Map<String, Object> map) {

        map.put("user", new User());
        map.put("findUser", new User());
        map.put("userList", userService.userList());
        map.put("countryList", countryService.countryList());

        return "user_list";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, BindingResult result) {

        userService.saveUser(user);

        return "redirect:/user/index";
    }

    @RequestMapping("/user/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long userId) {

        userService.removeUser(userId);

        return "redirect:/user/index";
    }
    
    @RequestMapping("/user/save")
    public String saveUser(@ModelAttribute("user") User user, BindingResult result) {

        userService.saveUser(user);

        return "redirect:/user/edit/" + user.getId();
    }
    
    @RequestMapping("/user/edit/{userId}")
    public String editUser(@PathVariable("userId") Long userId, Map<String, Object> map) {

        User user = userService.retriveUser(userId);
        map.put("user", user); 
        map.put("countryList", countryService.countryList());

        return "user_edit";
    }
    
    @RequestMapping("/user/find")
    public String findUsers(@ModelAttribute("findUser") User user, BindingResult result, Map<String, Object> map) {

    	map.put("userList", userService.findUsersByName( user.getName() ) );
        map.put("user", new User());

        return "user_list";
    }
        
    
}