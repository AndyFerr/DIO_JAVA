package Fundamentos.Exemples.Interface.Equipamentos;

import Fundamentos.Exemples.Interface.Interfaces.Digitalzadora;

public class LaserJet implements Digitalzadora {
    public void digitalizar(){
        System.out.println("Digitalizando com a laserjet");
    }
}