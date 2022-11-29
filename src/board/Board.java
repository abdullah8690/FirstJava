package board;

import EquipementOfensif.BouclesDeFeu;
import EquipementOfensif.Eclairs;
import EquipementOfensif.Epees;
import EquipementOfensif.Massues;
import Personage.Personnage;
import ennemy.Dragon;
import ennemy.Goblines;
import ennemy.Sorcier;
import potion.GrandesPotion;
import potion.PotionStandard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Board {
    ArrayList<Case> board = new ArrayList<>();

    private final int nbcase;

    ////////////////  Constructor   ///////////////////
    public Board() {
        this.nbcase = 64;
        ArrayList<Integer> indexesCasesVides = new ArrayList<>();

        // ajout de cases vides dans board
        // initialisation de la list caseVides des index des cases vides
        for (int i = 0; i < nbcase; i++) {
            board.add(new CaseVide("this is my empty Box"));
            indexesCasesVides.add(i);
        }

        Map<String, Integer> dic = new HashMap<>();
        dic.put("Dragon", 4);
        dic.put("Sorcier", 10);
        dic.put("Goblines", 10);
        dic.put("Massues", 5);
        dic.put("Epee", 4);
        dic.put("Eclairs", 5);
        dic.put("BoulesDeFeu", 2);
        dic.put("PotionStandard", 6);
        dic.put("GrandesPotion", 2);


        for (String key : dic.keySet()) {
            int items = dic.get(key);
            while (items > 0) {
                int x = (int) (Math.random() * (indexesCasesVides.size()-1));
                int c = indexesCasesVides.get(x);
                instaciateAndAssociate(c,key);
                indexesCasesVides.remove(x);
                items--;
            }
        }
    }

    public void instaciateAndAssociate(int c, String player) {

        if (player == "Dragon") {
            board.set(c, new Dragon("Dragon", 10));
        } else if (player == "Sorcier") {
            board.set(c, new Sorcier("Sorcier", 15));
        } else if (player == "Goblines") {
            board.set(c, new Goblines("Gobline", 20));
        } else if (player == "Massues") {
            board.set(c, new Massues("Massue"));
        } else if (player == "Epee") {
            board.set(c, new Epees("Epee"));
        } else if (player == "Eclairs") {
            board.set(c, new Eclairs("éclairs"));
        } else if (player == "BoulesDeFeu") {
            board.set(c, new BouclesDeFeu("boulde foue"));
        } else if (player == "PotionStandard") {
            board.set(c, new PotionStandard("PotionStandard", 3));
        } else if (player == "GrandesPotion") {
            board.set(c, new GrandesPotion("GrandPotion", 5));
        }else {
            board.set(c,new CaseVide("I am Empty Box") );
        }
    }


    ////////////////  getter & setter   ///////////////////


    public int getNbcase() {
        return nbcase;
    }

    public ArrayList<Case> getBord() {
        return board;
    }

    public void setBord(ArrayList<Case> bord) {
        this.board = bord;
    }


    public void displayBoard(Personnage personage) {
        for (int i = 0; i < board.size(); i++) {
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
