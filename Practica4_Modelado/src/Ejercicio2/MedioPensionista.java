package Ejercicio2;

public class MedioPensionista extends Trabajador{
	
	private Activo activo;
	private Pensionista pensionista;

	public MedioPensionista(String n, String ns, double s) {
		super(n, ns, s);
		activo = new Activo(n,ns,s);
		pensionista = new Pensionista(n,ns,s);
	}

	@Override
	public void incrementar() {
		activo.incrementar();
		pensionista.incrementar();
		salario = activo.nomina() + pensionista.nomina();
	}

}
