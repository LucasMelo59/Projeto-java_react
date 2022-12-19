package br.com.banco.service.impl;

import br.com.banco.model.enteties.User;
import br.com.banco.model.enteties.dto.UserDto;
import br.com.banco.model.repository.UserCustomRepository;
import br.com.banco.model.repository.UserRepository;
import br.com.banco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserCustomRepository userCustomRepository;

    @Override
    public List<User> listAll() {
    return  userRepository.findAll();
    }


    @Override
    public List<UserDto> findUserByCustom(
         @RequestParam(value = "id", required = false) long id,
         @RequestParam(value = "data_inicial", required = false) Date dataInicio,
         @RequestParam(value = "nomeOperadorTranscionado", required = false)  String nomeOperadorTranscionado
         ) {
        return userCustomRepository.find(id, nomeOperadorTranscionado , dataInicio )
                .stream()
                .map(UserDto::converter)
                .collect(Collectors.toList());
    }
}
