package exerciciosencapsulamento;

public class ciclismo extends Atleta {

	public ciclismo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	public void pedal() {
		System.out.println("está pedalando");
	}
	public void parou_pedal() {
		System.out.println("parou o pedal");
	}
}
