package rubik;

import java.util.ArrayList;
import java.util.List;

import EspacioDeEstados.Estado;

public class CuboRubik extends Estado{

	private int[] posicion = new int[8];
	private int[] orientacion = new int[8];
	private char[][] colores = new char[6][8];
	private String movimiento;
	
	public CuboRubik(int[] pos, int[] ori) {
		for(int i = 0; i < 8; i++){
			posicion[i] = new Integer(pos[i]);
			orientacion[i] = new Integer(ori[i]);
		}
	}

	public void colores(char[][] c){
		for(int i = 0; i < 6; i++){
			for(int j = 0; j< 8; j++){
				colores[i][j] = new Character(c[i][j]);
			}
		}
	}
	
	public int getPosicion(int i){
		return posicion[i];
	}
	
	public int getOrientacion(int i){
		return orientacion[i];
	}
	
	public char[][] getColores(){
		return colores;
	}
	
	public void cambiarColor(String movimiento){
		
		char[][] c = new char[6][8];
		for(int i = 0; i< 6; i++){
			for(int j = 0; j< 8; j++){
				c[i][j]  = new Character(colores[i][j]); 
			}
		}
		
		switch(movimiento){
		case "F": 
			colores[1][3] = c[2][1];
			colores[1][2] = c[3][1];
			colores[2][1] = c[4][2];
			colores[3][1] = c[4][3];
			colores[4][2] = c[3][4];
			colores[4][3] = c[2][4];
			colores[3][4] = c[1][3];
			colores[2][4] = c[1][2];
			colores[2][2] = c[3][2];
			colores[2][3] = c[2][2];
			colores[3][2] = c[3][3];
			colores[3][3] = c[2][3];
			
			break;
			
		case "F'":
			colores[1][3] = c[3][4];
			colores[1][2] = c[2][4];
			colores[2][1] = c[1][3];
			colores[3][1] = c[1][2];
			colores[4][2] = c[2][1];
			colores[4][3] = c[3][1];
			colores[3][4] = c[4][2];
			colores[2][4] = c[4][3];
			colores[2][2] = c[2][3];
			colores[2][3] = c[3][3];
			colores[3][2] = c[2][2];
			colores[3][3] = c[3][2];
			break;
			
		case "B": 
			colores[0][3] = c[3][5];
			colores[0][2] = c[2][5];
			colores[2][0] = c[0][3];
			colores[3][0] = c[0][2];
			colores[5][2] = c[2][0];
			colores[5][3] = c[3][0];
			colores[2][5] = c[5][3];
			colores[3][5] = c[5][2];
			colores[2][6] = c[3][6];
			colores[2][7] = c[2][6];
			colores[3][6] = c[3][7];
			colores[3][7] = c[2][7];
		
			break;
			
		case "B'":
			colores[0][3] = c[2][0];
			colores[0][2] = c[3][0];
			colores[2][0] = c[5][2];
			colores[3][0] = c[5][3];
			colores[5][2] = c[2][5];
			colores[5][3] = c[3][5];
			colores[2][5] = c[0][2];
			colores[3][5] = c[0][3];
			colores[2][6] = c[2][7];
			colores[2][7] = c[3][7];
			colores[3][6] = c[2][6];
			colores[3][7] = c[3][6];
			break;
		
		case "U": 
			colores[2][0] = c[2][2];
			colores[2][1] = c[2][3];
			colores[2][2] = c[2][4];
			colores[2][3] = c[2][5];
			colores[2][4] = c[2][6];
			colores[2][5] = c[2][7];
			colores[2][6] = c[2][0];
			colores[2][7] = c[2][1];
			colores[0][2] = c[1][2];
			colores[0][3] = c[0][2];
			colores[1][2] = c[1][3];
			colores[1][3] = c[0][3];
			break;
			
		case "U'":
			colores[2][0] = c[2][6];
			colores[2][1] = c[2][7];
			colores[2][2] = c[2][0];
			colores[2][3] = c[2][1];
			colores[2][4] = c[2][2];
			colores[2][5] = c[2][3];
			colores[2][6] = c[2][4];
			colores[2][7] = c[2][5];
			colores[0][2] = c[0][3];
			colores[0][3] = c[1][3];
			colores[1][2] = c[0][2];
			colores[1][3] = c[1][2];
			break;
			
		case "D": 
			colores[3][0] = c[3][6];
			colores[3][1] = c[3][7];
			colores[3][2] = c[3][0];
			colores[3][3] = c[3][1];
			colores[3][4] = c[3][2];
			colores[3][5] = c[3][3];
			colores[3][6] = c[3][4];
			colores[3][7] = c[3][5];
			colores[4][2] = c[5][2];
			colores[4][3] = c[4][2];
			colores[5][2] = c[5][3];
			colores[5][3] = c[4][3];
		
			break;
			
		case "D'":
			colores[3][0] = c[3][2];
			colores[3][1] = c[3][3];
			colores[3][2] = c[3][4];
			colores[3][3] = c[3][5];
			colores[3][4] = c[3][6];
			colores[3][5] = c[3][7];
			colores[3][6] = c[3][0];
			colores[3][7] = c[3][1];
			colores[4][2] = c[4][3];
			colores[4][3] = c[5][3];
			colores[5][2] = c[4][2];
			colores[5][3] = c[5][2];
			break;
			
		case "R": 
			colores[0][3] = c[2][3];
			colores[1][3] = c[3][3];
			colores[2][3] = c[4][3];
			colores[3][3] = c[5][3];
			colores[4][3] = c[3][6];
			colores[5][3] = c[2][6];
			colores[2][6] = c[1][3];
			colores[3][6] = c[0][3];
			colores[2][4] = c[3][4];
			colores[2][5] = c[2][4];
			colores[3][4] = c[3][5];
			colores[3][5] = c[2][5];
			break;
			
		case "R'":
			colores[0][3] = c[3][6];
			colores[1][3] = c[2][6];
			colores[2][3] = c[0][3];
			colores[3][3] = c[1][3];
			colores[4][3] = c[2][3];
			colores[5][3] = c[3][3];
			colores[2][6] = c[5][3];
			colores[3][6] = c[4][3];
			colores[2][4] = c[2][5];
			colores[2][5] = c[3][5];
			colores[3][4] = c[2][4];
			colores[3][5] = c[3][4];
			break;
			
		case "L": 
			colores[0][2] = c[3][7];
			colores[1][2] = c[2][7];
			colores[2][2] = c[0][2];
			colores[3][2] = c[1][2];
			colores[4][2] = c[2][2];
			colores[5][2] = c[3][2];
			colores[2][7] = c[5][2];
			colores[3][7] = c[4][2];
			colores[2][0] = c[3][0];
			colores[2][1] = c[2][0];
			colores[3][0] = c[3][1];
			colores[3][1] = c[2][1];
			break;
			
		case "L'":
			colores[0][2] = c[2][2];
			colores[1][2] = c[3][2];
			colores[2][2] = c[4][2];
			colores[3][2] = c[5][2];
			colores[4][2] = c[3][7];
			colores[5][2] = c[2][7];
			colores[2][7] = c[1][2];
			colores[3][7] = c[0][2];
			colores[2][0] = c[2][1];
			colores[2][1] = c[3][1];
			colores[3][0] = c[2][0];
			colores[3][1] = c[3][0];
			break;
			
		case "FIN":
			break;
		}	
	}
	
