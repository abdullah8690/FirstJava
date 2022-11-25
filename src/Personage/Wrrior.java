package Personage;

import Defensif.Bouclier;
import EquipementOfensif.Arme;

public class Wrrior extends Personnage {
    public Wrrior(String name) {
        super(name);
        setForce(10);
        setPv(10);
        this.thingToDefend = new Bouclier("shield");
        this.weaponToAttack = new Arme("arme",0);

    }

    public Wrrior(String name,int pv,int force) {
        super(name);
        setForce(force);
        setPv(pv);
    }

    public Wrrior() {

    }


    @Override
    public String toString() {
        return "Personage.Wrrior\nName:" + getName() +
                " pv= " + pv +
                ", force= " + force +
                ", thingToDefend= " + thingToDefend +
                ", weaponToAttack= " + weaponToAttack;
    }
}
