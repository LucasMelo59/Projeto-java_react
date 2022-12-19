package br.com.banco.service;

import br.com.banco.model.enteties.User;
import br.com.banco.model.enteties.dto.UserDto;

import java.util.Date;
import java.util.List;

public interface UserService {

    public List<User> listAll();

    public List<UserDto> findUserByCustom(long id, Date date,String name);
}
