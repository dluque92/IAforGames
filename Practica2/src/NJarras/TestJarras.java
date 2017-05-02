package NJarras;

import java.util.*;
/**
 * Write a description of class TestJarras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestJarras
{
   public static void main(String [] args){
       int numJarras = 3;
       int capacidades[] = {8,5,3};
       int estadoInicial[] = {8,0,0};
       Jarra jarras[] = new Jarra[numJarras];
       for(int i = 0; i < numJarras; i++){
           jarras[i] = new Jarra(capacidades[i],estadoInicial[i]);
       }
       Jarras todasJarras = new Jarras(jarras);
       PJarras problema = new PJarras(todasJarras);
       
       List<Jarras> solucion = problema.amplitud();
       
       for(Jarras e:solucion){
           e.ver();
       }
   }
}