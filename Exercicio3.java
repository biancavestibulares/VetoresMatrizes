package aula5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros
		//Variáveis
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;

		//Scanner
		Scanner leia = new Scanner(System.in);

		//Matriz 3x3
		int[][] matriz = new int[3][3];

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ Matriz 3x3 ~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n");

		//Ler os números inteiros da matriz
		System.out.println("~~ Digite os valores da matriz ~~");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j); //%d indica qual a linha e qual a coluna
				matriz[i][j] = leia.nextInt(); //Adicionando o valor da matriz
			}
		}
		
		//Imprimindo os resultados das diagonais
		System.out.println("\nElementos da Diagonal Principal: ");
		for (int i =  0; i <  3; i++) {
			System.out.print(matriz[i][i] + " ");
			somaDiagonalPrincipal += matriz[i][i];
		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);

		System.out.println("\nElementos da Diagonal Secundária: ");
		for (int i =  0; i <  3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
			somaDiagonalSecundaria += matriz[i][2 - i];
		}
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);

	}

}
