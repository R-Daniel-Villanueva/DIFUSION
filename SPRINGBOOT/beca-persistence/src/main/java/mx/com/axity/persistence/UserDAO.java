package mx.com.axity.persistence;

import mx.com.axity.model.UserDO;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UserDAO extends CrudRepository<UserDO, Long> {

//USO DEL UserDO UTILIZANDO METODOS DEL Crudepository
    List<UserDO> findByLastname(String lastname);

    //List<UserDO> findByLastName(String lastName);
}
