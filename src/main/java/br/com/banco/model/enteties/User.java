package br.com.banco.model.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double saldo;
    private double saldoNoPeriodo;
    private String nomeOperadorTranscionado;
    private Date dataInicio;
    private Date dataFim;
    private double valentia;
    private String tipo;
}
