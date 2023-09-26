package agendaContacts;

import java.util.Scanner;

public class TestAgenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o nome da agenda:");
		String nomeAgenda = scan.nextLine();

		Agenda agenda = new Agenda(nomeAgenda);

		boolean sair = false;
		while (!sair) {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Adicionar contato");
			System.out.println("2. Atualizar contato");
			System.out.println("3. Remover contato");
			System.out.println("4. Exibir agenda");
			System.out.println("0. Sair");

			int opcao = scan.nextInt();
			scan.nextLine(); // Limpar o buffer do teclado

			switch (opcao) {
			case 1:
				System.out.println("Entre com as informacoes do contato:");
				Contato novoContato = new Contato();

				System.out.println("Nome: ");
				String nomeContato = scan.nextLine();
				novoContato.setNome(nomeContato);

				System.out.println("Telefone: ");
				String telefoneContato = scan.nextLine();
				novoContato.setTelefone(telefoneContato);

				System.out.println("E-mail: ");
				String emailContato = scan.nextLine();
				novoContato.setEmail(emailContato);

				agenda.adicionarContato(novoContato);
				System.out.println("Contato adicionado com sucesso!");
				break;

			case 2:
				System.out.println("Entre com o indice do contato a ser atualizado:");
				int numeroContatoAtualizacao = scan.nextInt();
				scan.nextLine(); // Limpar o buffer do teclado

				int indiceAtualizacao = numeroContatoAtualizacao - 1;
				if (indiceAtualizacao >= 0 && indiceAtualizacao < agenda.getContatos().size()) {
					Contato contatoExistente = agenda.getContatos().get(indiceAtualizacao);

					System.out.println("Entre com as novas informacoes do contato:");
					Contato contatoAtualizado = new Contato();

					System.out.println("Nome: ");
					String novoNomeContato = scan.nextLine();
					contatoAtualizado.setNome(novoNomeContato);

					System.out.println("Telefone: ");
					String novoTelefoneContato = scan.nextLine();
					contatoAtualizado.setTelefone(novoTelefoneContato);

					System.out.println("E-mail: ");
					String novoEmailContato = scan.nextLine();
					contatoAtualizado.setEmail(novoEmailContato);

					agenda.atualizarContato(indiceAtualizacao, contatoAtualizado);
					System.out.println("Contato atualizado com sucesso!");
				} else {
					System.out.println("Indice invalido. Nenhum contato foi atualizado.");
				}
				break;

			case 3:
				System.out.println("Entre com o indice do contato a ser removido:");
				int numeroContatoRemocao = scan.nextInt();
				scan.nextLine(); // Limpar o buffer do teclado

				int indiceRemocao = numeroContatoRemocao - 1;
				agenda.removerContato(indiceRemocao);
				System.out.println("Contato removido com sucesso!");
				break;

			case 4:
				System.out.println(agenda.obterInfo());
				break;

			case 0:
				sair = true;
				System.out.println("Encerrando a agenda...");
				break;

			default:
				System.out.println("Opcao invalida. Tente novamente.");
				break;
			}
		}

		scan.close();
	}

}
