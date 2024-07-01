package Fundamentos.Exemples.Streams;

import java.util.Comparator;
import java.util.stream.Collectors;

public class UsandoStream {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Manteiga", 25.90, 2);
        carrinhoDeCompras.adicionarItem("Tapioca", 10.25, 4);
        carrinhoDeCompras.adicionarItem("Queijo", 56, 1);

//        carrinhoDeCompras.itensOrdenadosNome();

//        carrinhoDeCompras.produtoMaisCaro();
    }


}
