/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventuracuantica;

/**
 *
 * @author mariayanezojeda
 */
public class MontanaRusa extends Atraccion {
    // atributos
    private final float velocidadMax;
    private final float longitudVia;
    
    // constructor
    public MontanaRusa(String nombreAtraccion, int capacidadMax, EstadoAtraccion estado, float velocidadMax, float longitudVia) {
        super(nombreAtraccion, capacidadMax, estado);
        this.velocidadMax = velocidadMax;
        this.longitudVia = longitudVia;
    }

    // getter
    public float getVelocidadMax(){
        return velocidadMax;
    }
    public float getLongitudVia(){
        return longitudVia;
    }
    
    // metodo proveniente de atraccion
    @Override
    public void arrancar() {
        System.out.println("Encendiendo motores de cadena...");
        System.out.println("Verificando frenos magnéticos...");
    }

    // metodos implementados de la interfaz auditable
    @Override
    public float calcularIndiceDeRiesgo() {
        float indice = 0;
        if(velocidadMax >= 200) indice = 5;
        else if(velocidadMax >= 150) indice = 4;
        else if(velocidadMax >= 100)  indice = 3;
        else if(velocidadMax >= 50) indice = 2;
        else indice = 1;
        return indice;
    }

    @Override
    public String generarReporteDeSeguridad() {
        return "Reporte de la Montaña Rusa: " + getNombreAtraccion() + 
           "\nVelocidad: " + velocidadMax + 
           "\nÍndice de riesgo: " + calcularIndiceDeRiesgo();
    }
    
}
