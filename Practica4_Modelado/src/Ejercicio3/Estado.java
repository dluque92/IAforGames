package Ejercicio3;

public abstract class Estado {
	
	public Estado() {
		
	}
	
	public abstract void put(Pieza p, Bandeja b) throws Exception;
	
	public abstract Pieza get(Bandeja b) throws Exception;
	
	public abstract String toString();
}
