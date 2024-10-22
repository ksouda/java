package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.animal;
import tn.esprit.gestionzoo.entities.zoo;
import tn.esprit.gestionzoo.entities.aquatic;
import tn.esprit.gestionzoo.entities.terrestrial;
import tn.esprit.gestionzoo.entities.dolphin;
import tn.esprit.gestionzoo.entities.penguin
        ;
public class ZooManagement {
    public static void main(String[] args) {
        float depth;
        zoo myzoo = new zoo("parc animalier", "paris");
        terrestrial chat = new terrestrial("félins","chat", 2,true,4);
        dolphin dp = new dolphin("dauphins","dau",10,true,"mer",500);
        penguin pg = new penguin("penguins","pen",5,true,"ice",80);
        penguin pg1 = new penguin("penguins","pen",5,true,"ice",60);
        penguin pg2 = new penguin("penguins","pen",5,true,"ice",30);
        dp.swim();
        pg.swim();
        myzoo.addAquaticAnimal(pg);
        myzoo.addAquaticAnimal(pg1);
        myzoo.addAquaticAnimal(pg2);
        myzoo.addAquaticAnimal(dp);
        myzoo.addAquaticAnimal(pg);
        depth= myzoo.maxPenguinSwimmingDepth();
        System.out.println("la profondeur max des pingouins: " +depth);
        myzoo.displayNumberOfAquaticsByType();
        if (pg1.equals(dp))
        {
            System.out.println("les deux animaux sont identiques");
        }
        else {
            System.out.println("les deux animaux sont différents");
        }
        myzoo.displayAquaticAnimals();
        /*zoo zoo1 = new zoo("parc ", "france");
        animal lion = new animal("félins", "Lion", 7, true);
        animal tiger = new animal("Félins", "Tigre", 4, true);
        animal elephant = new animal("Éléphants", "Éléphant", 10, true);
        animal panda = new animal("Ursidés", "Panda", 5, true);
        myzoo.addanimal(lion);              // Ajout réussi
        myzoo.addanimal(tiger);             // Ajout réussi
        myzoo.addanimal(elephant);          // Ajout réussi

        zoo1.addanimal(lion);              // Ajout réussi
        zoo1.addanimal(tiger);             // Ajout réussi
        zoo1.addanimal(elephant);
        zoo1.addanimal(panda);
        myzoo.displayAnimals();

        zoo largerZoo = myzoo.comparerZoo(zoo1, myzoo);
        largerZoo.displayZoo();
        if(myzoo.searchAnimal(panda)==-1){
            System.out.println("Animal not found");
        }
        else
        {
            System.out.println("Animal found");
        }*/
    }
}
