package Fundamentos.Exemples.Interface;


import Fundamentos.Exemples.Interface.Equipamentos.EquipamentoMultifuncional;
import Fundamentos.Exemples.Interface.Interfaces.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();


        // Como o euqipamento multifuncional também é todos esses 3, pode-se fazer assim:
        Impressora impressora = (Impressora) em;
        Copiadora copiadora = (Copiadora) em;
        Digitalzadora digitalzadora = (Digitalzadora) em;

        impressora.imprimir();
        copiadora.copiar();
        digitalzadora.digitalizar();
    }
}
