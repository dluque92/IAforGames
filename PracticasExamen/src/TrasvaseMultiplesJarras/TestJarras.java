package TrasvaseMultiplesJarras;

import java.util.List;

public class TestJarras {

	public static void main(String[] args) {
		
		int[][] jarras = {{13,11,7,5,3,2},{13,2,0,0,0,2}};
		Jarra jarra = new Jarra(jarras);
		ProbJarras problema = new ProbJarras(jarra);
		List<Jarra> l = problema.amplitud();
		
		if (l != null) {
			System.out.println("Profundidad de la solucion: " + (l.size()-1));
            System.out.println("Camino Solucion:");
            for (Jarra e : l) {
               e.ver();
               System.out.println("");
            }
        } else {
            System.out.println("No se ha podido encontrar la Solucion");
        }  
	}

}
