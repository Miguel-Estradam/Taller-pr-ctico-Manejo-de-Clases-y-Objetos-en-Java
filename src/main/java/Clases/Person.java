
package Clases;

import java.util.Date;
/**
 *
 * @author Miguel Muñoz Estrada 
 */
public class Person {

   
      public String name;
      public String lastName1;
      public String lastName2;
      public Date dateBirth;
      public float height;
      public String gender; //genero Masculino o Femenino 

    
      
    //Get y set requeridos
     /**
     * Optener nombre
     */
     public String getName() {
        return name;
    }
     /**
     * Ingresa el primer nombre
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    } 
    
    
    
}
