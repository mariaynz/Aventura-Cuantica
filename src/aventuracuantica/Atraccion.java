/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventuracuantica;

/**
 *
 * @author mariayanezojeda
 */
public abstract class Atraccion implements Auditable{
    // atributos
    private final String nombreAtraccion;
    private final int capacidadMax;
    private EstadoAtraccion estado;
    
    // constructor
    public Atraccion(String nombreAtraccion, int capacidadMax, EstadoAtraccion estado){
        this.nombreAtraccion = nombreAtraccion;
        this.capacidadMax = capacidadMax;
        this.estado = estado;
    }
    
    // metodos
    public abstract void arrancar();
    
    // getter
    public String getNombreAtraccion(){
        return nombreAtraccion;
    }
    public int getCapacidadMax(){
        return capacidadMax;
    }
    public EstadoAtraccion getEstado(){
        return estado;
    }
    
    // setters
    public void setEstado(EstadoAtraccion estado){
        this.estado = estado;
    }
    
}
