package logic.ProjSum;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjSumApplication {

	public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 37; i >= 1; i--) {
            // Calculando o numerador (produto dos números consecutivos)
            double numerador = (i + 1) * i;

            // Calculando o denominador (índice do termo)
            double denominador = 37 - i + 1;

            // Calculando o termo atual
            double termo = numerador / denominador;

            // Somando ao total
            soma += termo;
        }

        System.out.printf("A soma da série é: %.2f%n", soma);
    }
}
