package br.com.alura.java.io.testes;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TestaLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner lineScan = new Scanner(linha);
			lineScan.useLocale(Locale.US);
			lineScan.useDelimiter(",");
			
			String tipoConta = lineScan.next();
			int agencia = lineScan.nextInt();
			int numero = lineScan.nextInt();
			String titular = lineScan.next();
			double saldo = lineScan.nextDouble();
			
			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n", 
									tipoConta, agencia, numero, titular, saldo);
			
			lineScan.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		
		scanner.close();
		
	}

}
