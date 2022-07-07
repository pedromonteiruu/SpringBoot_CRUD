package br.com.aulaapi.services;

import br.com.aulaapi.entities.Telefones;
import br.com.aulaapi.entities.TelefonesToAdd;
import br.com.aulaapi.entities.User;
import br.com.aulaapi.repositories.TelRepository;
import br.com.aulaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelService {

    @Autowired
    TelRepository telRepository;



    public void addTel(String id, TelefonesToAdd telefones){telRepository.save(telefones); }

    public void removeUser(String id){telRepository.deleteById(id);}

    public void updateUser(String id, TelefonesToAdd telefones){telRepository.findById(id).map(address->{

        return telRepository.save(address);
    });}

//    public void addTelefone(Telefones telefone{telefoneRepository.save(telefone);}

}
