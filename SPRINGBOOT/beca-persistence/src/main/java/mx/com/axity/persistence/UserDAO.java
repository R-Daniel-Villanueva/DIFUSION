package mx.com.axity.persistence;

import mx.com.axity.model.UserDO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface UserDAO extends CrudRepository<UserDO, Long> {

    List<UserDO> findBypass(String id);
    //List<UserDO> findByUserAndPass(String user,String pass);

    @Query("SELECT u FROM UserDO u WHERE u.user=?1 and u.pass=?2")
    UserDO validateUserAndPass(String user,String pass);

    //Optional<UserDO> findByuserAndpass(String username, String userpass);
}
