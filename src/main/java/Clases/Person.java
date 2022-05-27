
package Clases;

import java.util.Date;
/**
 *
 * @author Miguel Muñoz Estrada 
 */
public class Person {

   
      private String name;
      private String lastName1;
      private String lastName2;
      private Date dateBirth;
      private float height;
      private String gender; //genero Masculino o Femenino 

    
      
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
    
    
     // get y set que creo que faltan
    
    /**
     * Optener Primer apellido
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Ingresa el primer apellido
     * @param lastName1 Ingresa un String
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Optener Segundo apellido
     */
    public String getLastName2() {
        return lastName2;
    }
    
    /**
     * Ingresa el Segundo apellido
     * @param lastName2 Ingresa un String
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Optener altura de la persona
     */
    public float getHeight() {
        return height;
    }
    /**
     * Ingresa cuanto mide la persona
     * @param height En cm ej: 172.5 , no usar letras
     */
    public void setHeight(float height) {
        this.height = height;
    }
    /**
     * Optener fecha de nacimiento
     */
    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * Ingresa La fecha de nacimiento
     * @param dateBirth Ingresa con el formato AAAA-MM-DD
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    /**
     * Optener el genero
     */
    public String getGender() {
        return gender;
    }
    /**
     * Ingresa el genero
     * @param gender Masculino o femenido
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
