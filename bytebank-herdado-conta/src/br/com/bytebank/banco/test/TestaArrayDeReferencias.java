package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayDeReferencias {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		ContaPoupanca cc2 = new ContaPoupanca(321, 123);
		
		Conta[] contas = new Conta[5];
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].getAgencia());
		System.out.println(contas[1].getAgencia());
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		
		Conta[] refs = {cc1, cc2};
		
		System.out.println(refs[0].getNumero());
		System.out.println(refs[1].getNumero());
	}
}
