package TrasvaseMultiplesJarras;

import EspacioDeEstados.Problema;

public class ProbJarras extends Problema<Jarra>{

	public ProbJarras(Jarra e) {
		this.ini = e;
	}
	
	@Override
	public boolean esFinal(Jarra e) {
		boolean esFinal = true;
		int tam = e.jarras[0].length;
		int[] jarraFinal = {0,11,6,0,0,0};
		int i = 0;
		while(esFinal && i < tam){
			if(e.jarras[1][i] != jarraFinal[i]){
				esFinal = false;
			}
			i++;
		}
		return esFinal;
	}

}