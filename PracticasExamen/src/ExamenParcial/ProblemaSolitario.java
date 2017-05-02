package ExamenParcial;

import EspacioDeEstados.Problema;

public class ProblemaSolitario extends Problema<Solitario>{

	public ProblemaSolitario(Solitario e) {
		this.ini = e;
	}
	
	@Override
	public boolean esFinal(Solitario e) {
		boolean esFinal = true;
		int tam = e.cartas.length*2;
		int i = 1;
		while(i < tam && esFinal){
			for(int k = 0; k < 2; k++){
				for(int j = e.cartas.length-1; j > -1; j--){
					if(e.cartas[j][k] != i){
						esFinal = false;
					}
					i++;
				}
			}
		}
		return esFinal;
	}

}
