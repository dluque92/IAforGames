package Ejercicio3;

public class Full extends Estado{

	private static Full full;
	
	private Full() {
		// TODO Auto-generated constructor stub
	}
	
	public static Full ejemplar(){
		if(full == null){
			full = new Full();
		}
		return full;
	}
	
	@Override
	public void put(Pieza p, Bandeja b) throws Exception {
		throw new Exception("La bandeja está llena.");
	}

	@Override
	public Pieza get(Bandeja b) {
		Pieza p = b.extraer();
		if(b.size() != 0){
			Estado e = Normal.ejemplar();
			b.cambiarEstado(e);
		}else{
			Estado e = Empty.ejemplar();
			b.cambiarEstado(e);
		}
		return p;
	}

	@Override
	public String toString() {
		return "Full";
	}

}
