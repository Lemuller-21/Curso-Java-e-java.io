package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestaOutrosWrappers {

	public static void main(String[] args) {

		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Integer iRef = Integer.valueOf(3);
		System.out.println(iRef.intValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number nRef = Float.valueOf(29.9f);
		
		List<Number> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(77.7);
		numeros.add(29.9f);
		
	}

}
