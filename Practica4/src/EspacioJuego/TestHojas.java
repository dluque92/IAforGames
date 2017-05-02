package EspacioJuego;

import ConectaK.ConectaK;
import ConectaK.EvaluadorCK;
import Jugadores.JugadorAlfaBeta;
import Jugadores.JugadorEvaluar;
import Jugadores.JugadorMinimax;

public class TestHojas {

	public static void main(String[] args) {

		//Conecta 4 - De tamaño 6x7
		ConectaK e = new ConectaK(6,7,4);
		EvaluadorCK evaluador = new EvaluadorCK(6, 7, 4);
		
		JugadorMinimax min2 = new JugadorMinimax(evaluador, 2);
		min2.negamax(e, 2, e.fichaActual(), e.fichaOtro(), 1).v();
		System.out.println("A profundidad 2 con MiniMax hay " + min2.hojas() + " hojas.");
		
		JugadorMinimax min3 = new JugadorMinimax(evaluador, 3);
		min3.negamax(e, 3, e.fichaActual(), e.fichaOtro(), 1).v();
		System.out.println("A profundidad 3 con MiniMax hay " + min3.hojas() + " hojas.");
		
		JugadorMinimax min4 = new JugadorMinimax(evaluador, 4);
		min4.negamax(e, 4, e.fichaActual(), e.fichaOtro(), 1).v();
		System.out.println("A profundidad 4 con MiniMax hay " + min4.hojas() + " hojas.");
		
		JugadorMinimax min5 = new JugadorMinimax(evaluador, 5);
		min5.negamax(e, 5, e.fichaActual(), e.fichaOtro(), 1).v();
		System.out.println("A profundidad 5 con MiniMax hay " + min5.hojas() + " hojas.");
		
		JugadorMinimax min6 = new JugadorMinimax(evaluador, 6);
		min6.negamax(e, 6, e.fichaActual(), e.fichaOtro(), 1).v();
		System.out.println("A profundidad 6 con MiniMax hay " + min6.hojas() + " hojas.");
		
		System.out.println("");
		
		JugadorAlfaBeta alfa2 = new JugadorAlfaBeta(evaluador, 2);
		alfa2.negamaxAB(e, 2, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 2 con AlfaBeta Aleatorio hay " + alfa2.hojas() + " hojas.");
		
		JugadorAlfaBeta alfa3 = new JugadorAlfaBeta(evaluador, 3);
		alfa3.negamaxAB(e, 3, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 3 con AlfaBeta Aleatorio hay " + alfa3.hojas() + " hojas.");
		
		JugadorAlfaBeta alfa4 = new JugadorAlfaBeta(evaluador, 4);
		alfa4.negamaxAB(e, 4, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 4 con AlfaBeta Aleatorio hay " + alfa4.hojas() + " hojas.");
		
		JugadorAlfaBeta alfa5 = new JugadorAlfaBeta(evaluador, 5);
		alfa5.negamaxAB(e, 5, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 5 con AlfaBeta Aleatorio hay " + alfa5.hojas() + " hojas.");
		
		JugadorAlfaBeta alfa6 = new JugadorAlfaBeta(evaluador, 6);
		alfa6.negamaxAB(e, 6, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 6 con AlfaBeta Aleatorio hay " + alfa6.hojas() + " hojas.");
		
		System.out.println("");
		
		JugadorAlfaBeta alfaOrde2 = new JugadorAlfaBeta(evaluador, 2);
		alfaOrde2.negamaxOrdenadoAB(e, 2, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 2 con AlfaBeta Ordenado hay " + alfaOrde2.hojas() + " hojas.");
		
		JugadorAlfaBeta alfaOrde3 = new JugadorAlfaBeta(evaluador, 3);
		alfaOrde3.negamaxOrdenadoAB(e, 3, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 3 con AlfaBeta Ordenado hay " + alfaOrde3.hojas() + " hojas.");
		
		JugadorAlfaBeta alfaOrde4 = new JugadorAlfaBeta(evaluador, 4);
		alfaOrde4.negamaxOrdenadoAB(e, 4, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 4 con AlfaBeta Ordenado hay " + alfaOrde4.hojas() + " hojas.");
		
		JugadorAlfaBeta alfaOrde5 = new JugadorAlfaBeta(evaluador, 5);
		alfaOrde5.negamaxOrdenadoAB(e, 5, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 5 con AlfaBeta Ordenado hay " + alfaOrde5.hojas() + " hojas.");
		
		JugadorAlfaBeta alfaOrde6 = new JugadorAlfaBeta(evaluador, 6);
		alfaOrde6.negamaxOrdenadoAB(e, 6, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		System.out.println("A profundidad 6 con AlfaBeta Ordenado hay " + alfaOrde6.hojas() + " hojas.");
	}

}
