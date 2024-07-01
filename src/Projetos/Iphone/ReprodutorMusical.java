package Projetos.Iphone;

import java.util.Scanner;
public interface ReprodutorMusical {

    Scanner numeroMusica = new Scanner(System.in);

    String [] musicas = {
            "1 - SKINNY",
            "2 - LUNCH",
            "3 - CHIHIRRO",
            "4 - BIRDS  OF A FEATHER",
            "5 - WILDFLOWER",
            "6 - THE GREATEST",
            "7 - L'AMOUR DE MA VIE",
            "8 - THE DINNER",
            "9 - BITTERSUITE",
            "10 - BLUE"
    };

    default void tocar(){
        System.out.println("Tocando");
    }

    default void pausar(){
        System.out.println("Pausado");
    }

    public void selecionarMusica();

}
