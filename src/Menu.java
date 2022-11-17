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
     * Demande les nom et type pour un personnage
     */
   public String  askName(){
        Scanner nm= new Scanner(System.in);
        System.out.print("Please enter your Name: ");
        String name=nm.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("Name :" + name);

        return name;
    }

    public int  askType(){
        Scanner nm= new Scanner(System.in);
        System.out.print("Please enter Type :(1) To Magician And (2) To  Warrior  ");
        int type=nm.nextInt();
        System.out.println("-------------------------------------");
        System.out.println("Type :" + type);
        return type;

    }
    /**
     * @return true si l'utilisateur veut modifier son perso, false sinon
     */
   public boolean userWantsToModify(Personnage perso){

       Scanner nm= new Scanner(System.in);
       System.out.println("(1) To validate");
       System.out.println("(2) To modify character");
       System.out.println("(3) Display character");
       int myChoice = Integer.parseInt(nm.nextLine());
       switch (myChoice){
           case 1:
               System.out.println("Conformation Validated");
               System.out.println("Name :" +perso);
               System.out.println("Type :" + perso);
               return false;
           case 2:
               return true;

           case 3:
               System.out.println(perso.toString());
               return false;
           default:
            System.out.println("Choix incorrect");
            return false;
       }
    }
}
