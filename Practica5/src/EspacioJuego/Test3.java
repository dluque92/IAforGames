package EspacioJuego;

import ConectaK.ConectaK;
import ConectaK.EvaluadorCK;
import Jugadores.Evaluador;
import Jugadores.JugadorEvaluar;
import Jugadores.JugadorEvaluarTV;

public class Test3 {

	public static void main(String[] args) {
		
		double alfa = 0.1;
		double pexp = 0.1;
		int partidas = 80000;
		int cada = 5000;
		int pruebas = 200;
		
		// Conecta-3 en un tablero 3x3
		verEntrenamientoAleatorio(3, 3, 3, alfa, pexp, partidas, cada, pruebas);
		System.out.println("");
		// Conecta-3 en un tablero 4x4
		verEntrenamientoAleatorio(4, 4, 3, alfa, pexp, partidas, cada, pruebas);
		System.out.println("");
		// Conecta-4 en un tablero 4x4
		verEntrenamientoAleatorio(4, 4, 4, alfa, pexp, partidas, cada, pruebas);
		
	}
	
public static void verEntrenamientoAleatorio (int f, int c, int k, double alfa, double pexp, int partidas, int cada, int pruebas){
		
		System.out.println("EvaluarTV frente a EvaluarCK");
		System.out.println("Entrenamos c-" + k + " " + f + "x" + c + ". Alfa: " + alfa + " Pexp: " + pexp + " Partidas: " + partidas + " Pruebas: " + pruebas + " cada " + cada);
		
		ConectaK ck = new ConectaK(f, c, k);
		JugadorEvaluarTV j1 = new JugadorEvaluarTV(alfa);
		JugadorEvaluarTV j2 = new JugadorEvaluarTV(alfa);
		JugadorEvaluar je = new JugadorEvaluar(new EvaluadorCK(f,c,k));
			
		
		Juego juego = new Juego(j1, je, ck);
		
		for(int i = 0; i< partidas*2; i++){
			// Como comienza en 0, el primer turno es 0 y el segundo es 1
			if(i%2 == 0){
				j1.aprendeTurno1(j2, ck, pexp);
			}else{
				j2.aprendeTurno2(j1, ck, pexp);
			}
			if(i%(cada*2) == 0){
				int jug1 = 0;	int jug2 = 0; 	int empate = 0;
				for(int j = 0; j < pruebas; j++){
					int ganador = juego.jugarPartida(false); 
					if(ganador == 1){
						jug1++;
					}else if(ganador == 0){
						empate++;
					}else{
						jug2++;
					}
				}
				System.out.println("Gana1: " + redondearDecimales((double)jug1/pruebas*100, 2) + "% (" + jug1 + ") Empate: " + redondearDecimales((double)empate/pruebas*100, 2) + "% (" + empate + ") Gana2: " + redondearDecimales((double)jug2/pruebas*100, 2) + "% (" + jug2 + ")" );
			}
		}
	}
	
	public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }

}