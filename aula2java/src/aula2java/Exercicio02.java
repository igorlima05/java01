package aula2java;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros:");
		int valor1 = scanner.nextInt();
		int valor2 = scanner.nextInt();
		int valor3 = scanner.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.printf("valor1 (%d) é o numero maior",valor1 );
		}else if (valor2 > valor3) {
			System.out.printf("valor2 (%d) é o numero maior",valor2);
		}else {
			System.out.printf("valor3 (%d) é o numero maior",valor3);
		}
}
}