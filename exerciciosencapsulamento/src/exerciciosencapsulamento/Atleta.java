package exerciciosencapsulamento;

public abstract class Atleta {
	String nome;
	int idade;
	
	public Atleta(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public void aquecer() {
		System.out.println("Aquecido");
	}
}
