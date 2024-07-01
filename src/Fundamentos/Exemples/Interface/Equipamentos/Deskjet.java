package Fundamentos.Exemples.Interface.Equipamentos;


import Fundamentos.Exemples.Interface.Interfaces.Impressora;

public class Deskjet implements Impressora {
    public void imprimir(){
        System.out.println("Imprimindo com a deskjet");
    }
}
