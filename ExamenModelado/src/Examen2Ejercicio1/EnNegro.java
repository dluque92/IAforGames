package Examen2Ejercicio1;

import java.util.List;

public class EnNegro extends EstadoCuenta{

	public static EnNegro enNegro;
	
	public EnNegro() {
		// TODO Auto-generated constructor stub
	}
	
	public static EnNegro ejemplar(){
		if(enNegro == null){
			enNegro = new EnNegro();
		}
		return enNegro;
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
		if(clientes.contains(c)){
			s -= d;
			return s;
		}else{
			throw new Exception("El cliente no puede sacar dinero");
		}
	}

}
