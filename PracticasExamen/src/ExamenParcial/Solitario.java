package ExamenParcial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import EspacioDeEstados.Estado;

public class Solitario extends Estado{

	int[][] cartas;
	
	public Solitario(int[][] c){
		cartas = c;
	}
	
	@Override
	public List<Solitario> hijos() {

		List<Solitario> hijos = new ArrayList<Solitario>();
		for(int i = 0; i < 3; i++){
			int[][] solitarioHijo = new int[cartas.length][2];
			for(int j = 0; j < cartas.length; j++){
				for(int k = 0; k < 2; k++){
					solitarioHijo[j][k] = cartas[j][k];
				}
			}
			//La ultima de la izquierda la subo arriba
			if(i == 0){
				int ultima = solitarioHijo[cartas.length-1][0];
				for(int j = cartas.length-1; j > 0; j--){
					solitarioHijo[j][0] = solitarioHijo[j-1][0];
				}
				solitarioHijo[0][0] = ultima;
				Solitario hijo = new Solitario(solitarioHijo);
				hijos.add(hijo);
				
			//La ultima de la derecha la subo arriba
			}else if(i == 1){
				int ultima = solitarioHijo[cartas.length-1][1];
				for(int j = cartas.length-1; j > 0; j--){
					solitarioHijo[j][1] = solitarioHijo[j-1][1];
				}
				solitarioHijo[0][1] = ultima;
				Solitario hijo = new Solitario(solitarioHijo);
				hijos.add(hijo);
				
			//Intercambio las dos de abajo
			}else{
				int ultima = solitarioHijo[cartas.length-1][0];
				solitarioHijo[cartas.length-1][0] = solitarioHijo[cartas.length-1][1];
				solitarioHijo[cartas.length-1][1] = ultima;
				Solitario hijo = new Solitario(solitarioHijo);
				hijos.add(hijo);
			}
			
		}
		return hijos;
	}

	@Override
	public String toString() {
		String salida = "";
		for(int i = 0; i < cartas.length; i++){
			salida += Arrays.toString(cartas[i]) + " \n";
		}
		return salida;
	}

}
