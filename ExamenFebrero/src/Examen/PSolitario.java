package Examen;
//David Luque Fernández
import EspacioDeEstados.Problema;

public class PSolitario extends Problema<Solitario>{

	public PSolitario(Solitario e) {
		this.ini = e;
	}
	
	@Override
	public boolean esFinal(Solitario e) {
		boolean esFinal = false;
		//List<Solitario> hijos = e.hijos();
		if(e.hijos().isEmpty()){
			esFinal = true;
		}
		return esFinal;
	}

}
