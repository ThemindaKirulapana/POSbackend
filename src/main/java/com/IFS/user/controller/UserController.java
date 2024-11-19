package com.IFS.user.controller;


import com.IFS.user.model.User;
import com.IFS.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/user")
@CrossOrigin("http://localhost:3000")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    User addnewUser(@RequestBody User user){

        return userRepository.save(user);
    }
    @GetMapping("/getuser")
    List<User>getallusers(){
        return userRepository.findAll();
    }

}
