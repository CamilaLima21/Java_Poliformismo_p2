package teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "    Alura      ";
		String vazio2 = vazio.trim();
		System.out.println(vazio.isEmpty());
		System.out.println(vazio.contains("Alu"));
		System.out.println(vazio2.isEmpty());
		
		String nome = "Alura"; //object literal
		//String outro = new String ("Alura");
		
		System.out.println(nome.length());
		
		for(int i = 0 ; i < nome.length(); i ++) {
			System.out.println(nome.charAt(i));
		}
		
		
		String nome1 = "Mario";
        nome.replace('o', 'a');
        System.out.println(nome1);
		//String sub = nome.substring(1);
		//System.out.println(sub);
		
		//int pos = nome.indexOf("ur");
		//System.out.println(pos);
		
		//char c = nome.charAt(0);
		//System.out.println(c);
		
		//char c = 'A';
		//char d = 'a';
		
		//String outra = nome.replace(c, d);
		
		//String outra = nome.toUpperCase();
		
		//System.out.println(nome);
		//System.out.println(outra);
	}

}
