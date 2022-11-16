public class EquipementDefensif {
   private String bouclier;
   private String name;
   private int niveauDefence;

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

   public EquipementDefensif(String bouclier)
   {
      this.bouclier = bouclier;
 //     this.name=name;
 //     this.niveauDefence=niveauDefence;
   }
   public String getBouclier() {
      return bouclier;
   }

   public void setBouclier(String bouclier) {
      this.bouclier = bouclier;
   }


   @Override
   public String toString() {
      return "EquipementDefensif{" +
              "bouclier='" + bouclier + '\'' +
              ", name='" + name + '\'' +
              ", niveauDefence=" + niveauDefence +
              '}';
   }
}
