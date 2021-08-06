package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		//Generics
		List<Conta> lista = new Vector<Conta>(); //usa array por baixo, mas tbm é threadsafe
//		List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
//		List<Conta> lista = new LinkedList<Conta>(); //lista linkada
//		Collection<Conta> listaDeContas = new Vector<Conta>();
		
		Conta cc = new ContaCorrente(123, 321);
		lista.add(cc);
		
		Conta cp = new ContaPoupanca(456, 654);
		lista.add(cp);
		
		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
//		list.remove(0);
//		System.out.println("Tamanho: " + list.size());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-----------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
