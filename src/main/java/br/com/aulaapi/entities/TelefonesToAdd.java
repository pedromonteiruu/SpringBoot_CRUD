package br.com.aulaapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TELEFONES")
@Entity
public class TelefonesToAdd {


    @Id
    @Column(name= "IDTELEFONE")
    private String telId;

    @Basic
    @Column(name= "TEL")
    private String tel;

    @Basic
    @Column(name="IDUSER")
    private String ID;
}
