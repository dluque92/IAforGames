package Ejercicio2_c;

public class TextoEnmarcado extends TextoDecorador{

	public TextoEnmarcado(Texto t) {
		super(t);
	}
	
	public void dibujar(){
		this.dibujarEnmarcado();
	}
	
	private void dibujarEnmarcado(){
		// Dibujar el texto Enmarcado
	}

}
