package Puzzle8;

import EspacioDeEstados.Problema;

public class ProbPuzzleHNumPD extends Problema<Puzzle>{

	public ProbPuzzleHNumPD(Puzzle p){
		this.ini = p;
	}
	
	@Override
	 public int h (Puzzle p){
		 int cont = 0;
		 int pos = 0;
		 for(int i = 0; i < p.nf(); i++){
			 for(int j = 0; j < p.nc(); j++){
				 if (p.tab[i][j] != pos && p.tab[i][j] != 0) {
	                    cont++;
	                    pos++;
	                } else {
	                    pos++;
	                }
			 }
		 }
		 return cont;
	 }
	    
	
	@Override
	public boolean esFinal(Puzzle e) {
		int cont = 0;

        for (int i = 0; i < e.tab.length; i++) {
            for (int j = 0; j < e.tab[0].length; j++) {
                if (e.tab[i][j] != cont) {
                    return false;
                } else {
                    cont++;
                }
            }
        }

        return true;
	}

}
