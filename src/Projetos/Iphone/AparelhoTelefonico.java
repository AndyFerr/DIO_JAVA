package Projetos.Iphone;

import java.util.Scanner;

public interface AparelhoTelefonico {

    Scanner numeroTelefone = new Scanner(System.in);

    public void ligar();

    public void atender();

    public void iniciarCorreioVoz();
}
