package com.proyecto.RestoBack.service;

import com.proyecto.RestoBack.model.User;

import java.util.List;
import java.util.Optional;

public interface UserInterface {
    public User createUser(User usuario);
    public Optional<User> findUSerById(Integer id);
    public List<User> getAllUsers();
}
