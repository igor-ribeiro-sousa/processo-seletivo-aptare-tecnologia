package questao03;

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
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Data de referência: ");
		String dataRecebida = scan.nextLine().trim();
		if (dataRecebida == null || dataRecebida.isEmpty()) {
			System.out.println("Por favor, digite uma data válido.");
		}

		Date data = fmt.parse(dataRecebida);

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);

		Integer diaDoMes = cal.get(Calendar.DAY_OF_MONTH);
		Integer resul = (diaDoMes / 10) + (diaDoMes % 10);

		cal.add(Calendar.DAY_OF_MONTH, resul);
		data = cal.getTime();

		System.out.print("Nova Data: " + fmt.format(data));

		scan.close();

	}

}

