package aula2java;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero de 1 á 7:");
		int numero = scanner.nextInt();
		
		if (numero == 1) {
			System.out.println("domingo");
		}else if (numero == 2) {
			System.out.println("segunda");
		}else if (numero == 3) {
			System.out.println("terça");
		}else if (numero == 4) {
			System.out.println("quarta");
		}else if (numero == 5) {
			System.out.println("quinta");
		}else if (numero == 6) {
			System.out.println("sexta");
		}else if (numero == 7) {
			System.out.println("sabado");
		
		}else {
			System.out.println("opção invalida");
		}
}
}