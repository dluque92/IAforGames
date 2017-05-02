package Ejercicio1;

public class AsociacionExpedientePaciente {

	public Expediente expediente;
	public Paciente paciente;
	
	public AsociacionExpedientePaciente(Expediente expediente, Paciente paciente) {
		this.expediente = expediente;
		this.paciente = paciente;
		if(expediente.asocExpPaciente == null){
			expediente.addAsoc(this);
			paciente.addAsoc(this);
		}
	}
	
	public void remove(){
		expediente.removeAsoc(this);
		paciente.removeAsoc(this);
	}
}
