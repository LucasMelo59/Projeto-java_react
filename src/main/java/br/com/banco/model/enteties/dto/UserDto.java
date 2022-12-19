package br.com.banco.model.enteties.dto;

import br.com.banco.model.enteties.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private long id;
    private double saldo;
    private double saldoNoPeriodo;
    private String nomeOperadorTranscionado;
    private Date dataInicio;
    private Date dataFim;
    private double valentia;
    private String tipo;

    public static UserDto converter(User user){
        var users  = new UserDto();
        users.setId(user.getId());
        users.setDataFim(user.getDataFim());
        users.setDataInicio((user.getDataInicio()));
        users.setSaldo(user.getSaldo());
        users.setTipo(user.getTipo());
        users.setValentia(user.getValentia());
        users.setSaldoNoPeriodo(user.getSaldoNoPeriodo());
        users.setNomeOperadorTranscionado(user.getNomeOperadorTranscionado());
        return users;
    }
}
