package com.example.dao;

import com.example.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {
    int insertUser(UUID id, User user);

    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> getAllUsers();

    Optional<User> getUserById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, User user);
}
