package br.com.banco.service;

import br.com.banco.model.dto.TransferenciaDto;
import br.com.banco.model.enteties.Transferencia;

import java.util.List;
public interface TransferenciaService {
    public List<Transferencia> findByCustom(TransferenciaDto transferenciaDto);
}
