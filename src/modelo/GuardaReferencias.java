package modelo;

public class GuardaReferencias {

	private Object[] referencias;
	private int posicaolivre;
	 
	public GuardaReferencias() {
		this.referencias = new Object[10];
		this.posicaolivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaolivre] = ref;
		this.posicaolivre ++;
	}

	public int getQtdElementos() {
		return this.posicaolivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
