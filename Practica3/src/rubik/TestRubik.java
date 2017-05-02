package rubik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TestRubik {

	public static void main(String[] args) {
		
		String mov = "";
		int opcion = 0;
		int[] posicion = new int[]{0,1,2,3,4,5,6,7};
		int[] orientacion = new int[]{0,0,0,0,0,0,0,0};
		
		CuboRubik cubo = new CuboRubik(posicion,orientacion);
		char[][] colores = new char[6][8];
		colores[0] = new char[]{' ',' ','Y','Y',' ',' ',' ',' '};
		colores[1] = new char[]{' ',' ','Y','Y',' ',' ',' ',' '};
		colores[2] = new char[]{'P','P','B','B','R','R','G','G'};
		colores[3] = new char[]{'P','P','B','B','R','R','G','G'};
		colores[4] = new char[]{' ',' ','W','W',' ',' ',' ',' '};
		colores[5] = new char[]{' ',' ','W','W',' ',' ',' ',' '};
		
		cubo.colores(colores);
		PRubik problema = new PRubik(cubo);
		boolean esFinal = false;
		while(!mov.equals("FIN") && !esFinal){
			cubo.ver();
			
			System.out.println("Seleccione una de las dos opciones: ");
			System.out.println("1. Realizar un movimiento.");
			System.out.println("2. Resolver el cubo.");

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);
			try {
				opcion = Integer.parseInt (br.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		
			if(opcion == 1){
			
				System.out.println("-Introduzca uno de estos movimientos: ");
				System.out.println("D, D', U, U', L, L', R, R', F, F', B, B'");
				try {
					mov = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				cubo.mover(mov);
				problema = new PRubik(cubo);
				if(problema.esFinal(cubo)){
					cubo.ver();
				}
				esFinal = problema.esFinal(cubo);
				
			
		}else if(opcion == 2){
			problema = new PRubik(cubo);
			List<CuboRubik> solucion = problema.amplitud();
			System.out.println("La solucion es: ");
			for(CuboRubik c : solucion){
				c.ver();
			}
			esFinal = true;
		}else{
			System.out.println("Introduzca una de las 2 opciones.");
		}
			
		}
		System.out.println("Cubo de rubik RESUELTO");
	}
}
