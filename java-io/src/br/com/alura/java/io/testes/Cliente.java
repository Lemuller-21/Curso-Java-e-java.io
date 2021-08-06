package br.com.alura.java.io.testes;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author Leonardo Müller
 * 
 * @version 16.0.1
 */

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 101L;
	
	String nome;
	String cpf;
	String profissao;
	
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String profissao) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setProfissao(profissao);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
}
