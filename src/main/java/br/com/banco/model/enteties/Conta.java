package br.com.banco.model.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "conta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conta {
    @Id
    @Column(name = "id_conta")
    private Integer id_conta;
    @Column(name = "nome_responsavel")
    private String nome_responsavel;

}
