package util;

import java.util.ArrayList;

import modelo.Conta;
import modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(33, 12);
		lista.add(cc1);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc2 = new ContaCorrente(44, 55);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(11, 24);
		lista.add(cc3);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}
