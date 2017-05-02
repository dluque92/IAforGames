package Ejercicio1;

import java.util.Date;

public class Acceso {

	public Date fecha;
	public TipoAcceso tipo;
	
	public Profesional profesional;
	public Expediente expediente;
	
	public Acceso(Profesional profesional, Expediente expediente, TipoAcceso tipo) {
		this.expediente = expediente;
		this.profesional = profesional;
		if(expediente.asocExpPaciente != null){
			expediente.addAsocAcceso(this);
			profesional.addAsocAcceso(this);
			fecha = new Date();
			this.tipo = tipo;
		}
	}
	
	public void remove(){
		expediente.addAsocAcceso(this);
		profesional.addAsocAcceso(this);
	}
	
	public String toString(){
		String salida = "";
		salida += "El profesional -> " + profesional + " ha realizado una " + tipo.toString() 
		+ " al expediente del paciente -> " + expediente.asocExpPaciente.paciente.toString() + " en " + fecha;
		return salida;
	}
}
