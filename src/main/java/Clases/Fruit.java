

package Clases;
import java.util.ArrayList;

public class Fruit {
    
    private String name;
    private float averageWeight;
    private ArrayList<String> colors = new ArrayList<String>();
    private String taste; // Sabor
    
    //Get y set requeridos
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
    //Get y set a completar
    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    
    
}
