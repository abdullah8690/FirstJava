package ennemy;

import Personage.Personnage;
import board.Board;
import board.Case;
import game.Game;
import menu.Menu;

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
        String choice = Menu.choiceAttackRun();
        switch (choice){
            case "1" -> {
                setPv(pv - personnage.getForce());
                personnage.setPv(personnage.getPv()-attack);
                System.out.println("Vous avez infligé -" + personnage.getForce());
                System.out.println("Vous avez pris -" + attack);
            }
            case "2" -> {
                System.out.println("Vous avez Fui");
                int roll = Game.rollDice();
                System.out.println("Votre position : " + personnage.getPosition());
                System.out.println("Vous avez reculé de : " + roll + " cases");
                personnage.setPosition(personnage.getPosition() - roll);
                System.out.println("Votre position : " + personnage.getPosition());
            }
        }

        if (getPv() <= 0){
            System.out.println("Ennemy est mort");
        }else {
            System.out.println("L'ennemy a fui");
        }

    }
}
