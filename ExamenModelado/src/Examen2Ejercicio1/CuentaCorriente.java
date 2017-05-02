package Examen2Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente {

	public List<Cliente> propietarios;
	public List<Cliente> autorizados;
	public int saldo;
	public EstadoCuenta estado;	
	
	public CuentaCorriente(Cliente c, int s) {
		propietarios = new ArrayList<Cliente>();
		autorizados = new ArrayList<Cliente>();
		propietarios.add(c);
		autorizados.add(c);
		saldo = s;
		estado = new EnNegro();
	}
	
	public void cambiarEstado(EstadoCuenta e){
		estado = e;
	}
	
	public int consultaSaldo(Cliente c)  throws Exception{
		return estado.consultaSaldo(propietarios, c, saldo);
	}
	
	public void ingresar(Cliente c, int d) throws Exception{
		saldo = estado.ingresar(autorizados, c, saldo, d);
		if(saldo >= 0 && estado.getClass().getName() == EnRojo.class.getName()){
			estado = EnNegro.ejemplar();
		}
	}
	
	public void reintegro(Cliente c, int d) throws Exception{
		saldo = estado.reintegro(propietarios, c, saldo, d);
		if(saldo < 0 && estado.getClass().getName() == EnNegro.class.getName()){
			estado = EnRojo.ejemplar();
		}
	}
	
	public String toString(){
		return "La cuenta tiene " + saldo + " y su estado es " + estado.getClass().getSimpleName();
	}
	
}
