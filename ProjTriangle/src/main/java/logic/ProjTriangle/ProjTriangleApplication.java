package logic.ProjTriangle;

import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjTriangleApplication {

	public static void main(String[] args) {
        Random random = new Random();

        double lado1 = random.nextDouble() * 10 + 1;
        double lado2 = random.nextDouble() * 10 + 1;
        double lado3 = random.nextDouble() * 10 + 1;

        System.out.printf("Lado 1: %.2f%n", lado1);
        System.out.printf("Lado 2: %.2f%n", lado2);
        System.out.printf("Lado 3: %.2f%n", lado3);

        if (formaTriangulo(lado1, lado2, lado3)) {
            String tipoTriangulo = determinarTipoTriangulo(lado1, lado2, lado3);
            System.out.println("Os lados formam um triângulo do tipo: " + tipoTriangulo);
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }

	
    public static boolean formaTriangulo(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

 
    public static String determinarTipoTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "equilátero";
        } else if (a == b || a == c || b == c) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}
