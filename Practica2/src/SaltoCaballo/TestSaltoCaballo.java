package SaltoCaballo;
import java.util.*;

/**
 * Write a description of class TestSaltoCaballo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestSaltoCaballo{
   public static void main(String [] args){
       int fila = 5;
       int col = 5;
       int[][] tablero = new int[fila][col];
       Coordenada inicial = new Coordenada(0,0);
       for(int i = 0; i < fila; i++){
           for(int j = 0; j < col; j++){
               if(i == inicial.x && j == inicial.y){
                   tablero[i][j] = 0;
                }else{
                   tablero[i][j] = -1;
                }
            }
        }
       
       Tablero tabCaballo = new Tablero(tablero);
       System.out.println("Esto es el tablero:");
       //tabCaballo.ver();
       
       PCaballo problema = new PCaballo(tabCaballo);
       List<Tablero> solucion = problema.amplitud();
       
       for(Tablero e: solucion){
           e.ver();
        }
   }
}
