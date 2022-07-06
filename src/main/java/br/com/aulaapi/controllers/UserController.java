package br.com.aulaapi.controllers;

import br.com.aulaapi.entities.Telefones;
import br.com.aulaapi.entities.User;
import br.com.aulaapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    @ResponseBody
    public List<User> searchUser() {
        return userService.searchUser();
    }

    @PostMapping()
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "Usuario inserido com sucesso!";
    }

    @DeleteMapping(path = "/{id}")
    public String removeUser(@PathVariable String id){
        userService.removeUser(id);
        return "Usuario removido com sucesso!";
    }

    @GetMapping(path = "/{id}")
    public Optional<User> searchById(@PathVariable String id){
        return userService.searchUserById(id) ;
    }

    @PutMapping(path = "/{id}")
    public String updateUser(@PathVariable String id,
                                     @RequestBody User user){
        userService.updateUser(id, user);
        return "Usuario atualizado com sucesso!";
    }

//    @PostMapping(value={"/number"})
//    public String addNumber(@RequestBody Telefones telefones){
//        userService.addTelefone(telefones);
//        return "Novo numero cadastrado!";
//    }

}
