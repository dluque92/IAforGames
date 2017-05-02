package SaltoDeCaballo;

import java.util.List;

public class TestSaltoCaballo {

	public static void main(String[] args) {

		int filas = 5;
		int columnas = 5;
		int posX = 0;
		int posY = 0;
		
		int[][] tab = new int[filas][columnas];
		
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				tab[i][j] = 0;
			}
		}
		
		tab[posX][posY] = 1;
		
		Tablero tablero = new Tablero(tab, posX, posY);
		ProblemaSaltoCaballo problema = new ProblemaSaltoCaballo(tablero);
		List<Tablero> l = problema.amplitud();
		
		if (l != null) {
			System.out.println("Profundidad de la solucion: " + (l.size()-1));
            System.out.println("Camino Solucion:");
            for (Tablero e : l) {
               e.ver();
               System.out.println("");
            }
        } else {
            System.out.println("No se ha podido encontrar la Solucion");
        }  

	}

}
