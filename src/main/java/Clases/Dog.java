
package Clases;

public class Dog {

    //Variables del perro
    
    public String name;
    public String race;
    private String nameOwner;
    public int age;
    
    /**
     * Nombre del perro
     */
    public String getName() {
        
        return name;
    }
    /**
     * Ingresar nombre del perro
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Raza del perro
     */
    public String getRace() {
        return race;
    }
    /**
     * Ingresar raza del perro
     */
    public void setRace(String race) {
        this.race = race;
    }
    /**
     * Dueño o propietario del perro
     * Validad si tiene dueño
     */
    public String getNameOwner() {
        if(this.nameOwner == " "){
            return "No tiene dueño";
        }else{
            return nameOwner;
            }
    }
    /**
     * Ingresar dueño del perro
     */
    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }
    /**
     * edad del perro
     */
    public int getAge() {
        return age;
    }
    /**
     * Ingrese la edad del perro
     * @param age Edad en años, si no tiene mas de 1 año ponga 0
     */
    public void setAge(int age) {
        this.age = age;
    }
}
