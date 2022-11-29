package game;

import Personage.Magician;
import Personage.Personnage;
import Personage.Wrrior;
import board.Board;
import exceptions.ThroxExeptionOutOfPlateu;
import menu.Menu;

import java.util.Scanner;
public class Game {
    Personnage personnage;
    Menu menu = new Menu();
    Board board = new Board();
    ///////////   GAME START   ///////////////////////////
    public int demarage() {
        String name;
        int type;
        int restart = 1;
        // Afficher le menu principal pour commencer
        int selection = menu.mainMenu();
        if (selection == 1) {
            System.out.println("Start game.Game");
            do {
                name = menu.askName();
                type = menu.askType();
                if (type == 1) {
                    personnage = new Magician(name);
                } else if (type == 2) {
                    personnage = new Wrrior(name);
                }
            } while (menu.userWantsToModify(personnage));
            while (restart == 1) {
                restart = jeuPrincipal();
            }
            //affiche le perso
        } else if (selection == 2) {
            System.out.println("Exit game.Game");
        }
        return selection;
    }
    ///////////   JEU PRANCIPAL   ///////////////////////////
    private int jeuPrincipal() {
        ////   TRY AND CATCH   ////
        try {
            Scanner rst = new Scanner(System.in);
            System.out.println("Position de joueur " + personnage.getPosition());
            Board.displayBoard(personnage);
            while (personnage.getPosition() < board.getBord().size() - 1) {
                int roll = rollDice();
                System.out.println("Vous avez avancé de : "+ roll);
                personnage.setPosition(personnage.getPosition() + roll);

                if (personnage.getPosition() >= board.getBord().size()) {
                    throw new ThroxExeptionOutOfPlateu();
                }
                System.out.println("Position de joueur " + personnage.getPosition());
                Board.displayBoard(personnage);
                board.getBord().get(personnage.getPosition()).interact(personnage);
            }
            System.out.println("(1) To Restar the game.Game (2) To Exit");
            int selection = Integer.parseInt(rst.nextLine());

            if (selection == 1) {
                personnage.setPosition(0);
                jeuPrincipal();
            }
        } catch (ThroxExeptionOutOfPlateu e) {
            System.out.println(e);
        }
        return personnage.getPosition();
    }

    public static  int rollDice(){
        return (int) (Math.random() * 6) + 1;
    }
}
