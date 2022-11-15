import java.util.Scanner;

public class Game {
    Personnage perso;
    Menu menu= new Menu();
    public int demarage(){
        String name;
        String type;

        // Afficher le menu principal pour commencer
        int selection = menu.mainMenu();
        if(selection==1){
            System.out.println("Start Game");
            do {
                name = menu.askName();
                type =menu.askType();
                perso = new Personnage(name,type);
            } while (menu.userWantsToModify(perso));

            //affiche le perso
        } else if (selection==2) {
            System.out.println("Exit Game");
        }
        return selection;
    }

}
