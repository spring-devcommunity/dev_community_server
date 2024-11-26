package com.example.dev_community.controller.user;

import com.example.dev_community.dto.User.AddUserRequest;
import com.example.dev_community.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request){
        userService.save(request);
        return "redirect:/login";
    }
}