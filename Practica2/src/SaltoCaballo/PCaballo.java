package SaltoCaballo;
import EspacioDeEstados.*;

/**
 * Write a description of class PCaballo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PCaballo extends Problema<Tablero>
{
    /**
     * Constructor for objects of class PCaballo
     */
    public PCaballo(Tablero tablero)
    {
        // initialise instance variables
        this.ini = tablero;
    }

     public boolean esFinal(Tablero tablero)
    {
        // put your code here
        boolean esFinal = false;
        int tab[][] = tablero.devolver();
        int fila = tab.length;
        int col = tab[0].length;
        for(int i = 0; i< fila; i++){
            for(int j = 0; j < col; j++){
                if((fila*col)-1 == tab[i][j]){
                    esFinal = true;
                }
            }
        }
        return esFinal;
    }
}
