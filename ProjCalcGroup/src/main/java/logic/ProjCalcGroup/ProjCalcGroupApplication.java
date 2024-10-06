package logic.ProjCalcGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjCalcGroupApplication {

	public static void main(String[] args) {
        
        List<Double> alturas = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            double alturaMetros = (random.nextInt(51) + 150) / 100.0; 
            alturas.add(alturaMetros);
        }

        
        List<String> sexos = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            sexos.add(random.nextBoolean() ? "masculino" : "feminino");
        }

        
        double maiorAltura = alturas.stream().mapToDouble(Double::doubleValue).max().orElse(0);
        double menorAltura = alturas.stream().mapToDouble(Double::doubleValue).min().orElse(0);

        int totalMulheres = 0;
        double somaAlturaMulheres = 0;
        for (int i = 0; i < 50; i++) {
            if (sexos.get(i).equals("feminino")) {
                totalMulheres++;
                somaAlturaMulheres += alturas.get(i);
            }
        }
        double mediaAlturaMulheres = somaAlturaMulheres / totalMulheres;

        int numHomens = 50 - totalMulheres;
        double porcentagemHomens = (double) numHomens / 50 * 100;
        double porcentagemMulheres = 100 - porcentagemHomens;

        
        System.out.printf("Maior altura: %.2f metros%n", maiorAltura);
        System.out.printf("Menor altura: %.2f metros%n", menorAltura);
        System.out.printf("Média de altura das mulheres: %.2f metros%n", mediaAlturaMulheres);
        System.out.println("Número de homens: " + numHomens);
        System.out.printf("Porcentagem de homens: %.2f%%%n", porcentagemHomens);
        System.out.printf("Porcentagem de mulheres: %.2f%%%n", porcentagemMulheres);
    }
}
