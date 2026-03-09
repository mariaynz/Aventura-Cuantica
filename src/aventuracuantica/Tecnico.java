/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventuracuantica;

/**
 *
 * @author mariayanezojeda
 */
public class Tecnico extends Trabajador {
    // atributos
    private String especialidad;
    
    // constructor
    public Tecnico(String nombre, float salarioBase, String especialidad) {
        super(nombre, salarioBase);
        this.especialidad = especialidad;
    }
    
    // getter
    public String getEspecialidad(){
        return especialidad;
    }
    
    // setter
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
}
