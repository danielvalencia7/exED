package com.huerta.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import com.huerta.model.Property;

@ManagedBean(name="obj")
@RequestScoped
public class ViewManager implements Serializable{
//private Property item = new Property();
  private String key;
  private String value;
  private String mensaje;

  public String getMensaje() {
    return mensaje;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
  
  public String add() {
    System.out.println("--" + this.key + " | " + this.value + "--");
    setValue(this.value + "<--- Añadido");
    this.mensaje="Alta realizada correctamente";
    return "vista2";
  }
}
