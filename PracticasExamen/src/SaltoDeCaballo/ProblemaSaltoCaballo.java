package SaltoDeCaballo;

import EspacioDeEstados.Problema;

public class ProblemaSaltoCaballo extends Problema<Tablero>{

	public ProblemaSaltoCaballo(Tablero t) {
		this.ini = t;
	}
	
	@Override
	public boolean esFinal(Tablero e) {
		
		boolean esFinal = false;
		if(e.filas * e.columnas == e.tablero[e.posX][e.posY]){
			esFinal = true;
		}
		return esFinal;
	}
}
