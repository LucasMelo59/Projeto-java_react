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

    public TransferenciaDto(String nome) {
        this.nome_operador = nome;
    }

    public TransferenciaDto(String inicio, String fim) {
        this.data_inicio = inicio;
        this.data_fim = fim;
    }

    public TransferenciaDto(String nome, String inicio, String fim) {
        this.nome_operador = nome;
        this.data_inicio = inicio;
        this.data_fim = fim;
    }
}
