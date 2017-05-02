package Examen2Ejercicio1;

public class TestEjercicio1 {

	public static void main(String[] args) {

		Cliente c = new Cliente();
	//	Cliente c2 = new Cliente();
		CuentaCorriente cc = new CuentaCorriente(c, 400);
		CuentaDeCredito cdc = new CuentaDeCredito(c, 400, 99);
		
		try {
			
			System.out.println(cdc.toString());
			cdc.ingresar(c, 100);
			System.out.println(cdc.toString());
			cdc.reintegro(c, 598);
			System.out.println(cdc.toString());
			cdc.reintegro(c, 100);
			System.out.println(cdc.toString());
			cdc.ingresar(c, 200);
			System.out.println(cdc.toString());
//			cc.ingresar(c2, 200);
//			System.out.println(cc.toString());
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
