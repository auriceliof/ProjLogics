package logic.ProjTemperature;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjTemperatureApplication {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double F = scanner.nextDouble();

        double C = (5 * (F - 32) / 9);

        System.out.println("Temperatura em Fahrenheit: " + F + " °F");
        System.out.println("Temperatura em Celsius: " + C + " °C");

        scanner.close();
    }
}
