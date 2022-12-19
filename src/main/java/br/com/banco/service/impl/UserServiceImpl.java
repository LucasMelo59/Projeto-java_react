package br.com.banco.service.impl;

import br.com.banco.model.enteties.User;
import br.com.banco.model.repository.UserRepository;
import br.com.banco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> listAll() {
    return  userRepository.findAll();
    }

    @Override
    public List<User> listWithDate(Date date) {
        return userRepository.findByDate(date);
    }

    @Override
    public List<User> listWithName(String name) {
        return userRepository.findByName(name);
    }
}
