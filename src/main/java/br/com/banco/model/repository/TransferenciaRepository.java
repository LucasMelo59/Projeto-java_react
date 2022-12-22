package br.com.banco.model.repository;

import br.com.banco.model.enteties.Conta;
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
            " and (( (:inicio is null) or (:fim is null) ) or " +
            " p.data_transferencia between TO_TIMESTAMP(cast(:inicio as text),'YYYY-MM-DD HH24:MI:SS') and TO_TIMESTAMP(cast(:fim as text),'YYYY-MM-DD HH24:MI:SS'))" +
            " and ((coalesce(:conta, NULL) is null) or (:conta = p.conta_id))", nativeQuery = true)
    public List<Transferencia> getUserWithCustom(@Param("nome") String nome, @Param("inicio") String inicio, @Param("fim") String fim , @Param("conta")Integer conta);
}
