public class Personnage {
    private String name;
    private String type;
    private String pv = "10";
    private String force = "15";
    private String thingToDefend = "shield";
    private String weaponToAttack = "sword";



////////////////constructor///////////
    public Personnage() {

    }

    public Personnage(String name) {
        this.name=name;

    }

    public Personnage(String name,String type) {
        this.name=name;
        this.type=type;

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

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public String getThingToDefend() {
        return thingToDefend;
    }

    public void setThingToDefend(String thingToDefend) {
        this.thingToDefend = thingToDefend;
    }

    public String getWeaponToAttack() {
        return weaponToAttack;
    }

    public void setWeaponToAttack(String weaponToAttack) {
        this.weaponToAttack = weaponToAttack;
    }

    @Override
    public String toString() {

        return "Personnage{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pv='" + pv + '\'' +
                ", force='" + force + '\''+
                ". Your character has: " + weaponToAttack +
            " and " + thingToDefend +
                '}';
    }
}
