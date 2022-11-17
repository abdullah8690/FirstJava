import java.util.Objects;

public abstract class Personnage {
    private String name;
    protected int pv;
   protected int force;
   protected EquipementDefensif thingToDefend;
    protected EquipementOffensif weaponToAttack;



////////////////constructor///////////
    public Personnage() {

    }

    public Personnage(String name) {
        this.name=name;
    }




    //////////////guetterandsetter/////////////


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public int getPv() {
        return pv;
    }

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

        return "Personnage{" +
                "name='" + name + '\'' +
                ", pv='" + pv + '\'' +
                ", force='" + force + '\''+
                ". Your character has: " + weaponToAttack.toString() +
            " and " + thingToDefend +
                '}';
    }
}
