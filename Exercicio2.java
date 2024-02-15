package aula5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor.
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		//Criando um vetor de tamanho 10
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			numeros[i] = leia.nextInt();
		}
		
		leia.close(); //Fechando o Scanner
		
		//Identificando os elementos nos índices impares
		System.out.println("Elementos nos índices ímpares: ");
		for(int i = 0; i < numeros.length; i++) {
			if(i % 2 != 0) { //Verifica se o índice é ímpar
				System.out.println(numeros[i]);
			}
		}
		
		//Identificando os elementos nos índices pares
		System.out.println("\nElementos nos índices pares: ");
		for(int i = 0; i < numeros.length; i++) {
			if(i % 2 == 0) { //Verifica se o índice é par
				System.out.println(numeros[i]);
			}
		}
		
		//Somando os números do vetor
		int soma = 0;
		for(int i : numeros) { //i significa cada índice do vetor numeros
			soma += i;
		}
		System.out.println("\nSoma: " + soma);
		
		//Calculando a média dos números
		double media = 0;
		media = (double) soma / numeros.length;
		System.out.println("\nMédia: " + media);
		
	}

}
