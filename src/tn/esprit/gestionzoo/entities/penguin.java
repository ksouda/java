package tn.esprit.gestionzoo.entities;

public class penguin extends aquatic {
    float swimmingdepth;
    public penguin() {}
    public penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingdepth) {
        super(family, name,age,isMammal,habitat);
        this.swimmingdepth = swimmingdepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingdepth + " meters";
    }
}
