package ennemy;

import Personage.Personnage;
import board.Case;

abstract class Ennemy extends Personnage implements Case {
    private String name;
    private int attack;
    private int pv;

    ////////////////  Constructor   ///////////////////
    public Ennemy(String name, int attack, int pv) {
        this.name = name;
        this.attack = attack;
        this.pv =pv;
    }

    ////////////////  getter & setter   ///////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }



    @Override
    public void interact(Personnage personnage) {
        System.out.println("Vous etes tombé sur un " + name);

    }
}
