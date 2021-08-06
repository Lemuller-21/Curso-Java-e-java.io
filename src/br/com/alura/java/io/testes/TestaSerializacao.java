package br.com.alura.java.io.testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestaSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente("Izold", "555.555.555-55", "dev");
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
//		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getCpf());
		
	}

}
