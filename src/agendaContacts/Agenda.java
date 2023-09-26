package agendaContacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	private String nome;
	private List<Contato> contatos;

	public Agenda(String nome) {
		this.nome = nome;
		this.contatos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public void removerContato(int indice) {
		if (indice >= 0 && indice < contatos.size()) {
			contatos.remove(indice);
		} else {
			System.out.println("Indice invalido. O contato nao foi removido.");
		}
	}

	public void atualizarContato(int indice, Contato contatoAtualizado) {
		if (indice >= 0 && indice < contatos.size()) {
			contatos.set(indice, contatoAtualizado);
		} else {
			System.out.println("indice invalido. O contato nao foi atualizado.");
		}
	}

	public String obterInfo() {
		StringBuilder info = new StringBuilder("Nome da Agenda: " + nome + "\n");

		if (contatos.isEmpty()) {
			info.append("Nenhum contato encontrado na agenda.");
		} else {
			info.append("Contatos:\n");
			for (int i = 0; i < contatos.size(); i++) {
				int indiceContato = i + 1;
				Contato contato = contatos.get(i);
				info.append(indiceContato).append(". ").append(contato.obterInfo()).append("\n");
			}
		}

		return info.toString();
	}
}