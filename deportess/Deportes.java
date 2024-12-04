package diciembre.deporte;

public class Deportes {
    public static void main(String[] args) {
        
        Deporte futbol = new Futbol();
        Deporte baloncesto = new Baloncesto();

        
        futbol.mostrarDetalles();
        System.out.println(); 
        baloncesto.mostrarDetalles();
    }
}


