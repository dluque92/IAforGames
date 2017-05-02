package Examen;
// David Luque Fernánde

import java.util.ArrayList;
import java.util.List;

import EspacioDeEstados.Estado;

public class Solitario extends Estado{

	Carta[] baraja;
	Carta cartaActual;
	boolean esFinal;
	
	public Solitario(Carta[] b, Carta c) {
		baraja = b;
		cartaActual = c;
		esFinal = false;
	}
	
	@Override
	public List<Solitario> hijos() {
		List<Solitario> hijos = new ArrayList<Solitario>();
		if(baraja[0].palo == cartaActual.palo){
			Carta[] cartas;
			if(baraja.length >1){
				cartas = new Carta[baraja.length-1];
				for(int i = 1; i < baraja.length; i++){
					cartas[i-1] = new Carta(baraja[i].numero, baraja[i].palo);
				}
			}else{
				cartas = null;
			}
			Carta c = new Carta(baraja[0].numero, baraja[0].palo);
			Solitario s = new Solitario(cartas, c);
			hijos.add(s);
		}
		if(baraja[0].numero == cartaActual.numero){
			Carta[] cartas;
			if(baraja.length >1){
				cartas = new Carta[baraja.length-1];
				for(int i = 1; i < baraja.length; i++){
					cartas[i-1] = new Carta(baraja[i].numero, baraja[i].palo);
				}
			}else{
				cartas = null;
			}
			Carta c = new Carta(baraja[0].numero, baraja[0].palo);
			Solitario s = new Solitario(cartas, c);
			hijos.add(s);
		}
		if(baraja[0].numero + cartaActual.numero == 12){
			Carta[] cartas;
			if(baraja.length > 1){
				cartas = new Carta[baraja.length-1];
				for(int i = 1; i < baraja.length; i++){
					cartas[i-1] = new Carta(baraja[i].numero, baraja[i].palo);
				}
			}else{
				cartas = null;
			}
			Carta c = new Carta(baraja[0].numero, baraja[0].palo);
			Solitario s = new Solitario(cartas, c);
			hijos.add(s);
		}
		if(hijos.isEmpty()){
			esFinal = true;
		}
		return hijos;
	}

	@Override
	public String toString() {
		
		return " (" + cartaActual.numero + " "+ cartaActual.palo + ")";
		
	}

}
