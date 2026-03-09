/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventuracuantica;

/**
 *
 * @author mariayanezojeda
 */
public class CarritoDeGolf implements Auditable{

    // atributos
    private float nivelDeBateria;
    private final int numSerie;
    
    // constructor
    public CarritoDeGolf(float nivelDeBateria, int numSerie){
        this.nivelDeBateria = nivelDeBateria;
        this.numSerie = numSerie;
    }
    // getters y setters
    public float getNivelDeBateria(){
        return nivelDeBateria;
    }
    public int getNumSerie(){
        return numSerie;
    }
    
    public void setNivelDeBateria(float nivelDeBateria){
        if(nivelDeBateria > 100 || nivelDeBateria < 0){
            System.out.println("Nivel de bateria inválido");
            return;
    }
        this.nivelDeBateria = nivelDeBateria;
    }
    
    @Override
    public float calcularIndiceDeRiesgo() {
        int indice = 0;
        if(nivelDeBateria >= 80) indice = 1;
        else if(nivelDeBateria >= 60) indice = 2;
        else if(nivelDeBateria >= 40) indice = 3;
        else if(nivelDeBateria >= 20) indice = 4;
        else indice = 5;
            return indice;
    }

    @Override
    public String generarReporteDeSeguridad() {
        return "\nReporte del Carrito de Golf: " + getNumSerie() +
                "\nNivel de bateria: " + getNivelDeBateria() +
                "\nÍndice de riesgo: " + calcularIndiceDeRiesgo();
                
    }
    
}
