package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardaReferencias;

public class TesteGuardaReferencias {

	public static void main(String[] args) {

		GuardaReferencias gr = new GuardaReferencias();
		
		Conta cc = new ContaCorrente(22, 11);
		gr.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(33, 15);
		gr.adiciona(cc2);
		
		int tamanho = gr.getQtdElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) gr.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
