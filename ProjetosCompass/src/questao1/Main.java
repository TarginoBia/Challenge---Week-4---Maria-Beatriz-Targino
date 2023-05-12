package questao1;
import java.util.ArrayList;
import java.util.Scanner;

//*Escreva um programa Java que visa validar se um determinado funcion�rio tem direito
//a um b�nus. O programa precisa receber o n�mero de funcion�rios que ser�o
//cadastradas e ap�s isso, o programa deve armazenar o nome e o sal�rio de cada
//funcion�rio.
//Se o usu�rio receber at� R$ 1.000,00 reais, receber� um b�nus de 20%. Se voc�
//recebe acima de 1000 e at� 2000 recebe 10%. Se estiver acima de 2000, em vez
//de um b�nus, o funcion�rio ter� um desconto de 10%. Ao final do programa, h�
//deve ser uma sa�da com os nomes dos funcion�rios, sal�rio, b�nus ou desconto e
//sal�rio l�quido.
//Obs.: Use array para armazenar os dados.

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("N�mero de funcion�rios a serem cadastrados: ");
		int numFuncionarios = Integer.parseInt(scan.nextLine());

		ArrayList<ClasseFuncionario> funcionarios = new ArrayList<>();

		for(int i = 0; i < numFuncionarios; i++) {
			ClasseFuncionario funcionario = new ClasseFuncionario();

			System.out.println("Digite o nome do funcion�rio: ");
			String nome = scan.nextLine();
			funcionario.setNome(nome);

			System.out.println("Digite o sal�rio do funcion�rio: ");
			float salario = Float.parseFloat(scan.nextLine());
			funcionario.setSalario(salario);

			funcionarios.add(funcionario);
		}

		System.out.println("\nFuncion�rios cadastrados:");
		for (ClasseFuncionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Sal�rio: R$ " + funcionario.getSalario());
			float bonusDesconto = 0;
			float salarioLiquido = 0;
			if (funcionario.getSalario() <= 1000) {
				bonusDesconto = funcionario.getSalario() * 0.2f;
				System.out.println("B�nus = R$ " + bonusDesconto);
				salarioLiquido = funcionario.getSalario() + bonusDesconto;
			} else if (funcionario.getSalario() <= 2000) {
				bonusDesconto = funcionario.getSalario() * 0.1f;
				System.out.println("B�nus = R$ " + bonusDesconto);
				salarioLiquido = funcionario.getSalario() + bonusDesconto;
			} else {
				bonusDesconto = funcionario.getSalario() * 0.1f * -1;
				System.out.println("Desconto = R$ " + bonusDesconto);
				salarioLiquido = funcionario.getSalario() + bonusDesconto;
			}
			System.out.println("Sal�rio l�quido: " + salarioLiquido);
		}

		scan.close();
	}

}


