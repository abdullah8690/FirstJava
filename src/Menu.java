import Personage.Personnage;
import Personage.Wrrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    /**
     * Menu principal pour choisir de jouer ou ferme.
     */
    public int mainMenu() {
        Scanner sc= new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Welcome to Donjons & Dragons game");
        System.out.println("(1) Now Play Game");
        System.out.println("(2) Exit Game");
        return Integer.parseInt(sc.nextLine());
    }

    /**
     * Demande les nom de utilisateur
     */
   public String  askName(){
        Scanner nm= new Scanner(System.in);
        System.out.print("Please enter your Name: ");
        String name=nm.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("Name :" + name);

        return name;
    }
    /**
     * Demande le type pour un personnage
     */
    public int  askType(){
        Scanner nm= new Scanner(System.in);
        System.out.print("Please enter Type :(1) To Personage.Magician And (2) To  Warrior ");
        int type=nm.nextInt();
        System.out.println("-------------------------------------");
        System.out.println("Type :" + type);
        return type;

    }
    /**
     *  Descriptif  utilisateur peux create Nouveau personnage et aussi peux choisi niveau de vie et force
     *  @param perso le joueur peut choisir personnage
     *  @return true si l'utilisateur veut modifier son perso, false sinon true

     */
   public boolean userWantsToModify(Personnage perso){
       List<Personnage> c = new ArrayList<Personnage>();
       Scanner nm= new Scanner(System.in);
       System.out.println("(1) To VALIDATE");
       System.out.println("(2) TO MODIFY CHARACTER");
       System.out.println("(3) TO DISPLAY CHARACTER");
       System.out.println("(4) TO INSERT NEW CHARACTER");
       int myChoice = Integer.parseInt(nm.nextLine());
       switch (myChoice){
           case 1:
               System.out.println("Conformation Validated");
//               System.out.println("Name :" +perso);
               System.out.println("Type :" + perso);
               return false;
           case 2:
               return true;

           case 3:
               System.out.println(perso.toString());
               return false;
           case 4:
               System.out.print("Enter Character Name : ");
               String name = nm.nextLine();
               System.out.print("Enter Niveau de Vie : ");
               int vie = nm.nextInt();
               System.out.print("Enter Force : ");
               int force = nm.nextInt();

               c.add(new Wrrior(name,vie,force));
               break;
           default:
            System.out.println("Choix incorrect");
            return false;
       }
       return false;
   }
}
