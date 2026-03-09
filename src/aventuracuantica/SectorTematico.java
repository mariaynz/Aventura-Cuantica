/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventuracuantica;
import java.util.ArrayList;

/**
 *
 * @author mariayanezojeda
 */
public class SectorTematico {
    // atributos
    private final String nombreDelSector;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Atraccion> atracciones;
    
    // constructor
    public SectorTematico(String nombreDelSector) {
        this.nombreDelSector = nombreDelSector;
        this.atracciones = new ArrayList<>();
        this.trabajadores = new ArrayList<>();
    }
    
    // getters
    public String getNombreDelSector(){
        return nombreDelSector;
    }
    public ArrayList<Trabajador> getTrabajadores(){
        return trabajadores;
    }
    public ArrayList<Atraccion> getAtracciones(){
        return atracciones;
    }
    
    // metodos
    public void agregarTrabajador(Trabajador t){
        trabajadores.add(t);
    }
    public void agregarAtraccion(Atraccion a){
        atracciones.add(a);
    }
    
    
}
