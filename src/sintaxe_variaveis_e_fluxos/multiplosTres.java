package sintaxe_variaveis_e_fluxos;

public class multiplosTres {

	public static void main(String[] args) {

		for (int numero = 3; numero <= 100; numero++) {
			if (numero % 3 == 0) {
				// Divide por 3 e só vai mostrar aqueles que o resto seja 0
				System.out.print(numero + "  ");
			}
		}
	}
}
