package br.com.banco.model.repository;

import br.com.banco.model.enteties.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer> {
    @Query(value = " select * from transferencia p" +
            " where ( :nome is null or lower(p.nome_operador_transacao) like lower(concat('%', :nome, '%')))" +
            " and ( :data is null or (p.data_transferencia >= :data or p.data_transferencia <= :data))", nativeQuery = true)
    public List<Transferencia> getUserWithCustom(@Param("nome") String nome,  @Param("data") Date data );
}
