package tn.esprit.gestionzoo.entities;
public class animal {
    private String family;
    private String name ;
    private int age;
    private boolean isMammal;
    public animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);  // Utilisation du setter pour l'âge
        this.isMammal = isMammal;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
        this.age = age;
    }

    // Getters
    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }
    public void displayAnimal() {
        System.out.println("Nom de l'animal: " + name);
        System.out.println("nom de la famille: " + family);
        System.out.println("age: " + age);
        System.out.println("mammifère: " + isMammal);
    }


}
