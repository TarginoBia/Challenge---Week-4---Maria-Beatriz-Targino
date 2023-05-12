package questao3;
import java.util.Scanner;

public class Questionario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Pergunta o nome do usuário
		System.out.print("Qual é o seu nome? ");
		String nome = input.nextLine();

		// Define as perguntas e respostas
		String[] perguntas = {"Qual é a capital do Brasil?", "Quem descobriu o Brasil?", "Quanto é 2 + 2?"};
		String[] respostas = {"Brasília", "Pedro Álvares Cabral", "4"};

		// Inicializa variáveis de controle
		int numPerguntas = perguntas.length;
		int numAcertos = 0;
		int numErros = 0;

		// Itera sobre as perguntas e verifica as respostas
		for (int i = 0; i < numPerguntas; i++) {
			System.out.print(perguntas[i] + " ");
			String resposta = input.nextLine();

			if (resposta.equalsIgnoreCase(respostas[i])) {
				System.out.println("Resposta correta!");
				numAcertos++;
			} else {
				System.out.println("Resposta incorreta!");
				numErros++;
			}
		}

		// Exibe o resultado final
		System.out.println("Fim do questionário, " + nome + "!");
		System.out.println("Você acertou " + numAcertos + " de " + numPerguntas + " perguntas.");
		System.out.println("Você errou " + numErros + " de " + numPerguntas + " perguntas.");
	}

}


