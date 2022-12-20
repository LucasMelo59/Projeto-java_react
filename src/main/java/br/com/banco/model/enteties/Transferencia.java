package br.com.banco.model.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "transferencia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transferencia {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_transferencia")
    private Date dataInicio;
    @Column(name = "valor")
    private double valentia;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "nome_operador_transacao")
    private String nomeOperadorTranscionado;
    @Column(name = "conta_id")
    private long conta_id;

}

