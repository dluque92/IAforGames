package Ejercicio2;

public class Activo extends Trabajador{
	
	public Activo(String n, String ns, double s) {
		super(n, ns, s);
	}

	@Override
	public void incrementar() {
		salario = salario * 1.02;
	}

}

