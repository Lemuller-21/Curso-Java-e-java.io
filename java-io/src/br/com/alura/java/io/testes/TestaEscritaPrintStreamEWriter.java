package br.com.alura.java.io.testes;

import java.io.IOException;
import java.io.PrintWriter;

public class TestaEscritaPrintStreamEWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivos
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.print("aiushu ahsuh aush aius huai suahsu hai");
		
		ps.close();
		
	}

}
