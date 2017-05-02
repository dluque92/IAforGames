package Jugadores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ConectaK.DivisionTablero;
import EspacioJuego.EstadoJuego;

public class JugadorOpciones implements Jugador{

	@Override
	public EstadoJuego mueve(EstadoJuego e) {
		DivisionTablero div = (DivisionTablero) e;
		if(div.turno1()){
			System.out.println("Elige <- (0) ó -> (1)");
		}
		
		int hijo = Movimiento();
		return div.hijos().get(hijo);
	}

	private int Movimiento(){
		int movimiento = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("¿Que mitad eliges?: ");
			String salida = br.readLine();
			movimiento = Integer.parseInt(salida);
		}catch(IOException e){
			e.getMessage();
		}
		return movimiento;
		
	}
}
