package SaltoDeCaballo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import EspacioDeEstados.Estado;

public class Tablero extends Estado{

	public int[][] tablero;
	public int posX;
	public int posY;
	public int filas;
	public int columnas;
	
	public Tablero(int[][] tab, int x, int y) {
		tablero = tab;
		posX = x;
		posY = y;
		filas = tab.length;
		columnas = tab[0].length;
	}
	
	@Override
	public List<Tablero> hijos() {
		List<Tablero> hijos = new ArrayList<Tablero>();
		//Dos arriba, uno izquierda
		if(posX - 2 > -1 && posY - 1 > -1 && tablero[posX-2][posY-1] == 0){
			Tablero tableroHijo = crearTablero(posX-2, posY-1);
			hijos.add(tableroHijo);
		}
		//Dos arriba, uno derecha
		if(posX - 2 > -1 && posY + 1 < columnas && tablero[posX-2][posY+1] == 0){
			Tablero tableroHijo = crearTablero(posX-2, posY+1);
			hijos.add(tableroHijo);
		}
		//Uno arriba, dos izquierda
		if(posX - 1 > -1 && posY - 2 > -1 && tablero[posX-1][posY-2] == 0){
			Tablero tableroHijo = crearTablero(posX-1, posY-2);
			hijos.add(tableroHijo);
		}
		//Uno abajo, dos izquierda
		if(posX + 1 < filas && posY -2 > -1 && tablero[posX+1][posY-2] == 0){
			Tablero tableroHijo = crearTablero(posX+1, posY-2);
			hijos.add(tableroHijo);
		}
		//Dos abajo, uno izquierda
		if(posX + 2 < filas && posY - 1 > -1 && tablero[posX+2][posY-1] == 0){
			Tablero tableroHijo = crearTablero(posX+2, posY-1);
			hijos.add(tableroHijo);
		}
		//Dos abajo, uno derecha
		if(posX + 2 < filas && posY + 1 < columnas && tablero[posX+2][posY+1] == 0){
			Tablero tableroHijo = crearTablero(posX+2, posY+1);
			hijos.add(tableroHijo);
		}
		//Uno arriba, dos izquierda
		if(posX - 1 > -1 && posY + 2 < columnas && tablero[posX-1][posY+2] == 0){
			Tablero tableroHijo = crearTablero(posX-1, posY+2);
			hijos.add(tableroHijo);
		}
		//Uno abajo, dos izquierda
		if(posX + 1 < filas && posY +2 < columnas && tablero[posX+1][posY+2] == 0){
			Tablero tableroHijo = crearTablero(posX+1, posY+2);
			hijos.add(tableroHijo);
		}
		
		return hijos;
	}

	@Override
	public String toString() {
		String salida = "";
		for(int i = 0; i < filas; i++){
			salida += Arrays.toString(tablero[i]) + "\n";
		}
		return salida;
	}
	
	public Tablero crearTablero(int x, int y){
		int[][] tabHijo = new int[filas][columnas];
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				tabHijo[i][j] = tablero[i][j];
			}
		}
		tabHijo[x][y] = tabHijo[posX][posY] + 1;
		Tablero tablero = new Tablero(tabHijo, x, y);
		return tablero;
	}

}
