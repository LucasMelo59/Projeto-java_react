package br.com.banco.model.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cd_usuario")
    private long id;
    @Column(name = "saldo")
    private double saldo;
    @Column(name = "saldo_periodo")
    private double saldoNoPeriodo;
    @Column(name ="nome_operador")
    private String nomeOperadorTranscionado;
    @Column(name = "data_inicial")
    private Date dataInicio;
    @Column(name = "data_fim")
    private Date dataFim;
    @Column(name = "valentia")
    private double valentia;
    @Column(name = "tipo")
    private String tipo;
}
