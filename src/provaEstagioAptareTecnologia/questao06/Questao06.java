package provaEstagioAptareTecnologia.questao06;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

	/*
		Implementar um programa que receba como parâmetro de entrada as seguintes 
		informações: data de referência, dia de vencimento e quantidade de dias de corte. 
		Com essas informações, o método deverá retornar a data de vencimento e a data de 
		apuração baseado nos parâmetros de entrada. Os parâmetros de entrada deverão 
		ser solicitados do usuário. Segue exemplo abaixo:
			
			Exemplo 1:
	 		* Entrada 
			Data de referência: 10/03/2020
			Dia do vencimento: 20
			Quantidade de dias de corte: 5
	 		
	 		* Saída
			Data de vencimento: 20/03/2020
			Data de Apuração: 15/03/202
 	*/
public class Questao06 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Data de referência: ");
		String dataRefencia = scan.nextLine();

		System.out.print("Dia do vencimento: ");
		int diaVencimento = scan.nextInt();

		System.out.print("Quantidade de dias de corte: ");
		int diaCorte = scan.nextInt();

		Date dt = df.parse(dataRefencia);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);

		int dia = cal.get(Calendar.DAY_OF_MONTH);
		Date dtNova;
		if (dia > (diaVencimento - diaCorte)) {
			dtNova = df.parse(diaVencimento + "/" + (cal.get(Calendar.MONTH) + 2) + "/" + cal.get(Calendar.YEAR));

		} else {
			dtNova = df.parse(diaVencimento + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR));
		}

		cal.add(Calendar.DAY_OF_MONTH, diaVencimento);

		System.out.println("Data do vencimento: " + df.format(dtNova));

		cal.setTime(dtNova);
		cal.add(Calendar.DAY_OF_MONTH, (diaCorte * -1));
		dtNova = cal.getTime();

		System.out.println("Data de Apuração: " + df.format(dtNova));

		scan.close();

	}

}
