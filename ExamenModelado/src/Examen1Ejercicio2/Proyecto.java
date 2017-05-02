package Examen1Ejercicio2;

import java.util.List;

public class Proyecto {
	
	private String nombre;
	private List<Trabajo> empleados;
	private Euro bonus;
	
	public Euro getBonus() {
		return bonus;
	}

	public void setBonus(Euro bonus) {
		this.bonus = bonus;
	}

	public Proyecto(String n) {
		setNombre(n);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Trabajo> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Trabajo t){
		empleados.add(t);
	}
}
