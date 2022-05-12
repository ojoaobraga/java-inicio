public class TesteIR {

	public static void main(String[] args) {

		double salario = 2000;

		if (salario >= 1900 && salario <= 2800.00) {
			double IR = 7.5;
			double valorDeclaracao = 142;
			System.out.println("Seu valor de IR é de: " + IR + "%, pode deduzir o valor de R$" + valorDeclaracao);
		} else if (salario > 2800 && salario <= 3751) {
			double IR = 15;
			double valorDeclaracao = 350;
			System.out.println("Seu valor de IR é de: " + IR + "%, pode deduzir o valor de R$" + valorDeclaracao);
		} else if (salario > 3751 && salario <= 4664) {
			double IR = 22.5;
			double valorDeclaracao = 636;
			System.out.println("Seu valor de IR é de: " + IR + "%, pode deduzir o valor de R$" + valorDeclaracao);
		}
	}
}