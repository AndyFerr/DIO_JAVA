package Fundamentos.Exemples.Streams;

public class Item {
    private String nome;
    private double preco;
    private int qunantidade;


    public Item(String nome, double preco, int qunantidade) {
        this.nome = nome;
        this.preco = preco;
        this.qunantidade = qunantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQunantidade() {
        return qunantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qunantidade=" + qunantidade +
                '}';
    }
}
