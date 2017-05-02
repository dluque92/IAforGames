package EspacioJarras;
import java.util.*;
import EspacioDeEstados.Estado;

/**
 * Write a description of class Jarras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jarras extends Estado
{
    // instance variables - replace the example below with your own
    public int jg;
    public int jp;
    public final static int MAXG = 5;
    public final static int MAXP = 2;
    /**
     * Constructor for objects of class Jarras
     */
    public Jarras(int jg, int jp)
    {
        // initialise instance variables
        this.jp = jp;
        this.jg = jg;
    }

    public List<Jarras> hijos()
    {
        List<Jarras> listaHijos = new ArrayList<Jarras>();
        if(this.jg > 0){
            listaHijos.add(new Jarras(0, this.jp));
        }
        if(this.jp > 0){
            listaHijos.add(new Jarras(this.jg, 0));
        }
        if(this.jg > 0 && (this.jg + this.jp)<= 2 && this.jp<2){
            listaHijos.add(new Jarras(0, this.jg + this.jp));
        }
        if(this.jp > 0 && (this.jg + this.jp)<= 5 && this.jg<5){
            listaHijos.add(new Jarras(this.jg + this.jp, 0));
        }
        if(this.jg > 0 && (this.jg + this.jp)>2  && this.jp<2){
            listaHijos.add(new Jarras(this.jg + this.jp - 2, 2));
        }
        if(this.jp > 0 && (this.jg + this.jp)>5 && this.jg<5){
            listaHijos.add(new Jarras(5, this.jg + this.jp - 5));
        }
        return listaHijos;
    }
    
    public String toString(){
        return Integer.toString(this.jg) + " " + Integer.toString(this.jp);
    }
}
