package br.com.banco.service.impl;

import br.com.banco.model.dto.TransferenciaDto;
import br.com.banco.model.enteties.Transferencia;
import br.com.banco.model.mapper.TransferenciaMapper;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

    @Autowired
    private TransferenciaMapper transferenciaMapper;

    @Override
    public List<Transferencia> findByCustom(TransferenciaDto transferenciaDto) {
        return transferenciaMapper.filter(transferenciaDto.getNome_operador(), transferenciaDto.getData_inicio(), transferenciaDto.getData_fim(), transferenciaDto.getConta_id())
                .stream().peek(x -> x.setValor(roundTwoPlaces(x.getValor()))).collect(Collectors.toList());
    }

    private Double roundTwoPlaces(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
