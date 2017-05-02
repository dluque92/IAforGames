// David Luque Fernández

package Examen;

import java.util.List;

public class TestSolidario {

	public static void main(String[] args) {

		int N = 6;
		
		Solitario solitario = new Solitario(N);
		
		solitario.generarAlea();
		
		System.out.println(solitario.toString());
		
		PSolitario problema = new PSolitario(solitario);
		
		List<Solitario> hijos = problema.amplitud();

		if(hijos != null){
			for(Solitario hijo: hijos){
				hijo.ver();
			}
		}
		
		
	}

}
