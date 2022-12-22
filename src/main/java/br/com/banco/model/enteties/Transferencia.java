package br.com.banco.model.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transferencia")
public class Transferencia {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_transferencia")
    private Date data_transferencia;
    @Column(name = "valor")
    private double valor;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "nome_operador_transacao")
    private String nome_operador_transacao;
    @Column(name = "conta_id")
    private Integer conta_id;

}

