package board;

import EquipementOfensif.*;
import Personage.Personnage;
import ennemy.Dragon;

import ennemy.Goblines;
import ennemy.Sorcier;
import potion.GrandesPotion;
import potion.Potion;
import potion.PotionStandard;

import java.util.ArrayList;

public class Board {
    ArrayList<Case> bord = new ArrayList<>();

    private final int nbcase;

    ////////////////  Constructor   ///////////////////
    public Board() {
        this.nbcase=64;
        for (int i = 0; i<nbcase; i++){
            switch (i){
                case 45,52,56,62 ->bord.add(new Dragon("Dragon",10));
                case 10, 20, 25, 32, 35, 36, 37, 40, 44 , 47 ->bord.add(new Sorcier("Sorcier",15));
                case 3, 6, 9 , 12, 15, 18, 21, 24, 27 , 30 -> bord.add(new Goblines("Gobline",20));
                case 2, 11, 5, 22, 38 -> bord.add(new Massues("Massue"));
                case 19, 26, 42 , 53->bord.add(new Epees("Epee"));
                case 1, 4 , 8, 17 , 23 -> bord.add(new Eclairs("éclairs")) ;
                case 48, 49 -> bord.add(new BouclesDeFeu("boulde foue"));
                case 7, 13, 31, 33, 39, 43 -> bord.add(new PotionStandard("PotionStandard",3));
                case 28, 41 -> bord.add(new GrandesPotion("GrandPotion",5));
                default -> bord.add(new CaseVide("Case Vide"));
            }
        }
    }

    ////////////////  getter & setter   ///////////////////



    public int getNbcase() {
        return nbcase;
    }

    public ArrayList<Case> getBord() {
        return bord;
    }

    public void setBord(ArrayList<Case> bord) {
        this.bord = bord;
    }


    public void displayBoard(Personnage personage) {
        for (int i = 0; i < bord.size(); i++) {
            if (personage.getPosition() == i) {
                System.out.print("**|");
            } else {
                System.out.print(i + "|");
                System.out.print(" ");
            }

        }
        System.out.println("");

    }
}
