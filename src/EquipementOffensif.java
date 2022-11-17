public abstract class EquipementOffensif {
    protected String name;
    protected int niveauAttack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiveauAttack() {
        return niveauAttack;
    }

    public void setNiveauAttack(int niveauAttack) {
        this.niveauAttack = niveauAttack;
    }

    ///////// construv
    public EquipementOffensif(String name) {
        this.name =name;
        this.niveauAttack =niveauAttack;
    }



    @Override
    public String toString() {
        return name + ", niveau attack= " + niveauAttack;
    }
}
