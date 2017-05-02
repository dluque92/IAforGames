package Ejercicio3;

public class Normal extends Estado{

	private static Normal normal;
	
	private Normal() {
		// TODO Auto-generated constructor stub
	}
	
	public static Normal ejemplar(){
		if(normal == null){
			normal = new Normal();
		}
		return normal;
	}
	
	@Override
	public void put(Pieza p, Bandeja b) {
		b.añadir(p);
		if(b.size() == b.capacidad){
			Estado e = Full.ejemplar();
			b.cambiarEstado(e);
		}
	}

	@Override
	public Pieza get(Bandeja b) {
		Pieza p = b.extraer();
		if(b.size() == 0){
			Estado e = Empty.ejemplar();
			b.cambiarEstado(e);
		}
		return p;
	}

	@Override
	public String toString() {
		return "Normal";
	}

}
