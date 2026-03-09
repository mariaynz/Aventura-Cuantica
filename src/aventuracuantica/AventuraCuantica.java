/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aventuracuantica;
import static aventuracuantica.EstadoAtraccion.Abierto;
import static aventuracuantica.EstadoAtraccion.Cerrado;

/**
 *
 * @author mariayanezojeda
 */
public class AventuraCuantica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creacion del parque
        Parque parque = new Parque("Aventura Cuántica");
        
        /// Sectores tematicos
        SectorTematico ciberPunk = new SectorTematico("Zona Ciberpunk");
        SectorTematico jurasico = new SectorTematico("Zona Jurásica");
        SectorTematico universe = new SectorTematico("Zona Galáctica");
        parque.agregarSector(ciberPunk);
        parque.agregarSector(jurasico);
        parque.agregarSector(universe);
        
        
        // atracciones
        // zona jurasica
        SimuladorDeRV dinoSimulator = new SimuladorDeRV("Dinosaur Simulator", 5, Abierto, 10.0f);
        MontanaRusa dinoRide = new MontanaRusa("Dino Xtreme", 20, Cerrado, 20f, 100);
        jurasico.agregarAtraccion(dinoSimulator);
        jurasico.agregarAtraccion(dinoRide);
        
        // zona ciberpunk
        SimuladorDeRV punkSimulator = new SimuladorDeRV("CiberPunk Simulator", 7, Abierto, 6.7f);
        MontanaRusa punkRide = new MontanaRusa("Punkss", 30, Abierto, 60.02f, 300f);
        ciberPunk.agregarAtraccion(punkSimulator);
        ciberPunk.agregarAtraccion(punkRide);
        
        // Zona Galáctica
        SimuladorDeRV starRv = new SimuladorDeRV("Spaceship simulator", 4, Abierto, 9.0f);
        MontanaRusa starRide = new MontanaRusa("Stars", 13, Abierto, 200f, 1000f);
        universe.agregarAtraccion(starRv);
        universe.agregarAtraccion(starRide);
        
        // carrito golf
        CarritoDeGolf carrito = new CarritoDeGolf(100, 134340);
        parque.agregarCarrito(carrito);
          
  
        // trabajadores
        Operador op1 = new Operador("María", 100000f, 5);
        Tecnico tec1 = new Tecnico("Cristina", 13434f, "mecánica");
        universe.agregarTrabajador(op1);
        universe.agregarTrabajador(tec1);
        
        Operador op2 = new Operador("Isis", 78000f, 4);
        Tecnico tec2 = new Tecnico("Leandro", 69f, "eléctrico");
        jurasico.agregarTrabajador(op2);
        jurasico.agregarTrabajador(tec2);
        
        Operador op3 = new Operador("Carlos", 67f, 1);
        Tecnico tec3 = new Tecnico("Andrés", 1234f, "eléctrico");
        ciberPunk.agregarTrabajador(op3);
        ciberPunk.agregarTrabajador(tec3);       
        
        parque.arrancarParque();
    }
    
}
