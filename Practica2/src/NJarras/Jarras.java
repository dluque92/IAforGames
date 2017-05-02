package NJarras;
import java.util.*;
import EspacioDeEstados.Estado;

/**
 * Write a description of class Jarras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jarras extends Estado{
    // instance variables - replace the example below with your own
   public Jarra[] todasJarras;
    /**
     * Constructor for objects of class Jarras
     */
    public Jarras(Jarra[] jarras){
        todasJarras = jarras;
    }
    
    public Jarra[] devuelve(){
        return todasJarras;
    }
    

    public List<Jarras> hijos(){
        List<Jarras> listaHijos = new ArrayList<Jarras>();
        
        int tam = todasJarras.length;
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                if(i!=j){
                    if(todasJarras[i].capacidad > 0 && (todasJarras[i].capacidad + todasJarras[j].capacidad)<= todasJarras[j].capMAXIMA && todasJarras[j].capacidad < todasJarras[j].capMAXIMA){
                        Jarra aux[] = new Jarra[tam];
                        for(int k = 0; k < tam; k++){
                            Jarra h = new Jarra(todasJarras[k].capMAXIMA, todasJarras[k].capacidad);
                            aux[k] = h;
                        }
                        aux[j].capacidad = aux[j].capacidad + aux[i].capacidad; 
                        aux[i].capacidad = 0;
                        Jarras auxiliar = new Jarras(aux);
                        listaHijos.add(auxiliar);
                    }
                   
                    if(todasJarras[i].capacidad > 0 && (todasJarras[i].capacidad + todasJarras[j].capacidad) > todasJarras[j].capMAXIMA && todasJarras[j].capacidad < todasJarras[j].capMAXIMA){
                        Jarra aux[] = new Jarra[tam];
                        for(int k = 0; k < tam; k++){
                            Jarra h = new Jarra(todasJarras[k].capMAXIMA, todasJarras[k].capacidad);
                            aux[k] = h;
                        }
                        aux[i].capacidad = aux[i].capacidad + aux[j].capacidad - aux[j].capMAXIMA; 
                        aux[j].capacidad = aux[j].capMAXIMA;
                        Jarras auxiliar = new Jarras(aux);
                        listaHijos.add(auxiliar);
                    }
                    
                }
            }
        }
        return listaHijos;
    }
    
    public String toString(){
        String aux = " ";
        for(Jarra j: todasJarras){
            aux += Integer.toString(j.capacidad) + " ";
        }
        return aux;
    }
    
    public boolean equals(Object e){
        return true;
    }   
       
}
