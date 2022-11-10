import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {

//        Menu test =new Menu();
//        test.demarage();

        Personnage perso= new Personnage();
        System.out.println(perso);

        Personnage toto= new Personnage("power");
        System.out.println(toto);

        Personnage toto1= new Personnage("Amir","guerier");
        System.out.println(toto1);


    }

}