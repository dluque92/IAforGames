package Examen2Ejercicio1;

import java.util.List;

public abstract class EstadoCuenta {

	public EstadoCuenta() {};
	
	public abstract int consultaSaldo(List<Cliente> clientes, Cliente c, int s)  throws Exception;
	public abstract int ingresar(List<Cliente> clientes, Cliente c, int s, int d)  throws Exception;
	public abstract int reintegro(List<Cliente> clientes, Cliente c, int s, int d)  throws Exception;
	
}
