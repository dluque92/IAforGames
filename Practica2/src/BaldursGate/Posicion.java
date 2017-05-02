package BaldursGate;

import java.util.ArrayList;
import java.util.List;

import EspacioDeEstados.*;

public class Posicion extends Estado{

	public int actualX;
	public int actualY;
	
	public static char[][] mapa;
	
	public Posicion(int x, int y) {
		actualX = x;
		actualY = y;
	}
	
	public int getX(){
		return actualX;
	}
	
	public int getY(){
		return actualY;
	}
	
	@Override
	public int coste(Estado p){
		
		if(Math.abs(((Posicion)p).actualX-actualX)+Math.abs(((Posicion)p).actualY-actualY) == 2){
        	return 1414;
        }else{
        	return 1000;
        }
        
    }   
	
	public void insertarMapa(char[][] map){
		mapa = new char[map.length][map[0].length];
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[0].length; j++){
				mapa[i][j] = new Character(map[i][j]);
			}
		}
	}
	
	@Override
	public List<Posicion> hijos() {
		
		List<Posicion> listaHijos = new ArrayList<Posicion>();
		
		if(actualX > 0 && actualY > 0 && mapa[actualX-1][actualY-1] == '.'){
			Posicion pos = new Posicion(actualX-1,actualY-1);
			pos.insertarMapa(mapa);
			listaHijos.add(pos);
		}
		
		if(actualX > 0 && actualY > 0 && mapa[actualX-1][actualY] == '.'){
			Posicion pos = new Posicion(actualX-1,actualY);
			pos.insertarMapa(mapa);
			listaHijos.add(pos);
		}
		
		if(actualX > 0 && actualY < mapa[0].length-1 && mapa[actualX-1][actualY+1] == '.'){
			Posicion pos = new Posicion(actualX-1,actualY+1);
			pos.insertarMapa(mapa);
			listaHijos.add(pos);
		}
		
		if(actualX >= 0 && actualY < mapa[0].length-1 && mapa[actualX][actualY+1] == '.'){
			Posicion pos = new Posicion(actualX,actualY+1);
			pos.insertarMapa(mapa);
			listaHijos.add(pos);
		}
		
		if(actualX < mapa.length-1 && actualY < mapa[0].length-1 && mapa[actualX+1][actualY+1] == '.'){
			Posicion pos = new Posicion(actualX+1,actualY+1);
			pos.insertarMapa(mapa);
			listaHijos.add(pos);
		}
		
		if(actualX < mapa.length-1 && actualY < mapa[0].length && mapa[actualX+1][actualY] == '.'){
			Posicion pos = new Posicion(actualX+1,actualY);
			pos.insertarMapa(mapa);
			listaHijos.add(pos);
		}
		
		if(actualX < mapa.length-1 && actualY > 0 && mapa[actualX+1][actualY-1] == '.'){
			Posicion pos = new Posicion(actualX+1,actualY-1);
			pos.insertarMapa(mapa);
			listaHijos.add(pos);
		}
		
		if(actualX < mapa.length && actualY > 0 && mapa[actualX][actualY-1] == '.'){
			Posicion pos = new Posicion(actualX,actualY-1);
			pos.insertarMapa(mapa);
			listaHijos.add(pos);
		}
		
		return listaHijos;
	}
	
	@Override
	public String toString() {
		return "("+ Integer.toString(actualX) + "," + Integer.toString(actualY) + ")";
	}

	/*int coste = 1000;
	String tipo1 = "("+ (actualX+1) + "," + actualY+1 + ")";
	String tipo2 = "("+ (actualX-1) + "," + actualY+1 + ")";
	String tipo3 = "("+ (actualX-1) + "," + (actualY-1) + ")";
	String tipo4 = "("+ actualX+1 + "," + (actualY-1) + ")";
	if(p.toString() == tipo1 ){
		coste = 1414;
	}else if(p.toString() == tipo2){
		coste = 1414;
	}else if(p.toString() == tipo3){
		coste = 1414;
	}else if(p.toString() == tipo4){
		coste = 1414;
	}else{
		coste = 1000;
	}
	return coste;
    
	if(p.getClass() == Posicion){
		
	}
	*/
	
}
