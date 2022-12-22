package br.com.banco.service.impl;

import br.com.banco.model.enteties.Transferencia;
import br.com.banco.model.mapper.TransferenciaMapper;
import br.com.banco.model.repository.TransferenciaRepository;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {
    @Autowired
    private TransferenciaMapper transferenciaMapper;
    @Autowired
    private TransferenciaRepository transferenciaRepository;
    @Override
    public List<Transferencia> findByCustom(Transferencia transferencia) {
        return transferenciaMapper.filter(transferencia.getNome_operador_transacao(), transferencia.getData_transferencia_inicio(), transferencia.getData_transferencia_fim(), transferencia.getConta_id());
    }

}
