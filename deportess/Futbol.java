package diciembre.deporte;

final class Futbol extends Deportes {

        private int numeroJugadores;
        private int numeroArbitros;
    
        public Futbol() {
            super("Fútbol");
            this.numeroJugadores = 11;
            this.numeroArbitros = 1;
        }
    
        @Override
        public void mostrarDetalles() {
            System.out.println("Deporte: " + getNombre());
            System.out.println("Número de jugadores: " + numeroJugadores);
            System.out.println("Número de árbitros: " + numeroArbitros);
        }
}
    
