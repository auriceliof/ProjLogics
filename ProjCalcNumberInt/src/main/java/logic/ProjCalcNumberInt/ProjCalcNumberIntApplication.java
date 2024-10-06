package logic.ProjCalcNumberInt;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjCalcNumberIntApplication {

	public static void main(String[] args) {
        int n = 100;
        int soma = (n * (n + 1)) / 2;

        System.out.println("A soma dos números inteiros de 1 a 100 é: " + soma);
    }

}
