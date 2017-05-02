package rubik;

import EspacioDeEstados.Problema;

public class PRubik extends Problema<CuboRubik>{

	public PRubik(CuboRubik c) {
		this.ini = c;
	}
	
	@Override
	public boolean esFinal(CuboRubik c) {

		char[][] colores = new char[6][8];
		colores[0] = new char[]{' ',' ','Y','Y',' ',' ',' ',' '};
		colores[1] = new char[]{' ',' ','Y','Y',' ',' ',' ',' '};
		colores[2] = new char[]{'P','P','B','B','R','R','G','G'};
		colores[3] = new char[]{'P','P','B','B','R','R','G','G'};
		colores[4] = new char[]{' ',' ','W','W',' ',' ',' ',' '};
		colores[5] = new char[]{' ',' ','W','W',' ',' ',' ',' '};
		
		char[][] cubo = c.getColores();
		
		boolean esFinal = true;
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 8; j++){
				if(cubo[i][j] != colores[i][j]){
					esFinal = false;
				}
			}
		}
		return esFinal;
		
	}

}
