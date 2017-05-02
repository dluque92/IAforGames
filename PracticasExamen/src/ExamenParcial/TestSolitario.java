package ExamenParcial;

import java.util.List;
import java.util.Random;

public class TestSolitario {

	public static void main(String[] args) throws Exception {
		
		int[][] cartas = crearCartas(8);
		Solitario solitario = new Solitario(cartas);
		System.out.println(solitario.toString());
		System.out.println("Sus hijos son");
		for(Solitario s: solitario.hijos()){
			s.ver();
		}
		ProblemaSolitario problema = new ProblemaSolitario(solitario);
		List<Solitario> l = problema.amplitud();
		
		if (l != null) {
			System.out.println("Profundidad de la solucion: " + (l.size()-1));
            System.out.println("Camino Solucion:");
            for (Solitario e : l) {
               e.ver();
               System.out.println("");
            }
        } else {
            System.out.println("No se ha podido encontrar la Solucion");
        }  
	}

	private static int[][] crearCartas(int tam) throws Exception {
		if(tam %2 == 0){
			int[] aleatorios = new int[tam];
			for(int i = 0; i < tam; i++){
				aleatorios[i] = i+1;
			}
			int[] barajadas = new int[tam];
			int i = 0;
			Random r = new Random();
			while(i != tam){
				int n = r.nextInt(tam);
				while(aleatorios[n] == 0){
					n = r.nextInt(tam);
				}
				barajadas[i] = aleatorios[n];
				aleatorios[n] = 0;
				i++;
			}
			int[][] cartas = new int[tam/2][2];
			int num = 0;
			for(int j = 0; j < tam/2; j++){
				for(int k = 0; k < 2; k++){
					cartas[j][k] = barajadas[num];
					num++;
				}
			}
			return cartas;
		}else{
			throw new Exception("El tamaño tiene que ser par.");
		}
		
	}

}
