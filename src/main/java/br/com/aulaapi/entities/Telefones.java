package br.com.aulaapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.Target;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TELEFONES")
@Entity
public class Telefones {


    @Id
    @Column(name= "IDTELEFONE")
    private String telId;

    @Basic
    @Column(name= "TEL")
    private String tel;


    @ManyToOne
    @JoinColumn(name="IDUSER")
    @JsonBackReference
    private User user;

}
