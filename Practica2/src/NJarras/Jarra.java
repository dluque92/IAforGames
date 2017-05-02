package NJarras;

/**
 * Write a description of class Jarras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jarra
{
    // instance variables - replace the example below with your own
    public int capacidad;
    public int capMAXIMA;
    /**
     * Constructor for objects of class Jarras
     */
    public Jarra(int capMax,int cap)
    {
        capMAXIMA = capMax;
        capacidad = cap;
    }
    
    public String toString(){
        return Integer.toString(capacidad);
    }
}
