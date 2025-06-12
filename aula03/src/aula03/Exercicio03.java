package aula03;

import java.util.Scanner;

public class Exercicio03 {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 for (int i = 0; i < 100;i++) {
		 if (i> 50 && i < 60) {
			 continue;
		 }
		 System.out.println(i);
	 }
 }
}
