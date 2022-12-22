package br.com.banco.model.mapper;

import br.com.banco.model.enteties.Transferencia;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface TransferenciaMapper {

    @Select(value = "Select * from transferencia t" + " where ( {#nome, jdbcType=VARCHAR} is null or lower(p.nome_operador_transacao) like lower(concat('%', {#nome, jdbcType=VARCHAR}, '%')))" +
            " and (( (#{inicio, jdbcType=TIMESTAMP} is null) or (#{fim, jdbcType=TIMESTAMP} is null) ) or " +
            " p.data_transferencia between #{inicio, jdbcType=TIMESTAMP} and #{fim, jdbcType=TIMESTAMP})" +
            " and (#{conta, jdbcType=BIGINT} IS NULL or t.conta_id = #{conta})")
    public List<Transferencia> filter(@Param("nome") String nome, @Param("data_inicio") Date inicio , @Param("data_fim") Date fim , @Param("conta") Long conta);

    @Insert(value = "insert into ...")
    public void insert(Transferencia transferencia);
}


//select * from transferencia p" +
//        " where ( {#nome, jdbcType=VARCHAR} is null or lower(p.nome_operador_transacao) like lower(concat('%', {#nome, jdbcType=VARCHAR}, '%')))" +
//        " and (( (#{inicio, jdbcType=TIMESTAMP} is null) or (#{fim, jdbcType=TIMESTAMP} is null) ) or " +
//        " p.data_transferencia between #{inicio, jdbcType=TIMESTAMP} and #{fim, jdbcType=TIMESTAMP})" +
//        " and (#{conta, jdbcType=BIGINT} IS NULL or t.conta_id = #{conta})")
//public List<Transferencia> getUserWithCustom(@Param("nome") String nome,