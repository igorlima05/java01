package aula03;

import java.util.Scanner;

public class Exeercicio06 {
	 public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite a quantidade de alunos de sua sala :");
			int qtd = scanner.nextInt();
			double soma = 0;
			for (int x=0; x<qtd ;x++) {
				
				System.out.println("informe a nota :");
				soma += scanner.nextDouble();
			}
			double media = soma/qtd;
			System.out.println(media);		
	 }
}