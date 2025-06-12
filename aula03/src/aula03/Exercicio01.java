package aula03;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		
		int quantidade = 0, x=0;
		double nota = 0,soma = 0, media=0; 
		System.out.println("Qual a quantidaade de alunos na sua sala?");
		quantidade = sca.nextInt();
		
		while (x < quantidade) {
			System.out.printf("Digite a nota %d",x+1);
			soma += sca.nextDouble();
			x++;
		}
}
}