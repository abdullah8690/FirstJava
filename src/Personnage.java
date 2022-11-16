import java.util.Objects;

public class Personnage {
    private String name;
    private String type;
    private int pv;
    private int force;
    private EquipementDefensif thingToDefend;
    private EquipementOffensif weaponToAttack;



////////////////constructor///////////
    public Personnage() {

    }

    public Personnage(String name) {
        this.name=name;

    }

    public Personnage(String name,String type) {
        this.name=name;
        this.type=type;
        if (Objects.equals(type, "magician")){
            this.pv=6;
            this.force=15;
            this.thingToDefend = new EquipementDefensif("philtre");
            this.weaponToAttack= new EquipementOffensif("spell");
        } else if (Objects.equals(type, "warrior")) {
            this.pv=10;
            this.force=10;
            this.weaponToAttack= new EquipementOffensif("sword");
            this.thingToDefend = new EquipementDefensif("shield");
        } else {
            System.out.println("ERROR : bad type");
        }
    }



    //////////////guetterandsetter/////////////


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
                ", type='" + type + '\'' +
                ", pv='" + pv + '\'' +
                ", force='" + force + '\''+
                ". Your character has: " + weaponToAttack.toString() +
            " and " + thingToDefend +
                '}';
    }
}
