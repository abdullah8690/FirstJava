package EquipementOfensif;

import Personage.Magician;
import Personage.Personnage;
import board.Case;

public class Sort extends EquipementOffensif {
    public Sort(String name,int atk) {
        super(name,atk);

    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Vous etes tombé sur un " + name);
        if(personnage instanceof Magician){
            int newDamage = personnage.getForce()+niveauAttack;
            personnage.setForce(newDamage);
            System.out.println("La force du personnage est de " +personnage.getForce());
        }
    }
}
