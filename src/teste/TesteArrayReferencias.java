package teste;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int[] idades = new int [5];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(001, 22);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(002, 33);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//Object referenciaGenerica = referencias[1];
		
		//System.out.println(referenciaGenerica[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}
}
