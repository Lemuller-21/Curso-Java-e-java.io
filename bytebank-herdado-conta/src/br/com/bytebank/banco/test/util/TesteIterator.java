package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteIterator {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Donkey kong");
		nomes.add("Yoshi");
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
