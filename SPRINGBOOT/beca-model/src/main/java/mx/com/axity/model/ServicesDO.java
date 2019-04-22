package mx.com.axity.model;

public class ServicesDO {

  private Long id;
  private Long costo;
  private String servicio;
  private String descripcion;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCosto() {
    return costo;
  }

  public void setCosto(Long costo) {
    this.costo = costo;
  }

  public String getServicio() {
    return servicio;
  }

  public void setServicio(String servicio) {
    this.servicio = servicio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public ServicesDO() {
  }

  public ServicesDO(Long id, Long costo, String servicio, String descripcion) {
    this.id = id;
    this.costo = costo;
    this.servicio = servicio;
    this.descripcion = descripcion;
  }

}
