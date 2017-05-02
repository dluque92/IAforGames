package Puzzle8;

import java.util.List;
/**
 * Pruebas para el puzzle 2D de piezas deslizantes.
 * 
 * @Jose Miguel Horcas Aguilera, Lorenzo Mandow
 *
 */
public class TestPuzzle {
    
    public static void main(String[] args) {
    	System.out.println("Distancia Manhattan:");
    	testManhattan();
    	System.out.println("Heuristica Numero Piezas Descolocadas:");
    	testHNumPD();
    	System.out.println("Heuristica H = 0");
    	testH0();
    	System.out.println("Puzzle BDP");
    	testDPB();
    	
    	
    }
    
    public static void testManhattan(){
        //    Puzzle s = new Puzzle(3,3);
        	int[][] ttt = {{1,2,0},{3,4,5},{6,7,8}};
            Puzzle s = new Puzzle(ttt);
    		ProbPuzzleManhattan prob = new ProbPuzzleManhattan(s);
    		List<Puzzle> l = prob.aMono();
    		
    		if (l != null) {
    			System.out.println("Profundidad de la solucion: " + (l.size()-1));
                System.out.println("Camino Solucion:");
                for (Puzzle e : l) {
                   e.ver();
                }
            } else {
                System.out.println("No se ha podido encontrar la Solucion");
            }        
    	}
    
    public static void testHNumPD(){
        //    Puzzle s = new Puzzle(3,3);
        	int[][] ttt = {{1,2,0},{3,4,5},{6,7,8}};
            Puzzle s = new Puzzle(ttt);
    		ProbPuzzleHNumPD prob = new ProbPuzzleHNumPD(s);
    		List<Puzzle> l = prob.aMono();
    		
    		if (l != null) {
    			System.out.println("Profundidad de la solucion: " + (l.size()-1));
                System.out.println("Camino Solucion:");
                for (Puzzle e : l) {
                   e.ver();
                }
            } else {
                System.out.println("No se ha podido encontrar la Solucion");
            }        
    	}
    
    public static void testH0(){
    //    Puzzle s = new Puzzle(3,3);
    	int[][] ttt = {{1,2,0},{3,4,5},{6,7,8}};
        Puzzle s = new Puzzle(ttt);
        ProbPuzzleH0 problema = new ProbPuzzleH0(s);
		List<Puzzle> l =  problema.aMono();
		
		if (l != null) {
			System.out.println("Profundidad de la solucion: " + (l.size()-1));
            System.out.println("Camino Solucion:");
            for (Puzzle e : l) {
               e.ver();
            }
        } else {
            System.out.println("No se ha podido encontrar la Solucion");
        }        
	}
	
	public static void testDPB() {
        Puzzle s = new Puzzle(3,3);
		ProbPuzzleBDP problema = new ProbPuzzleBDP(s, 5);
		
		List<Puzzle> l = problema.aMono();
		
		if (l != null) {
			System.out.println("Profundidad de la solucion: " + (l.size()-1));
            System.out.println("Camino Solucion:");
            for (Puzzle e : l) {
               e.ver();
            }
        } else {
            System.out.println("No se ha podido encontrar la Solucion");
        }        
	}
	
}
