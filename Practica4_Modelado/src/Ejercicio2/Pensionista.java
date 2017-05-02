package Ejercicio2;

public class Pensionista extends Trabajador{

	public Pensionista(String n, String ns, double s) {
		super(n, ns, s);
	}

	@Override
	public void incrementar() {
		salario = salario * 1.04;
	}

}
