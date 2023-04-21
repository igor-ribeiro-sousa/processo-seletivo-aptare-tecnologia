package provaEstagioAptareTecnologia.questao01;

import java.util.Scanner;

/*
	Implementar um programa que receba como parâmetro de entrada 1(um) texto e 
	retorne a quantidade de caracteres, o 1º e último caractere. 
	
	Exemplo 1:
 		* Entrada 
			Texto: APTARE TECNOLOGIA

		* Saída
			Quantidade de Caracteres: 17
			1º caractere: A
			Último Caractere: A
*/

public class Questao01 {
	public static void PrimeiroUltimo(String texto) {

		if (texto == null || texto.isEmpty()) {
			System.out.println("Por favor, digite um texto válido.");
		}

		texto = texto.toUpperCase();
		Integer quantidadeCaracteres = texto.length();
		Character primeiro = texto.charAt(0);
		Character ultimo = texto.charAt(texto.length() - 1);

		imprimir(quantidadeCaracteres, primeiro, ultimo);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Texto: ");
		String texto = scan.nextLine().trim();
		PrimeiroUltimo(texto);

		scan.close();

	}

	public static void imprimir(Integer quantidade, Character primeiro, Character ultimo) {
		System.out.println("Quantidade de Caracteres: " + quantidade);
		System.out.println("1º caractere: " + primeiro);
		System.out.println("Último Caractere: " + ultimo);
	}

}
