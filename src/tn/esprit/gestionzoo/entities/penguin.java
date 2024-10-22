package tn.esprit.gestionzoo.entities;

public  class penguin extends aquatic {
    private float swimmingdepth;
    public penguin() {}
    public penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingdepth) {
        super(family, name,age,isMammal,habitat);
        this.swimmingdepth = swimmingdepth;
    }
    public float getswimmingdepth() {
        return swimmingdepth;
    }

    public void swim() {
        System.out.println("This penguin is swimming.");
    }
    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingdepth + " meters";
    }
}
