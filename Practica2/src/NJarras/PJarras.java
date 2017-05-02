package NJarras;
import EspacioDeEstados.*;

/**
 * Write a description of class PJarras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PJarras extends Problema<Jarras>
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class PJarras
     */
    public PJarras(Jarras jarras)
    {
        // initialise instance variables
        this.ini = jarras;
    }

    public boolean esFinal(Jarras jarras)
    {
        // put your code here
        boolean esFinal = false;
        Jarra[] todas = jarras.devuelve();
        for(Jarra j : todas){
            if(j.capacidad == 4){
                esFinal = true;
            }
        }
        return esFinal;
    }
}