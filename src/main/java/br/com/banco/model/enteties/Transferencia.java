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
    @Column(name = "data_transferencia_inicio")
    private Date data_transferencia_inicio;
    @Column(name = "data_transferencia_fim")
    private Date data_transferencia_fim;
    @Column(name = "valor")
    private double valor;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "nome_operador_transacao")
    private String nome_operador_transacao;
    @Column(name = "conta_id")
    private Long conta_id;

}