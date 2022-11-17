public class Wrrior extends Personnage {
    public Wrrior(String name) {
        super(name);
        setForce(10);
        setPv(10);
        this.thingToDefend= new Bouclier("shield");
        this.weaponToAttack =new Arme("arme");

    }

    @Override
    public String toString() {
        return "Wrrior{ name:"+ getName() +
                " pv= " + pv +
                ", force= " + force +
                ", thingToDefend= " + thingToDefend +
                ", weaponToAttack= " + weaponToAttack +
                '}';
    }
}
