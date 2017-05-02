package Ejercicio3;

import java.util.LinkedList;
import java.util.List;

public class Bandeja {

	public int capacidad;
	private List<Pieza> piezas;
	private Estado estadoBandeja;
	
	public Bandeja(int cap) {
		piezas = new LinkedList<Pieza>();
		estadoBandeja = Empty.ejemplar();
		capacidad = cap;
	}
	
	public void put(Pieza p) throws Exception{
		estadoBandeja.put(p,this);
	}
	
	public Pieza get() throws Exception{
		return estadoBandeja.get(this);
	}
	
	public int size(){
		return piezas.size();
	}
	
	public void añadir(Pieza p){
		piezas.add(p);
	}
	
	public Pieza extraer(){ return piezas.get(0); }
	
	public void cambiarEstado(Estado e){ estadoBandeja = e; }
	
	public String toString(){
		String s = "La bandeja con capacidad " + capacidad + " y estado " + estadoBandeja.toString() +" tiene " + size() + " piezas: ";
		for(Pieza p: piezas){
			s += p.toString() + " ";
		}
		return s;
	}
}
