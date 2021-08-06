package br.com.alura.java.io.testes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteAleatorio {

	public static void main(String[] args) throws Exception {

		InputStream input = System.in;
		Reader reader = new InputStreamReader(input);
		BufferedReader bf = new BufferedReader(reader);
		
		System.out.println(bf);
		
		bf.close();
		
	}

}
