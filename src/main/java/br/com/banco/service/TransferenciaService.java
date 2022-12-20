package br.com.banco.service;

import br.com.banco.model.enteties.Transferencia;
import br.com.banco.model.enteties.dto.UserDto;

import java.util.List;
public interface TransferenciaService {
    public List<Transferencia> findByCustom(UserDto dto);
}