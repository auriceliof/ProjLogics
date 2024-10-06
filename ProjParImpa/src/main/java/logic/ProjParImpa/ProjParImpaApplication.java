package logic.ProjParImpa;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjParImpaApplication {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("O número é par.");
	        } else {
	            System.out.println("O número é ímpar.");
	        }

	        if (numero > 0) {
	            System.out.println("O número é positivo.");
	        } else if (numero < 0) {
	            System.out.println("O número é negativo.");
	        } else {
	            System.out.println("O número é zero.");
	        }

	        scanner.close();
	    }
}
