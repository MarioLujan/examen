/**
 *
 * @author Mario Lujan
 */
package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class productos extends Model {
 
    public Integer clave;
    public String descripcion;
    public Integer minima;
    public Integer stock;
    public float precio;
    
    public productos(String email, String password, String fullname) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.minima = minima;
        this.stock = stock;
      
        this.precio = precio;
    }
 
}