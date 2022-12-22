package br.com.banco.service;

import br.com.banco.model.enteties.Transferencia;

import java.util.List;
public interface TransferenciaService {
    public List<Transferencia> findByCustom(Transferencia transferencia);
}
