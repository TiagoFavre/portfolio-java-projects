package sistLivraria;

import java.util.List;
import java.util.Scanner;

public class testLivraria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("Bem-vindo(a) a livraria!");

        while (true) {
            System.out.print("Digite o nome do livro ou 0 para finalizar a compra: ");
            String nomeLivro = scan.nextLine();
            if (nomeLivro.equals("0")) {
                break;
            }

            System.out.print("Digite o preco do livro: ");
            double precoLivro = scan.nextDouble();

            System.out.print("Digite a quantidade de livros: ");
            int quantidadeLivros = scan.nextInt();

            Livro livro = new Livro(nomeLivro, precoLivro, quantidadeLivros);
            carrinho.adicionarLivro(livro);

            scan.nextLine();
        }

        System.out.println("\nResumo da compra:");

        List<Livro> itens = carrinho.getItens();
        for (Livro item : itens) {
            System.out.printf("- %s (preco: R$ %.2f, quantidade: %d)%n", item.getNome(), item.getPreco(), item.getQuantidade());
        }

        System.out.printf("%nValor total da compra: R$ %.2f%n", carrinho.getTotalCompra());
        System.out.printf("Numero de livros comprados: %d%n", carrinho.getQuantidadeTotal());
        System.out.println("Obrigado por comprar na nossa livraria!");
}

}