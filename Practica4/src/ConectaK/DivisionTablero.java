package ConectaK;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import EspacioJuego.EstadoJuego;
import EspacioJuego.Ficha;

public class DivisionTablero implements EstadoJuego{

	private int[][] tablero;
	private boolean turno1;	
	
	private static final Ficha Jugador1 = new Ficha('1');
	private static final Ficha Jugador2 = new Ficha('2');
	
	public DivisionTablero(int tam) {
		try {
			double pot = tam;
			while(pot > 1){
				pot = pot/2;
			}
			if(pot != 1){
				throw new Exception("El tablero tiene que ser múltiplo de 2.");
			}
			turno1 = true;
			tablero = new int[tam][tam];
			Random r = new Random();
			
			for(int i = 0; i < tam; i++){
				for(int j = 0; j < tam; j++){
					tablero[i][j] = r.nextInt(2);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public DivisionTablero(int[][] tab, boolean b) {
		tablero = tab;
		turno1 = b;
	}
	
	public String toString(){
		String salida = "";
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				salida += tablero[i][j] + " " ; 
			}
			salida += "\n";
		}
		return salida;
	}

	@Override
	public List<EstadoJuego> hijos() {
		List<EstadoJuego> hijos = new ArrayList<EstadoJuego>();
		if (turno1) {
			//Turno humano
			int[][] parteIzq = crearHijo(tablero, "izquierda");
			int[][] parteDer = crearHijo(tablero, "derecha");

			hijos.add(new DivisionTablero(parteIzq, false));
			hijos.add(new DivisionTablero(parteDer, false));
		} else {
			// Turno aleatorio
			int[][] parteArriba = crearHijo(tablero, "arriba");
			int[][] parteAbajo = crearHijo(tablero, "abajo");

			hijos.add(new DivisionTablero(parteArriba, true));
			hijos.add(new DivisionTablero(parteAbajo, true));
		}
		return hijos;
	}

	private int[][] crearHijo(int[][] tab, String mov) {
		int[][] nuevoTablero = null;
		switch(mov){
		case "izquierda":
			nuevoTablero = new int[tab.length][tab.length/2];
			for(int i = 0; i < tab.length; i++){
				for(int j = 0; j < tab.length/2; j++){
					nuevoTablero[i][j] = tab[i][j];
				}
			}
			break;
			
		case "derecha":
			nuevoTablero = new int[tab.length][tab.length/2];
			for(int i = 0; i < tab.length; i++){
				int k = 0;
				for(int j = tab.length/2; j < tab.length; j++){
					nuevoTablero[i][k] = tab[i][j];
					k++;
				}
			}
			break;
			
		case "abajo":
			nuevoTablero = new int[tab.length/2][tab[0].length];
			int k = 0;
			for(int i = tab.length/2; i < tab.length; i++){
				for(int j = 0; j < tab[0].length; j++){
					nuevoTablero[k][j] = tab[i][j];
				}
				k++;
			}
			break;
			
		case "arriba":
			nuevoTablero = new int[tab.length/2][tab[0].length];
			for(int i = 0; i < tab.length/2; i++){
				for(int j = 0; j < tab[0].length; j++){
					nuevoTablero[i][j] = tab[i][j];
				}
			}
			break;
		}
		
		return nuevoTablero;
	}

	@Override
	public Ficha ganador() {
		Ficha ganador = null;
		if(tablero.length*tablero[0].length == 1){
			if(tablero[0][0] == 0){
				ganador = Jugador1;
			}else{
				ganador = Jugador2;
			}
		}
		return ganador;
	}

	@Override
	public boolean agotado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean turno1() {
		// TODO Auto-generated method stub
		return turno1;
	}

	@Override
	public Ficha fichaActual() {
		Ficha actual = null;
		if(turno1){
			actual = Jugador1;
		}else{
			actual = Jugador2;
		}
		return actual;
	}

	@Override
	public Ficha fichaOtro() {
		Ficha actual = null;
		if(!turno1){
			actual = Jugador1;
		}else{
			actual = Jugador2;
		}
		return actual;
	}

	@Override
	public void ver() {
		System.out.println("Turno del jugador: " + fichaActual());
		System.out.println(toString());
		
	}
}
