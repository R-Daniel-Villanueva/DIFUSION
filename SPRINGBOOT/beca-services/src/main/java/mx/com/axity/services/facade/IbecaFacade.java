package mx.com.axity.services.facade;

import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.commons.to.ServicesTO;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.ServicesDO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaFacade {

  /*INICIA CONFIGURACION DEL USUARIO*/
    List<UserTO> getAllUsers();
    void saveUser(UserTO userTO);
  /*TERMINA CONFIGURACION DEL USUARIO*/
  /*INICIA CONFIGURACION DE LOS SERVICIOS*/
    List<ServicesTO>getAllServices();
    void saveServices(ServicesTO servicesTO);
  /*TERMINA CONFIGURACION DE LOS SERVICIOS*/




  /*
    int operation(int num1, int num2);

    List<UserTO> getAllUsers();

    void createUser(UserTO userTO);
    void updateUser(UserTO userTO);
    UserTO readUser(int id);
    void deleteUser(int id);

    List<LoginTO> getAllLogins();

    void createLogin(LoginTO loginTO);
    void updateLogin(LoginTO loginTO);
    LoginTO readLogin(int id);
    void deleteLogin(int id);

    UserTO makeLogin(LoginTO loginTO);
*/
}
