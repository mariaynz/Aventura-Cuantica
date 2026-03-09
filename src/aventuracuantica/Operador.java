/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventuracuantica;

/**
 *
 * @author mariayanezojeda
 */
public class Operador extends Trabajador {
    // atributos
    private int nivelCertificacion;
    
    // constructor
    public Operador(String nombre, float salarioBase, int nivelCertificacion) {
        super(nombre, salarioBase);
        this.nivelCertificacion = nivelCertificacion;
    }
    
    // getter
    public int getNivelCertificacion(){
        return nivelCertificacion;
    }
    
    // setter
    public void setNivelCertificacion(int nivelCertificacion){
        this.nivelCertificacion = nivelCertificacion;
    }
}
