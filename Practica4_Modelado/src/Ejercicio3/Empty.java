package Ejercicio3;

public class Empty extends Estado{

	private static Empty empty;
	
	private Empty() {
		// TODO Auto-generated constructor stub
	}

	public static Empty ejemplar(){
		if(empty == null){
			empty = new Empty();
		}
		return empty;
	}
	
	@Override
	public void put(Pieza p, Bandeja b) {
		b.añadir(p);
		if(b.size() < b.capacidad){
			Estado e = Normal.ejemplar();
			b.cambiarEstado(e);
		}else{
			Estado e = Full.ejemplar();
			b.cambiarEstado(e);
		}
	}

	@Override
	public Pieza get(Bandeja b) throws Exception {
		throw new Exception("La bandeja está vacia.");
		
	}

	@Override
	public String toString() {
		return "Empty";
	}
	
}
