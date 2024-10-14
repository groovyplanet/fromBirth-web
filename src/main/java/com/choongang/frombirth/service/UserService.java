package com.choongang.frombirth.service;

import com.choongang.frombirth.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(String userId);
    UserDTO updateUser(String userId, UserDTO userDTO);
    void deleteUser(String userId);
    List<UserDTO> getAllUsers();

}

