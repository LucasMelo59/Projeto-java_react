package br.com.banco.service;

import br.com.banco.model.enteties.User;

import java.util.Date;
import java.util.List;

public interface UserService {

    public List<User> listAll();

    public List<User> listWithDate(Date date);

    public List<User> listWithName(String name);
}
