package aula2java;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite as duas primeiras notas de um maluno:");
		double n1 =  scanner.nextDouble();
		double n2 =  scanner.nextDouble();
		 double media =( n1+n2)/2;
		 
		 System.out.printf("media sua media é: %.2f%n",media);
		 
	}
	}
