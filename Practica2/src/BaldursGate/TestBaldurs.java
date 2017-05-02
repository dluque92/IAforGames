package BaldursGate;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class TestBaldurs {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\David\\workspaceIAJ\\Practica2\\src\\AR0011SR.map"));
			String tipo = sc.nextLine();
			String alto = sc.nextLine();
			String ancho = sc.nextLine();
			int altura = Integer.parseInt(alto.substring(7));
			int anchura = Integer.parseInt(ancho.substring(6));
			String mapa = sc.nextLine();
			char mapaB[][] = new char[altura][anchura];
			Posicion pInicio = new Posicion(370,244);
			Posicion pFinal = new Posicion(376,359);
			for(int i = 0; i < altura; i++){
				String linea = sc.nextLine();
				for(int j = 0; j < anchura; j++){
					mapaB[i][j] = linea.charAt(j);
				}
			}
			sc.close();
			
			pInicio.insertarMapa(mapaB);
			PBaldur problema = new PBaldur(pInicio);
			problema.setPosicionFinal(pFinal.actualX, pFinal.actualY);
			List<Posicion> solucion = problema.aMono();
			
			for(Posicion e:solucion){
		           e.ver();
		    }
		    
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
