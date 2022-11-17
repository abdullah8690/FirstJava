import java.util.Scanner;

public class Game {
    Personnage perso;
    Menu menu= new Menu();
    public int demarage(){
        String name;
        int type;
        int restart=1;
        // Afficher le menu principal pour commencer
        int selection = menu.mainMenu();
        if(selection==1){
            System.out.println("Start Game");
            do {
                name = menu.askName();
                type = menu.askType();
                if (type==1){
                    perso = new Magician(name);
                } else if (type==2) {
                 perso =   new Wrrior(name);
                }
            } while (menu.userWantsToModify(perso));
            while (restart==1){
                restart= jeuPrincipal();
            }


            //affiche le perso
        } else if (selection==2) {
            System.out.println("Exit Game");
        }
        return selection;
    }

    private int jeuPrincipal(){
         int pos = 1;
         //  Try and Catch
      try {
            Scanner rst= new Scanner(System.in);
            System.out.println("Position de joueur " + pos);
            while (pos < 64){
                int de = (int)(Math.random()*6);
                pos += de;
                System.out.println("Position de joueur " + pos);
                if (pos>64){
                    throw new ThroxExeptionOutOfPlateu();
                }


            }
            System.out.println("(1) To Restar the Game (2) To Exit");
            int selection =Integer.parseInt(rst.nextLine());
            int restart;
            if (selection==1){
                restart =1;
            }else {
                restart = 0;
                }
            return restart;
      } catch (ThroxExeptionOutOfPlateu e)
      {

          System.out.println(e);
      }


        return pos;
    }
}
