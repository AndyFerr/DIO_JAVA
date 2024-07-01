package Fundamentos.Exemples.Streams;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for (Item i : carrinhoDeCompras){
            if (i.getNome().equalsIgnoreCase(nome)){
                carrinhoDeCompras.remove(i);
            }
        }
    }


    public void calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : carrinhoDeCompras){
            valorTotal += (i.getPreco()*i.getQunantidade());
        }
        System.out.println("Valor total do carrinho: "+ valorTotal);
    }

    public void exibirItens(){
        for (Item i : carrinhoDeCompras){
            System.out.printf("Item: %s \nPreco: %.2f \nQuantidade: %d", i.getNome(), i.getPreco(), i.getQunantidade());

        }
    }


    // Usando streams e method reference

    public void itensOrdenadosNome (){
        carrinhoDeCompras.stream()
                .sorted(Comparator.comparing(Item::getNome))
                .forEach(System.out::println);
    }

    public void itensOrdenadosPreco (){
        carrinhoDeCompras.stream()
                .sorted(Comparator.comparing(Item::getPreco))
                .forEach(System.out::println);
    }

    public void itensOrdenadosPrecoInvertido (){
        carrinhoDeCompras.stream()
                .sorted(Comparator.comparing(Item::getPreco)
                        .reversed())
                .forEach(System.out::println);
    }

    public void itensOrdenadosQuantidade (){
        carrinhoDeCompras.stream()
                .sorted(Comparator.comparing(Item::getQunantidade))
                .forEach(System.out::println);
    }

    public void itensOrdenadosNomePrecoQuant (){
        carrinhoDeCompras.stream()
                .sorted(Comparator
                        .comparing(Item::getNome)
                        .thenComparing(Item::getPreco)
                        .thenComparing(Item::getQunantidade))
                .forEach(System.out::println);
    }

    // Para usar o disctinct() é necessario criar o método equals na classe referencia que nesse caso é Item


    // Pegando o produto mais caro
//    public void produtoMaisCaro(){
//        var maisCaro = carrinhoDeCompras
//                .stream()
//                .max(Comparator.comparing(Item::getPreco))
//                .get();
//        System.out.println(maisCaro);
//    }
}
