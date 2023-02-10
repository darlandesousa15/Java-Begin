package sintaxe_variaveis_e_fluxos;

public class TestaVariaveis {

	public static void main(String[] args) {
		
		System.out.println("ola, novo teste");
		
		int idade;
		idade = 37;
		
		System.out.println(idade);
		
		double salario;
		salario = 200.20;
		
		System.out.println("Meu salario é de R$ " + salario);
		
		double divisao = 200.0 / 5.7;
		// posso utilizar a declaração de variaveis dessa maneira
		// ao utilizar o double e dividir se colocar um dos numeros
		// que serão utilizados com o "." ele vai trazer o resultado
		// em double e ñ em inteiro. Mas s ñ usar vai trazer o valor 
		// como se fosse um int, dessa maneira dando errado o valor
		// do resultado
		System.out.println(divisao);
		
	}
}
