package Ejercicio2;

public abstract class Trabajador {

	public String nombre;
	public String numeroSeguridadSocial;
	protected double salario;
	
	public Trabajador(String n, String ns, double s) {
		nombre = n;
		numeroSeguridadSocial = ns;
		salario = s;
	}
	
	public double nomina(){
		return salario;
	}
	
	public abstract void incrementar();
	
	public String toString(){
		return "El trabajador " + nombre + " tiene de salario: " + salario ;
	}
	
}