	public void mover(String movimiento){
		
		int[] copiaMov = new int[8];
		int[] copiaOri = new int[8];
		for(int i = 0; i < 8; i++){
			copiaMov[i] = new Integer(posicion[i]);
			copiaOri[i] = new Integer(orientacion[i]);
		}
		
		this.movimiento = movimiento;
		
		switch(movimiento){
			case "F": 
				posicion[0] = copiaMov[1];
				posicion[1] = copiaMov[3];
				posicion[2] = copiaMov[0];
				posicion[3] = copiaMov[2];
				
				orientacion[0] = (copiaOri[0] + 1) % 3;
				orientacion[1] = (copiaOri[1] + 2) % 3; 
				orientacion[2] = (copiaOri[2] + 2) % 3; 
				orientacion[3] = (copiaOri[3] + 1) % 3; 
				break;
				
			case "F'":
				posicion[0] = copiaMov[2];
				posicion[1] = copiaMov[0];
				posicion[2] = copiaMov[3];
				posicion[3] = copiaMov[1];
				
				orientacion[0] = (copiaOri[0] + 2) % 3;
				orientacion[1] = (copiaOri[1] + 1) % 3; 
				orientacion[2] = (copiaOri[2] + 1) % 3; 
				orientacion[3] = (copiaOri[3] + 2) % 3; 
				
				break;
				
			case "B": 
				posicion[4] = copiaMov[6];
				posicion[5] = copiaMov[4];
				posicion[6] = copiaMov[7];
				posicion[7] = copiaMov[5];
				
				orientacion[4] = (copiaOri[4] + 1) % 3;
				orientacion[5] = (copiaOri[5] + 2) % 3; 
				orientacion[6] = (copiaOri[6] + 2) % 3; 
				orientacion[7] = (copiaOri[7] + 1) % 3; 
			
				break;
				
			case "B'":
				posicion[4] = copiaMov[5];
				posicion[5] = copiaMov[7];
				posicion[6] = copiaMov[4];
				posicion[7] = copiaMov[6];
				
				orientacion[4] = (copiaOri[4] + 2) % 3;
				orientacion[5] = (copiaOri[5] + 1) % 3; 
				orientacion[6] = (copiaOri[6] + 1) % 3; 
				orientacion[7] = (copiaOri[7] + 2) % 3; 
				
				break;
			
			case "U": 
				posicion[0] = copiaMov[4];
				posicion[1] = copiaMov[0];
				posicion[4] = copiaMov[5];
				posicion[5] = copiaMov[1];
				
				break;
				
			case "U'":
				posicion[0] = copiaMov[1];
				posicion[1] = copiaMov[5];
				posicion[4] = copiaMov[0];
				posicion[5] = copiaMov[4];
				
				break;
				
			case "D": 
				posicion[2] = copiaMov[3];
				posicion[3] = copiaMov[7];
				posicion[6] = copiaMov[2];
				posicion[7] = copiaMov[6]; 
			
				break;
				
			case "D'":
				posicion[2] = copiaMov[6];
				posicion[3] = copiaMov[2];
				posicion[6] = copiaMov[7];
				posicion[7] = copiaMov[3];

				break;
				
			case "R": 
				posicion[1] = copiaMov[5];
				posicion[3] = copiaMov[1];
				posicion[5] = copiaMov[7];
				posicion[7] = copiaMov[3];
				
				orientacion[1] = (copiaOri[1] + 1) % 3;
				orientacion[3] = (copiaOri[3] + 2) % 3; 
				orientacion[5] = (copiaOri[5] + 2) % 3; 
				orientacion[7] = (copiaOri[7] + 1) % 3; 
			
				break;
				
			case "R'":
				posicion[1] = copiaMov[3];
				posicion[3] = copiaMov[7];
				posicion[5] = copiaMov[1];
				posicion[7] = copiaMov[5];
				
				orientacion[1] = (copiaOri[1] + 2) % 3;
				orientacion[3] = (copiaOri[3] + 1) % 3; 
				orientacion[5] = (copiaOri[5] + 1) % 3; 
				orientacion[7] = (copiaOri[7] + 2) % 3; 
				
				break;
				
			case "L": 
				posicion[0] = copiaMov[2];
				posicion[2] = copiaMov[6];
				posicion[4] = copiaMov[0];
				posicion[6] = copiaMov[4];
				
				orientacion[0] = (copiaOri[0] + 1) % 3;
				orientacion[2] = (copiaOri[2] + 2) % 3; 
				orientacion[4] = (copiaOri[4] + 2) % 3; 
				orientacion[6] = (copiaOri[6] + 1) % 3; 
			
				break;
				
			case "L'":
				posicion[0] = copiaMov[4];
				posicion[2] = copiaMov[0];
				posicion[4] = copiaMov[6];
				posicion[6] = copiaMov[2];
				
				orientacion[0] = (copiaOri[0] + 2) % 3;
				orientacion[2] = (copiaOri[2] + 1) % 3; 
				orientacion[4] = (copiaOri[4] + 1) % 3; 
				orientacion[6] = (copiaOri[6] + 2) % 3; 
				
				break;
				
			case "FIN":
				break;
		}	
		cambiarColor(movimiento);
	}
	
