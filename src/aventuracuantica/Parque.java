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

public class Parque {
    // atributos
      private ArrayList<SectorTematico> sectores; 
      private ArrayList<CarritoDeGolf> carritos;
      private final String nombreParque;
      
      
      // constructor
      public Parque(String nombreParque){
          this.sectores = new ArrayList<>();
          this.carritos = new ArrayList<>();
          this.nombreParque = nombreParque;
          
      }
      
      // GETTERS
      public ArrayList<SectorTematico> getSectores(){
          return sectores;
      }
      
      public ArrayList<CarritoDeGolf> getCarritos(){
          return carritos;
      }
              
      // metodos
          
      public void arrancarParque(){ // arrancar atracciones
          for(SectorTematico sector : sectores){
              for(Atraccion atraccion : sector.getAtracciones()){
                  atraccion.arrancar();
              }
          }
      }
      
      public void agregarSector(SectorTematico s){
          sectores.add(s);
      }
      
      public void agregarCarrito(CarritoDeGolf c){
          carritos.add(c);
      }
      
      
}
