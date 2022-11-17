public class Magician extends Personnage {


    public Magician(String name) {
        super(name);
        this.pv=6;
        this.force=15;
        this.thingToDefend = new Philtre("philtre"); // its liquid to defend
        this.weaponToAttack = new Arme("sort");
    }
    @Override
    public String toString() {
        return "Magician{ name: " + getName() +
                " pv= " + pv +
                ", force= " + force +
                ", thingToDefend= " + thingToDefend +
                ", weaponToAttack= " + weaponToAttack +
                '}';
    }

}
