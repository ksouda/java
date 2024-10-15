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
        zoo myzoo = new zoo("parc animalier", "paris");
        aquatic aq = new aquatic("aq","poisson",8,false,"mer");
        terrestrial chat = new terrestrial("félins","chat", 2,true,4);
        dolphin dp = new dolphin("dauphins","dau",10,true,"mer",500);
        penguin pg = new penguin("penguins","pen",5,true,"ice",50);
        aq.swim();
        dp.swim();
        pg.swim();
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
