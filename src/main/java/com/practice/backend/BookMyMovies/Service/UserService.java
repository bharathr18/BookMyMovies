package com.practice.backend.BookMyMovies.Service;

import com.practice.backend.BookMyMovies.Dtos.UserRequestDto;
import com.practice.backend.BookMyMovies.Models.UserEntity;
import com.practice.backend.BookMyMovies.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto)
    {
        // Converting the dto to UserEntity for the repository class
        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();

        try
        {
            userRepository.save(userEntity);
        }
        catch (Exception e)
        {
            return "user could not be added";
        }
        return "User added successfully";
    }
}
