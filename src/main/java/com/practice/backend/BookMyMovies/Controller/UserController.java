package com.practice.backend.BookMyMovies.Controller;

import com.practice.backend.BookMyMovies.Dtos.UserRequestDto;
import com.practice.backend.BookMyMovies.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/adduser")
    public String addUsers(@RequestBody UserRequestDto userRequestDto)
    {
        return userService.createUser(userRequestDto);
    }
}
