package exerciciosencapsulamento;

import java.util.ArrayList;

public class TesteAnimal {
	public static void main(String[]args) {
		ArrayList<Animal> listaAnimais = new ArrayList<>();
		
		listaAnimal.add(new Cachorro("Apollo"));
		listaAnimal.add(new Gato("Frufru"));
		
		for(Animal a : listaAnimais) {
			a.emitirSom();
			a.dormir();
			System.out.println();
		}
	}

}
