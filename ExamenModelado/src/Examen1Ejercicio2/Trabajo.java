package Examen1Ejercicio2;

public class Trabajo {

	private Cargo cargo;
	private Empleado empleado;
	private Proyecto proyecto;
	private float porcentaje;
	
	public Trabajo(Empleado e, Proyecto p, Cargo c, float porcentaje) {
		setEmpleado(e);
		setProyecto(p);
		setCargo(c);
		setPorcentaje(porcentaje);
		empleado.setProyectos(this);
		proyecto.setEmpleados(this);
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	
}
