package com.example.dao;

import com.example.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao{

    private static ArrayList<User> DB = new ArrayList<User>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getUsername()));
        return 1;
    }

    @Override
    public List<User> getAllUsers() {
        return DB;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        return DB.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {

        return 0;
    }

    @Override
    public int updatePersonById(UUID id, User user) {

        return 0;
    }

}
