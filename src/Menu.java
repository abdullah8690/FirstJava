import java.util.Scanner;

public class Menu {

    public int demarage(){

        Scanner sc= new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Welcome to Donjons & Dragons game");
        System.out.println("Now Play Game");
        System.out.println("Exit Game");

        int selection = Integer.parseInt(sc.nextLine());

        if(selection==1){
            System.out.println("Start Game");
        } else if (selection==2) {
            System.out.println("Exit Game");
        }
        return selection;
    }
}
