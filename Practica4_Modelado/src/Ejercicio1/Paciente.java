package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

	public Expediente expedienteAbierto;
	public List<AsociacionExpedientePaciente> asocExpPaciente;
	private String nombre;
	
	public Paciente(String n) {
		nombre = n;
		Expediente expediente = new Expediente();
		asocExpPaciente = new ArrayList<AsociacionExpedientePaciente>();
		AsociacionExpedientePaciente asociacion = new AsociacionExpedientePaciente(expediente, this);
	}

	public List<Expediente> getExpedientes(){
		List<Expediente> expedientes = new ArrayList<Expediente>();
		for(AsociacionExpedientePaciente asoc : asocExpPaciente){
			expedientes.add(asoc.expediente);
		}
		return expedientes;
	}
	
	public void addAsoc(AsociacionExpedientePaciente asoc){
		asocExpPaciente.add(asoc);
	}
	
	public void removeAsoc(AsociacionExpedientePaciente asoc){
		asocExpPaciente.remove(asoc);
	}
	
	public Expediente getExpedienteAbierto() {
		return expedienteAbierto;
	}

	public void setExpedienteAbierto(Expediente expedienteAbierto) {
		this.expedienteAbierto = expedienteAbierto;
	}
	
	public String toString(){
		return nombre;
	}
	
}
