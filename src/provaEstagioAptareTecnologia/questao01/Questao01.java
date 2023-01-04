package provaEstagioAptareTecnologia.questao01;

import java.util.Scanner;

		/*
			Implementar um programa que receba como parâmetro de entrada 1 (um) texto e 
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
	public static void PrimeiroUltimo(String texto){
	
		texto = texto.toUpperCase();
		int quantidadeCaracteres = texto.length();
		char primeiro = texto.charAt(0);
		char ultimo = texto.charAt(texto.length() - 1);
		
		System.out.println("Quantidade de Caracteres: " + quantidadeCaracteres);
		System.out.println("1º caractere: " + primeiro);
		System.out.println("Último Caractere: " + ultimo);
				
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Texto: ");
		String str = scan.nextLine();
		PrimeiroUltimo(str);
		scan.close();
	}

}