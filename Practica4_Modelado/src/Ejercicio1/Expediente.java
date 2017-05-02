package Ejercicio1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Expediente {

	public AsociacionExpedientePaciente asocExpPaciente;
	public List<Acceso> accesos;
	public int id;
	
	public Expediente() {
		accesos = new ArrayList<Acceso>();
		asocExpPaciente = null;
		id = (int) new Date().getTime();
	}
	
	public List<Profesional> getProfesional(){
		List<Profesional> profesionales = new ArrayList<Profesional>();
		for(Acceso asoc : accesos){
			profesionales.add(asoc.profesional);
		}
		return profesionales;
	}
	
	public void addAsoc(AsociacionExpedientePaciente asoc){
		asocExpPaciente = asoc;
	}
	
	public void removeAsoc(AsociacionExpedientePaciente asoc){
		asocExpPaciente = null;
	}
	
	public void addAsocAcceso(Acceso asoc){
		accesos.add(asoc);
	}
	
	public void removeAsocAcceso(Acceso asoc){
		accesos.remove(asoc);
	}
	
	public int getid(){
		return id;
	}
}
