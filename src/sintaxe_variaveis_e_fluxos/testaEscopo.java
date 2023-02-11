package sintaxe_variaveis_e_fluxos;

public class testaEscopo {
	
	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 18;
		int quantidadeDePessoas = 3;
		boolean acompanhado = quantidadeDePessoas >= 2;

		if (idade >= 18 && acompanhado) {
			System.out.println("Você tem mais de 18 anos e "
					+ "está acompanhado por adultos");		
		} else {
				System.out.println("Você não pode entrar");
		}
	}

}
