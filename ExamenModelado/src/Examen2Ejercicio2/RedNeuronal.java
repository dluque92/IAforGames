package Examen2Ejercicio2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RedNeuronal {

	private Set<Neurona> redNeuronal;
	private Neurona neurona;
	
	public RedNeuronal() {
		
	}
	
	public void crearRed(Neurona n, int tam){
		redNeuronal = new HashSet<Neurona>(tam);
		
		for(int i = 0; i < redNeuronal.size(); i++){
			neurona = n.clone();
			redNeuronal.add(neurona);
		}
	}
	
	public void conectar(){
		
	}
	
	public void aprender(){
		Iterator<Neurona> it = redNeuronal.iterator();
		while(it.hasNext()){
			it.next().aprender();
		}
	}
}
