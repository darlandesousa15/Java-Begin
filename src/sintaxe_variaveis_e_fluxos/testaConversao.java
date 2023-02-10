package sintaxe_variaveis_e_fluxos;

public class testaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1275.62;
		int valor = (int) salario;
		// o (int) obriga a transformação do valor double em inteiro alterando para que ele se encaixe
		System.out.println(valor);
		
		long numeroGrande = 65413851325l;
		// long utilizado para numeros grandes
		short valorPequeno = 2131;
		// short utilizado para numeros pequenso
		byte b = 127;
		// byte é utilizado para numeros bem pequenos q vai até 127 e - 126
		
	}

}
