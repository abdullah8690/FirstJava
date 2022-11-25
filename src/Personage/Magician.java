package Personage;

import Defensif.Philtre;
import EquipementOfensif.Arme;
import EquipementOfensif.Sort;

public class Magician extends Personnage {

    /**
     * @param name coordinate
     *             pv 6 coordinate
     *             force 15 coordinate
     *             thingToDefend instance of obj Philter coordinate
     *             weaponToAttack instance of obj Sort coordinate
     */
    public Magician(String name) {
        super(name);
        this.pv=6;
        this.force=15;
        this.thingToDefend = new Philtre("philtre"); // its liquid to defend
        this.weaponToAttack = new Sort("Sort",0);
    }

    /**
     * @return name , vie, firce, deffend and attack,
     */
    @Override
    public String toString() {
        return "Personage.Magician\nName: " + getName() +
                " pv= " + pv +
                ", force= " + force +
                ", thingToDefend= " + thingToDefend +
                ", weaponToAttack= " + weaponToAttack;
    }

}
