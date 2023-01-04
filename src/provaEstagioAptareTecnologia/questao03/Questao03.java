package provaEstagioAptareTecnologia.questao03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

	/*
		Implementar um programa que receba como parâmetro de entrada uma data. Com 
		essa informação, o método deverá pegar os números que compõem o dia e somar. O
		resultado da soma deverá adicionar na quantidade de dias da data informada. Segue 
		exemplo abaixo:
			
			Exemplo 1:
	 		* Entrada 
			Data de referência: 23/08/2020
 
	 		* Saída
			Nova Data: 28/08/2020
 	*/
public class Questao03 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Data de referência: ");
		String dataRecebida = scan.nextLine();
		
		Date dt = df.parse(dataRecebida);
		
		Calendar cal =  Calendar.getInstance();
		cal.setTime(dt);
		
		int dia = cal.get(Calendar.DAY_OF_MONTH);		
		int resul = (dia/10) + (dia % 10);
				
		cal.add(Calendar.DAY_OF_MONTH, resul);
		dt = cal.getTime();
		
		System.out.print("Nova Data: "+ df.format(dt));
		
		
		scan.close();
		
	}

}
