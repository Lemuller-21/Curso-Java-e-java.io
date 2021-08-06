package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquasls {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(123, 321);
		listaDeContas.add(cc);
		
		Conta cp = new ContaPoupanca(456, 654);
		listaDeContas.add(cp);
		
		Conta cc2 = new ContaCorrente(456, 654);
		boolean existe = listaDeContas.contains(cc2);
		
		System.out.println("Já existe? " + existe);
		
		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		
	}

}
