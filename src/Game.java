import Personage.Magician;
import Personage.Personnage;
import Personage.Wrrior;
import board.Board;
import java.util.Scanner;
public class Game {
    Personnage perso;
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
            System.out.println("Start Game");
            do {
                name = menu.askName();
                type = menu.askType();
                if (type == 1) {
                    perso = new Magician(name);
                } else if (type == 2) {
                    perso = new Wrrior(name);
                }
            } while (menu.userWantsToModify(perso));
            while (restart == 1) {
                restart = jeuPrincipal();
            }
            //affiche le perso
        } else if (selection == 2) {
            System.out.println("Exit Game");
        }
        return selection;
    }
    ///////////   JEU PRANCIPAL   ///////////////////////////
    private int jeuPrincipal() {
        ////   TRY AND CATCH   ////
        try {
            Scanner rst = new Scanner(System.in);
            System.out.println("Position de joueur " + perso.getPosition());
            board.displayBoard(perso);
            while (perso.getPosition() < board.getBord().size() - 1) {
                int de = (int) (Math.random() * 6) + 1;
                perso.setPosition(perso.getPosition() + de);

                if (perso.getPosition() >= board.getBord().size()) {
                    throw new ThroxExeptionOutOfPlateu();
                }

                board.getBord().get(perso.getPosition()).interact(perso);
                System.out.println("Position de joueur " + perso.getPosition());
                board.displayBoard(perso);
            }
            System.out.println("(1) To Restar the Game (2) To Exit");
            int selection = Integer.parseInt(rst.nextLine());

            if (selection == 1) {
                perso.setPosition(0);
                jeuPrincipal();
            }
        } catch (ThroxExeptionOutOfPlateu e) {
            System.out.println(e);
        }
        return perso.getPosition();
    }
}
