public class EquipementOffensif {
    private String type;
    private String name;
    private int niveauAttack;

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
    public EquipementOffensif(String type) {
        this.type = type;
      //  this.name =name;
      //  this.niveauAttack =niveauAttack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EquipementOffensif{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", niveauAttack=" + niveauAttack +
                '}';
    }
}
