package mx.com.axity.persistence;

import mx.com.axity.model.ServicesDO;
import mx.com.axity.model.UserDO;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ServicesDAO extends CrudRepository<ServicesDO, Long> {
  List<UserDO> findAllByName(String name);
}