	@Override
	public List<? extends Estado> hijos() {

		List<CuboRubik> hijos = new ArrayList<CuboRubik>();
		
		for(int i = 0; i < 12; i++){
			
			int[] copiaMov = new int[8];
			int[] copiaOri = new int[8];
			for(int j = 0; j < 8; j++){
				copiaMov[j] = new Integer(posicion[j]);
				copiaOri[j] = new Integer(orientacion[j]);
			}
			
			if(i == 0){ 
				
				copiaMov[0] = new Integer(posicion[1]);
				copiaMov[1] = new Integer(posicion[3]);
				copiaMov[2] = new Integer(posicion[0]);
				copiaMov[3] = new Integer(posicion[2]);
				
				copiaOri[0] = new Integer((orientacion[0] + 1) % 3);
				copiaOri[1] = new Integer((orientacion[1] + 2) % 3); 
				copiaOri[2] = new Integer((orientacion[2] + 2) % 3); 
				copiaOri[3] = new Integer((orientacion[3] + 1) % 3); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("F");
				hijo.movimiento = "F";
				hijos.add(hijo);
			
			}else if(i == 1){
				
				copiaMov[0] = new Integer(posicion[0]);
				copiaMov[1] = new Integer(posicion[2]);
				copiaMov[2] = new Integer(posicion[3]);
				copiaMov[3] = new Integer(posicion[1]);
				
				copiaOri[0] = new Integer((orientacion[0] + 2) % 3);
				copiaOri[1] = new Integer((orientacion[1] + 1) % 3); 
				copiaOri[2] = new Integer((orientacion[2] + 1) % 3); 
				copiaOri[3] = new Integer((orientacion[3] + 2) % 3); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("F'");
				hijo.movimiento = "F'";
				hijos.add(hijo);
				
			}else if(i == 2){
				
				copiaMov[4] = new Integer(posicion[6]);
				copiaMov[5] = new Integer(posicion[4]);
				copiaMov[6] = new Integer(posicion[7]);
				copiaMov[7] = new Integer(posicion[5]);
				
				copiaOri[4] = new Integer((orientacion[4] + 1) % 3);
				copiaOri[5] = new Integer((orientacion[5] + 2) % 3); 
				copiaOri[6] = new Integer((orientacion[6] + 2) % 3); 
				copiaOri[7] = new Integer((orientacion[7] + 1) % 3); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("B");
				hijo.movimiento = "B";
				hijos.add(hijo);
			
			}else if(i == 3){
				
				copiaMov[4] = new Integer(posicion[5]);
				copiaMov[5] = new Integer(posicion[7]);
				copiaMov[6] = new Integer(posicion[4]);
				copiaMov[7] = new Integer(posicion[6]);
				
				copiaOri[4] = new Integer((orientacion[4] + 2) % 3);
				copiaOri[5] = new Integer((orientacion[5] + 1) % 3); 
				copiaOri[6] = new Integer((orientacion[6] + 1) % 3); 
				copiaOri[7] = new Integer((orientacion[7] + 2) % 3); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("B'");
				hijo.movimiento = "B'";
				hijos.add(hijo);
				
			}else if(i == 4){
			
				copiaMov[0] = new Integer(posicion[4]);
				copiaMov[1] = new Integer(posicion[0]);
				copiaMov[4] = new Integer(posicion[5]);
				copiaMov[5] = new Integer(posicion[1]);
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("U");
				hijo.movimiento = "U";
				hijos.add(hijo);
				
			}else if(i == 5){
				
				copiaMov[0] = new Integer(posicion[1]);
				copiaMov[1] = new Integer(posicion[5]);
				copiaMov[4] = new Integer(posicion[0]);
				copiaMov[5] = new Integer(posicion[4]);
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("U'");
				hijo.movimiento = "U'";
				hijos.add(hijo);
				
			}else if(i == 6){
				
				copiaMov[2] = new Integer(posicion[3]);
				copiaMov[3] = new Integer(posicion[7]);
				copiaMov[6] = new Integer(posicion[2]);
				copiaMov[7] = new Integer(posicion[6]); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("D");
				hijo.movimiento = "D";
				hijos.add(hijo);
			
			}else if(i == 7){
				
				copiaMov[2] = new Integer(posicion[6]);
				copiaMov[3] = new Integer(posicion[2]);
				copiaMov[6] = new Integer(posicion[7]);
				copiaMov[7] = new Integer(posicion[3]);
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("D'");
				hijo.movimiento = "D'";
				hijos.add(hijo);

			}else if(i == 8){
				
				copiaMov[1] = new Integer(posicion[5]);
				copiaMov[3] = new Integer(posicion[1]);
				copiaMov[5] = new Integer(posicion[7]);
				copiaMov[7] = new Integer(posicion[3]);
				
				copiaOri[1] = new Integer((orientacion[1] + 1) % 3);
				copiaOri[3] = new Integer((orientacion[3] + 2) % 3); 
				copiaOri[5] = new Integer((orientacion[5] + 2) % 3); 
				copiaOri[7] = new Integer((orientacion[7] + 1) % 3); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("R");
				hijo.movimiento = "R";
				hijos.add(hijo);
			
			}else if(i == 9){
				
				copiaMov[1] = new Integer(posicion[3]);
				copiaMov[3] = new Integer(posicion[7]);
				copiaMov[5] = new Integer(posicion[1]);
				copiaMov[7] = new Integer(posicion[5]);
				
				copiaOri[1] = new Integer((orientacion[1] + 2) % 3);
				copiaOri[3] = new Integer((orientacion[3] + 1) % 3); 
				copiaOri[5] = new Integer((orientacion[5] + 1) % 3); 
				copiaOri[7] = new Integer((orientacion[7] + 2) % 3); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("R'");
				hijo.movimiento = "R'";
				hijos.add(hijo);
				
			}else if(i == 10){
				
				copiaMov[0] = new Integer(posicion[2]);
				copiaMov[2] = new Integer(posicion[6]);
				copiaMov[4] = new Integer(posicion[0]);
				copiaMov[6] = new Integer(posicion[4]);
				
				copiaOri[0] = new Integer((orientacion[0] + 1) % 3);
				copiaOri[2] = new Integer((orientacion[2] + 2) % 3); 
				copiaOri[4] = new Integer((orientacion[4] + 2) % 3); 
				copiaOri[6] = new Integer((orientacion[6] + 1) % 3); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("L");
				hijo.movimiento = "L";
				hijos.add(hijo);
			
			}else{
				
				copiaMov[0] = new Integer(posicion[4]);
				copiaMov[2] = new Integer(posicion[0]);
				copiaMov[4] = new Integer(posicion[6]);
				copiaMov[6] = new Integer(posicion[2]);
				
				copiaOri[0] = new Integer((orientacion[0] + 2) % 3);
				copiaOri[2] = new Integer((orientacion[2] + 1) % 3); 
				copiaOri[4] = new Integer((orientacion[4] + 1) % 3); 
				copiaOri[6] = new Integer((orientacion[6] + 2) % 3); 
				
				CuboRubik hijo = new CuboRubik(copiaMov, copiaOri);
				hijo.colores(colores);
				hijo.cambiarColor("L'");
				hijo.movimiento = "L'";
				hijos.add(hijo);
				
			}
		}	
		
		return hijos;
	}

	@Override
	public String toString() {
		String salida ="Aplicamos el movimiento " + movimiento + ":";
		salida += "\n";
		for(int i = 0; i< 6; i++){
			for(int j = 0; j < 8; j++){
				salida +=" " + colores[i][j];
			}
			salida += "\n";
		}
		
		return salida;
	}

}
