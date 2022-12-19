package br.com.banco.model.repository;

import br.com.banco.model.enteties.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

@Repository
public class UserCustomRepository {

    private final EntityManager em;

    public UserCustomRepository(EntityManager em) {
        this.em = em;
    }

    public List<User> find(Long id , String name, Date data_inicio){
    String query = "select U from users as U ";
    String condicao = "where";
    if(id != null){
        query += condicao + " P.id = :id ";
        condicao = "and";
    }
    if (name != null ) {
        query += condicao + " P.nomeOperadorTranscionado = :nomeOperadorTranscionado";
        condicao = "and";
    }
    if (data_inicio != null) {
        query += condicao + " P.dataInicio = :dataInicio";
    }
    var q = em.createQuery(query, User.class);

        if(id != null){
            q.setParameter("id", id);
        }
        if (name != null ) {
            q.setParameter("nomeOperadorTranscionado", name);
        }
        if (data_inicio != null) {
            q.setParameter("dataInicio", data_inicio);
        }
        return q.getResultList();
    }
}
