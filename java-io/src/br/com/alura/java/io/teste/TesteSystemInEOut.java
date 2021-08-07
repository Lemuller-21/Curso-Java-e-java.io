package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteSystemInEOut {

	public static void main(String[] args) throws IOException {

		InputStream si = System.in;
		Reader isr = new InputStreamReader(si, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream so = System.out;
		Writer osw = new OutputStreamWriter(so);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
	}

}
