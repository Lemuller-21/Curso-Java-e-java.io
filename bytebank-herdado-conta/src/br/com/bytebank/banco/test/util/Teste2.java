package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Teste2 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>(26);
		
		lista.add("RJ");
		lista.add("PR");
		lista.add("SP");
		lista.add("MG");
		
		for (String element : lista) {
			System.out.println(element);
		}
		
		System.out.println();
		
		ArrayList<String> teste = new ArrayList<String>(lista);
		
		teste.remove(2); // Remove SP. MG se torna o 2
		teste.remove(2); // Remove MG
		
		for (Object element : teste) {
			System.out.println(element);
		}
		
		// ---------------------------
		System.out.println();
		// ---------------------------
		
		String[] paises = {"BR", "PT", "US"};
		List<String> listaDePaises = Arrays.asList(paises);
		
		for (Object element : listaDePaises) {
			System.out.println(element);
		}
		
//		List<String> argumentos = Arrays.asList(args);
		
	}

}
