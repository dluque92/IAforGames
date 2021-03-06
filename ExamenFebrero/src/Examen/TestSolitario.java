package Examen;
//David Luque Fernandez


import java.util.List;
import java.util.Random;

public class TestSolitario {

	public static void main(String[] args) {

		int N = 6;
		// Genero un mazo con N cartas aleatorias
		Carta[] cartas = generarCartas(N);
		
		//Cojo la primera
		Carta primera = cartas[0];
		Carta[] baraja = new Carta[N-1];
		for(int i = 1; i < N; i++){
			baraja[i-1] = cartas[i]; 
		}
		System.out.println("La primera carta es " + primera.toString());
		System.out.println("");
		
		System.out.println("La baraja es: ");
		
		for(int i = 0; i < N-1; i++){
			System.out.println(baraja[i].toString());
		}
		
		System.out.println("");
		Solitario solitario = new Solitario(baraja, primera);
		
		List<Solitario> hijos = solitario.hijos();
		System.out.println("Su hijo es: ");
		for(Solitario s: hijos){
			s.ver();
		}
		
		PSolitario problema = new PSolitario(solitario);
		List<Solitario> l = problema.amplitud();
		
		
		if(l != null){
			System.out.println("El solitario es: ");
			for(Solitario s: l){
				s.ver();
			}
		}else{
			System.out.println("No tiene Hijos");
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		int N2 = 10;
		// Genero un mazo con N cartas aleatorias
		Carta[] cartas2 = generarCartas(N2);
		
		//Cojo la primera
		Carta primera2 = cartas2[0];
		Carta[] baraja2 = new Carta[N2-1];
		for(int i = 1; i < N2; i++){
			baraja2[i-1] = cartas2[i]; 
		}
		System.out.println("La primera carta es " + primera2.toString());
		System.out.println("");
		
		System.out.println("La baraja es: ");
		
		for(int i = 0; i < N2-1; i++){
			System.out.println(baraja2[i].toString());
		}
		
		System.out.println("");
		Solitario solitario2 = new Solitario(baraja2, primera2);
		
		List<Solitario> hijos2 = solitario2.hijos();
		System.out.println("Su hijo es: ");
		for(Solitario s: hijos2){
			s.ver();
		}
		
		PSolitario problema2 = new PSolitario(solitario2);
		List<Solitario> l2 = problema2.amplitud();
		
		
		if(l2 != null){
			System.out.println("El solitario es: ");
			for(Solitario s2: l2){
				s2.ver();
			}
		}else{
			System.out.println("No tiene Hijos");
		}

		
	}
	
	private static Carta[] generarCartas(int n){
		
		int pos = 0;
		Carta[] barajaOrdenada = new Carta[40];
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 10; j++){
				Carta c;
				if(i == 1){
					c = new Carta(j, "oros");
				}else if(i == 2){
					c = new Carta(j, "copas");
				}else if(i == 3){
					c = new Carta(j, "espadas");
				}else{
					c = new Carta(j, "bastos");
				}
				barajaOrdenada[pos] = c;
				pos++;
			}
		}
		
		Random r = new Random();
		Carta[] baraja = new Carta[n];
		for(int i = 0; i < n; i++){
			int posAlea = r.nextInt(40);
			if(barajaOrdenada[posAlea] != null){
				baraja[i] = barajaOrdenada[posAlea];
				barajaOrdenada[posAlea] = null;
			}else{
				while(barajaOrdenada[posAlea] == null){
					posAlea = r.nextInt(40);
				}
				baraja[i] = barajaOrdenada[posAlea];
				barajaOrdenada[posAlea] = null;
			}
		}
		return baraja;
	}

}
