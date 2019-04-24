package mx.com.axity.model;

import javax.persistence.*;

@Entity
@Table(name = "t_services", schema = "public")
public class ServicesDO {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "servicesSeq")
  @SequenceGenerator(name="servicesSeq",sequenceName = "t_services_id_seq",allocationSize = 1)

  @Column (name="id")
  private Long id;
  @Column (name="name")
  private String name;
  @Column (name="description")
  private String description;
  @Column (name="mail")
  private String mail;
  @Column (name="phone")
  private String phone;
  @Column (name="ubication")
  private String ubication;
  @Column (name="address")
  private String address;
  @Column (name="views")
  private Long views;
  @Column (name="picture")
  private String picture;
  @Column (name="fk_kind")
  private Long fk_kind;

  public ServicesDO(String name, String description, String mail, String phone, String ubication, String address, Long views, String picture, Long fk_kind) {
    this.name = name;
    this.description = description;
    this.mail = mail;
    this.phone = phone;
    this.ubication = ubication;
    this.address = address;
    this.views = views;
    this.picture = picture;
    this.fk_kind = fk_kind;
  }

  public ServicesDO() {
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getUbication() {
    return ubication;
  }

  public void setUbication(String ubication) {
    this.ubication = ubication;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Long getViews() {
    return views;
  }

  public void setViews(Long views) {
    this.views = views;
  }

  public Long getFk_kind() {
    return fk_kind;
  }

  public void setFk_kind(Long fk_kind) {
    this.fk_kind = fk_kind;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

}
