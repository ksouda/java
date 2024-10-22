package tn.esprit.gestionzoo.entities;

public abstract class aquatic extends animal {
    String habitat;
    public aquatic() {}
    public aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name,age,isMammal);
        this.habitat = habitat;
    }
    public abstract void swim() ;
    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Les deux objets pointent vers la même référence
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // Vérifie si l'objet est null ou s'il n'est pas de la même classe
        }

        aquatic aqua = (aquatic) obj; // Cast de l'objet en aquatic

        // Comparaison des attributs name, age et habitat
        return this.getName().equals(aqua.getName()) && this.getAge() == aqua.getAge() && this.habitat.equals(aqua.habitat);
    }



}
