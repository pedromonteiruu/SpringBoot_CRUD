package br.com.aulaapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="usuario")
@Entity
public class User {


    @Id
    @Column(name= "ID")
    private String id;

    @Basic
    @Column(name = "NOME")
    private String name;

    @Basic
    @Column(name= "IDADE")
    private Integer age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Telefones> telefonesList = new ArrayList<>();

}
