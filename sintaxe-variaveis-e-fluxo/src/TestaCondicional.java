
/**
 * @author João
 *
 */
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");
		int idade = 10;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("Ele tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Ele não tem 18 anos, mas pode entrar pois está acompanhado");
			} else {
				System.out.println("Infelizmente voce nao pode entrar");
			}

		}

	}
}
