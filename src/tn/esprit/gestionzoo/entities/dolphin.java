package tn.esprit.gestionzoo.entities;

public class dolphin extends aquatic{
    float swimmingspeed ;
    public dolphin(){}
    public dolphin(String family, String name, int age, boolean isMammal, String habitat,float swimmingspeed){
        super(family, name, age, isMammal, habitat);
        this.swimmingspeed = swimmingspeed;
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingspeed + " km/h";
    }
}
