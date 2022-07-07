package br.com.aulaapi.repositories;

import br.com.aulaapi.entities.TelefonesToAdd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelRepository extends JpaRepository<TelefonesToAdd, String> {
    //Ver como faz usando o JPA, q tem mt coisa pronta(get funfa facin)
}
