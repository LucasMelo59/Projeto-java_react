package br.com.banco.service.impl;

import br.com.banco.model.enteties.Transferencia;
import br.com.banco.model.enteties.dto.UserDto;
import br.com.banco.model.repository.TransferenciaRepository;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;
    @Override
    public List<Transferencia> findByCustom(UserDto dto) {
        return transferenciaRepository.getUserWithCustom(dto.getNome(), null);
    }

}
