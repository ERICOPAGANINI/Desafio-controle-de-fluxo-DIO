import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro parametro");
		int primeiroParametro = entrada.nextInt();
		System.out.println("Digite o segundo parametro");
		int segundoParametro = entrada.nextInt();

		try {
			contar(primeiroParametro, segundoParametro);

		} catch (ParametrosInvalidosException exception) {
			System.out.println("Erro: " + exception.getMessage());
		}

		entrada.close();

	}

	public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
		if (primeiroParametro >= segundoParametro) {
			throw new ParametrosInvalidosException(
					"Parametros invalidos. O primeiro parametro deve ser menor que o segundo.");
		}
		
		int contador = segundoParametro - primeiroParametro;
		for (int indice = 0; indice < contador; indice++) {
			System.out.println("Imprimindo numero " + (indice + 1));
		}

	}

}

