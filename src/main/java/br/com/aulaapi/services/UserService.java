package br.com.aulaapi.services;

import br.com.aulaapi.entities.Telefones;
import br.com.aulaapi.entities.User;
import br.com.aulaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> searchUser(){
        return userRepository.findAll();
    }

    public void addUser(User user){userRepository.save(user); }

    public void removeUser(String id){userRepository.deleteById(id);}

    public Optional<User> searchUserById(String id) {return userRepository.findById(id);}

    public void updateUser(String id, User user){userRepository.findById(id).map(address->{
        address.setName(user.getName());
        address.setAge(user.getAge());
        return userRepository.save(address);
    });}

//    public void addTelefone(Telefones telefone{telefoneRepository.save(telefone);}

}
