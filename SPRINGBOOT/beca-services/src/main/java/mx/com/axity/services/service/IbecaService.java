package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.LoginDO;
import mx.com.axity.model.ServicesDO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {

  /*INICIA CONFIGURACION DEL USUARIO*/
    List<UserDO> getAllUsers();
    void saveUser(UserDO userDO);
  /*TERMINA CONFIGURACION DEL USUARIO*/
  /*INICIA CONFIGURACION DE LOS SERVICIOS*/
    List<ServicesDO>getAllServices();
    void saveServices(ServicesDO servicesDO);
  /*TERMINA CONFIGURACION DE LOS SERVICIOS*/








/*
    int sum(int sum1, int sum2);

    int substraction(int substraction1, int substraction2);

    int multiplication(int multiplication1);

    int division(int division1);

    List<UserDO> getAllUsers();

    void createUser(UserDO userDO);
    void updateUser(UserDO userDO);
    UserDO readUser(int id);
    void deleteUser(int id);

    List<LoginDO> getAllLogins();

    void createLogin(LoginDO loginDO);
    void updateLogin(LoginDO loginDO);
    LoginDO readLogin(int id);
    void deleteLogin(int id);

    UserDO makeLogin (LoginDO loginDO);
*/
}
