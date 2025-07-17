package exerciciosencapsulamento;

public class nadador extends Atleta{

	public nadador(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	public void nadar() {
		System.out.println("está nadando");
	}
	public void parou_nadar() {
		System.out.println("parou de nadar");
	}
}
