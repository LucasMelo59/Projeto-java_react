package br.com.banco.model.repository;

import br.com.banco.model.enteties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = " select * from transferencia p\n" +
            "          where ( :nome is null or lower(p.nome_operador_transacao) like lower(concat('%', :nome, '%')))\n" +
            "          and ( :id is null or p.id = :id)\n" +
            "          and ( :data is null or (p.data_transferencia >= :data or p.data_transferencia <= :data))", nativeQuery = true)
    public List<User> getUserWithCustom(@Param("nome") String name, @Param("id") Integer id,@Param("data") Date data );
}
