package aula2java;
import java.util.Scanner;
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        String[] perguntas = {
		            "1. Você telefonou para a vítima?",
		            "2. Esteve no local do crime?",
		            "3. Mora perto da vítima?",
		            "4. Devia para a vítima?",
		            "5. Já trabalhou com a vítima?"
		        };

		        int respostasPositivas = 0;

		        for (String pergunta : perguntas) {
		            System.out.println(pergunta);
		            String resposta = scanner.nextLine();

		            if (resposta.equalsIgnoreCase("sim")) {
		                respostasPositivas++;
		            }
		        }
		        if (respostasPositivas == 2) {
		            System.out.println("SUSPEITA");
		        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
		            System.out.println("CÚMPLICE");
		        } else if (respostasPositivas == 5) {
		            System.out.println("ASSASSINA");
		        } else {
		            System.out.println("INOCENTE");
		        }

		        scanner.close();
		    }
		}