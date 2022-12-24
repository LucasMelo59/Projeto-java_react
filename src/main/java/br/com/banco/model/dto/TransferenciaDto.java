package br.com.banco.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaDto {
    private Long conta_id;
    private String data_inicio;
    private String data_fim;
    private String nome_operador;
}
