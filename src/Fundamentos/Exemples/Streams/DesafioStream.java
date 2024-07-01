package Fundamentos.Exemples.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.stream.Stream;
import static java.lang.Math.sqrt;



public class DesafioStream {
    public static void main(String[] args) {
        List<Integer> numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//         Desafio 1 - Mostre a lista em ordem numérica

        numerosList.stream().sorted().forEach(System.out::println);


//        Desafio 2 - Imprima a soma dos números pares

        int numerosSomados = numerosList.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a+b);
        System.out.println(numerosSomados);

//         Desafio 3 - Verifique se todos os números da lista são positivos

        boolean numeorsNegativos = false;
        numeorsNegativos = numerosList.stream().anyMatch(n -> n < 0);
        System.out.println(numeorsNegativos);

//         Desafio 4 - Remova todos os valores ímpares

        numerosList.stream().filter(n -> !(n % 2 != 0)).forEach(System.out::println);

//         Desafio 5 - Calcule a média dos números maiores que 5

        var mediaMaiorQue5 = numerosList.stream()
                .filter(n -> n >5)
                .mapToDouble(Integer::doubleValue)
                .average();
        System.out.println(mediaMaiorQue5);

//         Desafio 6 - Verificar se há número maoir que 10

        System.out.println(numerosList.stream().anyMatch(n -> n >10));


//         Desafio 7 - Encontrar o segundo número maior da lista

        var segundoMaior = numerosList.stream()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst().get().intValue();

        System.out.println("O segundo maior é: "+segundoMaior);

//         Desafio 8 - Somar os dígitos de todos os números da lista

//         Desafio 9 - Verificar se todos os números são distintos

        try{
            Integer ocorrencia = numerosList.stream().filter(n -> Collections.frequency(numerosList, n) >1).findFirst().get().intValue();
            System.out.println("Ha repeticoes");
        }catch (NoSuchElementException e){
            System.out.printf("Nao ha repeticoes");
        }

//         Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou 5

        numerosList.stream().filter(n -> (n % 2 != 0) && ((n % 3 == 0) || (n % 5 == 0))).forEach(System.out::println);

//         Desafio 11 - Enocontre a soma dos quadrados de todos os números da lista

        int soma = numerosList.stream().map( n -> (n*n)).reduce(0, (a, b) -> a + b);
        System.out.println(soma);

//         Desafio 12 - Encontre o produto de todos os números da lista

        int produto = numerosList.stream().reduce(1, (a, b) -> a*b);
        System.out.println(produto);

//         Desafio 13 - Filtrar os números dentro de um intervalo

        numerosList.stream()
                .filter(n -> n > 3 && n < 10)
                .distinct()
                .forEach(System.out::println);

//         Desafio 15 - Encontre o maior número da lista

        System.out.println(numerosList.stream().max(Comparator.naturalOrder())); // print como um Optional Integer
        System.out.println(numerosList.stream().max(Comparator.naturalOrder()).get().intValue()); // print como um int

//         Desafio 16 - Agrupe os números em pares e ímpares

        var pares = numerosList.stream().filter(n -> n%2 == 0).toList();
        var impares = numerosList.stream().filter(n -> n%2 != 0).toList();

//         Desafio 17 - Filtrar os números primos da lista
//
//         Desafio 18 - Verifique se todos os números da lista são iguais
//
//         Desafio 19 - Encontre a soma dos números divisiveis por 3 e 5
    }
}

