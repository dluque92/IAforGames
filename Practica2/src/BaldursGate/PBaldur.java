package BaldursGate;

import EspacioDeEstados.*;

public class PBaldur extends Problema<Posicion>{

	public Posicion pFinal;
	
	public PBaldur(Posicion m) {
		this.ini = m;
	}
	
	public void setPosicionFinal(int x, int y){
		pFinal = new Posicion(x,y);
	}
	
	@Override
	 public int h (Posicion m){
		
		int difFilas = Math.abs(m.actualX - pFinal.actualX);
		int difCol = Math.abs(m.actualY - pFinal.actualY);
		return (1414 * Math.min(difFilas, difCol) + 1000 * (Math.max(difFilas, difCol) - Math.min(difFilas, difCol)));
	 }
	
	@Override
	public boolean esFinal(Posicion m) {
		if(m.actualX == pFinal.actualX && m.actualY == pFinal.actualY){
			return true;
		}else{
			return false;
		}
	}

}
