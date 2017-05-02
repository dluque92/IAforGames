package Examen2Ejercicio1;

public class CuentaDeCredito extends CuentaCorriente{

	private int limite;
	
	public CuentaDeCredito(Cliente c, int s, int l){
		super(c, s);
		limite = l;
	}
	
	@Override
	public void reintegro(Cliente c, int d) throws Exception {
		if(saldo - d > (-limite)){
			saldo = estado.reintegro(propietarios, c, saldo, d);
			if(saldo < 0 && estado.getClass().getName() == EnNegro.class.getName()){
				estado = EnRojo.ejemplar();
			}
		}else{
			System.out.println("No puedes retirar " + d + ", supera el límite de saldo -" + limite);
		}
	}
	

}
