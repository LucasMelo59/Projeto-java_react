package br.com.banco.model.mapper;

import br.com.banco.model.enteties.Transferencia;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TransferenciaMapper {

    @Select(value = "Select * from transferencia t where ( #{nome, jdbcType=VARCHAR} is null or lower(t.nome_operador_transacao) like lower(concat('%', #{nome, jdbcType=VARCHAR}, '%')))" +
            " and ( ((#{inicio, jdbcType=VARCHAR} is null) or (#{fim, jdbcType=VARCHAR} is null)) or" +
            " t.data_transferencia between TO_TIMESTAMP(#{inicio}, 'YYYY-MM-DD HH24:MI:SS') and TO_TIMESTAMP(#{fim}, 'YYYY-MM-DD HH24:MI:SS'))" +
            " and (#{conta, jdbcType=BIGINT} IS NULL or t.conta_id = #{conta, jdbcType=BIGINT})")
    public List<Transferencia> filter(@Param("nome") String nome, @Param("inicio")String inicio, @Param("fim") String fim, @Param("conta") Long conta);

    @Insert(value = "insert into ...")
    public void insert(Transferencia transferencia);
}


//select * from transferencia p" +
//        " where ( {#nome, jdbcType=VARCHAR} is null or lower(p.nome_operador_transacao) like lower(concat('%', {#nome, jdbcType=VARCHAR}, '%')))" +
//        " and (( (#{inicio, jdbcType=TIMESTAMP} is null) or (#{fim, jdbcType=TIMESTAMP} is null) ) or " +
//        " p.data_transferencia between #{inicio, jdbcType=TIMESTAMP} and #{fim, jdbcType=TIMESTAMP})" +
//        " and (#{conta, jdbcType=BIGINT} IS NULL or t.conta_id = #{conta})")
//public List<Transferencia> getUserWithCustom(@Param("nome") String nome,