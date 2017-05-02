package Puzzle8;

import java.util.List;
/**
 * Pruebas para el puzzle 2D de piezas deslizantes.
 * 
 * @Jose Miguel Horcas Aguilera, Lorenzo Mandow
 *
 */
public class TestPuzzleACiegas {
    
    public static void main(String[] args) {
    	System.out.println("Distancia Manhattan:");
    	testManhattan();
//    	System.out.println("Heuristica Numero Piezas Descolocadas:");
//    	testHNumPD();
//    	System.out.println("Distancia Manhattan 2:");
//    	testManhattan2();
//    	System.out.println("Heuristica Numero Piezas Descolocadas 2:");
//    	testHNumPD2();
//    	System.out.println("Heuristica con 5 comodines:");
//    	testDPB();
//    	System.out.println("Heuristica con 4 comodines:");
//    	testDPB2();
//    	System.out.println("Heuristica con 5 comodines:");
//    	testDPB3();
//    	System.out.println("Heuristica con 4 comodines:");
//    	testDPB4();
    }
    
    public static void testManhattan(){
    //    Puzzle s = new Puzzle(3,3);
    	int[][] ttt = {{3,2,5},{6,0,4},{7,8,1}};
        Puzzle s = new Puzzle(ttt);
		ProbPuzzleManhattan prob = new ProbPuzzleManhattan(s);
		List<Puzzle> l = prob.aMono();
		
		if (l != null) {
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
		int[][] ttt = {{3,2,5},{6,0,4},{7,8,1}};
        Puzzle s = new Puzzle(ttt);
		ProbPuzzleHNumPD prob = new ProbPuzzleHNumPD(s);
		List<Puzzle> l = prob.aMono();
		
		if (l != null) {
            System.out.println("Camino Solucion:");
            for (Puzzle e : l) {
               e.ver();
            }
        } else {
            System.out.println("No se ha podido encontrar la Solucion");
        }        
	}
    
    public static void testManhattan2(){
        //    Puzzle s = new Puzzle(3,3);
        	int[][] ttt = {{8,1,7},{4,5,6},{2,0,3}};
            Puzzle s = new Puzzle(ttt);
    		ProbPuzzleManhattan prob = new ProbPuzzleManhattan(s);
    		List<Puzzle> l = prob.aMono();
    		
    		if (l != null) {
                System.out.println("Camino Solucion:");
                for (Puzzle e : l) {
                   e.ver();
                }
            } else {
                System.out.println("No se ha podido encontrar la Solucion");
            }        
    	}
        
        public static void testHNumPD2(){
        //    Puzzle s = new Puzzle(3,3);
        	int[][] ttt = {{8,1,7},{4,5,6},{2,0,3}};
            Puzzle s = new Puzzle(ttt);
    		ProbPuzzleHNumPD prob = new ProbPuzzleHNumPD(s);
    		List<Puzzle> l = prob.aMono();
    		
    		if (l != null) {
                System.out.println("Camino Solucion:");
                for (Puzzle e : l) {
                   e.ver();
                }
            } else {
                System.out.println("No se ha podido encontrar la Solucion");
            }        
    	}
        
        public static void testDPB() {
        	int[][] ttt = {{3,2,5},{6,0,4},{7,8,1}};
            Puzzle s = new Puzzle(ttt);
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
        
        public static void testDPB2() {
        	int[][] ttt = {{3,2,5},{6,0,4},{7,8,1}};
            Puzzle s = new Puzzle(ttt);
    		ProbPuzzleBDP problema = new ProbPuzzleBDP(s, 4);
    		
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
	
        public static void testDPB3() {
        	int[][] ttt = {{8,1,7},{4,5,6},{2,0,3}};
            Puzzle s = new Puzzle(ttt);
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
        
        public static void testDPB4() {
        	int[][] ttt = {{8,1,7},{4,5,6},{2,0,3}};
            Puzzle s = new Puzzle(ttt);
    		ProbPuzzleBDP problema = new ProbPuzzleBDP(s, 4);
    		
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
