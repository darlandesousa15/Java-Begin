package sintaxe_variaveis_e_fluxos;

public class testaCondicionais2 {

	public static void main(String[] args) {
		// palavra main + control + espaço e confirma com enter para dar essa linha sem
		// precisar digitar

		System.out.println("testando condicionais");
		// plavra sysout + control + espaço e confirma com enter para trazer essa linha
		// automatica
		
		int idade = 18;
		boolean quantidadeDePessoas = true;

		if (idade >= 18 && quantidadeDePessoas) {
			System.out.println("Você tem mais de 18 anos e "
					+ "está acompanhado por adultos");		
		} else {
				System.out.println("Você não pode entrar");
		}
	}
}

