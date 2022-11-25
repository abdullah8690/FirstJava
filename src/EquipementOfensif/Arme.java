package EquipementOfensif;

import Personage.Magician;
import Personage.Personnage;
import Personage.Wrrior;
import board.Case;

public class Arme extends EquipementOffensif {
    public Arme(String type,int atk) {
        super(type,atk);


    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Vous etes tombé sur une " + name);
        if(personnage instanceof Wrrior){
            int newDamage = personnage.getForce()+niveauAttack;
            personnage.setForce(newDamage);
            System.out.println(personnage.getForce());
            System.out.println("La force du personnage est de " +personnage.getForce());
        }
    }
}
