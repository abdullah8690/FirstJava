package Defensif;

import Personage.Personnage;
import board.Case;

public class Bouclier extends EquipementDefensif {

     public Bouclier(String name) {
        super(name);
        this.niveauDefence= 10;



    }

    @Override
    public void interact(Personnage personnage) {

    }
}
