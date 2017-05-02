package EspacioJarras;

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
    public PJarras(Jarras e)
    {
        // initialise instance variables
        this.ini = e;
    }

    public boolean esFinal(Jarras e)
    {
        // put your code here
        return e.jp == 1;
    }
}
