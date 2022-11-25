package board;

import Personage.Personnage;
import board.Case;

public class CaseVide implements Case {
    private String msg;

    public CaseVide(String msg) {
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public void interact(Personnage personnage) {
        System.out.println("Cette case est vide.");
    }
}
