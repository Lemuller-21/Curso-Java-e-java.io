package br.com.bytebank.banco.test;

public class TestaArrayDePrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[5];
		
		idades[0] = 20;
		idades[1] = 29;
		idades[2] = 30;
		idades[3] = 50;
		idades[4] = 69;
				
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
