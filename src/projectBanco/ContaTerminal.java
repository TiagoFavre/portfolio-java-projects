package projectBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		List<ContaBancaria> contas = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("\nEscolha uma opcao:");
			System.out.println("1. Criar Conta");
			System.out.println("2. Depositar");
			System.out.println("3. Sacar");
			System.out.println("4. Consultar Saldo");
			System.out.println("5. Imprimir Informacoes da Conta");
			System.out.println("6. Sair");
			System.out.print("Opcao: ");
			opcao = scan.nextInt();
			scan.nextLine(); // Limpar o buffer de entrada

			switch (opcao) {
			case 1:
				System.out.print("Por favor, digite o numero da Agencia: ");
				String agencia = scan.nextLine();

				System.out.print("Por favor, digite o numero da Conta: ");
				int numeroConta = scan.nextInt();
				scan.nextLine(); // Limpar o buffer de entrada

				System.out.print("Por favor, digite o nome do cliente: ");
				String nomeCliente = scan.nextLine();

				System.out.print("Por favor, digite o saldo inicial: ");
				double saldoInicial = scan.nextDouble();

				ContaBancaria novaConta = new ContaBancaria(numeroConta, agencia, nomeCliente, saldoInicial);
				contas.add(novaConta);

				System.out.println("Conta criada com sucesso.");
				break;
			case 2:
				System.out.print("Digite o numero da conta: ");
				int numeroDeposito = scan.nextInt();
				scan.nextLine(); // Limpar o buffer de entrada

				System.out.print("Digite o valor a ser depositado: ");
				double valorDeposito = scan.nextDouble();

				for (ContaBancaria conta : contas) {
					if (conta.getNumero() == numeroDeposito) {
						conta.depositar(valorDeposito);
						break;

					}

				}
				break;
			case 3:
				System.out.print("Digite o numero da conta: ");
				int numeroSaque = scan.nextInt();
				scan.nextLine(); // Limpar o buffer de entrada

				System.out.print("Digite o valor a ser sacado: ");
				double valorSaque = scan.nextDouble();

				for (ContaBancaria conta : contas) {
					if (conta.getNumero() == numeroSaque) {
						try {
							conta.sacar(valorSaque);
						} catch (SaldoInsuficienteException e) {
							System.out.println(e.getMessage());
						}
						break;
					}
				}
				break;
			case 4:
				System.out.print("Digite o numero da conta: ");
				int numeroConsulta = scan.nextInt();
				scan.nextLine(); // Limpar o buffer de entrada

				for (ContaBancaria conta : contas) {
					if (conta.getNumero() == numeroConsulta) {
						System.out.println("Saldo atual: " + conta.getSaldo());
						break;
					}
				}
				break;
			case 5:
				System.out.print("Digite o numero da conta: ");
				int numeroInfo = scan.nextInt();
				scan.nextLine(); // Limpar o buffer de entrada

				for (ContaBancaria conta : contas) {
					if (conta.getNumero() == numeroInfo) {
						System.out.println("Informacoes da conta:");
						System.out.println("Numero da conta: " + conta.getNumero());
						System.out.println("Agencia: " + conta.getAgencia());
						System.out.println("Nome do cliente: " + conta.getNomeCliente());
						System.out.println("Saldo: " + conta.getSaldo());
						break;
					}
				}
				break;
			case 6:
				System.out.println("Saindo do programa.");
				break;
			default:
				System.out.println("Opcao invalida. Tente novamente.");
			}
		} while (opcao != 6);

		scan.close();
	}
}
