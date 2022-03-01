package com.example.deploytest;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Validated
public class UserController {

    private final UserService userService;


    @GetMapping(value = "/Join")
    public  ResponseEntity<String> join()   {
        return ResponseEntity.status(HttpStatus.OK).body("success");
    }

    @GetMapping(value = "/GetUser")
    public ResponseEntity<List<User>> regUser()   {

        return ResponseEntity.status(HttpStatus.OK).body(userService.findUser());
    }

    @PostMapping(value = "/RegUser")
    public List<User> getUser(@RequestBody UserJoinDto userJoinDto)   {
        User user = User.builder()
                .usrId(userJoinDto.getUsrId())
                .build();
        return userService.saveUser(user);
    }
}
