package br.com.banco.controllers;

import br.com.banco.model.enteties.Transferencia;
import br.com.banco.model.enteties.dto.UserDto;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class transferenciaController {
    @Autowired
    private TransferenciaService transferenciaService;

    @PostMapping("/custom")
    public List<Transferencia> findByCustom(@RequestBody UserDto dto){
        return transferenciaService.findByCustom(dto);
    }
}