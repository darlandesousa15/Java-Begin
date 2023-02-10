package sintaxe_variaveis_e_fluxos;

public class testaCondicional {

	public static void main(String[] args) {
		// palavra main + control + espaço e confirma com enter para dar essa linha sem
		// precisar digitar

		System.out.println("testando condicionais");
		// plavra sysout + control + espaço e confirma com enter para trazer essa linha
		// automatica
		int idade = 19;
		int quantidadeDePessoas = 3;

		if (idade >= 18) {

			System.out.println("Você tem mais de 18 anos");

		} else {
			
			if (quantidadeDePessoas >= 2) {
				System.out.println("Você é menor de idade mas está "
						+ "acompanhado de duas ou mais pessoas, pode entrar");
			} else {
			
			System.out.println("Você é menor de idade");

			}
		}

	}

}
