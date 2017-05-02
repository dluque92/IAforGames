package Ejercicio3;

public class TestEjercicio3 {

	public static void main(String[] args) throws Exception {

		Bandeja b1 = new Bandeja(3);
		
		Pieza p1 = new Pieza(1);
		Pieza p2 = new Pieza(2);
		Pieza p3 = new Pieza(3);
		Pieza p4 = new Pieza(4);
		
		System.out.println(b1.toString());
		b1.put(p1);
		System.out.println(b1.toString());
		b1.put(p2);
		System.out.println(b1.toString());
		b1.put(p3);
		System.out.println(b1.toString());
		b1.get();
		System.out.println(b1.toString());
		b1.put(p4);
		System.out.println(b1.toString());
		b1.get();
		System.out.println(b1.toString());
		b1.get();
		System.out.println(b1.toString());
		b1.get();
		System.out.println(b1.toString());
		//b1.put(p4);
		//System.out.println(b1.toString());
		
	}

}
