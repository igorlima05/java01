package aula2java;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		double valor = scanner.nextDouble();
		
		   if (valor > 0) {
	            System.out.println("O valor é positivo.");
	        } else if (valor < 0) {
	            System.out.println("O valor é negativo.");
	        } else {
	            System.out.println("O valor é zero.");
	        }

	        scanner.close();
				
	}

}
 