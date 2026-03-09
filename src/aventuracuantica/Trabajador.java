/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventuracuantica;

/**
 *
 * @author mariayanezojeda
 */
public abstract class Trabajador {
    // atributos
    private final String nombre;
    private final String id;
    private float salarioBase;
    private static int contadorID = 0;
    
    // constructor
    public Trabajador(String nombre, float salarioBase){
        contadorID++;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.id = "JKK-" + contadorID;
    }
    
    // getters
    public String getNombre(){
        return nombre;
    }
    public String getID(){
        return id;
    }
    public float getSalarioBase(){
        return salarioBase;
    }
    
    // setter
    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }
}
