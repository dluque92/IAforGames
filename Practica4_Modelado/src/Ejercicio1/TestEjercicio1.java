package Ejercicio1;

public class TestEjercicio1 {

	public static void main(String[] args) {

		Profesional pro1 = new Profesional("Doctor");
		Paciente pa1 = new Paciente("Paciente");
		for(AsociacionExpedientePaciente asoc : pa1.asocExpPaciente){
			Acceso consulta = new Acceso(pro1, asoc.expediente, TipoAcceso.consulta);
			System.out.println(consulta.toString());
		}
		
		

	}

}
