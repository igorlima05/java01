package exerciciosencapsulamento;

public class corredor extends Atleta {

	public corredor(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	public void correr() {
		System.out.println("está correndo");
	}
	public void parar_correr() {
		System.out.println("parou de correr");
	}
	

}
