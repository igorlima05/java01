package exerciciosencapsulamento;

public class Cachorro extends Animal {
	public Cachorro(String nome) {
		super(nome);
	}

	public void emitirSom() {
		System.out.println(this.nome + " :au au");
	}

}
