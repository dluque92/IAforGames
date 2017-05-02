package Examen1Ejercicio2;

public enum Cargo {
	
	JefeDeProyecto (2.0), Analista (1.5), Arquitecto (1.0), Desarrollador (0.75), Operador (0.5);
	
	private double coeficiente;
	
	private Cargo(double coeficiente) {
		setCoeficiente(coeficiente);
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}
	
}
