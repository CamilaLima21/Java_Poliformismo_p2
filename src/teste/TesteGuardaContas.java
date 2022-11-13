package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardaContas;

public class TesteGuardaContas {

	public static void main(String[] args) {

		GuardaContas gc = new GuardaContas();
		
		Conta cc = new ContaCorrente(22, 11);
		gc.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(33, 15);
		gc.adiciona(cc2);
		
		int tamanho = gc.getQtdElementos();
		System.out.println(tamanho);
		
		Conta ref = gc.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
