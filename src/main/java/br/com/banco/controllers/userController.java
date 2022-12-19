package br.com.banco.controllers;

import br.com.banco.model.enteties.User;
import br.com.banco.model.enteties.dto.UserDto;
import br.com.banco.model.repository.UserRepository;
import br.com.banco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class userController {

    @Autowired
    private UserService userService;

//    @GetMapping("/buscas/custom")
//    public List<UserDto> findUserByCustom(long id, Date date, String name){
//       return userService.findUserByCustom(id, date , name);
//    }

    @GetMapping("/all")
    public List<User> findALl(){
        return userService.listAll();
    }

    @PostMapping("/custom")
    public List<User> findByCustom(@RequestBody UserDto dto){
        return userService.findByCustom(dto);
    }
}
