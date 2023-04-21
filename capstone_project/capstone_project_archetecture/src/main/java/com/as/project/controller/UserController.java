package com.as.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.as.project.dto.AppResponse;
import com.as.project.dto.UserDto;
import com.as.project.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping(value = "/user")
@RestController
public class UserController {

    private final UserService service;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewUser(@RequestBody UserDto dto)
    {
        Integer sts= service.createNewUser(dto);

        AppResponse<Integer> response= AppResponse.<Integer>builder()
                                                   .sts("success")
                                                   .msg("User created successfully")
                                                   .bd(sts)
                                                   .build();

return ResponseEntity.status(HttpStatus.CREATED).body(response);


    }
    
}
