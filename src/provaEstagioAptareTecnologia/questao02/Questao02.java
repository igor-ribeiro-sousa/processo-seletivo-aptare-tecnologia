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

	public final static int ORDEM_CRESCENTE = 1;
	public final static int ORDEM_DECRESCENTE = 2;

	// Aplicando ordem
	public static void condicionalOrdem(String[] numeros, String ordem) {
		ordenar(adicionarNalista(numeros), ordem.equalsIgnoreCase("CRESCENTE") ? ORDEM_CRESCENTE : ORDEM_DECRESCENTE);
	}

	// Ordenando Lista
	public static void ordenar(List<Integer> lista, Integer ordem) {
		lista.sort(ordem == ORDEM_CRESCENTE ? Comparator.naturalOrder() : Comparator.reverseOrder());
		System.out.println("Numeros ordenados : " + lista.toString().replace("[", "").replace("]", ""));
	}

	// Adicionando valores na Lista
	public static List<Integer> adicionarNalista(String[] numeros) {
		List<Integer> listaNumeros = new ArrayList<>();
		for (String e : numeros) {
			listaNumeros.add(Integer.parseInt(e));
		}
		return listaNumeros;
	}

	// Pares e Impares
	public static void parImpar(List<Integer> lista) {
		List<Integer> numerosPares = lista.stream().filter(numeros -> numeros % 2 == 0).collect(Collectors.toList());
		List<Integer> numerosImpares = lista.stream().filter(numeros -> numeros % 2 != 0).collect(Collectors.toList());

		imprimir("Pares", numerosPares);
		imprimir("Ímpares", numerosImpares);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Números :");

		String entradaNumeros = scan.nextLine();
		if (!entradaNumeros.matches("^\\d+(,\\d+)*$")) {
			System.out.println("Entrada inválida. Digite uma lista de números separados por vírgulas.");
			scan.close();

		}
		String[] numeros = entradaNumeros.split(",");

		System.out.println("Ordem de Exibição :");
		String entradaOrdem = scan.nextLine().trim();
		if (!entradaOrdem.equalsIgnoreCase("CRESCENTE") && !entradaOrdem.equalsIgnoreCase("DECRESCENTE")) {
			System.out.println("Ordem inválida. Digite 'CRESCENTE' ou 'DECRESCENTE'.");
			scan.close();

		}
		condicionalOrdem(numeros, entradaOrdem);
		parImpar(adicionarNalista(numeros));

		scan.close();
	}

	// Imprimindo lista
	public static void imprimir(String tipoNumeros, List<Integer> lista) {
		System.out.println("Quantidade de Números " + tipoNumeros + ":" + lista.size());
		System.out.print("Exibindo Números " + tipoNumeros + ":");
		System.out.println(String.join(", ", lista.stream().map(String::valueOf).collect(Collectors.toList())));
p
	}
}
