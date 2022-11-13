package modelo;

public class GuardaContas {

	private Conta[] referencias;
	private int posicaolivre;
	 
	public GuardaContas() {
		this.referencias = new Conta[10];
		this.posicaolivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaolivre] = ref;
		this.posicaolivre ++;
	}

	public int getQtdElementos() {
		return this.posicaolivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
