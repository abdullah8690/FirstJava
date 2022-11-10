public class Personnage {
    private String name;
    private String type;
    private String pv;
    private String force;

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


    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pv='" + pv + '\'' +
                ", force='" + force + '\'' +
                '}';
    }
}
