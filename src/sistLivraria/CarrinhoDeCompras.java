package sistLivraria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Livro> itens; //atributos

    public CarrinhoDeCompras() { //construtor
        itens = new ArrayList<>();
    }

    //metodos
    
    public void adicionarLivro(Livro livro) { 
        itens.add(livro);
    }

    public void removerLivro(Livro livro) {
        itens.remove(livro);
    }

    public double getTotalCompra() {
        double total = 0;
        for (Livro item : itens) {
            total += item.getTotal();
        }
        return total;
    }

    public int getQuantidadeTotal() {
        int quantidadeTotal = 0;
        for (Livro item : itens) {
            quantidadeTotal += item.getQuantidade();
        }
        return quantidadeTotal;
    }

    public List<Livro> getItens() {
        return itens;


}
}
