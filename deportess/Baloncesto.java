package diciembre.deporte;


    class Baloncesto extends Deportes {
        private int numeroJugadores;
        private int numeroArbitros;
    
        public Baloncesto() {
            super("Baloncesto");
            this.numeroJugadores = 5;
            this.numeroArbitros = 3;
        }
    
        @Override
        public void mostrarDetalles() {
            System.out.println("Deporte: " + getNombre());
            System.out.println("Número de jugadores: " + numeroJugadores);
            System.out.println("Número de árbitros: " + numeroArbitros);
        }
    }
    
