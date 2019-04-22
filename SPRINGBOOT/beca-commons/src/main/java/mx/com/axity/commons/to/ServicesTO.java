package mx.com.axity.commons.to;

import java.io.Serializable;

public class ServicesTO implements Serializable {
  private Long id;
  private String name;

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

  private String description;
  private String mail;
  private String phone;
  private String ubication;
  private String address;
  private Long views;
  private Long fk_kind;

}
