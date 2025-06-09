package aula2java;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu sexo F ou M:");
		String letras = scanner.nextLine();
		
		if (letras .equalsIgnoreCase("F")){
			System.out.println("FEMININO");
		}else if (letras .equalsIgnoreCase( "M")){
				System.out.println("MASCULINO");
		}else {
					System.out.println("Sexo invalido");
				
			}
		scanner.close();
	}
}

