package br.com.erickfreire.calculadoradecrescimentodemograficomundial;

import java.util.Scanner;

/**
 * Porgrama quem Java que calcula o crescimento demográfico mundial
 * @author Erick Freire
 * @version 1 - Criado em 28-03-2021 as 19:39
 */

public class CalculadoraDeCrescimentoDemograficoMundial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double populacao;
		double taxaDeCrescimento;
		double calculo;
		
		System.out.print("Digite o numero da população mundial: ");
		populacao = entrada.nextDouble();
		
		System.out.print("Digite a taxa de crescimento mundial: ");
		taxaDeCrescimento = entrada.nextDouble();
		
		calculo = ((populacao * (taxaDeCrescimento / 100)) + populacao);
		
		System.out.printf("Ano 1: %.2f Bilhões%n", calculo);		
		calculo = ((calculo * (taxaDeCrescimento / 100) + calculo));
        System.out.printf("Ano 2: %.2f Bilhões%n", calculo);		
		calculo = ((calculo * (taxaDeCrescimento / 100) + calculo));
		System.out.printf("Ano 3: %.2f Bilhões%n", calculo);		
		calculo = ((calculo * (taxaDeCrescimento / 100) + calculo));
		System.out.printf("Ano 4: %.2f Bilhões%n", calculo);		
		calculo = ((calculo * (taxaDeCrescimento / 100) + calculo));
		System.out.printf("Ano 5: %.2f Bilhões%n", calculo);		
		calculo = ((calculo * (taxaDeCrescimento / 100) + calculo));
	}

}
