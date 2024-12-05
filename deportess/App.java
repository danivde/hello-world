package diciembre.deporte;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        Deporte futbol = new Futbol();
        Deporte baloncesto = new Baloncesto();

        
        futbol.mostrarDetalles();
        System.out.println(); 
        baloncesto.mostrarDetalles();
    }
 // Crear una liga
        Liga ligaFutbol = new Liga("Liga Nacional de Fútbol");
        
        // Agregar equipos a la liga
        ligaFutbol.agregarEquipo("Real Madrid");
        ligaFutbol.agregarEquipo("Barcelona");
        ligaFutbol.agregarEquipo("Atlético de Madrid");

        // Mostrar información de la liga y los equipos
        System.out.println("Liga: " + ligaFutbol.getNombre());
        System.out.println("Equipos en la liga:");
        ligaFutbol.mostrarEquipos();

        // Crear instancias de los deportes
        List<Deporte> deportes = new ArrayList<>();
        deportes.add(new Futbol());
        deportes.add(new Baloncesto());

        // Mostrar información de cada deporte
        System.out.println("\nInformación de deportes:");
        for (Deporte deporte : deportes) {
            System.out.println("Deporte: " + deporte.getClass().getSimpleName());
            System.out.println("Número de jugadores: " + deporte.getNumeroJugadores());
            System.out.println("Número de árbitros: " + deporte.getNumeroArbitros());
            System.out.println("Descripción: " + deporte.getDescripcion());
            System.out.println();
        }
}

// fin de la clase




