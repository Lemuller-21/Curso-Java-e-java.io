package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TestaGuardadorDeReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(123, 321);
		guardador.adiciona(cc);
		
		Conta cp = new ContaPoupanca(456, 654);
		guardador.adiciona(cp);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
		Cliente cliente = new Cliente();
		guardador.adiciona(cliente);
		
		Cliente cref = (Cliente) guardador.getReferencia(2);
		cref.setNome("That");
		System.out.println(cref.getNome());
	}

}