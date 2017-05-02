package EspacioJuego;

import ConectaK.DivisionTablero;
import Jugadores.Jugador;
import Jugadores.JugadorAleatorio;
import Jugadores.JugadorOpciones;

public class TestDivisionTablero{

	public static void main(String[] args) {

		DivisionTablero tablero = new DivisionTablero(16);
		
		Jugador j1 = new JugadorOpciones();
		Jugador j2 = new JugadorAleatorio();
		
		Juego juego = new Juego(j1,j2,tablero);
		int ganador = juego.jugarPartida(true);
		
		if(ganador == 1){
			System.out.println("Ha ganado el jugador 1");
		}else{
			System.out.println("Ha ganado el jugador 2");
		}
	}

}
