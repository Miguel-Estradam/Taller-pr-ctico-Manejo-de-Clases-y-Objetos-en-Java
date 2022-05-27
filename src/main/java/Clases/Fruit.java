

package Clases;
import java.util.ArrayList;

public class Fruit {
    
    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList<String>();
    public String taste; // Sabor
    
    //Get y set requeridos
    /**
     * Optener los colores de la fruta
     * @param colors nos retorna un arrayList
     */
    public ArrayList<String> getColors() {
        return colors;
    }
    /**
     * Ingresar los colores de la fruta
     * @param colors Ingresa un String
     */
    
    public void setColors(String colors) {
        this.colors.add(colors);
    }
    
    
    //Get y set a completar
    /**
     * Optener el peso promedio
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    
    
    
    /**
     * Ingresar el peso de la fruta
     * @param averageWeight float
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /**
     * Optener nombre de la fruta
     */
    public String getName() {
        return name;
    }
    /**
     * Ingresar el nombre de la fruta
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }
     /**
     * Optener sabor de la fruta
     */   
    public String getTaste() {
        return taste;
    }
/**
     * Ingresar el sabor de la fruta
     * @param name String
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }
    
    
}
