package Defensif;

import Defensif.EquipementDefensif;
import Personage.Personnage;

public class Philtre extends EquipementDefensif {



    public Philtre(String name) {
        super(name);
        this.niveauDefence =15;



    }

    @Override
    public void interact(Personnage personnage) {

    }

//    @Override
//    public String toString() {
//        return "Name=" + name + ", niveauDefence=" + niveauDefence;
//    }
}
