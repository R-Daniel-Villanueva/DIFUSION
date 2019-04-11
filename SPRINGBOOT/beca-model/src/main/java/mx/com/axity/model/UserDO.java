package mx.com.axity.model;

import javax.persistence.*;

//DECLARACION DE LA ESTRUCTURA DE LA TABLA A USARSE
@Entity
@Table(name = "t_users", schema = "public")
public class UserDO {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usersSeq")
  @SequenceGenerator(name="usersSeq",sequenceName = "t_users_id_seq",allocationSize = 1)
//DECLARACION DE VARIABLES Y DEFINICION DE COLUMNAS
  @Column (name="id")
  private Long id;
  @Column (name="name")
  private String name;
  @Column (name="lastname")
  private String lastname;
  @Column (name="secondname")
  private String secondname;
  @Column (name="username")
  private String username;
  @Column (name="password1")
  private String password1;
  @Column (name="password2")
  private String password2;

  //CONSTRUCTOR VACIO
  protected UserDO() {
  }

  public UserDO(String name, String lastname, String secondname, String username, String password1, String password2) {
    this.name = name;
    this.lastname = lastname;
    this.secondname = secondname;
    this.username = username;
    this.password1 = password1;
    this.password2 = password2;
  }
//METODOS GETTER Y SETTER
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getSecondname() {
    return secondname;
  }

  public void setSecondname(String secondname) {
    this.secondname = secondname;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword1() {
    return password1;
  }

  public void setPassword1(String password1) {
    this.password1 = password1;
  }

  public String getPassword2() {
    return password2;
  }

  public void setPassword2(String password2) {
    this.password2 = password2;
  }

/*
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usersSeq")
    @SequenceGenerator(name = "usersSeq", sequenceName = "users_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;
    @Column(name = "ds_name")
    private String name;
    @Column(name = "ds_lastname")
    private String lastName;
    @Column(name = "age")
    private int age;

    protected UserDO() {
    }

    public UserDO(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
*/
}

