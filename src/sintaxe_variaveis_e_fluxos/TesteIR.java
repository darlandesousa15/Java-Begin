package sintaxe_variaveis_e_fluxos;

public class TesteIR {

    public static void main(String[] args) {

        double salario = 2000.0;
        double IRMenor = 120.0;
        double IRMedio = 350.0;
        double IRMaior = 636.0;
        //ifs aqui
        if (salario >= 1900.0 && salario <= 2801.0) {
        	System.out.println("A sua aliquota é de 7.5%");
        	System.out.println("O Imposto de Renda a ser pago é de R$ " + IRMenor);
        } else if (salario >= 2801.01 && salario <= 3751.0 ) {
        	System.out.println("A sua aliquota é de 15%");
        	System.out.println("O Imposto de Renda a ser pago é de R$ " + IRMedio);
        } else if (salario >= 3751.01 && salario <= 4664.0) {
        	System.out.println("A sua aliquota é de 22,5%");
        	System.out.println("O Imposto de Renda a ser pago é de R$ " + IRMaior);
        }
    }
}
