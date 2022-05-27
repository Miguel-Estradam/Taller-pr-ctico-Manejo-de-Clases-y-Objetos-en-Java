/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HP
 */
public class Client {
    
    

    /**
     * Variables cliente
     * @param id id del cliente
     * @param name nombre del cliente
     * @param frequent si el cliente es frecuente o no
     */
    private int id;
    private String name;
    public boolean frequent;
    
    /**
     * Ingresar el cliente
     * @param id Codigo del cliente
     * @param name Nombre del cliente
     * @param frequent Es frecuente si o no
     */
    public Client(int id, String name, boolean frequent){
        this.id = id;
        this.name = name;
        this.frequent = frequent;
        
    }
    /**
     * optiene el codigo del cliente
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Optener el nombre del cliente
     * 
     */
    public String getName() {
        return name;
    }
    /**
     * Obtiene si el cliente es frecuente o no
     */
    public boolean getFrequent() {
        return frequent;
    }
    
    
}
