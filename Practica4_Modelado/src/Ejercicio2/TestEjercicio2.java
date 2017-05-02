package Ejercicio2;

public class TestEjercicio2 {

	public static void main(String[] args) {


		Pensionista Pepe = new Pensionista("Pepe", "0101", 1000);
		Activo Juan = new Activo("Juan", "0202", 1000);
		MedioPensionista Jose = new MedioPensionista("Jose", "0303", 1000);
		
		System.out.println(Pepe.toString());
		System.out.println(Juan.toString());
		System.out.println(Jose.toString());
		
		Pepe.incrementar();
		Juan.incrementar();
		Jose.incrementar();
		
		System.out.println("Se incrementa el salario de los trabajadores.");
		
		System.out.println(Pepe.toString());
		System.out.println(Juan.toString());
		System.out.println(Jose.toString());

	}

}
