package Fundamentos.Exemples.Interface.Equipamentos;

import Fundamentos.Exemples.Interface.Interfaces.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalzadora {
    public void copiar(){
        System.out.println("copiando com a multifuncional");
    }

    public void imprimir(){
        System.out.println("imprimindo com a multifuncional");
    }

    public void digitalizar(){
        System.out.println("digitalizando com a multifuncional");
    }

}
