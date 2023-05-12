package questao1;
import java.util.ArrayList;
import java.util.Scanner;

//*Escreva um programa Java que visa validar se um determinado funcionário tem direito
//a um bônus. O programa precisa receber o número de funcionários que serão
//cadastradas e após isso, o programa deve armazenar o nome e o salário de cada
//funcionário.
//Se o usuário receber até R$ 1.000,00 reais, receberá um bônus de 20%. Se você
//recebe acima de 1000 e até 2000 recebe 10%. Se estiver acima de 2000, em vez
//de um bônus, o funcionário terá um desconto de 10%. Ao final do programa, há
//deve ser uma saída com os nomes dos funcionários, salário, bônus ou desconto e
//salário líquido.
//Obs.: Use array para armazenar os dados.

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Número de funcionários a serem cadastrados: ");
		int numFuncionarios = Integer.parseInt(scan.nextLine());

		ArrayList<ClasseFuncionario> funcionarios = new ArrayList<>();

		for(int i = 0; i < numFuncionarios; i++) {
			ClasseFuncionario funcionario = new ClasseFuncionario();

			System.out.println("Digite o nome do funcionário: ");
			String nome = scan.nextLine();
			funcionario.setNome(nome);

			System.out.println("Digite o salário do funcionário: ");
			float salario = Float.parseFloat(scan.nextLine());
			funcionario.setSalario(salario);

			funcionarios.add(funcionario);
		}

		System.out.println("\nFuncionários cadastrados:");
		for (ClasseFuncionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Salário: R$ " + funcionario.getSalario());
			float bonusDesconto = 0;
			float salarioLiquido = 0;
			if (funcionario.getSalario() <= 1000) {
				bonusDesconto = funcionario.getSalario() * 0.2f;
				System.out.println("Bônus = R$ " + bonusDesconto);
				salarioLiquido = funcionario.getSalario() + bonusDesconto;
			} else if (funcionario.getSalario() <= 2000) {
				bonusDesconto = funcionario.getSalario() * 0.1f;
				System.out.println("Bônus = R$ " + bonusDesconto);
				salarioLiquido = funcionario.getSalario() + bonusDesconto;
			} else {
				bonusDesconto = funcionario.getSalario() * 0.1f * -1;
				System.out.println("Desconto = R$ " + bonusDesconto);
				salarioLiquido = funcionario.getSalario() + bonusDesconto;
			}
			System.out.println("Salário líquido: " + salarioLiquido);
		}

		scan.close();
	}

}


