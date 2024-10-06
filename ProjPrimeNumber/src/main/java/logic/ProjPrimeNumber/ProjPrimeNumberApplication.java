package logic.ProjPrimeNumber;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjPrimeNumberApplication {
	
	 public static boolean ehPrimo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Números primos no intervalo [" + inicio + ", " + fim + "]:");
        for (int numero = inicio; numero <= fim; numero++) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }

        scanner.close();
    }   
}
