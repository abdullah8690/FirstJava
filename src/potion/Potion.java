package potion;

import Personage.Personnage;
import board.Case;

public class Potion implements Case {
    private String name;
    private int pv;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public Potion(String name, int pv) {
        this.name = name;
        this.pv = pv;
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Vous etes tombé sur une " + name);
        personnage.setPv(personnage.getPv()+pv);
        System.out.println("La vie du personnage est de " +personnage.getPv());
    }
}
