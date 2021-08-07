package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("contas.csv"), "UTF-8");
		
		while (scan.hasNextLine()) {
			String linha = scan.nextLine();
			
			Scanner lineScan = new Scanner(linha);
			lineScan.useLocale(Locale.US);
			lineScan.useDelimiter(",");
			
//			String tipoConta = lineScan.next();
//			int agencia = lineScan.nextInt();
//			int numero = lineScan.nextInt();
//			String titular = lineScan.next();
//			double saldo = lineScan.nextDouble();
			
			String tipoConta = lineScan.next();
            int agencia = lineScan.nextInt();
            int numero = lineScan.nextInt();
            String titular = lineScan.next();
            double saldo = lineScan.nextDouble();
			
			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d %20s: %08.2f %n", 
													tipoConta, agencia, numero, titular, saldo);
			
			lineScan.close();
		}
		
		scan.close();
		
	}

}
