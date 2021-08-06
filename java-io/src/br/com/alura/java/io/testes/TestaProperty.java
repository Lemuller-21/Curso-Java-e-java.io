package br.com.alura.java.io.testes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class TestaProperty {

	public static void main(String[] args) throws Exception {

		Properties props = new Properties();
		props.setProperty("login", "alura");
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "alura.com.br");
		
		props.store(new FileWriter("conf.properties"), "Testandinho");
		
		props.load(new FileReader("conf.properties"));
		
		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");
		
		System.out.println(login + ", " + senha + ", " + endereco);
		System.out.format(new Locale("pt", "BR"), "%s, %s, %s", login, senha, endereco);
		
	}

}
