package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.animal;
import tn.esprit.gestionzoo.entities.zoo;
public class ZooManagement {
    public static void main(String[] args) {
        zoo myzoo = new zoo("parc animalier", "paris");
        zoo zoo1 = new zoo("parc ", "france");
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

        /*zoo largerZoo = myzoo.comparerZoo(zoo1, myzoo);
        largerZoo.displayZoo();*/
        if(myzoo.searchAnimal(panda)==-1){
            System.out.println("Animal not found");
        }
        else
        {
            System.out.println("Animal found");
        }
    }
}
