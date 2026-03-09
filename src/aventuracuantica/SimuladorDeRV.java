/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventuracuantica;

/**
 *
 * @author mariayanezojeda
 */
public class SimuladorDeRV extends Atraccion {
    // atributo extra
    private float versionSoftware;

    
    // constructor
    public SimuladorDeRV(String nombreAtraccion, int capacidadMax, EstadoAtraccion estado, float versionSoftware) {
        super(nombreAtraccion, capacidadMax, estado);
        this.versionSoftware = versionSoftware;
    }

    /// metodo de la atraccion
    @Override
    public void arrancar() {
        System.out.println("Reinicidando computadoras...");
        System.out.println("Calibrando cascos...");
    }

    // getters
    public float getVersionSoftware(){
        return versionSoftware;
    }
    
    // setter
    public void setVersionSoftware(float versionSoftware){
        this.versionSoftware = versionSoftware;
    }
    
    // metodos de auditable
    @Override
    public float calcularIndiceDeRiesgo() {
       int riesgo = 0;
       if(versionSoftware >= 10) riesgo = 1;
        else if(versionSoftware >= 5) riesgo  = 3; 
        else  riesgo = 5;
       return riesgo;
    }

    @Override
    public String generarReporteDeSeguridad() {
        return "Reporte del Simulador de VR: " + getNombreAtraccion() + 
                "\nVersion del software: " + getVersionSoftware() + 
                "\nÍndice de riesgo: " + calcularIndiceDeRiesgo();
                
    }
    
    
}
