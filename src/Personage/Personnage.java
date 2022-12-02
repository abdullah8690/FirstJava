package Personage;

import Defensif.EquipementDefensif;
import EquipementOfensif.EquipementOffensif;

public abstract class Personnage {
    private String name;
    protected int pv;
   protected int force;
   protected EquipementDefensif thingToDefend;
    protected EquipementOffensif weaponToAttack;

    private int position;



    ////////////////constructor///////////
    public Personnage() {

    }

    public Personnage(String name)
    {
        this.name=name;
        this.position =0;
    }




    //////////////guetterandsetter/////////////
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipementDefensif getThingToDefend() {
        return thingToDefend;
    }

    public EquipementOffensif getWeaponToAttack() {
        return weaponToAttack;
    }
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    /**
     *
     * @return pv to get(in int)
     */
    public int getPv() {
        return pv;
    }

    /**
     *
     * @param pv to set pv(in int)
     */
    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }


    @Override
    public String toString() {

        return "Personage.Personnage{" +
                "name='" + name + '\'' +
                ", pv='" + pv + '\'' +
                ", force='" + force + '\''+
                ". Your character has: " + weaponToAttack.toString() +
            " and " + thingToDefend +
                '}';
    }
}
