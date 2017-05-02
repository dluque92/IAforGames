package Examen2Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public abstract class Neurona implements Cloneable{
	
	public List<Peso> in;
	public List<Peso> out;
	
	public Neurona() {
		in = new ArrayList<Peso>();
		out = new ArrayList<Peso>();
	}
	
	public abstract Neurona clone();
	
	
	public abstract void aprender();
	
}
