package br.com.banco.model.mapper;

import br.com.banco.model.enteties.Transferencia;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TransferenciaMapper {

    @Select(value = "Select * from transferencia t where (#{conta, jdbcType=BIGINT} IS NULL or t.conta_id = #{conta})")
    public List<Transferencia> filter(@Param("conta") Long conta);

    @Insert(value = "insert into ...")
    public void insert(Transferencia transferencia);
}


//select * from transferencia p" +
//        " where ( :nome is null or lower(p.nome_operador_transacao) like lower(concat('%', :nome, '%')))" +
//        " and (( (:inicio is null) or (:fim is null) ) or " +
//        " p.data_transferencia between TO_TIMESTAMP(cast(:inicio as text),'YYYY-MM-DD HH24:MI:SS') and TO_TIMESTAMP(cast(:fim as text),'YYYY-MM-DD HH24:MI:SS'))" +
//        " and ((coalesce(:conta, NULL) is null) or (:conta = p.conta_id))", nativeQuery = true)
//public List<Transferencia> getUserWithCustom(@Param("nome") String nome,