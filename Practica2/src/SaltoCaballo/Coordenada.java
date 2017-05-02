package SaltoCaballo;


/**
 * Write a description of class Coordenada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coordenada
{
    // instance variables - replace the example below with your own
    public int x;
    public int y;

    /**
     * Constructor for objects of class Coordenada
     */
    public Coordenada(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString(){
        return "("+ x + "," + y + ")";
    }
}
