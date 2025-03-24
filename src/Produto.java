

public class Produto {
    String nome;
    double preco;
    int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public void informacoes() {
        System.out.println("nome: " + this.nome);
        System.out.println("preço: R$" + this.preco);
        System.out.println("quantidade em estoque: " + this.quantidade);
    }



}





