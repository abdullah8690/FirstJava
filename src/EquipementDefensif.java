public abstract class EquipementDefensif {
   protected String name;
   protected int niveauDefence;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getNiveauDefence() {
      return niveauDefence;
   }

   public void setNiveauDefence(int niveauDefence) {
      this.niveauDefence = niveauDefence;
   }

   public EquipementDefensif(String name)
   {
      this.name = name;
   }
   public String getBouclier() {
      return name;
   }

   public void setBouclier(String bouclier) {
      this.name = name;
   }


   @Override
   public String toString() {
      return name + ", niveau defence= " + niveauDefence;
   }
}
