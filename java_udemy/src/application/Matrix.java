package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.NewAccount;
import model.exceptions.AccountException;

public class Matrix {

	
	public static void main(String[] args) throws ParseException {
	//public static void main(String[] args) throws ParseException {
		
		/* quando "throws ParseException" não é acrescentado ao método principal, estamos
		 * informando ao programa que esse método não lança nenhuma exceção/erro. Mas se 
		 * utilizarmos uma chamada dentro de Main que pode lançar uma exceção, como é o 
		 * caso do .parse(), o compilador vai indicar erro para que essa exceção seja 
		 * tratada ou propagada("jogada" para outro metodo resolver) no método que ela se encontra. Acrescentando esse termo, 
		 * indicdos que essa exceção não precisa ser tratada pelo método que ela está 
		 * inserida.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Matrizes
		
		/*- Conceito de matriz: nome dado a arranjos (array) bidimensionais - linhas (1º indice) e colunas (2º indice) - 
		 * (ao contrário do vetor, que seria um arranjo unidimensional) - "vetor de vetores"; 
		 * Assim como todo array, ele é uma estrutura de dados homogênea, ordenada e é alocada de uma vez só, em um bloco contíguo de memória.
		 * - Vantagens: acesso imediato aos elementos pela sua posição.
		 * - Desvantagens: tamanho fixo e dificuldade para se realizar inserções e deleções
		 */
		
		/*
		 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N
		 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a
		 * quantidade de valores negativos da matriz.
		 * ------------
		 * ENTRADA:
		 * 3
		 * 5 -3 10
		 * 15 8 2
		 * 7 9 -4
		 * ------------
		 * SAÍDA:
		 * Main diagonal:
		 * 5 8 -4
		 * Negative numbers = 2 
		 * -------------
		 */
		
		int n1 = sc.nextInt();
		//numero de colchetes de acordo com a dimensão (uni, bi, tri..)
		int[][] mat1 = new int[n1][n1];
		
		for(int i = 0; i < mat1.length; i++) {
			for(int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < n1; i++) {
			System.out.print(mat1[i][i] + " ");
		}
		System.out.println();
		
		int count1 = 0;
		for(int i = 0; i < n1; i++) {
			for(int j = 0; j < n1; j++) {
				if(mat1[i][j] < 0) {
					count1++;
				}
			}
		}
		System.out.println("Negative numbers = " + count1);
		
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler
		 * uma matriz M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz.
		 * Para casa ocorrência de X, mostrar os valores à esquerda, acima, à direita e 
		 * abaixo de X, quando houver, conforme exemplo. - corrigido
		 * ---------------
		 * ENTRADA
		 * 3 4 
		 * 10 8 15 12
		 * 21 11 23 8
		 * 14 5 13 19
		 * 8
		 * ---------------
		 * SAÍDA
		 * Position 0,1:
		 * Left: 10
		 * Right: 15
		 * Down: 11
		 * Position 1,3:
		 * Left: 23
		 * Up: 12
		 * Down: 19
		 */
		
		int m2 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int[][] mat2 = new int[m2][n2];
		
		for(int i = 0; i < mat2.length; i++) {
			for(int j = 0; j < mat2[i].length; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		//int posX = 0;
		//int posY = 0;
		for(int i = 0; i < mat2.length; i++) {
			for(int j = 0; j < mat2[i].length; j++) {
				if(mat2[i][j] == x) {
					//posX = i;
					//posY = j;
					System.out.println("Position " + i + "," + j + ":");
					//if(i == 0 && j > 0 && j < mat[i].length) {						
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i == 0 && j == 0) {
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);						
					//}else if(i > 0 && j == mat[i].length ) {
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);						
					//}else if(i > 0 && i < mat.length && j > 0 && j < mat[i].length) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i > 0 && i < mat.length && j == mat[i].length) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i > 0 && i < mat.length && j == 0) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i == mat.length && j == mat[i].length){
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
					//}	
					if(j > 0) {
						System.out.println("Left: " + mat2[i][j - 1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat2[i - 1][j]);
					}
					if(j < mat2[i].length-1) {
						System.out.println("Right: " + mat2[i][j + 1]);
					}
					if(i < mat2.length-1) {
						System.out.println("Down: " + mat2[i+1][j]);
					}
				}
			}
		}
		

	}
}
