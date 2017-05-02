package EspacioJuego;

import ConectaK.ConectaK;
import ConectaK.EvaluadorCK;
import Jugadores.Evaluador;
import Jugadores.Jugador;
import Jugadores.JugadorAleatorio;
import Jugadores.JugadorAlfaBeta;
import Jugadores.JugadorEvaluar;

public class TestJuego {

	public static void main(String[] args) {

		ConectaK e = new ConectaK(3,3,3);
		double n = 200.0;
		System.out.println("Jugador Aleatorio vs Jugador Aleatorio");
		dosJugAlea(e, n);
		System.out.println("");
		System.out.println("Jugador Aleatorio vs Jugador Evaluador");
		jugAleaEva(e, n);
		System.out.println("");
		System.out.println("Jugador Aleatorio vs Jugador AlfaBeta con prof 2"); 
		jugAleaAlfBeta2(e, n);
		System.out.println("");
		System.out.println("Jugador Aleatorio vs Jugador AlfaBeta con prof 3"); 
		jugAleaAlfBeta3(e, n);
		System.out.println("");
		System.out.println("Jugador Aleatorio vs Jugador AlfaBeta con prof 4"); 
		jugAleaAlfBeta4(e, n);
		System.out.println("");
		System.out.println("Jugador Aleatorio vs Jugador AlfaBeta con prof 5"); 
		jugAleaAlfBeta5(e, n);
		System.out.println("");
		System.out.println("Jugador Aleatorio vs Jugador AlfaBeta con prof 6"); 
		jugAleaAlfBeta6(e, n);

	}
	
	public static void dosJugAlea(ConectaK e, double n){
		Jugador j1 = new JugadorAleatorio();
		Jugador j2 = new JugadorAleatorio();
		Juego j = new Juego(j1, j2, e);
		System.out.println(j.jugar(n));
		
	}
	
	public static void jugAleaEva(ConectaK e, double n){
		Jugador j1 = new JugadorAleatorio();
		EvaluadorCK ev = new EvaluadorCK(3, 3, 3);
		Jugador j2 = new JugadorEvaluar(ev);
		Juego j = new Juego(j1, j2, e);
		System.out.println(j.jugar(n));
	}

	public static void jugAleaAlfBeta2(ConectaK e, double n){
		Jugador j1 = new JugadorAleatorio();
		EvaluadorCK ev = new EvaluadorCK(3, 3, 3);
		Jugador j2 = new JugadorAlfaBeta(ev, 2);
		Juego j = new Juego(j1, j2, e);
		System.out.println(j.jugar(n));
	}
	
	public static void jugAleaAlfBeta3(ConectaK e, double n){
		Jugador j1 = new JugadorAleatorio();
		EvaluadorCK ev = new EvaluadorCK(3, 3, 3);
		Jugador j2 = new JugadorAlfaBeta(ev, 3);
		Juego j = new Juego(j1, j2, e);
		System.out.println(j.jugar(n));
	}
	
	public static void jugAleaAlfBeta4(ConectaK e, double n){
		Jugador j1 = new JugadorAleatorio();
		EvaluadorCK ev = new EvaluadorCK(3, 3, 3);
		Jugador j2 = new JugadorAlfaBeta(ev, 4);
		Juego j = new Juego(j1, j2, e);
		System.out.println(j.jugar(n));
	}
	
	public static void jugAleaAlfBeta5(ConectaK e, double n){
		Jugador j1 = new JugadorAleatorio();
		EvaluadorCK ev = new EvaluadorCK(3, 3, 3);
		Jugador j2 = new JugadorAlfaBeta(ev, 5);
		Juego j = new Juego(j1, j2, e);
		System.out.println(j.jugar(n));
	}
	
	public static void jugAleaAlfBeta6(ConectaK e, double n){
		Jugador j1 = new JugadorAleatorio();
		EvaluadorCK ev = new EvaluadorCK(3, 3, 3);
		Jugador j2 = new JugadorAlfaBeta(ev, 6);
		Juego j = new Juego(j1, j2, e);
		System.out.println(j.jugar(n));
	}

}
