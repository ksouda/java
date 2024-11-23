package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        float depth;
        zoo myzoo = new zoo("parc animalier", "paris");
        zoo zoo1 = new zoo("parc ", "france");
        terrestrial chat = new terrestrial("félins","chat", 2,true,4);
        dolphin dp = new dolphin("dauphins","dau",10,true,"mer",500);
        penguin pg = new penguin("penguins","pen",5,true,"ice",80);
        penguin pg1 = new penguin("penguins","pen",5,true,"ice",60);
        penguin pg2 = new penguin("penguins","pen",5,true,"ice",30);
        animal lion = new animal("félins", "Lion", 7, true);
        animal tiger = new animal("Félins", "Tigre", 4, true);
        animal elephant = new animal("Éléphants", "Éléphant", -5, true);
        animal panda = new animal("Ursidés", "Panda", 5, true);
        pg1.eatMeat(Food.MEAT);
        dp.eatMeat(Food.PLANT);
        chat.eatPlantAndMeat(Food.BOTH);
        /*try{
            zoo1.addanimal(lion);
            System.out.println("Nombre d'animaux : " + zoo1.getAnimalCount());
            zoo1.addanimal(tiger);
            System.out.println("Nombre d'animaux : " + zoo1.getAnimalCount());
            zoo1.addanimal(elephant);
            System.out.println("Nombre d'animaux : " + zoo1.getAnimalCount());
            zoo1.addanimal(panda);
            System.out.println("Nombre d'animaux : " + zoo1.getAnimalCount());
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        myzoo.displayAnimals();
        myzoo.addanimal(lion);              // Ajout réussi
        myzoo.addanimal(tiger);             // Ajout réussi
        myzoo.addanimal(elephant);          // Ajout réussi
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
