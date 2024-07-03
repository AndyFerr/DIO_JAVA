package Projetos.Iphone;

import java.util.Scanner;

public interface NavegadorInternet {

    Scanner link = new Scanner(System.in);

    public static void exibirPag (){
        System.out.println("insira o lnink da pgágina");
        String url = link.next();
        System.out.println("Abrindo o link: "+url);
    }

    public static void adicionarNovaAba (){
        System.out.println("Abrindo nova aba");
    }

    public static void atualzarPag (){
        System.out.println("Atualizando a pagina");
    }

}
