package exerciciosencapsulamento;

public class Gato extends Animal {
	public Gato(String nome) {
		super(nome);
	}
	public void emitirSom() {
		System.out.println(nome +"miau!");
	}
}
