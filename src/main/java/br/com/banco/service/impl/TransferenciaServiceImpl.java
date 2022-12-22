package br.com.banco.service.impl;

import br.com.banco.model.enteties.Transferencia;
import br.com.banco.model.enteties.dto.TransferenciaDto;
import br.com.banco.model.mapper.TransferenciaMapper;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

    @Autowired
    private TransferenciaMapper mapper;

    @Override
    public List<Transferencia> findByCustom(TransferenciaDto dto) {
        return mapper.filter(dto.getConta_id());
    }

}
