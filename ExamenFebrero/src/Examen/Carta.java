package Examen;
//David Luque Fernandez

public class Carta {

	int numero;
	String palo;
	
	public Carta(int n, String p) {
		numero = n;
		palo = p;
	}
	
	public String toString(){
		String salida = numero + " " + palo;
		return salida;
	}
}
