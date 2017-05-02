package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Profesional {

	public List<Acceso> acceso;
	private String nombre;
	
	public Profesional(String n) {
		acceso = new ArrayList<Acceso>();
		nombre = n;
	}
	
	public List<Expediente> getExpedientes(){
		List<Expediente> expedientes = new ArrayList<Expediente>();
		for(Acceso asoc : acceso){
			expedientes.add(asoc.expediente);
		}
		return expedientes;
	}
	
	public void addAsocAcceso(Acceso asoc){
		acceso.add(asoc);
	}
	
	public void removeAsocAcceso(Acceso asoc){
		acceso.remove(asoc);
	}
	
	public String toString(){
		return nombre;
	}
}
