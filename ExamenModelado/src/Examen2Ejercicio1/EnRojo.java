package Examen2Ejercicio1;

import java.util.List;

public class EnRojo extends EstadoCuenta{

	public static EnRojo enRojo;
	
	public EnRojo() {
		// TODO Auto-generated constructor stub
	}
	
	public static EnRojo ejemplar(){
		if(enRojo == null){
			enRojo = new EnRojo();
		}
		return enRojo;
	}

	@Override
	public int consultaSaldo(List<Cliente> clientes, Cliente c, int s) throws Exception{
		if(clientes.contains(c)){
			return s;
		}else{
			throw new Exception("El cliente no puede consultar el saldo");
		}
	}

	@Override
	public int ingresar(List<Cliente> clientes, Cliente c, int s, int d)  throws Exception{
		if(clientes.contains(c)){
			s += d;
			return s;
		}else{
			throw new Exception("El cliente no puede ingresar dinero");
		}
	}

	@Override
	public int reintegro(List<Cliente> clientes, Cliente c, int s, int d)  throws Exception{
		throw new Exception("El cliente no puede sacar dinero");
	}
	

}
