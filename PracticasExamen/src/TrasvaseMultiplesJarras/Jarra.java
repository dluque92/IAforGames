package TrasvaseMultiplesJarras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import EspacioDeEstados.Estado;

public class Jarra extends Estado{

	public int[][] jarras;
	
	public Jarra(int[][] jrs) {
		jarras = jrs;
	}
	
	@Override
	public List<Jarra> hijos() {
		
		List<Jarra> hijos = new ArrayList<Jarra>();
		for(int i = 0; i < jarras[0].length; i++){
			for(int j = 0; j < jarras[0].length; j++){
				if(i != j){
					int[][] jarraHija = new int[2][jarras[0].length];
					for(int k = 0; k < 2; k++){
						for(int h = 0; h < jarras[0].length; h++){
							jarraHija[k][h] = jarras[k][h];
						}
					}
					if(jarraHija[1][i] > 0){
						//Si cabe todo lo que me queda, lo paso
						if(jarras[1][i] <= (jarras[0][j] - jarras[1][j])){
							jarraHija[1][j] += jarras[1][i]; 
							jarraHija[1][i] = 0;
						//Si no me cabe todo, la jarra está completa
						}else{
							jarraHija[1][i] = jarras[1][i] - (jarras[0][j] - jarras[1][j]);
							jarraHija[1][j] = jarras[0][j];
						}
						Jarra jar = new Jarra(jarraHija);
						hijos.add(jar);
					}
				}
			}
		}
		
		return hijos;
	}

	@Override
	public String toString() {
		String salida = "";
		salida += Arrays.toString(jarras[0]) + "\n";
		salida += Arrays.toString(jarras[1]);
		return salida;
	}

}
