package Examen1Ejercicio2;

import java.util.List;

public class Empleado {

	private String nombre;
	private String titulacion;
	private List<Trabajo> proyectos;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public List<Trabajo> getProyectos() {
		return proyectos;
	}	
	
	public Empleado(String n, String t) {
		setNombre(n);
		setTitulacion(t);
	}
	
	public void setProyectos(Trabajo t){
		proyectos.add(t);
	}
	
	public void removeProyecto(Trabajo t){
		int i = 0;
		int index = 0;
		for(Trabajo tr: proyectos){
			if(t.equals(tr)){
				index = i;
			}
			i++;
		}
		proyectos.remove(index);
	}
	
	public Euro bonus(){
		Euro euro = new Euro(0);
		for(Trabajo t: proyectos){
			euro.setEuros(euro.getEuros() + (t.getProyecto().getBonus().getEuros())*t.getPorcentaje()*t.getCargo().getCoeficiente());
		}
		return euro;
	}
	
}
