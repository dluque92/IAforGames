package Examen;

import EspacioDeEstados.Problema;

public class PSolitario extends Problema<Solitario>{
	
	public PSolitario(Solitario s) {
		this.ini = s;
	}

	@Override
	public boolean esFinal(Solitario e) {
		boolean esFinal = false;
		int cont = 1;
		int[][] tab = e.getSolitario();
		int tam = tab.length*2;
		for(int i = 0; i < 2; i++){
			for(int j = tab.length - 1; j > -1; j--){
				if(tab[j][i] == cont){
					cont++;
				}
			}
		}
		if(cont-1 == tam){
			esFinal = true;
		}
		return esFinal;
	}

}
