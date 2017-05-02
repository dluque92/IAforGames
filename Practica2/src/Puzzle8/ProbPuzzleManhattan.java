package Puzzle8;

import EspacioDeEstados.Problema;

public class ProbPuzzleManhattan extends Problema<Puzzle>{
	
	public ProbPuzzleManhattan(Puzzle p) {
		this.ini = p;
	}
	
	@Override
	public int h(Puzzle p){
		int cont = 0;
		for(int i = 0; i < p.nf(); i++){
			for(int j = 0; j < p.nc(); j++){
				switch (p.tab[i][j]) {
				case 1:
					cont += Math.abs(i-0) + Math.abs(j-1);
					break;
				case 2:
					cont += Math.abs(i-0) + Math.abs(j-2);
					break;
				case 3:
					cont += Math.abs(i-1) + Math.abs(j-0);
					break;
				case 4:
					cont += Math.abs(i-1) + Math.abs(j-1);
					break;
				case 5:
					cont += Math.abs(i-1) + Math.abs(j-2);
					break;
				case 6:
					cont += Math.abs(i-2) + Math.abs(j-0);
					break;
				case 7:
					cont += Math.abs(i-2) + Math.abs(j-1);
					break;
				case 8:
					cont += Math.abs(i-2) + Math.abs(j-2);
					break;
				default:
					break;
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
