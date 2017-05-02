package Jugadores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SingleSelectionModel;

import EspacioJuego.EstadoJuego;
import EspacioJuego.Ficha;


/**
 * Jugador que elige el siguiente movimiento evaluando los sucesores
 * de la posición actual a una profundidad dada, y propagando los
 * valores mediante la estrategia Alfa-Beta.
 * 
 * @author Lorenzo Mandow
 * 
 * @versión: 2013-11-18
 *
 */
public class JugadorAlfaBeta extends JugadorEvaluar {

    private int profMax;            // Profundidad máxima de búsqueda.
    private int hojas;
    
    /**
     * Constructor.
     * 
     * @param ev                Evaluador.
     * @param profundidadMaxima Profundidad máxima de búsqueda.
     */
    public JugadorAlfaBeta(Evaluador ev, int profundidadMaxima) {
        super(ev);
        this.profMax = profundidadMaxima;
        hojas = 0;
    }
    
    @Override
    public EstadoJuego mueve(EstadoJuego e) {
        VE resultado = negamaxAB(e, this.profMax, e.fichaActual(), e.fichaOtro(), 1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);     
        //System.out.println("Evaluación del movimiento: " + resultado.v());
        
        return resultado.e();
    }
    
    /**
     *  NEGAMAX Alfa-beta
     */
    
    public VE negamaxAB (EstadoJuego e, int prof, Ficha fmax, Ficha fmin, int signo, double alfa, double beta) {
        EstadoJuego mejorE = null;
        double mejorV = Double.NEGATIVE_INFINITY;
        double v2;
        
        if (prof == 0 || e.ganador()!=null || e.agotado()) {
            mejorV = signo*evalua(e, fmax, fmin);
            hojas++;
        } else {
            for (EstadoJuego e2 : ordenar(e.hijos())) {
                v2 = -(negamaxAB (e2, prof-1, fmax, fmin, -signo, -beta, -alfa).v());
                if ((v2 > mejorV) || (mejorE == null)) {
                    mejorV = v2;
                    mejorE = e2;
                     if (v2 >= beta){
                         return new VE(mejorV, mejorE);
                    }
                    if (v2 >  alfa){
                        alfa = v2;
                    }
                }
            }
        }
        return new VE(mejorV, mejorE);
    }
    
    public VE negamaxOrdenadoAB (EstadoJuego e, int prof, Ficha fmax, Ficha fmin, int signo, double alfa, double beta) {
        EstadoJuego mejorE = null;
        double mejorV = Double.NEGATIVE_INFINITY;
        double v2;
        
        if (prof == 0 || e.ganador()!=null || e.agotado()) {
            mejorV = signo*evalua(e, fmax, fmin);
            hojas++;
        } else {
            for (EstadoJuego e2 : ordenar2(e.hijos())) {
                v2 = -(negamaxOrdenadoAB (e2, prof-1, fmax, fmin, -signo, -beta, -alfa).v());
                if ((v2 > mejorV) || (mejorE == null)) {
                    mejorV = v2;
                    mejorE = e2;
                     if (v2 >= beta){
                         return new VE(mejorV, mejorE);
                    }
                    if (v2 >  alfa){
                        alfa = v2;
                    }
                }
            }
        }
        return new VE(mejorV, mejorE);
    }
    
    List<EstadoJuego> ordenar (List<EstadoJuego> l) {
        return super.barajar(l);    
    }
    
    List<EstadoJuego> ordenar2 (List<EstadoJuego> l){
    	List<EstadoJuego> lista = new ArrayList<EstadoJuego>(); 
    	for(int i = 0; i <= l.size()/2; i++){
    		if(i == 0){
    			lista.add(l.get(l.size()/2));
    		}else{
    			lista.add(l.get((l.size()/2)-i));
    			lista.add(l.get((l.size()/2)+i));
    		}
    	}
    	return lista;
    }
    
    public int hojas(){
    	return hojas;
    }
}
