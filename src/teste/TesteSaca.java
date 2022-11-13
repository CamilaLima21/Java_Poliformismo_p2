package teste;
import modelo.Conta;
import modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(123, 321);
		
		c1.deposita(200.0);
		try {
		c1.saca(2100.0);
		} catch (Exception ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		System.out.println(c1.getSaldo());
	}
}
