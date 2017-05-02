package Examen;

import java.util.ArrayList;
import java.util.List;
import EspacioDeEstados.Estado;

public class Solitario extends Estado{

	private int[][] tablero;
	
	public Solitario(int tam) {
		int num = tam/2;
		tablero = new int[num][2];
		for(int i = 0; i < num; i++){
			for(int j = 0; j < 2; j++){
				tablero[i][j] = 1 + i*2 + j;
			}
		}
	}
	
	public void generarAlea() {
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < 1; j++){
				int temp = tablero[i][j];
				tablero[i][j] = tablero[i][(j+1)%2];
				tablero[i][1] = temp;
			}
		}
	}
	
	public Solitario(int[][] tab){
		tablero = tab;
	}
	
	public int[][] getSolitario(){
		return tablero;
	}
	
	public List<Solitario> hijos() {
		List<Solitario> hijos = new ArrayList<Solitario>();
		
		int[][] tabHijo = new int[tablero.length][2];

		for(int i = 0; i < 3; i++){
			
			for(int k = 0; k < tablero.length; k++){
				for(int j = 0; j < 2; j++){
					tabHijo[k][j] = new Integer(tablero[k][j]);
				}
			}
			
			if(i == 0){
				
				int cambio = tabHijo[tabHijo.length - 1][0];
				for(int k = tabHijo.length -1; k >-1; k--){
					if(k == 0){
						tabHijo[k][0] = new Integer(cambio);
					}else{
						tabHijo[k][0] = new Integer(tabHijo[k-1][0]);
					}
				}
				Solitario hijo = new Solitario(tabHijo);
				hijos.add(hijo);
				System.out.println("HIJO!1");
				System.out.println(hijo.toString());
				
			}else if(i == 1){
				
				int cambio = tabHijo[tabHijo.length - 1][1];
				for(int k = tabHijo.length -1; k >-1; k--){
					if(k == 0){
						tabHijo[k][1] = new Integer(cambio);
					}else{
						tabHijo[k][1] = new Integer(tabHijo[k-1][1]);
					}
				}
				Solitario hijo = new Solitario(tabHijo);
				hijos.add(hijo);
				System.out.println("HIJO!2");
				System.out.println(hijo.toString());
				
			}else{
				
				int cambio = tabHijo[tabHijo.length - 1][1];
				tabHijo[tabHijo.length - 1][1] = new Integer(tabHijo[tabHijo.length - 1][0]);
				tabHijo[tabHijo.length - 1][0] = new Integer(cambio);
				Solitario hijo = new Solitario(tabHijo);
				hijos.add(hijo);
				System.out.println("HIJO!3");
				System.out.println(hijo.toString());
			}
		}
		
		return hijos;
	}

	@Override
	public String toString() {
		String salida = "";
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < 2; j++){
				salida += tablero[i][j] + " ";
			}
			salida += "\n";
		}
		return salida;
	}


}
