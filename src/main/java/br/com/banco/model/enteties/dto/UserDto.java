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
    private Integer id;
    private String name;
    private Date data;


//    public static UserDto converter(User user){
//        var users  = new UserDto();
//        users.setId(user.getId());
//        users.setDataInicio((user.getDataInicio()));
//        users.setSaldo(user.getSaldo());
//        users.setTipo(user.getTipo());
//        users.setValentia(user.getValentia());
//        users.setSaldoNoPeriodo(user.getSaldoNoPeriodo());
//        users.setNomeOperadorTranscionado(user.getNomeOperadorTranscionado());
//        return users;
//    }
}
