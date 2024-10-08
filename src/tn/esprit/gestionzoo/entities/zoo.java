//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package tn.esprit.gestionzoo.entities;

public class zoo {
    private animal[] animals;
    private String name;
    private String city;
    private final int nbrcages = 25;
    private int animalCount ;
    public zoo (String name, String city) {
        animals = new animal[nbrcages];
        setName(name);  // Utilisation du setter pour le nom
        this.city = city;
        animalCount = 0;

    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne doit pas être vide.");
        }
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrcages;
    }

    public int getAnimalCount() {
        return animalCount;
    }
    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrcages);
    }
    public  boolean addanimal(animal a){
        if (!isZooFull() && (searchAnimal(a)==-1)){
            animals[animalCount] = a;
            animalCount++;
            System.out.println(a.getName() + " a été ajouté au zoo.");
            return true;
        } else {
            System.out.println("Le zoo est plein ou bien cet animal existe déja, impossible d'ajouter " + a.getName() + ".");
            return false;
        }
    }
    public void displayAnimals() {
        System.out.println("Les animaux du zoo " + name + " :");
        if (animalCount == 0) {
            System.out.println("Il n'y a pas d'animaux dans le zoo.");
        } else {
            for (int i = 0; i < animalCount; i++) {
                animals[i].displayAnimal();
            }
        }
    }
    public int searchAnimal(animal Animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(Animal.getName())) {
                return i;  // Retourne l'indice si l'animal est trouvé
            }
        }
        return -1;  // Retourne -1 si l'animal n'est pas trouvé
    }
    public boolean removeAnimal(animal animal) {

        int index = searchAnimal(animal);

        if (index != -1) {  // Si l'animal est trouvé
            // Déplacer tous les animaux après l'index de suppression vers la gauche
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;  // Effacer la dernière case
            animalCount--;  // Décrémenter le compteur d'animaux
            System.out.println(animal.getName() + " a été supprimé du zoo.");
            return true;  // Suppression réussie
        } else {
            System.out.println(animal.getName() + " n'a pas été trouvé dans le zoo.");
            return false;  // L'animal n'a pas été trouvé
        }

    }
    public boolean isZooFull() {
        return animalCount >= nbrcages;
    }
    public zoo comparerZoo(zoo z1, zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;  // z1 a plus d'animaux
        } else if (z2.animalCount > z1.animalCount) {
            return z2;  // z2 a plus d'animaux
        } else {
            return null;  // Les deux zoos ont le même nombre d'animaux
        }
    }
}