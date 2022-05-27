/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Student {
    
    //Variables del estudiante
    private int code;
    private String name;
    private String lastName;
    private String course;
    private float punctuation;
    protected boolean approve;
    
    
    /*set del estudiante, este metodo es para igresar al estudiante con los campos
     nombre, apellido, curso, nota final
    y valida si el estudiante aprobo o no aprovo
    */
    
    
    
    /**
     * Ingresar estudiante
     * @param code codigo del estudiante
     * @param name nombre del estudiante
     * @param lastName apellido del estudiante
     * @param course grado que cursa
     * @param punctuation nota final
     */
    public  Student(int code, String name, String lastName,String course,float punctuation){
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
        this.punctuation = punctuation;
        if(punctuation > 6){
            this.approve = true;
        }else{
            this.approve = false;
        }
    }
    
    // devuelve el estado del estudiante
    /**
     * Devuelve el si el estudiante aprobo o no aprobo
     * @param code codigo del estudiante
     * @return 
     */
     public String isApprove(int code) {
         String aprobo = null;
         if(code == this.code){
             if(this.approve == true){
                 aprobo = "El estudiante aprobo";
             }else{
                 aprobo = "El estudiante reprobo";
             }
         }else{
            aprobo = "Estudiante no encontrado";
            
         }
        return aprobo;
        
        
    }
}
