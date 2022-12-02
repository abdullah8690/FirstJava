import Personage.Personnage;
import game.Game;
import game.Singleton;

import java.sql.*;

class Main {
    public static void main(String[] args) {
         Game test = new Game();
        test.demarage();

        Singleton singleton = Singleton.getInstance();


    }

}