package com.proyecto.RestoBack.controller;

import com.proyecto.RestoBack.model.User;
import com.proyecto.RestoBack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuarios")

public class UserController {
    /*intancias de clase service*/
    @Autowired
    private UserService userService;
    @PostMapping("/crearUsuario")
    public User crearUsuario(@RequestBody User usuario){
        
        return userService.createUser(usuario);
    }
    
    @PostMapping("/authUser")
    public Optional<User> getAuthUser(@RequestBody User usuario) {
	    /*aqui va la logica que autentica al usuario*/
	    String userName = usuario.getUser_name();
	    String password = usuario.getPassword();
        System.out.println(userName);
	    List<User> users = userService.getAllUsers();
	    boolean found = false;
        int id_user = 0;
	    Iterator<User> iterator = users.iterator();
	    
	    while (iterator.hasNext()) {
		    User user = iterator.next();
		    if ((user.getUser_name().equals(userName)) && (user.getPassword().equals(password))) {
			    found = true;
			    id_user = user.getId_usuario();
			    break;
		    }
	    }
	    if (found) {
		    System.out.println("usuario ENCONTRADO!");
	    } else {
		    System.out.println("usuario NO  EXISTE!");
	    }
        /*
         userService.findUSerById();
         */
	    
	    return userService.findUSerById(id_user);
	    
    }
}
