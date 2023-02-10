package sintaxe_variaveis_e_fluxos;

public class testaConversao {
	
	public static void main(String[] args) {
		
		float pontoFlutuante = 3.14f;
		
		System.out.println(pontoFlutuante);
		
		double salario = 1275.62;
		int valor = (int) salario;
		// o (int) obriga a transformação do valor double em inteiro alterando para que ele se encaixe
		// o (int) se chama cast, utilizamos um cast para transformar esse valor em int
		System.out.println(valor);
		
		long numeroGrande = 65413851325l;
		// long utilizado para numeros grandes
		short valorPequeno = 2131;
		// short utilizado para numeros pequenso
		byte b = 127;
		// byte é utilizado para numeros bem pequenos q vai até 127 e - 126
		
		double valor1 = 1.1;
		double valor2 = 2.2;
		double verValor = valor1 + valor2;
		int valores = (int) valor1 + (int) valor2;
		
		System.out.println(verValor);
		System.out.println(valores);
		
	}

}
