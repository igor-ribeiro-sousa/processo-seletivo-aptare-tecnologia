package provaEstagioAptareTecnologia.questao02;

	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Scanner;
	import java.util.stream.Collectors;
	
	/*
		Implementar um programa que receba como parâmetro de entrada 4 números inteiros 
		diversos e a ordem de exibi-los, crescente ou decrescentes. Além disso, informar 
		quantos e quais números são pares e ímpares. Exibir também na mesma ordem 
		definida pelo usuário. 
			
			Exemplo 1:
	 		* Entrada 
				Números: 10, 109, 864, 88
				Ordem de Exibição: Crescente
	 
	 		* Saída
				Números ordenados: 10, 88, 109, 864
				Quantidade de Números Pares: 3
				Exibindo Números Pares: 10, 88, 864
				Quantidade de Números Ímpares: 1
				Exibindo Números Ímpares: 109
	 */

	public class Questao02 {
		enum Ordem {
			CRESCENTE, DECRESCENTE;
		}

		public static void ordena(List<Integer> numeros, Ordem ordem) {
			if (ordem.equals(Ordem.CRESCENTE)) {
				numeros.sort(Comparator.naturalOrder());
			} else {
				numeros.sort(Comparator.reverseOrder());
			}
			System.out.println("Números ordenados: " + numeros.toString().replace("[", "").replace("]", ""));

		}

		public static void quantidadeENumerosParesEImpares(List<Integer> numeros) {
			List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());
			List<Integer> numerosImpares = numeros.stream().filter(numero -> numero % 2 != 0).collect(Collectors.toList());

			System.out.println("Quantidade de Números Pares: " + numerosPares.size());
			System.out.println("Exibindo Números Pares: " + numerosPares.toString().replace("[", "").replace("]", ""));

			System.out.println("Quantidade de Números Impares: " + numerosImpares.size());
			System.out.println("Exibindo Números Impares: " + numerosImpares.toString().replace("[", "").replace("]", ""));
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Números: ");

			String entradaNum = scan.nextLine();
			String[] listEntrada = entradaNum.split(",");

			List<Integer> numeros = new ArrayList<>();
			for (String i : listEntrada) {
				numeros.add(Integer.parseInt(i));
			}
			System.out.println("Ordem de Exibição: ");
			String entrada = scan.next();
			if (entrada.equalsIgnoreCase("Crescente")) {
				ordena(numeros, Ordem.CRESCENTE);

			} else if (entrada.equalsIgnoreCase("Decrescente")) {
				ordena(numeros, Ordem.DECRESCENTE);
			}

			quantidadeENumerosParesEImpares(numeros);

			scan.close();
		}

	}

