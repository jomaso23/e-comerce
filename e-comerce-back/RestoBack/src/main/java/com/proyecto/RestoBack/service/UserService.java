package com.proyecto.RestoBack.service;

import com.proyecto.RestoBack.model.User;
import com.proyecto.RestoBack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService implements UserInterface {
    @Autowired
    public UserRepository userRepository;
    @Override
    public User createUser(User usuario) {
        /*pendiente de modificar este servicio para validar usuario*/
        /*return userRepository.getOne();*/
        return userRepository.save(usuario);
    }
    
    @Override
    public Optional<User> findUSerById(Integer id) {
        return userRepository.findById(id);
    }
    
    @Override
    public List<User>  getAllUsers() {
        return userRepository.findAll();
    }
}
