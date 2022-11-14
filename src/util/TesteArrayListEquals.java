package util;

import java.util.ArrayList;

import modelo.Conta;
import modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(33, 12);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(33, 12);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
