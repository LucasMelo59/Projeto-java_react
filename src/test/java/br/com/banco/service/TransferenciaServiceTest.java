package br.com.banco.service;

import br.com.banco.model.dto.TransferenciaDto;
import br.com.banco.model.enteties.Transferencia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@SpringBootTest
public class TransferenciaServiceTest {
    @Autowired
    private TransferenciaService transferenciaService;

    @Test
    public void findByName(){
        List<Transferencia> list = transferenciaService.findByCustom(new TransferenciaDto("bel"));
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals("beltrano", list.get(0).getNome_operador_transacao().toLowerCase(Locale.ROOT));
    }

   @Test
    public void filterWithDate() {
        String inicio = "2019-01-01 00:00:00";
        String fim = "2020-01-01 23:59:59";
        List<Transferencia> list = transferenciaService.findByCustom(new TransferenciaDto(inicio, fim));
        Assertions.assertEquals(4, list.size());
        list.forEach(x -> {
            Assertions.assertTrue(x.getData_transferencia().isAfter(LocalDateTime.parse("2019-01-01T00:00:00")));
            Assertions.assertTrue(x.getData_transferencia().isBefore(LocalDateTime.parse("2020-01-01T23:59:59")));
        });

    }

    @Test
    public void doubleWithTwoPointers(){
        double numero = transferenciaService.roundTwoPlaces(2.555);
        Assertions.assertEquals(2.56, numero);
    }
}
