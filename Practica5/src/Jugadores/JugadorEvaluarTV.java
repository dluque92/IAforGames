package Jugadores;

import java.util.List;
import java.util.Random;

import EspacioJuego.EstadoJuego;

/**
 * Jugador que elige el siguiente movimiento evaluando los sucesores
 * inmediatos a la posición actual usando una Tabla de Valor calculada
 * mediante apriendizaje con refuerzo.
 * 
 * @author Lorenzo Mandow
 * @versión: 2013-11-22
 * */
public class JugadorEvaluarTV extends JugadorEvaluar {
    
    Random rnd = new Random();
    
    public JugadorEvaluarTV(){
        super(new EvaluadorTV());
    }
    
    public JugadorEvaluarTV(double alfa) {
        super(new EvaluadorTV(alfa));
    }
    
    /**
     * Entrena al jugador mediante una partida con el jugador j1 a partir del estado e.
     * Suponemos que j1 jugará en el turno 2 del
     * juego y el jugador en el turno 1.
     * 
     * @param j2   Jugador que jugara� el segundo turno
     * @param e    Estado inicial del juego
     * @param pExp Probabilidad de exploración, debe ser un valor mayor o igual que 0.0 y menor que 1.0
     *
     * 
     */
    public void aprendeTurno1 (Jugador j2, EstadoJuego e, double pExp){
        
    	boolean explora = (rnd.nextDouble() < pExp); //
        
        EstadoJuego e3;
        if (explora){
            List<EstadoJuego> lh = e.hijos();
            int n = rnd.nextInt(lh.size());
            e3 = lh.get(n);
        } else {
            e3 = this.mueve(e);
        }
        if (e.fichaActual() == e3.ganador()){   //this ganó el juego
            ((EvaluadorTV)this.evaluador).esVictoria(e3);
            if (!explora) {
                ((EvaluadorTV)this.evaluador).actualizaDT(e, e3);
            }
        } else if (e3.agotado()){               //j1 empató el juego
            ((EvaluadorTV)this.evaluador).esEmpate(e3);
            if (!explora) {
                ((EvaluadorTV)this.evaluador).actualizaDT(e, e3);
            }
        } else {  
            if (!explora) {
                ((EvaluadorTV)this.evaluador).actualizaDT(e, e3);
            }
            aprendeTurno2(j2, e3, pExp);
        }
        
    }
    
    /**
     * Entrena al jugador mediante una partida con el jugador j1 a partir del estado e.
     * Suponemos que j1 jugará en el turno 1 del
     * juego y el jugador en el turno 2.
     * 
     * @param j1   Jugador que jugará el primer turno
     * @param e    Estado inicial del juego
     * @param pExp Probabilidad de exploración, debe ser un valor mayor o igual que 0.0 y menor que 1.0
     *
     * 
     */
    public void aprendeTurno2 (Jugador j1, EstadoJuego e, double pExp){
        
        EstadoJuego e2 = j1.mueve(e);
        if (e.fichaActual() == e2.ganador()){   //j1 ganó el juego
            ((EvaluadorTV)this.evaluador).esDerrota(e2);
            ((EvaluadorTV)this.evaluador).actualizaDT(e, e2);
        } else if (e2.agotado()){               //j1 empató el juego
            ((EvaluadorTV)this.evaluador).esEmpate(e2);
            ((EvaluadorTV)this.evaluador).actualizaDT(e, e2);
        } else {    //el juego continúa
            boolean explora = (rnd.nextDouble() < pExp); //
            
            EstadoJuego e3;
            if (explora){
                List<EstadoJuego> lh = e2.hijos();
                int n = rnd.nextInt(lh.size());
                e3 = lh.get(n);
            } else {
                e3 = this.mueve(e2);
            }
            if (e2.fichaActual() == e3.ganador()){   //this ganó el juego
                ((EvaluadorTV)this.evaluador).esVictoria(e3);
                if (!explora) {
                    ((EvaluadorTV)this.evaluador).actualizaDT(e, e3);
                }
            } else if (e3.agotado()){               //j1 empató el juego
                ((EvaluadorTV)this.evaluador).esEmpate(e3);
                if (!explora) {
                    ((EvaluadorTV)this.evaluador).actualizaDT(e, e3);
                }
            } else {  
                if (!explora) {
                    ((EvaluadorTV)this.evaluador).actualizaDT(e, e3);
                }
                aprendeTurno2(j1, e3, pExp);
            }
        }
    }
}
