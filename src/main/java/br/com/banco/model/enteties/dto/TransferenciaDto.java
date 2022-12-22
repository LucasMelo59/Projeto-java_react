package br.com.banco.model.enteties.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Integer id;
    private String nome;
    private Date data;

}
