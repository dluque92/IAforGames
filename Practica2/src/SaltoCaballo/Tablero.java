package SaltoCaballo;
import java.util.*;
import EspacioDeEstados.Estado;

/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero extends Estado
{
    // instance variables - replace the example below with your own
    public int[][] tablero;

    /**
     * Constructor for objects of class Tablero
     */
    public Tablero(int[][] t){
        // initialise instance variables
        tablero = t;
    }

    public int[][] devolver(){
        return tablero;
    }
    
    public List<Tablero> hijos(){
        List<Tablero> listaHijos = new ArrayList<Tablero>();
        
        int fila = tablero.length;
        int col = tablero[0].length;
        Coordenada pos = new Coordenada(0,0);
        int mayor = 0;
        for(int i = 0; i < fila; i++){
            for(int j = 0; j < col; j++){
                if(tablero[i][j] >= mayor){
                    mayor = tablero[i][j];
                    pos.x = i;
                    pos.y = j;
                }
            }
        }
        //Dos arriba, uno a la izquierda
        if((pos.x)-2 >= 0 && (pos.y)-1 >= 0 && (tablero[(pos.x)-2][(pos.y)-1] == -1)) {
             //Hago una copia del array
            int hijo[][] = new int[fila][col];
            for(int i = 0; i< fila; i++){
                for(int j = 0; j< col; j++){
                    int dato = new Integer(tablero[i][j]);
                    hijo[i][j] = dato;
                }
            }
            hijo[(pos.x)-2][(pos.y)-1] = mayor + 1;
            Tablero tabHijo = new Tablero(hijo);
            listaHijos.add(tabHijo);
            //hijo[(pos.x)-2][(pos.y)-1] = -1;
        }
        //Dos arriba, uno a la derecha
        if((pos.x-2) >= 0 && (pos.y+1) < col && (tablero[pos.x-2][pos.y+1] == -1)) {
             //Hago una copia del array
            int hijo[][] = new int[fila][col];
            for(int i = 0; i< fila; i++){
                for(int j = 0; j< col; j++){
                    int dato = new Integer(tablero[i][j]);
                    hijo[i][j] = dato;
                }
            }
            hijo[pos.x-2][pos.y+1] = mayor + 1;
            Tablero tabHijo = new Tablero(hijo);
            listaHijos.add(tabHijo);
            //hijo[pos.x-2][pos.y+1] = -1;
        }
        //Dos abajo, uno a la izquierda
        if((pos.x+2) < fila && (pos.y-1) >= 0 && (tablero[pos.x+2][pos.y-1] == -1)){
             //Hago una copia del array
            int hijo[][] = new int[fila][col];
            for(int i = 0; i< fila; i++){
                for(int j = 0; j< col; j++){
                    int dato = new Integer(tablero[i][j]);
                    hijo[i][j] = dato;
                }
            }
            hijo[pos.x+2][pos.y-1] = mayor + 1;
            Tablero tabHijo = new Tablero(hijo);
            listaHijos.add(tabHijo);
            //hijo[pos.x+2][pos.y-1] = -1;
        }
        //Dos abajo, uno a la derecha
        if((pos.x+2) < fila && (pos.y+1) < col && (tablero[pos.x+2][pos.y+1] == -1)){
             //Hago una copia del array
            int hijo[][] = new int[fila][col];
            for(int i = 0; i< fila; i++){
                for(int j = 0; j< col; j++){
                    int dato = new Integer(tablero[i][j]);
                    hijo[i][j] = dato;
                }
            }
            hijo[pos.x+2][pos.y+1] = mayor + 1;
            Tablero tabHijo = new Tablero(hijo);
            listaHijos.add(tabHijo);
            //hijo[pos.x+2][pos.y+1] = -1;
        }
        //Dos a la izquierda, uno arriba
        if((pos.x-1) >= 0 && (pos.y-2) >= 0 && (tablero[pos.x-1][pos.y-2] == -1)) {
             //Hago una copia del array
            int hijo[][] = new int[fila][col];
            for(int i = 0; i< fila; i++){
                for(int j = 0; j< col; j++){
                    int dato = new Integer(tablero[i][j]);
                    hijo[i][j] = dato;
                }
            }
            hijo[pos.x-1][pos.y-2] = mayor + 1;
            Tablero tabHijo = new Tablero(hijo);
            listaHijos.add(tabHijo);
            //hijo[pos.x-1][pos.y-2] = -1;
        }
        //Dos a la izquierda, uno abajo
        if((pos.x+1) < fila && (pos.y-2) >= 0 && (tablero[pos.x+1][pos.y-2] == -1)) {
             //Hago una copia del array
            int hijo[][] = new int[fila][col];
            for(int i = 0; i< fila; i++){
                for(int j = 0; j< col; j++){
                    int dato = new Integer(tablero[i][j]);
                    hijo[i][j] = dato;
                }
            }
            hijo[pos.x+1][pos.y-2] = mayor + 1;
            Tablero tabHijo = new Tablero(hijo);
            listaHijos.add(tabHijo);
            //hijo[pos.x+1][pos.y-2] = -1;
        }
        //Dos a la derecha, uno arriba
        if((pos.x-1) >= 0 && (pos.y+2) < col && (tablero[pos.x-1][pos.y+2] == -1)){
             //Hago una copia del array
            int hijo[][] = new int[fila][col];
            for(int i = 0; i< fila; i++){
                for(int j = 0; j< col; j++){
                    int dato = new Integer(tablero[i][j]);
                    hijo[i][j] = dato;
                }
            }
            hijo[pos.x-1][pos.y+2] = mayor + 1;
            Tablero tabHijo = new Tablero(hijo);
            listaHijos.add(tabHijo);
            //hijo[pos.x-1][pos.y+2] = -1;
        }
        //Dos a la derecha, uno abajo
        if((pos.x+1) < fila && (pos.y+2) < col && (tablero[pos.x+1][pos.y+2] == -1)) {
             //Hago una copia del array
            int hijo[][] = new int[fila][col];
            for(int i = 0; i< fila; i++){
                for(int j = 0; j< col; j++){
                    int dato = new Integer(tablero[i][j]);
                    hijo[i][j] = dato;
                }
            }
            hijo[pos.x+1][pos.y+2] = mayor + 1;
            Tablero tabHijo = new Tablero(hijo);
            listaHijos.add(tabHijo);
            //hijo[pos.x+1][pos.y+2] = -1;
        }
        return listaHijos;
    }
    
    public String toString(){
        String aux = "";
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                aux += tablero[i][j] + "\t";
            }
            aux += "\n";
        }
        return aux;
    }
    
    public boolean equals(Object e)
    {
        return true;
    }   
}
