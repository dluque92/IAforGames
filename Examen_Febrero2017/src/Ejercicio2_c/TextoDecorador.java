package Ejercicio2_c;

public abstract class TextoDecorador implements Texto{

	public Texto texto;
	
	public TextoDecorador(Texto t) {
		setTexto(t);
	}
	
	private void setTexto(Texto t) {
		texto = t;
	}

	public void dibujar() {
		texto.dibujar();
	}

}

