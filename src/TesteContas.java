
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(111, 111);
		cc1.deposita(100.0);
		
		ContaPoupanca cp1 = new ContaPoupanca(222, 222);
		cp1.deposita(200.0);
		
		cc1.transfere(10.0, cp1);
		
		System.out.println("Saldo Conta Corrente CC = R$" + cc1.getSaldo());
		System.out.println("Saldo Conta Poupança CP = R$" + cp1.getSaldo());
	}

}
